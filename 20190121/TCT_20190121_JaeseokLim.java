import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TCT_20190121_JaeseokLim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("n : ");
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			
			System.out.print("r : ");
			int[] r = inputMedicine(br,n);
			
			System.out.print("p : ");
			int[] p = inputMedicine(br,n);
			
			calculateMedicine(n,r,p);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
	
	private static int[] inputMedicine(BufferedReader br,int n) throws Exception {
		int[]  r = new int[n];
		String rTxt = br.readLine();
		String[] rSplit = rTxt.split(" ");
		for ( int i = 0; i< n; i++) {
			r[i] = Integer.parseInt(rSplit[i]);
		}
		return r;
	}
	
	private static void calculateMedicine(int n,int[] r,int[] p) {
		int[] tempArr = Arrays.copyOf(r, r.length);
		//최적화
		boolean divAble = true;
		while(divAble) {
			for ( int i = 0 ; i < n;i++) {
				if ( tempArr[i]% 2 != 0 ) {
					divAble = false;
				}
			}
			// 2로 나눠진다면
			if ( divAble ) {
				for ( int i = 0 ; i < n;i++) {
					tempArr[i] = tempArr[i]/2;
				}
			}
		}
		//최소 곱 구하기
		int maxVal = 1;
		int temp = 1;
		//최적화된 곱의 값
		for ( int i = 0 ; i < n; i++) {
			 if ( p[i] <= tempArr[i]) {
				 temp = 1;
			 } else {
				 temp = p[i]/tempArr[i] + p[i]%tempArr[i];
			 }
			 if ( maxVal <= temp ) {
				 maxVal = temp;
			 }
			
			 
		}
		//최적화된 값 출력
		for ( int i = 0 ; i < n ; i++) {
			System.out.print(tempArr[i]*maxVal-p[i] + " ");
		}
		
		
		
		
		
	}

}
