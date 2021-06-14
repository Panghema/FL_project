package fl;

import java.util.ArrayList;
import java.util.List;

import fl.coverageunit.JunitTest;
import fl.coverageunit.*;

public class FaultLocation {
	int mode;
	int numOfCluster;
	int bmax;
	int m;
	int strategy;
    List<List<Integer>> linesList = new ArrayList<>();
    List<List<Double>> susesList = new ArrayList<>();
	Class<?> target;
	Class<?> targetTest;
    
	public FaultLocation(int mode,int numOfCluster,int bmax,int m,int strategy) {
		this.mode = mode;
		this.numOfCluster = numOfCluster;
		this.bmax = bmax;
		this.m = m;
		this.strategy = strategy;
		this.target = demo1.class;
		this.targetTest = JunitTest.class;
	}
	
	public void exec() throws Exception {
		if(this.mode==1) {
			SBFL sbfl = new SBFL(strategy,target,targetTest);
			sbfl.run();
			linesList = sbfl.getLines();
			susesList = sbfl.getSuses();
		}
		if(this.mode==2) {
			SFCMFL sfcmfl = new SFCMFL(strategy,m,bmax,numOfCluster,target,targetTest);
			sfcmfl.run();
			linesList = sfcmfl.getLines();
			susesList = sfcmfl.getSuses();
		}
		if(this.mode==3) {
			MFCMFL mfcmfl = new MFCMFL(m,bmax,numOfCluster,target,targetTest);
			mfcmfl.run();
			linesList = mfcmfl.getLines();
			susesList = mfcmfl.getSuses();
		}
	}
	
    public List<List<Integer>> getLines(){
    	return linesList;
    }
    public List<List<Double>> getSuses(){
    	return susesList;
    }
}
