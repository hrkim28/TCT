import java.util.*;


public class TCT_20190129_Kimsiwon {
	
	public static void main ( String[] args ) {
		
		//String input = "9+5-4+8";
		String input = "5+6*3-6/2+5";
		
		ArrayList<String> num = new ArrayList<String>();
		ArrayList<String> oper = new ArrayList<String>();
		String tempNum = "";
		int removePos = 0;
		int modNum = 0;
		String returnString = "";
		
		for (int idx = 0; idx < input.length(); idx++) {
			if (input.substring(idx, idx+1).matches("^[0-9]*$")) {
				tempNum = tempNum + input.substring(idx, idx+1);
			} else {
				num.add(tempNum);
				tempNum = "";
				oper.add(input.substring(idx, idx+1));
			}			
		}
		num.add(tempNum);
		
		while (oper.size() > 0) {
			returnString = "";
			
			if (oper.indexOf("*") > -1) {
				if (oper.indexOf("/") > -1 && oper.indexOf("/") < oper.indexOf("*")) {
					removePos = oper.indexOf("/");					
				} else {
					removePos = oper.indexOf("*");
				}				
			} else {
				if (oper.indexOf("/") > -1) {
					removePos = oper.indexOf("/");
				} else {
					removePos = 0;
				}
			}
			
			switch(oper.get(removePos)) {
				case "*": modNum = Integer.parseInt(num.get(removePos)) * Integer.parseInt(num.get(removePos+1)); break;
				case "/": modNum = Integer.parseInt(num.get(removePos)) / Integer.parseInt(num.get(removePos+1)); break;
				case "+": modNum = Integer.parseInt(num.get(removePos)) + Integer.parseInt(num.get(removePos+1)); break;
				case "-": modNum = Integer.parseInt(num.get(removePos)) - Integer.parseInt(num.get(removePos+1)); break;			
			}
			
			num.set(removePos, String.valueOf(modNum));
			num.remove(removePos + 1);
			oper.remove(removePos);
			
			for (int idx = 0; idx < oper.size(); idx++) {
				returnString = returnString + num.get(idx) + oper.get(idx);				
			}
			returnString = returnString + num.get(oper.size());
			
			System.out.println(returnString);
			
		}
		
	}
	
	
}
