package fl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fl.cluster.FuzzyCmeans;
import fl.coverageunit.CoverageCollector;
import fl.coverageunit.JunitTest;
import fl.coverageunit.tcas1;
import fl.coverageunit.tcas3;
import fl.statement.AnalyseNsicAndDSic;
import fl.statement.CaculatewNsic;
import fl.statement.Quad;
import fl.statement.StatementCollector;
import fl.statement.SubsetsOfMutualExclusions;
import fl.strategy.Coefficient;
import fl.strategy.Naish1;
import fl.strategy.Ochiai;
import fl.strategy.Tarantula;
import fl.strategy.Wong1;

public class SFCMFL {
	int strategy;
	int m;
	int bmax;
	int numOfCluster;
	Map<Integer,Double> susList = new HashMap<>();
	Coefficient coefficient_w = new Wong1();
	Coefficient coefficient_n = new Naish1();
	Coefficient coefficient_o = new Ochiai();
	Coefficient coefficient_t = new Tarantula();
	
	Class<?> target;
	Class<?> targetTest;
	
    private List<List<Integer>> linesList = new ArrayList<>();
    private List<List<Double>> susesList = new ArrayList<>();
    
    public SFCMFL(int strategy,int m,int bmax,int numOfCluster,Class<?> target,Class<?> targetTest) {
    	this.strategy = strategy;
    	this.m = m;
    	this.bmax = bmax;
    	this.numOfCluster = numOfCluster;
		this.target = target;
		this.targetTest = targetTest;
    }
    public void run() throws Exception {
    	final String targetName = target.getName();
    	final String targetTestName = targetTest.getName();
    	
    	CoverageCollector c = new CoverageCollector();
    	List<double[][]> res = c.exec(targetName,targetTestName);//收集的成功+失败覆盖信息 List0是失败 List1是成功
    	
    	List<double[]> cover_F = new ArrayList<>(res.get(0).length);//失败覆盖矩阵
    	Collections.addAll(cover_F, res.get(0));
    	List<double[]> cover_S = new ArrayList<>(res.get(1).length);//成功覆盖矩阵
    	Collections.addAll(cover_S, res.get(1));
    	
    	int numOfFailTest = cover_F.size();
        FuzzyCmeans fcm3 = new FuzzyCmeans(cover_F,numOfCluster,bmax,m);
        fcm3.fcm();
        double[][] U = fcm3.getU();
        
        StatementCollector sc = new StatementCollector(U,cover_F,cover_S);
        List<List<double[]>> cover_Fics = sc.outputAllCover();
        
        for(int i=0;i<numOfCluster;i++) {
        	
            AnalyseNsicAndDSic an = new AnalyseNsicAndDSic(cover_Fics.get(i),cover_S,i);//此处暂时取第一种错误的cover_Fic做测试 后面要改！
            SubsetsOfMutualExclusions SOME = an.getSOME();
            
    		CaculatewNsic cwn = new CaculatewNsic(U,cover_Fics.get(i),cover_S,i,numOfCluster);//暂时取第一种错误的序号 后改
    		List<Quad> wQuads = cwn.createwNsic();
    		
    		Map<Integer,Double> suses = new HashMap<>();
        	if(strategy==1) {
        		for(int line=0;line<cover_F.get(0).length;line++) {
        			double sus = coefficient_w.calculate(wQuads.get(line),line);
        			suses.put(line+1, sus);
        		}
        	}
        	if(strategy==2) {
        		for(int line=0;line<cover_F.get(0).length;line++) {
        			double sus = coefficient_n.calculate(wQuads.get(line),line);
        			suses.put(line+1, sus);
        		}
        	}
        	if(strategy==3) {
        		for(int line=0;line<cover_F.get(0).length;line++) {
        			double sus = coefficient_o.calculate(wQuads.get(line),line);
        			suses.put(line+1, sus);
        		}
        	}
        	if(strategy==4) {
        		for(int line=0;line<cover_F.get(0).length;line++) {
        			double sus = coefficient_t.calculate(wQuads.get(line),line);
        			suses.put(line+1, sus);
        		}
        	}
    		mapValueSort(suses);
    		
        }
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
