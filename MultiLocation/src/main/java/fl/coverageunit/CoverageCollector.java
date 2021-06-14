package fl.coverageunit;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.jacoco.core.analysis.Analyzer;
import org.jacoco.core.analysis.CoverageBuilder;
import org.jacoco.core.data.ExecutionDataStore;
import org.jacoco.core.data.SessionInfoStore;
import org.jacoco.core.instr.Instrumenter;
import org.jacoco.core.runtime.IRuntime;
import org.jacoco.core.runtime.LoggerRuntime;
import org.jacoco.core.runtime.RuntimeData;
import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class CoverageCollector {
    private MemoryClassLoader memoryClassLoader;
    private final IRuntime jacocoRuntime;
    private final Instrumenter jacocoInstrumenter;
    private final RuntimeData jacocoRuntimeData;
    public CoverageCollector() {
        this.memoryClassLoader = null;
        this.jacocoRuntime = new LoggerRuntime();
        this.jacocoInstrumenter = new Instrumenter(jacocoRuntime);
        this.jacocoRuntimeData = new RuntimeData();
        this.memoryClassLoader = new MemoryClassLoader();
    }
    
    /** 执行代码 获取其成功/失败覆盖矩阵 */
    
    public List<double[][]> exec(final String source, final String test) throws Exception {
    	
    	//创建所需的矩阵
        final ArrayList<ArrayList<Integer>> FouterList = new ArrayList<>();
        final ArrayList<ArrayList<Integer>> SouterList = new ArrayList<>();w
    	final List<double[][]> output = new ArrayList<>();//0是失败矩阵 1是成功矩阵
        
    	//字节码插桩
        loadInstrumentedClasses(source);
        final Class<?> junitClass = loadInstrumentedClasses(test);
    	
        //跑代码 收集信息过程
        final JUnitCore junitCore = new JUnitCore();
        final CoverageMeasurementListener listener = new CoverageMeasurementListener(source,FouterList,SouterList);
        junitCore.addListener(listener);
        junitCore.run(junitClass);
        
        //失败的矩阵添加到output
        int Fx = FouterList.size();
        int Fy = FouterList.get(0).size();
        final double[][] Foutput = new double[Fx][Fy];
        for(int i=0;i<Fx;i++) {//转换形态
        	for(int j=0;j<Fy;j++) {
        		Foutput[i][j] = FouterList.get(i).get(j);
        	}
        }
        output.add(Foutput);
        
        //成功的矩阵添加到output
        int Sx = SouterList.size();
        int Sy = SouterList.get(0).size();//SouterList为空 即成功测试的部分未被收集
        final double[][] Soutput = new double[Sx][Sy];
        for(int i=0;i<Sx;i++) {//转换形态
        	for(int j=0;j<Sy;j++) {
        		Soutput[i][j] = SouterList.get(i).get(j);//不再转置
        	}
        }
        output.add(Soutput);
        
        return output;
    }
    
    
    public static class MemoryClassLoader extends ClassLoader {

		private final Map<String, byte[]> definitions = new HashMap<String, byte[]>();

		public void addDefinition(final String name, final byte[] bytes) {
			definitions.put(name, bytes);
		}

		@Override
		protected Class<?> loadClass(final String name, final boolean resolve)
				throws ClassNotFoundException {
			final byte[] bytes = definitions.get(name);
			if (bytes != null) {
				return defineClass(name, bytes, 0, bytes.length);
			}
			return super.loadClass(name, resolve);
		}
	}
    
    private Class<?> loadInstrumentedClasses(String fqn) throws Exception {
        
    	final byte[] instrumentedData = instrument(fqn);//instrument
        Class<?> loadedClass=loadClass(fqn, instrumentedData);//loadClass
        
        return loadedClass;
    }
    
    private byte[] instrument(final String fqn) throws Exception {
        
    	return this.jacocoInstrumenter.instrument(getTargetClassInputStream(fqn), fqn);//getTargetClassInputStream
    }
    
    private Class<?> loadClass(final String fqn, final byte[] bytes) throws ClassNotFoundException {
        
    	this.memoryClassLoader.addDefinition(fqn, bytes);
        
    	return this.memoryClassLoader.loadClass(fqn); //强制加载被插桩的类
    }
    
    private InputStream getTargetClassInputStream(final String fqn) {//final String fqn
    	
        final String resource = fqn.replace('.', '/') + ".class";
        InputStream is = this.memoryClassLoader.getResourceAsStream(resource);
        return is;
    }
    
    class CoverageMeasurementListener extends RunListener {
    	
    	private final Description FAILED = Description.createTestDescription("failed", "failed");
    	
    	ArrayList<ArrayList<Integer>> FouterList = new ArrayList<>();
    	ArrayList<ArrayList<Integer>> SouterList = new ArrayList<>();
    	
        final private String measuredClass;
        
        public CoverageMeasurementListener(String measuredFQN,ArrayList<ArrayList<Integer>> FouterList,ArrayList<ArrayList<Integer>> SouterList)//ArrayList<ArrayList<Integer>> arr
                throws Exception {
            jacocoRuntime.startup(jacocoRuntimeData);
            //this.testResults = storedTestResults;
            this.FouterList = FouterList;
            this.SouterList = SouterList;
            this.measuredClass = measuredFQN;
        }
        
        @Override
        public void testStarted(Description description) {
            resetJacocoRuntimeData();
        }
        
        public void testFailure(Failure failure) {//一条测试失败时调用
            noteTestExecutionFail(failure);
        }
        
        public void testFinished(Description description) throws IOException {
            collectRuntimeData(description);
        }
        
        private void resetJacocoRuntimeData() {
            jacocoRuntimeData.reset();
        }
        
        private void noteTestExecutionFail(Failure failure) {
            failure.getDescription().addChild(FAILED);
        }
        
        private boolean isFailed(Description description) {
            return description.getChildren().contains(FAILED);
        }
        
        private String getTestMethodName(Description description) {
            return description.getTestClass().getName() + "." + description.getMethodName();
        }
        
        private void collectRuntimeData(final Description description) throws IOException {
            final CoverageBuilder coverageBuilder = new CoverageBuilder();
            analyzeJacocoRuntimeData(coverageBuilder);//分析出覆盖信息存在coverageBuilder
            addJacocoCoverageToTestResults(coverageBuilder, description);//把覆盖细节拿去统计 description是此条测试用例的详细信息
        }
        
        private void analyzeJacocoRuntimeData(final CoverageBuilder coverageBuilder) throws IOException {
            final ExecutionDataStore executionData = new ExecutionDataStore();
            final SessionInfoStore sessionInfo = new SessionInfoStore();
            jacocoRuntimeData.collect(executionData, sessionInfo, false);
            jacocoRuntime.shutdown();

            final Analyzer analyzer = new Analyzer(executionData, coverageBuilder);
            analyzer.analyzeClass(getTargetClassInputStream(measuredClass), measuredClass);
        }
        
        private void addJacocoCoverageToTestResults(final CoverageBuilder coverageBuilder,
                final Description description) {
            final String testMethodFQN = getTestMethodName(description);
            final boolean isFailed = isFailed(description);//判断失败与否的重要依据！
            List<Coverage> coverages = coverageBuilder.getClasses().stream().map(c -> new Coverage(c))
                    .collect(Collectors.toList());
            
            Map<Integer, Integer> map = coverages.get(0).getStatusOfLine();
            final int lineLength = coverages.get(0).getLength();
            ArrayList<Integer> FinnerList = new ArrayList<Integer>(lineLength);
            ArrayList<Integer> SinnerList = new ArrayList<Integer>(lineLength);
            
            //可以添加统计覆盖/未覆盖行的测试用例数量模块~
            if(isFailed) {
            	map.forEach((key, value) -> {
                    if(value==2) {//2为被覆盖！
                    	FinnerList.add(1);
                    }
                    if(value!=2) {
                    	FinnerList.add(0);
                    }
                });
            	FouterList.add(FinnerList);
            }
            if(!isFailed) {
            	map.forEach((key, value) -> {
                    if(value==2) {//2为被覆盖！
                    	SinnerList.add(1);
                    }
                    if(value!=2) {
                    	SinnerList.add(0);
                    }
                });
            	SouterList.add(SinnerList);
            }
        }
    }
}
