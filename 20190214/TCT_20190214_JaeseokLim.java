import java.util.Scanner;

public class TCT_20190214_JaeseokLim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int chkIdx = sc.nextInt();
		
		int[][] parity = new int[chkIdx][chkIdx];
		for ( int i = 0 ; i < chkIdx; i++) {
			for ( int j = 0 ; j < chkIdx; j++) {
				parity[i][j] = sc.nextInt();
			}
		}
		System.out.println(parityCheck(parity));
		
		//System.out.println(fnLowerCnt(chkIdx));
    }
	
	private static String parityCheck(int[][] parity) {
		// 가로 세로로 sum을 하여 sum%2가 모두 0 OK  
		// 가로, 세로  1개씩이면 ChangeBit
		// 2개 이상이면( Corrupt )
		int garoHol =0;
		int seroHol = 0;
		//가로 체크
		int garoCount = 0 ;
		for (int i =0 ; i < parity.length; i++) {
			int tempSum = 0;
			for ( int j=0; j< parity[i].length;j++) {
				tempSum += parity[i][j];
			}
			if ( tempSum%2 != 0 ) {
				garoCount++;
				garoHol = i+1;
			}
			if ( garoCount > 1) {
				return "Corrupt";
			}
		}
		
		//세로 체크
		int seroCount = 0 ;
		for (int i =0 ; i < parity.length; i++) {
			int tempSum = 0;
			for ( int j=0; j< parity.length;j++) {
				tempSum += parity[j][i];
			}
			if ( tempSum%2 != 0 ) {
				seroCount++;
				seroHol = i+1;
			}
			if ( seroCount > 1) {
				return "Corrupt";
			}
		}
		
		if ( garoCount == 0  && seroCount == 0 ) {
			return "OK";
		} else if ( garoCount == 1  && seroCount == 1 ) {
			return "ChangeBit("+garoHol+","+seroHol+")";
		} else {
			return "Corrupt";
		}
	}
}
		