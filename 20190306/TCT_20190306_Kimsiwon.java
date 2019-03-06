import java.util.Scanner;

public class TCT_20190306_Kimsiwon {
	
	public static void main ( String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		String result = "";
		
		boolean upper = false;
				
		if(input.contains("_")) {
			for(int idx = 0; idx < input.length(); idx++) {
				if(!input.substring(idx, idx+1).equals("_")) {
					if(upper) {
						result = result + input.substring(idx,idx+1).toUpperCase();
					} else {
						result = result + input.substring(idx,idx+1);
					}
					
					upper = false;
				} else {
					upper = true;
				}
			}
			
		} else if (input.matches(".*[A-Z].*")) {
			for(int idx = 0; idx < input.length(); idx++) {
				if(input.charAt(idx)>=65 && input.charAt(idx)<=90) {
					result = result + "_" + input.substring(idx,idx+1).toLowerCase();						
				} else {
					result = result + input.substring(idx,idx+1);				
				}
			}				
		} else {
			result = input;
		}
		
		System.out.println(result);
		
	}

}
