import java.util.*;


public class TCT_20190128_Kimsiwon {
	
	public static void main ( String[] args ) {
	
		//String input = "I think I'm lost.";
		String input = "I think I'm lost.I can't tell.";
		//String input = "I think I'm lost. I can't tell what's where.";
		
		String [] splitString = new String[input.length()];
		
		String returnAlpha = "";
		String tempAlpha = "";
		int returnCount = 0;
		int tempCount = 0;		
		
		for (int idx = 0; idx < input.length(); idx++) {
			splitString[idx] = input.substring(idx, idx + 1).toLowerCase();		
		}
		
		Arrays.sort(splitString);
			
		for (int idx = 0; idx < input.length(); idx++) {
			
			if (checkType(splitString[idx])) {
				if (splitString[idx].equals(tempAlpha)){
					tempCount = tempCount + 1;
				} else {
					if (tempCount > returnCount) {
						returnCount = tempCount;
						returnAlpha = tempAlpha;
					} else if (tempCount == returnCount) {
						returnAlpha = returnAlpha + ", " + tempAlpha;
					}
					
					tempCount = 1;
					tempAlpha = splitString[idx];
				}
				
			}			
		}
		
		if (tempCount > returnCount) {
			returnCount = tempCount;
			returnAlpha = tempAlpha;
		} else if (tempCount == returnCount) {
			returnAlpha = returnAlpha + ", " + tempAlpha;
		}
		
		System.out.println("가장 많이 쓰인 알파벳: " + returnAlpha + " = " + returnCount + "회");
		
	}
	
	public static boolean checkType(String input) {
		
		int index = input.charAt(0);
		
		if (index >= 65 && index <= 122) {
			return true;
		} else {
			return false;
		}
	}

}
