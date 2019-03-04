import java.util.ArrayList;



public class TCT_20190304_JaeseokLim {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		//Scanner sc = new Scanner(System.in);
		//int number = sc.nextInt();
		
		
		String[] testSet = {"madam","abab","lalavla"};
		//String[] testSet = {"abab"};
		
		
		for( int i = 0 ; i < testSet.length;i++ ) {
			System.out.println(fnPalinDrome(testSet[i]));
		}

		
		
    }
	
	
	private static int fnPalinDrome(String test) {
		ArrayList<String> palinStr = new ArrayList<String>();
		String temp = test;
		
		
		for ( int i = 1 ; i < test.length() ; i++) {
			String preStr= temp.substring(0,temp.length()/2);
			String backStr= temp.length()%2 == 0 ? temp.substring(temp.length()/2,temp.length()) : temp.substring(temp.length()/2+1,temp.length());
			
			StringBuilder strb = new StringBuilder();
			strb.append(preStr);
			if ( strb.reverse().toString().equals(backStr) ) {
				break;
			} else {
				String tempStr = temp.substring(temp.length()-i-1, temp.length()-i);
				if (palinStr.contains(tempStr)) {
					
				} else {
					palinStr.add(tempStr);
				}
				temp.concat(tempStr);
			}
		}
		
		return palinStr.size();
		
	}

}
	