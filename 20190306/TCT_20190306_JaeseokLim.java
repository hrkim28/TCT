import java.util.Scanner;

public class TCT_20190306_JaeseokLim {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String testSet = sc.nextLine();
		
		System.out.println(fnChangeSet(testSet));
	
		
		
    }
	
	
	private static String fnChangeSet(String test) {
		
		String temp = "";
		
		int javaToC = 0;
		int cToJava = 0;
		
		boolean isError = false;
		
		
		if (test.charAt(0) >= 'a' && test.charAt(0) <= 'z') {
			temp = test.substring(0,1);
		} else { 
			isError = true;
		}
		
		
		if ( !isError ) {
			for ( int i = 1 ; i < test.length(); i++) {
				// 소문자인지 체크;
				if (test.charAt(i) >= 'a' && test.charAt(i) <= 'z') {
					temp += test.substring(i,i+1);
				} // 대문자인지 체크 
				else if (test.charAt(i) >= 'A' && test.charAt(i) <= 'Z') {
					temp = temp+ "_"+test.substring(i,i+1).toLowerCase();
					if ( cToJava != 0 ) {
						isError = true;
						break;
					}
					javaToC++;
				} // '_'인지 체크  + 마지막이 아닌지
				else if (test.charAt(i) == '_' && i != test.length()-1) {
					if (test.charAt(i+1) >= 'a' && test.charAt(i+1) <= 'z') {
						if ( javaToC != 0 ) {
							isError = true;
							break;
						}
						temp += test.substring(i+1,i+2).toUpperCase();
						i++;
						cToJava++;
					} else {
						isError = true;
						break;
					}
				} else {
					isError = true;
					break;
				}
				
				
			}
		}
		
		if (isError) {
			return "Error";
		} else {
			return temp;
		}
		
	}

}
	