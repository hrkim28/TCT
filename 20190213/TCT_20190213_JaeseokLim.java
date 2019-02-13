import java.util.Scanner;

public class TCT_20190213_JaeseokLim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int chkIdx = sc.nextInt();
		
		System.out.println(fnLowerCnt(chkIdx));
    }
	
	private static int fnLowerCnt(int chkIdx) {
		// 우선순위를 나누기3을 우선순위로 하고, minus 1과 나누기2를 우선순위에 따라 결과값이 다르게 나옴
		// ex ) 17 -> minus 1우선순위 -> 17 -> 16 -> 15 -> 5-> 4-> 3 ->1 6번
		//      17 -> 나누기 2우선순위 -> 17 -> 16 -> 8 -> 4-> 2 ->1 5번  
		int returnVal;
		
		int priorTwo = fnPriorTwo(chkIdx);
		int priorMinus  = fnPriorMinus(chkIdx);
		
		if ( priorTwo <= priorMinus ) {
			returnVal = priorTwo;
		} else {
			returnVal = priorMinus;
		}
		
		
		return returnVal;
	}
	
	private static int fnPriorTwo(int chkIdx) {
		int retVal = 0;
		
		while ( chkIdx != 1) {
			if ( chkIdx % 3  == 0 ) {
				chkIdx = chkIdx/3;
				retVal++;
				continue;
			}
			
			if ( chkIdx % 2  == 0) {
				chkIdx = chkIdx/2;
				retVal++;
				continue;
			} else {
				chkIdx = chkIdx-1;
				retVal++;
				continue;
			}
		}
		
		return retVal;
		
	}
	
	private static int fnPriorMinus(int chkIdx) {
		int retVal = 0;
		
		while ( chkIdx != 1) {
			if ( chkIdx % 3  == 0 ) {
				chkIdx = chkIdx/3;
				retVal++;
				continue;
			} else {
				chkIdx = chkIdx-1;
				retVal++;
				continue;
			}
			
		}
		
		return retVal;
	}
}
		