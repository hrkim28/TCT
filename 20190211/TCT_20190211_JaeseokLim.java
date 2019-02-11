import java.util.ArrayList;
import java.util.Scanner;

public class TCT_20190211_JaeseokLim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int loopCnt = sc.nextInt();
		
		ArrayList<String> testCase = new ArrayList<String>();
		//중복 제거
		for ( int idx = 0 ; idx< loopCnt ; idx++ ) {
			testCase.add(sc.next());
		}
		//validate Monkey
		for ( int idx = 0 ; idx< loopCnt ; idx++ ) {
			if ( fnValidateMonkey(testCase.get(idx)) ) {
				System.out.println("OK");
			} else {
				System.out.println("FAKE");
			}
		}
    }
	
	private static boolean fnValidateMonkey(String monkeyString) {
		boolean isValid = true;
		
		String isCheckString = "";
		for ( int idx = 0 ; idx < monkeyString.length()-1; idx++ ) {
			String checkStr = monkeyString.substring(idx, idx+1);
			int count = 0 ;
			// checkString이면 pass
			if ( !isCheckString.contains(checkStr)) {
				for ( int jdx = idx ; jdx <= monkeyString.length()-1; jdx++ ) {
					//3의 배수 면서 
					String temp = monkeyString.substring(jdx, jdx+1);
					if ( temp.equals(checkStr)) {
						count++;
						if ( count % 3 == 0 ) {
							//다음수가 마지막이면, false, 그렇지 않다면 체크와 비교
							if( jdx == monkeyString.length()-1 ||  !monkeyString.substring(jdx+1, jdx+2).equals(checkStr)) {
								isValid = false;
							}
								
							
						}
					}
				}
			}
			isCheckString += checkStr;
			if ( !isValid) {
				return isValid;
			}
		}
		return isValid;
		
	}
	
}
