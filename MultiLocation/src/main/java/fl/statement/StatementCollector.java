package fl.statement;

import java.util.ArrayList;
import java.util.List;

public class StatementCollector {
	private double U[][];
	private List<double[]> cover_F;
	private List<double[]> cover_S;
	private int c;//缺陷数量
	
	public StatementCollector(double[][] U,List<double[]> cover_F,List<double[]> cover_S) {
		this.cover_F = cover_F;
		this.cover_S = cover_S;
		this.U = U;
		this.c = U.length;
	}
	
	/** 用以创建cover_Fic */
	
	List<double[]> CreateCoverFic(int numOfTrouble) {
		List<double[]> cover_Fic = new ArrayList<>();//对于当前缺陷的CoverFic输出
		
		for(int i=0;i<U[numOfTrouble].length;i++) {//
			if(U[numOfTrouble][i]>1.0/c) {//TS_F中Uij大于1/c的TS_F将用以合成Mcover_Fic
				cover_Fic.add(cover_F.get(i));
			}
		}
		return cover_Fic;
	}
	
	/** 将cover_Fic分别与cover_S合并成一个矩阵 */
	
	List<double[]> MatrixCombination(int numOfTrouble) {
		List<double[]> cover = new ArrayList<>();//对于当前缺陷的合成后的Cover输出
		List<double[]> cover_Fic = CreateCoverFic(numOfTrouble);
		
		for(int i=0;i<cover_Fic.size();i++) {//加入cover_Fic的
			cover.add(cover_Fic.get(i));
		}
		
		return cover;
	}
	
	public List<List<double[]>> outputAllCover() {
		List<List<double[]>> output = new ArrayList<>();
		
		for(int i=0;i<c;i++) {
			List<double[]> res = MatrixCombination(i);
			output.add(res);
		}
		
		return output;
	}
}
