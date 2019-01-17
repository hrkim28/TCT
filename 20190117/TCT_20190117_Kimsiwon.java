public class TCT_20190117_Kimsiwon {
	public static void main ( String[] args ) {
		
		int input = 63;
		int div = 0;
		int maxNum = 0;
		int output = 0;
		
		System.out.println("Input: " + input);	
		
		if ( input%3 == 0 ) {
			
			if ( input >= 9 ) {
				div = input / 3;
				maxNum = div - 2;
				
				
				for ( int idx = 0; idx < maxNum; idx++ ) {
					for ( int jdx = 0; jdx < maxNum; jdx++ ) {
						if ( idx + jdx + 2 < div) {
							output = output + 1;
							System.out.println("[ " + 3*(idx+1) + ", " + 3*(jdx+1) + ", " + 3*(div-idx-jdx-2) + " ]");
						}
					}
				}
				
			}else {
				System.out.println("Input number must equal or be more than 9");
			}
			
		}else {
			System.out.println("Input is not multiple of 3");
		}
		
		System.out.println("Output: " + output);		
	}

}