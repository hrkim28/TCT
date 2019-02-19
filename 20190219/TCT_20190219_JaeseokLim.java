
public class TCT_20190219_JaeseokLim {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		//Scanner sc = new Scanner(System.in);
		
		
		//int count = sc.nextInt();
		
		String[] inputTest1 = {"img12.png","img10.png","img02.png","img01.png","IMG01.GIF","img2.JPG"};
		fnFileSort(inputTest1);
		String[] inputTest2 = {"F-5 Freedom Fighter","B-50 Superfortress","A-10 ThunderboltB","F-14 Tomcat"};
		fnFileSort(inputTest2);
		
		
		
    }
	
	private static void fnFileSort(String[] testCase) {
		//bubble sort + Swap
		
		for ( int i = 0 ; i < testCase.length-1; i++) {
			
			for ( int j=i+1 ; j < testCase.length; j++) {
				String temp = "";
				
				if ( fnFindHeader(testCase[i]).compareTo(fnFindHeader(testCase[j]))>0 ) {
					 temp  = testCase[i];
					 testCase[i] = testCase[j];
					 testCase[j] = temp;
					 continue;
				} else if (fnFindHeader(testCase[i]).compareTo(fnFindHeader(testCase[j])) == 0) {
					if ( fnFindNumber(testCase[i]) > fnFindNumber(testCase[j]) ) {
						 temp  = testCase[i];
						 testCase[i] = testCase[j];
						 testCase[j] = temp;
						 continue;
					}
				}
			}
		}
		
		for ( int i = 0 ; i < testCase.length; i++) {
			System.out.print(testCase[i]+ " ");
		}
		System.out.println(" ");
		
		
	}
	
	private static String fnFindHeader(String str) {
		String temp = str;
		String numberStr = "0123456789";
		for ( int idx =0; idx < temp.length();idx++) {
			if ( numberStr.contains(temp.substring(idx, idx+1))) {
				temp = temp.substring(0,idx).toLowerCase();
				break;
			}
		}
		return temp;
	}
	
	private static int fnFindNumber(String str) {
		String temp = str;
		String numberStr = "0123456789";
		String rtnNum = "";
		for ( int idx =0; idx < temp.length();idx++) {
			if ( numberStr.contains(temp.substring(idx, idx+1))) {
				rtnNum += temp.substring(idx,idx+1);
			}
		}
		return Integer.parseInt(rtnNum);
	}
}
		