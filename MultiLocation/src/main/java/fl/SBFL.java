package fl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fl.coverageunit.CoverageCollector;
import fl.coverageunit.JunitTest;
import fl.coverageunit.tcas1;
import fl.statement.AnalyseNsicAndDSic;
import fl.statement.Quad;
import fl.statement.SubsetsOfMutualExclusions;
import fl.strategy.Coefficient;
import fl.strategy.Naish1;
import fl.strategy.Ochiai;
import fl.strategy.Tarantula;
import fl.strategy.Wong1;

public class SBFL {
	int strategy;
	//Map<Integer,Double> susList = new HashMap<>();
	Coefficient coefficient_w = new Wong1();
	Coefficient coefficient_n = new Naish1();
	Coefficient coefficient_o = new Ochiai();
	Coefficient coefficient_t = new Tarantula();
	
	Class<?> target;
	Class<?> targetTest;
	
    private List<List<Integer>> linesList = new ArrayList<>();
    private List<List<Double>> susesList = new ArrayList<>();
    
	public SBFL(int strategy,Class<?> target,Class<?> targetTest) {
		this.strategy = strategy;
		this.target = target;
		this.targetTest = targetTest;
	}
	public void run() throws Exception {
		//读取相关类
    	final String targetName = target.getName();
    	final String targetTestName = targetTest.getName();
    	
    	//收集的成功+失败覆盖信息 List0是失败 List1是成功
    	CoverageCollector c = new CoverageCollector();
    	List<double[][]> res = c.exec(targetName,targetTestName);
    	
    	List<double[]> cover_F = new ArrayList<>(res.get(0).length);//失败覆盖矩阵
    	Collections.addAll(cover_F, res.get(0));
    	List<double[]> cover_S = new ArrayList<>(res.get(1).length);//成功覆盖矩阵
    	Collections.addAll(cover_S, res.get(1));
    	
    	//获取互斥子集
    	AnalyseNsicAndDSic an = new AnalyseNsicAndDSic(cover_F,cover_S,0);
    	SubsetsOfMutualExclusions SOME = an.getSOME();
    	Map map = SOME.getMap();
    	
    	List<Quad> Quads = an.getQuads();
    	
    	//怀疑度的映射表
    	Map<Integer,Double> suses = new HashMap<>();
    	if(strategy==1) {
    		for(int line=0;line<cover_F.get(0).length;line++) {
    			double sus = coefficient_w.calculate(Quads.get(line),line);
    			suses.put(line+1, sus);
    		}
    	}
    	if(strategy==2) {
    		for(int line=0;line<cover_F.get(0).length;line++) {
    			double sus = coefficient_n.calculate(Quads.get(line),line);
    			suses.put(line+1, sus);
    		}
    	}
    	if(strategy==3) {
    		for(int line=0;line<cover_F.get(0).length;line++) {
    			double sus = coefficient_o.calculate(Quads.get(line),line);
    			suses.put(line+1, sus);
    		}
    	}
    	if(strategy==4) {
    		for(int line=0;line<cover_F.get(0).length;line++) {
    			double sus = coefficient_t.calculate(Quads.get(line),line);
    			suses.put(line+1, sus);
    		}
    	}
		mapValueSort(suses);
	}
	
    private void mapValueSort(Map<Integer, Double> susList) {
        List<Map.Entry<Integer, Double>> list = new ArrayList<Map.Entry<Integer, Double>>(susList.entrySet());
        list.sort(new Comparator<Map.Entry<Integer, Double>>() {
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                //return o1.getValue() < o2.getValue() ? 1 : ((o1.getValue() == o2.getValue()) ? 0 : -1);
            	if(o1 == null && o2 == null) {
            		return 0;
            	}
            	if(o1 == null) {
            		return -1;
            	}
            	if(o2 == null) {
            		return 1;
            	}
            	if(o1.getValue() < o2.getValue()) {
            		return 1;
            	}
            	if(o2.getValue() < o1.getValue()) {
            		return -1;
            	}
            	return 0;
            }
        });
        List<Integer> lines = new ArrayList<>();
        List<Double> suses = new ArrayList<>();
        for (Map.Entry<Integer, Double> mapping : list) {
        	lines.add(mapping.getKey());
        	suses.add(mapping.getValue());
        }
        linesList.add(lines);
        susesList.add(suses);
    }
    
    public List<List<Integer>> getLines(){
    	return linesList;
    }
    public List<List<Double>> getSuses(){
    	return susesList;
    }
    
}
