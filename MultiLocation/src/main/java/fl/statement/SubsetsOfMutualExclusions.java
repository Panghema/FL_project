package fl.statement;

import java.util.HashMap;
import java.util.Map;

public class SubsetsOfMutualExclusions {
	private int numOfCluster;
	private Map map = new HashMap<Integer,String>();
	
	public SubsetsOfMutualExclusions(int numOfCluster) {
		this.numOfCluster = numOfCluster;
	}
	
	public void Add(int line,String type) {
		map.put(line, type);
	}
	
	public int getnumOfCluster() {
		return numOfCluster;
	}
	public Map getMap() {
		return map;
	}
}
