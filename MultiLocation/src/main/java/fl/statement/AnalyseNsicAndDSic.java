package fl.statement;

import java.util.ArrayList;
import java.util.List;

public class AnalyseNsicAndDSic {
	private List<double[]> cover_Fic;
	private List<double[]> cover_S;
	private int numOfLine;
	private int numOfSuccessTest;
	private int numOfFailTest;
	private List<Quad> Quads;//存四元组的
	private SubsetsOfMutualExclusions SOME;
	
	public AnalyseNsicAndDSic(List<double[]> cover_Fic,List<double[]> cover_S,int numOfCluster) {
		this.cover_Fic = cover_Fic;
		this.cover_S = cover_S;
		this.numOfLine = cover_Fic.get(0).length;
		this.numOfFailTest = cover_Fic.size();
		this.numOfSuccessTest = cover_S.size();
		this.Quads = new ArrayList<>();
		this.SOME = new SubsetsOfMutualExclusions(numOfCluster);
	}
	
	/** 获得四元组信息 */
	
	List<Quad> getNsic() {
		for(int i=0;i<numOfLine;i++) {//先统计失败的
			int ncf = 0;
			int nuf = 0;
			int ncs = 0;
			int nus = 0;
			for(int j=0;j<numOfFailTest;j++) {//失败数据
				if(cover_Fic.get(j)[i] == 1) {
					ncf++;
				}
				if(cover_Fic.get(j)[i] != 1) {
					nuf++;
				}
			}
			
			for(int j=0;j<numOfSuccessTest;j++) {//成功数据
				if(cover_S.get(j)[i] == 1) {
					ncs++;
				}
				if(cover_S.get(j)[i] != 1) {
					nus++;
				}
			}
			Quad quad = new Quad(i,ncf,nuf,ncs,nus);
			Quads.add(quad);
		}
		return Quads;
	}
	
	/** 生成互斥矩阵 */
	
	public void getDCis() {
		List<Quad> Quads = getNsic();
		for(int i=0;i<numOfLine;i++) {
			if(Quads.get(i).getNcf()==numOfFailTest && Quads.get(i).getNcs()==0) {//全失败 0成功
				SOME.Add(i,"SI");
			}
			if(Quads.get(i).getNcf()==numOfFailTest && Quads.get(i).getNcs()>0 && Quads.get(i).getNcs()<numOfSuccessTest) {//全失败 部分成功
				SOME.Add(i,"SII");
			}
			if(Quads.get(i).getNcf()==numOfFailTest && Quads.get(i).getNcs()==numOfSuccessTest) {//全失败 全成功
				SOME.Add(i,"SIII");
			}
			if(Quads.get(i).getNcf()>0 && Quads.get(i).getNcf()<numOfFailTest && Quads.get(i).getNcs() == 0) {//部分失败 0成功
				SOME.Add(i,"SIV");
			}
			if(Quads.get(i).getNcf()>0 && Quads.get(i).getNcf()<numOfFailTest && Quads.get(i).getNcs()>0 && Quads.get(i).getNcs()<numOfSuccessTest) {//部分失败 部分成功
				SOME.Add(i,"SV");
			}
			if(Quads.get(i).getNcf()>0 && Quads.get(i).getNcf()<numOfFailTest && Quads.get(i).getNcs()==numOfSuccessTest) {//0失败 全部成功
				SOME.Add(i,"SVI");
			}
			if(Quads.get(i).getNcf()==0 && Quads.get(i).getNcs()==0) {//0失败 0成功
				SOME.Add(i,"SVII");
			}
			if(Quads.get(i).getNcf()==0 && Quads.get(i).getNcs()>0 && Quads.get(i).getNcs()<numOfSuccessTest) {//0失败 部分成功
				SOME.Add(i,"SVIII");
			}
			if(Quads.get(i).getNcf()==0 && Quads.get(i).getNcf()<numOfFailTest && Quads.get(i).getNcs()>0 && Quads.get(i).getNcs()<numOfSuccessTest) {//0失败 全成功
				SOME.Add(i,"SIX");
			}

		}
		
	}
	
	public SubsetsOfMutualExclusions getSOME() {
		getDCis();
		return SOME;
	}
	
	public List<Quad> getQuads(){
		getNsic();
		return Quads;
	}
}
