package fl.cluster;

import java.util.List;

public class XieBeni {
	public double exec(List<double[]> cover_F,double[][] U,double[][] V,int c,int m) {
		int n=U[0].length;
		int numOfLine = cover_F.get(0).length;
		double sum = 0;
		for(int i=0;i<c;i++) {
			for(int j=0;j<n;j++) {
				sum+=(Math.pow(U[i][j], m)*norm(cover_F,V,j,numOfLine,i));
			}
		}
		double min = 9999;
		for(int i=0;i<c;i++) {
			for(int j=i+1;j<c;j++) {
				double dis = norm(V[i],V[j],numOfLine);
				if(dis<min) {
					min=dis;
				}
			}
		}
		System.out.println(n+" "+min);
		return sum/(n*min);
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
