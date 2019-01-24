public class TCT_20190123_SoSoonOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int n = 16;
		//int[] r={2,5,3,3};
		
		System.out.println(divideNumber(n));
		
	}
	
	private static String divideNumber ( int n ){
		
		String result = "";
		int check = n%2; 
		int rNumber = 0;
		int lNumber = 0;
		
		if (checkPrime(n/2)){
			result = n/2 + " " + n/2;
		}else{
			lNumber = n/2+1;
			rNumber = n/2-1;
			while( !checkPrime(lNumber) || !checkPrime(rNumber)){
				lNumber ++;
				rNumber --;
			}
			result = rNumber + " " + lNumber;
		}
		
		return result;
		
	}
	
	private static boolean checkPrime( double n) {
		
		boolean result = true;
		
		for(int i = 2 ; i < n ; i ++){
			if( n % i == 0){
				result = false;
				return result;
			}
		}
			
        
        return result;
	}
	
}
