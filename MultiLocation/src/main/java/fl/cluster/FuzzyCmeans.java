package fl.cluster;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FuzzyCmeans {
	private static final double E_6 = 0;//停止阈值！
    public static Random randGen = new Random();//随机种子
    private double[][] U;
    private double[][] c;
    private double[][] c_old;
    private List<double[][]> J;
    private List<double[]> cover_F;
    private int numOfCluster;
    private int numOfIter;
    private int m;
    private int numOfFailTest;
    private int numOfLine;
    public FuzzyCmeans(List<double[]> cover_F,int numOfCluster,int numOfIter,int m) {
    	this.cover_F=cover_F;
    	this.numOfCluster=numOfCluster;
    	this.numOfIter=numOfIter;
    	this.m=m;
        this.numOfFailTest = cover_F.size();        // 数据行数 失败测试用例的数量
        this.numOfLine = cover_F.get(0).length;    // 数据维数 代码行数（每个数据的长度）
    	this.U=new double[numOfCluster][numOfFailTest];
    	this.c = new double[numOfCluster][numOfLine];
    	this.c_old = new double[numOfCluster][numOfLine];
    }
    public double[][] fcm(){
    	//判空
        if(cover_F == null || cover_F.size() < 1 || m <= 1) {
            return null;
        }
        
        // 数据行数 失败测试用例的数量
        int numOfFailTest = cover_F.size();        
        // 数据维数 代码行数（每个数据的长度）
        int numOfLine = cover_F.get(0).length;    
        
        //随机选取测试用力覆盖信息为聚类中心初始化
        for(int i=0;i<numOfCluster;i++) {
        	int test = randGen.nextInt(cover_F.size());
        	for(int j=0;j<numOfLine;j++) {
        		c[i][j]=cover_F.get(test)[j];
        	}
        }
        
        c_old = copy(c);//直接c_old=c 可能只赋值过去地址！

        //开始迭代
        for (int iter_i = 1; iter_i <= numOfIter; iter_i++) {
            boolean brk = OneSteo(cover_F, numOfCluster, m, numOfFailTest, numOfLine, iter_i);
            if(brk) {
                break;
            }
        }
    	return null;
    }
    
    boolean OneSteo(List<double[]> cover_F,int numOfCluster,int m,int numOfFailTest,int numOfLine,int iter_i) {
    	
    	/** 更新U */
    	
        boolean[] flag=new boolean[numOfFailTest];
        for(int i=0;i<numOfFailTest;i++) {
        	flag[i]=false;
        }
        
        //判断是否有那个用例距离某中心的距离为0（即为本身）
        double[][] distance = new double[numOfCluster][numOfFailTest];
        for(int j=0;j<numOfCluster;j++) {
        	for(int k=0;k<numOfFailTest;k++) {
        		if(norm(cover_F, c, k, numOfLine, j)==0){//datas.get(k)[i]) - c[j][i]
        			flag[k]=true;
        		}
        		distance[j][k]=norm(cover_F, c, k, numOfLine, j);
        	}
        }
        
        //更新U
    	for(int j=0;j<numOfCluster;j++) {
    		for(int k=0;k<numOfFailTest;k++) {
    			if(flag[k]) {
        			if(distance[j][k]==0) {
        				U[j][k]=1;
        			}
        			else {
        				U[j][k]=0;
        			}
    			}
    			else {
	                double sum1 = 0;
	                for (int j_a = 0; j_a < numOfCluster; j_a++) {
	                    sum1 += Math.pow((norm(cover_F, c, k, numOfLine, j)/norm(cover_F, c, k, numOfLine, j_a)), 2/(m-1));
	                }
	                U[j][k] = 1/sum1;
    			}
    		}
    	}
        
    	/** 更新聚类中心 */
    	
    	
        for (int j = 0; j < numOfCluster; j++) {
            double[] U_ij_m = new double[numOfFailTest];//U_ij_
            double sum_U_ij = 0;
            //求∑u^m
            for (int i = 0; i < numOfFailTest; i++) {
                U_ij_m[i] = Math.pow(U[j][i], m);
                sum_U_ij += U_ij_m[i];
            }
            //求每个vi
            for (int k = 0; k < numOfLine; k++) {
                double sum_c = 0;
                for (int i = 0; i < numOfFailTest; i++) {
                    sum_c += (U_ij_m[i])*((cover_F.get(i))[k])/sum_U_ij;
                }
                c[j][k] = sum_c;//c为聚类中心
            }
        }
        
        /** 判断前后两次聚类中心是否不再变化 */
        
        List<Double> diss = new ArrayList<Double>();
        for(int i=0;i<numOfCluster;i++) {
        	double dis=norm(c_old[i],c[i],numOfLine);
        	if(dis>=E_6){
        		c_old = copy(c);
        		return false;
        	}
        	diss.add(dis);
        }
        return true;
    }
    
    /** 计算欧式距离公式1 */
    
    private static double norm(List<double[]> datas, double[][] c, int k, int num_d, int j) {
        double sum = 0;
        for (int i = 0; i < num_d; i++) {
            sum += Math.pow(((datas.get(k)[i]) - c[j][i]),2);
        }
        return Math.sqrt(sum);
    }
    
    /** 计算欧式距离公式2 */
    
    private static double norm(double[] a,double[] b,int numOfLine) {
    	double sum = 0;
    	for(int i=0;i<numOfLine;i++) {
    		sum+=Math.pow(a[i]-b[i], 2);
    	}
    	return Math.sqrt(sum);
    }
    
    /** 二维数组赋值 */
    
    double[][] copy(double[][] c){
    	int a = c.length;
    	int b = c[0].length;
    	double[][] c_old = new double[a][b];
    	for(int i=0;i<a;i++) {
    		for(int j=0;j<b;j++) {
    			c_old[i][j]=c[i][j];
    		}
    	}
    	return c_old;
    }
    
    /** 返回U */
    
    public double[][] getU(){
    	return this.U;
    }
}
