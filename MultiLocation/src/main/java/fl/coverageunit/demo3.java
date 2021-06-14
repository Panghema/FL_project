package fl.coverageunit;

public class demo3 {
	int mid(int x,int y,int z) {//1,2,3
		int mid=z;
		if(y<z) {
			if(x<y) {
				mid=y;
			}
			else if(x<z) {
				mid=y;//正确的是mid=x
			}
		}
		else {
			if(x>y) {
				mid=z;//正确的是mid=y
			}
			else if(x>z) {
				mid=x;
			}
		}
		return mid;
	}
}