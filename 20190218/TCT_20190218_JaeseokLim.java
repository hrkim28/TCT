import java.util.Scanner;

public class TCT_20190218_JaeseokLim {
	static int zeroCnt = 0 ;
	static int oneCnt = 0 ; 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		int[] pivonacci  = new int[count];
		
		for ( int i = 0 ; i < count; i++) {
			pivonacci[i] = sc.nextInt();
		}
		
		for ( int i = 0 ; i < count; i++) {
			zeroCnt = 0 ;
			oneCnt = 0 ;
			calculatePiv(pivonacci[i]);
			System.out.println(zeroCnt + " " + oneCnt );
		}
		
    }
	
	private static int calculatePiv(int chk) {
		if ( chk == 0 ) {
			zeroCnt++;
			//System.out.println(zeroCnt  + " " + oneCnt); 
			return 0;
		} else if ( chk == 1) {
			oneCnt++;
			//System.out.println(zeroCnt  + " " + oneCnt);
			return 0;
		} else {
			return calculatePiv(chk-1) + calculatePiv(chk-2);
		}
		
	}
}
		