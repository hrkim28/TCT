import java.util.HashMap;

public class   TCT_20190304_LeeKangKil{
	public static void main(String args[])  {
		printResult( "madam",makePalindrome ("madam"));
		printResult( "abab",makePalindrome ("abab"));
		printResult( "lalavla",makePalindrome ("lalavla"));
		printResult( "nursesr",makePalindrome ("nursesr"));
	        
	}
	public static void printResult(String inputStr, String resultStr){
		HashMap<String, Integer > map = new HashMap<String,Integer>(); 
		for(int i=inputStr.length(); i<resultStr.length() ;i++) map.put(String.valueOf(resultStr.charAt(i)), 0);			
		
		System.out.println(map.keySet().size() + " " +  map.keySet());
				
	}
	
	public static String makePalindrome(String inputStr){
		String result = "";
		//case1 전체길이가 홀수일경우
		for(int midIdx = inputStr.length()/2; midIdx<inputStr.length() ; midIdx++){
			
			StringBuffer  preString = new StringBuffer(inputStr.substring(0,midIdx ) );
			StringBuffer postString =new StringBuffer(inputStr.substring( inputStr.length()%2==0 ? midIdx : midIdx+1));
			
			if(preString.length() < postString.length() ) continue;
			
			boolean checkFlag = true;
			for(int i=0; i<postString.length(); i++){
				if(postString.charAt(i) != preString.charAt(preString.length()-1-i)){
					checkFlag = false;
					break;
				}
			}
			if(checkFlag)return preString.toString() + inputStr.charAt(preString.length())+ preString.reverse();
		}
		
		//case2 전체길이가 짝수일경우
		for(int midIdx = inputStr.length()/2; midIdx<inputStr.length() ; midIdx++){
			
			StringBuffer preString = new StringBuffer(inputStr.substring(0,midIdx-1) );
			StringBuffer postString =new StringBuffer(inputStr.substring( inputStr.length()%2==0 ? midIdx : midIdx+1));
			if(preString.length() < postString.length() ) continue;
			
			boolean checkFlag = true;
			for(int i=0; i<postString.length()-1; i++){
		
				if(postString.charAt(i) != preString.charAt(preString.length()-1-i)){
					checkFlag = false;
					break;
				}
			}
			if(checkFlag) return preString.toString() + inputStr.charAt(preString.length())+ preString.reverse();
		}
		return result;
	}
}
	


