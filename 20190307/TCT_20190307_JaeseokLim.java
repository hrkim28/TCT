import java.util.Arrays;
import java.util.Scanner;



public class TCT_20190307_JaeseokLim {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int namuCnt = sc.nextInt();
		int wantMeter = sc.nextInt();
		int[] namu = new int[namuCnt];
		for ( int i = 0 ; i < namuCnt; i++) {
			namu[i] = sc.nextInt();
		}
		
		System.out.println(fnMinMeter(namu,wantMeter));
	
		
		
    }
	
	
	private static int fnMinMeter(int[] namu,int wantMeter) {
		
		int retVal = 0;
		int tempM = 0 ;
		
		Arrays.sort(namu);
		retVal = namu[namu.length-1]; 
		
		while (true) {
			for ( int i =0 ; i< namu.length; i ++) {
				if ( namu[i]> retVal) {
					tempM += namu[i] - retVal;
				}
			}
			if ( tempM >= wantMeter ) {
				break;
			} else {
				retVal --;
				tempM = 0;
			}
		}
		
		
		
		
		return retVal;
		
	}

}
	