package fl.cluster;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//fcm3
public class FuzzyCmeans2 {
    private static final double E = Math.pow(10.0, -5);//停止阈值！
    public static Random randGen = new Random();//随机种子
    private List<double[][]> J = new ArrayList<>();//存过往的中心
    private double[][] U;//
    private int iter = 0;
    
    public double[][] fcm(List<double[]> cover_F,int numOfCluster,int numOfIter,int m){
        if(cover_F == null || cover_F.size() < 1 || m <= 1) {
            return null;
        }
        
        int numOfFailTest = cover_F.size();        // 数据行数 失败测试用例的数量
        int numOfLine = cover_F.get(0).length;    // 数据维数 代码行数（每个数据的长度）
        
        U = new double[numOfCluster][numOfFailTest];//每行自然对应一个自己的隶属度 即每个测试用例对应每个错误的隶属度
        for (int i = 0; i < numOfCluster; i++) {// 随机赋值
            for (int j = 0; j < numOfFailTest; j++) {    
                U[i][j] = randGen.nextDouble()*10;
            }
        }
        
        for (int j = 0; j < numOfFailTest; j++) {// 归一化        
            double sum_d = 0;
            for (int i = 0; i < numOfCluster; i++) {      
                sum_d += U[i][j];
            }
            for (int i = 0; i < numOfCluster; i++) {      
                U[i][j] = U[i][j] / sum_d;
            }
        }
        
        double[][] c = new double[numOfCluster][numOfLine];//随便拿两个测试用例初始化中心
        Random rand = new Random();
        for(int i=0;i<numOfCluster;i++) {
        	c[i] = cover_F.get(rand.nextInt(cover_F.size()));
//        	for(int j=0;j<numOfLine;j++) {
//        		System.out.print(c[i][j]+" ");
//        	}
//        	System.out.println();
        }
        
        boolean continueFlag = true;
        while(continueFlag) {
        	
        	boolean[] formula = new boolean[numOfFailTest];
        	double[][] distance = new double[numOfCluster][numOfFailTest];
        	for(int i=0;i<numOfFailTest;i++) {
        		formula[i] = true;
        	}
        	for(int i=0;i<numOfFailTest;i++) {
        		for(int j=0;j<numOfCluster;j++) {
        			double dis = norm(cover_F, c, i, numOfLine, j);
        			if(dis==0) {
        				formula[i] = false;
        			}
        			distance[j][i] = dis;
        		}
        	}
        	
        	for(int i=0;i<numOfFailTest;i++) {
        		for(int j=0;j<numOfCluster;j++) {
        			if(formula[i]) {
	        			double sum = 0;
	        			for(int k=0;k<numOfCluster;k++) {
	        				sum+=(Math.pow(norm(cover_F,c,i,numOfLine,j)/norm(cover_F,c,i,numOfLine,k), 2/(m-1)));
	        			}//for k
	        			U[j][i]=1/sum;
        			}
        			if(!formula[i]) {
        				if(distance[j][i]==0) {
        					U[j][i]=1;
        				}
        				else {
        					U[j][i]=0;
        				}
        			}
        		}
        	}
        	
//      for(int i=0;i<U[0].length;++i) {
//      	if(i+1<10) {
//      		System.out.printf(" test:%d   ",i+1);
//      	}
//      	if(i+1>=10 && i+1<100) {
//      		System.out.printf(" test:%d  ",i+1);
//      	}
//      	if(i+1>=100 && i+1<1000) {
//      		System.out.printf(" test:%d ",i+1);
//      	}
//      }
//      System.out.println();
//      for(int i=0;i<U[0].length;++i) {
//      	System.out.printf("%9f ",U[0][i]);
//      }
//      System.out.println();
//      for(int i=0;i<U[1].length;++i) {
//      	System.out.printf("%9f ",U[1][i]);
//      }
//      System.out.println();
      
      
        	for(int i=0;i<numOfCluster;i++) {
        		double sumOfU = 0;//存分母
        		double[] Uijm = new double[numOfFailTest];//存每个Uij的m次方
        		for(int k=0;k<numOfFailTest;k++) {
        			Uijm[k]=Math.pow(U[i][k], m);
        			sumOfU += Uijm[k];
        		}//for k
        	
        		for(int k=0;k<numOfLine;k++) {
        			double sumOfUd = 0;
        			for(int j=0;j<numOfFailTest;j++) {
        				sumOfUd+=(Uijm[j]*(cover_F.get(j))[k])/sumOfU;
        			}//for j
        			c[i][k] = sumOfUd;//每个c的维度都是cluster*line  因为他们的特征向量都是Line 每个位置的c（即论文中的vi）都来自于该行代码被每个测试用例的覆盖情况乘以其第i类聚类的个Uij的和  除以该第i类聚类的个Uij的和
        		}//for k
        	}//for i
        	J.add(c);
	        
	        double[] dis = new double[numOfCluster];//每个类分开的和上一次的欧式距离
	        if(iter>=1) {
	        	for(int i=0;i<numOfCluster;i++) {
	        		dis[i] = norm(J.get(iter)[i],J.get(iter-1)[i],numOfLine);//下标减1
	        	}

	        	int over = 0;
	        	for(;over<numOfCluster;over++) {
	        		if(dis[over]>=E) {
	        			break;
	        		}
	        	}
	        	if(over==numOfCluster) {
	        		for(int i=0;i<over;i++) {
	        			System.out.print(dis[i]+" ");
	        			System.out.println();
	        		}
	        		continueFlag = false;
	        	}
	        }
	        iter++;
	        System.out.println("迭代次数:"+iter);
        }
    	return U;
    }

	public double[][] getV(){
		return J.get(iter-1);
	}
	
    private static double norm(List<double[]> cover_F, double[][] c, int k, int numOfLine, int j) {
        double sum = 0;
        for (int i = 0; i < numOfLine; i++) {
            sum += Math.pow(((cover_F.get(k)[i]) - c[j][i]),2);
        }
        return Math.sqrt(sum);
    }
    private static double norm(double[] a,double[] b,int numOfLine) {
    	double sum = 0;
    	for(int i=0;i<numOfLine;i++) {
    		sum+=Math.pow(a[i]-b[i], 2);
    	}
    	return Math.sqrt(sum);
    }
}
