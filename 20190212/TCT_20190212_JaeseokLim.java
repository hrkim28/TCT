import java.util.ArrayList;
import java.util.Scanner;

public class TCT_20190212_JaeseokLim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int chkIdx = sc.nextInt();
		
		int lowerChk = fnOnlyOneUse(chkIdx-1,false);
		int upperChk = fnOnlyOneUse(chkIdx+1,true);
		if ( chkIdx-lowerChk <= upperChk-chkIdx ) {
			System.out.println(lowerChk);
		} else {
			System.out.println(upperChk);
		}
    }
	
	private static int fnOnlyOneUse(int chkIdx,boolean direction) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		int tempChk = chkIdx;
		
		boolean isOnlyUse = true;
		while ( tempChk > 0 ) {
			if ( temp.contains(tempChk%10) ) {
				isOnlyUse = false;
				break;
			} else {
				temp.add(tempChk%10);
				tempChk -= tempChk%10;
				tempChk = tempChk/10;
			}
		}
		if ( isOnlyUse) {
			return chkIdx;
		} else {
			if( direction ) {
				return fnOnlyOneUse(chkIdx+1,direction);
			} else {
				return fnOnlyOneUse(chkIdx-1,direction);
			}
		}
		
	}
}
		