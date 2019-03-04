import java.util.HashSet;
import java.util.Set;

public class TCT_20190304_LeeJinKyoung {
	public static void main(String[] args) {

		//String input = "madam";
		//String input = "abab";	
		String input = "lalavla";

		String conCatStr = "";

		Set<String> result = new HashSet<String>();
		
		for(int inx = 0; inx < input.length(); inx++) {			
			if( (input.length() + conCatStr.length())%2 == 1) {
				if(checkString(input + conCatStr)) {
					break;
				} else {
					conCatStr = input.charAt(inx) + conCatStr;
					result.add(String.valueOf(input.charAt(inx)));
				}
			} else {
				conCatStr = input.charAt(inx) + conCatStr;
				result.add(String.valueOf(input.charAt(inx)));
			}
		}
		System.out.println(result.toString());
	}
	
	public static boolean checkString(String input) {		
		boolean check = true;
		for(int inx = 0; inx < input.length()/2; inx++) {
			if(input.charAt(inx) != input.charAt(input.length()-(inx+1))) {
				check = false;
				break;
			}
		}
		
		return check;
	}
}