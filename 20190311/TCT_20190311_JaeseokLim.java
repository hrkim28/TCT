import java.util.Scanner;



public class TCT_20190311_JaeseokLim {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String check = sc.nextLine();
		
		
		
		System.out.println(fnCheckParity(check));
	
		
		
    }
	
	
	private static boolean fnCheckParity(String check) {
		
		
		String plus1 = "(";
		String plus2 = "[";
		String plus3 = "{";
		
		String minus1 = ")";
		String minus2 = "]";
		String minus3 = "}";
		
		int check1 = 0 ;
		int check2 = 0 ;
		int check3 = 0 ;
		
		boolean retVal = false;
		
		for ( int i = 0 ; i < check.length(); i++) {
			String temp = check.substring(i,i+1);
			if ( temp.equals(plus1)) {
				check1++;
			} else if ( temp.equals(plus2)) {
				check2++;
			} else if ( temp.equals(plus3)) {
				check3++;
			} else if ( temp.equals(minus1)) { 
				check1--;
			} else if ( temp.equals(minus2)) { 
				check2--;
			} else if ( temp.equals(minus3)) { 
				check3--;
			} else {
				check1 = 100;
				break;
			}
		}
		
		if(check1 == 0 && check2 == 0 && check3 == 0 ) {
			retVal = true;
		}
		
		return retVal;
		
	}

}
	