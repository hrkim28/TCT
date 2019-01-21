public class TCT_20190118 {

	public static void main(String[] args){

		int n = 4;
		int[] stdArray2 = { 4, 6, 2, 4 };
		int[] spoilArray2 = { 6, 4, 2, 4 };
		getMagicSolution(n, stdArray2, spoilArray2);
		
		int[] stdArray3 = { 4, 6, 2, 4 };
		int[] spoilArray3 = { 7, 4, 2, 4 };
		getMagicSolution(n, stdArray3, spoilArray3);
		
		n = 3;
		int[] stdArray1 = { 4, 5, 6 };
    	int[] spoilArray1 = { 1, 2, 3 };
		getMagicSolution(n, stdArray1, spoilArray1);
    }
    
    public static void getMagicSolution(int n, int[] stdArray, int[] spoilArray){

    	int firstCase = 0;
    	int secondCase = 0;
    	StringBuffer sbResult = new StringBuffer();
    	
    	for(int i=0 ; i<n ; i++) {
    		if(stdArray[i] >= spoilArray[i])
    			firstCase++;
    	}
    	
    	if(firstCase == n) {
    		for(int i=0 ; i<n ; i++) {
    			sbResult.append(stdArray[i] - spoilArray[i]);
    			sbResult.append(" ");
    		}
    	}
    	else {
    		for(int i=0 ; i<n ; i++) {
    			if(commonDivideExist(stdArray[i], spoilArray[i]))
    				secondCase++;
    		}
    	}
    	
    	if(secondCase == n) {
    		for(int i=0 ; i<n ; i++) {
    			sbResult.append((int)(stdArray[i] * 1.5) - spoilArray[i]);
    			sbResult.append(" ");
    		}
    	}
    	
    	if(firstCase != n && secondCase != n){
    		for(int i=0 ; i<n ; i++) {
    			sbResult.append((stdArray[i] * 2) - spoilArray[i]);
    			sbResult.append(" ");
    		}
    	}
    	
    	System.out.println(sbResult);
    }
    
    public static boolean commonDivideExist(int a, int b) {
    	
    	for(int i=2 ; i<=a ; i++) {
    		if(a%i == 0) {
    			if(b%i == 0)
    				return true;
    		}
    	}
    	
    	return false;
    }
	
}