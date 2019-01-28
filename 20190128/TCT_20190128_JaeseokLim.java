import java.util.HashMap;

public class TCT_20190128_JaeseokLim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String tc = "I think I'm lost. I can't tell what's where.";
		
		printManyUse(tc);
    }
	
	private static void printManyUse(String testCase) {

		int manyCnt = 0;
		HashMap<String,Integer> alphaCnt = new HashMap<String,Integer>();
		
		for ( int i = 0 ; i < testCase.length()-1;i++ ) {
			String chkStr = testCase.substring(i, i+1).toLowerCase();
			if ( isAlphabet(chkStr)) {
				int putCnt = alphaCnt.containsKey(chkStr) == false ? 1 : alphaCnt.get(chkStr) + 1 ;
				alphaCnt.put(chkStr,putCnt);
				
				if ( putCnt > manyCnt ) {
					manyCnt = putCnt;
				}
			}
		}
		
		String result = "";
		
		for ( String key : alphaCnt.keySet() ) { 
			if ( alphaCnt.get(key) == manyCnt ) { 
			   	result = result == "" ?  key : result + " , " +key; 
			} 
		} 

		result = result + " : " + manyCnt;
		System.out.println("[Case] " + testCase + " / [°á°ú] " + result);
		
	}
	
	private static boolean isAlphabet(String tc) {
		int chkStrNum = (int)tc.charAt(0);
		if ( chkStrNum >=(int)'a' && chkStrNum <= 'z') {
			return true;
		} else {
			return false;
		}
		
	}
}
