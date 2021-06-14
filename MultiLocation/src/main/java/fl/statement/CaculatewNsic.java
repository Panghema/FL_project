package fl.statement;

import java.util.ArrayList;
import java.util.List;

public class CaculatewNsic {
	private double[][] U;
	private List<double[]> cover_Fic;
	private List<double[]> cover_S;
	private List<Quad> wQuads;
	private int wncf;
	private int wnuf;
	private int wncs;
	private int wnus;
	private int numOfFailTest;
	private int numOfSuccessTest;
	private int numOfTrouble;
	private int numOfLine;
	private int numOfCluster;
	public CaculatewNsic(double[][] U,List<double[]> cover_Fic,List<double[]> cover_S,int numOfTrouble,int numOfCluster) {
		this.U = U;
		this.cover_Fic = cover_Fic;
		this.cover_S = cover_S;
		this.wQuads = new ArrayList<>();
		this.wncf = 0;
		this.wnuf = 0;
		this.wncs = 0;
		this.wnus = 0;
		this.numOfFailTest = cover_Fic.size();//1477?
		this.numOfSuccessTest = cover_S.size();
		this.numOfTrouble = numOfTrouble;//
		this.numOfLine = cover_Fic.get(0).length;
		this.numOfCluster = numOfCluster;
	}
	
	/** 计算带权四元组 */
	
	double getwNcf(int numOfLine) {
		double sum=0;
		int i=0;
		int j=0;
		while(i<numOfFailTest) {
			if(U[numOfTrouble][j]>1/(double)numOfCluster) {
				sum+=(U[numOfTrouble][j]*cover_Fic.get(i)[numOfLine]*1);
				i++;
			}
			j++;
		}
		return sum;
	}
	
	double getwNuf(int numOfLine) {
		double sum=0;
		int i=0;
		int j=0;
		while(i<numOfFailTest) {
			if(U[numOfTrouble][j]>1/(double)numOfCluster) {
				sum+=(U[numOfTrouble][j]*(1-cover_Fic.get(i)[numOfLine])*1);
				i++;
			}
			j++;
		}
		return sum;
	}
	
	double getwNcs(int numOfLine) {
		double sum=0;
		double sumOfU=0;
		int i=0;
		int j=0;
		while(i<numOfFailTest) {
			if(U[numOfTrouble][j]>1/(double)numOfCluster) {
				sumOfU+=U[numOfTrouble][j];
				i++;
			}
			j++;
		}
		i=0;
		double dnumOfFailTest = numOfFailTest;
		while(i<numOfSuccessTest) {
			sum+=(sumOfU/dnumOfFailTest*cover_S.get(i)[numOfLine]*(1-0));
			i++;
		}
		return sum;
	}
	
	double getwNus(int numOfLine) {
		double sum=0;
		double sumOfU=0;
		int i=0;
		int j=0;
		while(i<numOfFailTest) {
			if(U[numOfTrouble][j]>1/(double)numOfCluster) {
				sumOfU+=U[numOfTrouble][j];
				i++;
			}
			j++;
		}
		i=0;
		double dnumOfFailTest = numOfFailTest;
		while(i<numOfSuccessTest) {
			sum+=(sumOfU/dnumOfFailTest*(1-cover_S.get(i)[numOfLine])*(1-0));
			i++;
		}
		return sum;
	}
	
	public List<Quad> createwNsic() {
		for(int i=0;i<numOfLine;i++) {
			Quad wquad = new Quad(i,getwNcf(i),getwNuf(i),getwNcs(i),getwNus(i));
			wQuads.add(wquad);
		}
		return wQuads;
	}
}
