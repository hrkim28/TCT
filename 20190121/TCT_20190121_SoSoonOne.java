import java.util.Scanner;

public class TCT_20190121_SoSoonOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int n = 4;
		int[] r={4,5,6,7};
		int[] p={1,2,1,9};
		int[] result = checkThree(n,r,p);
		
		for( int i = 0 ; i < n ; i ++){
			System.out.println(result[i]);
		}
	}
	
	private static int[] checkThree( int n, int[] r, int[] p ) {
		
		int[] result = new int[n];
		int lCnt = 0;
		int mCnt = 0;
		double max = 0.0d;
		
		for (int i = 0; i < n; i++) {
			if (r[i] > p[i]){
				lCnt++;
			}
			else if (r[i] < p[i]) {
				mCnt++;
				if(p[i] % 2 == 0){
					max = Math.max(max,(double)p[i] / r[i]); 
				}else{
					max = Math.max(max,(double)(p[i] + 1) / r[i]);
				}
			}
		}
		
		if (lCnt == 0 && mCnt == 0)
			return r;
		
		if (lCnt > 0 && mCnt == 0) {
			for (int i = 0; i < n; i++) {
				if (r[i] != p[i])
					result[i] = r[i] - p[i];
			}
			return result;
		}
		
		for (int i = 0; i < n; i++) {
			result[i] = (int)(r[i] * max) - p[i];
		}
		
		return result;
	}
	
}
