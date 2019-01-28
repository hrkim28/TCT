public class TCT_20190124_Kimsiwon {
	public static void main ( String[] args ) {
		
		int input = 16;
		
		int output = 0;
		
		for (int idx = 0; idx < input/2; idx++) {
			if(checkPrime(idx+1) && checkPrime(input-idx-1)) {
				output = idx + 1;
			}			
		}
		
		System.out.println(output + " / " + (input - output));
		
	}
	
	public static boolean checkPrime(int input) {
		
		//if (input == 1 || input == 2) {
		//	return true;
		//}
		
		for (int idx = 3; idx <= input/2; idx++) {
			if ((input%idx) == 0) {
				return false;
			}
		}
		
		return true;
	}
	
}