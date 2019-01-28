
public class TCT_20190124 {

	
	static ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
	
	public static void main(String[] args){

		int n = 16;
		getSumOfPrimeNumber(n);
    }
    
    public static void getSumOfPrimeNumber(int n){

    	getPrimeNumberList(n);
    	
    	int sum = 0;
    	int gap = 0;
    	int minGap = 10000;
    	String strResult = "";
    	
    	for(int i=0 ; i<primeNumbers.size() ; i++) {
    		for(int k=0 ; k<primeNumbers.size() ; k++) {
    			sum = primeNumbers.get(i) + primeNumbers.get(k);
    			if(sum == n) {
    				gap = Math.abs(primeNumbers.get(i)-primeNumbers.get(k));
    				if(gap < minGap) {
    					minGap = gap;
    					strResult = primeNumbers.get(i) + " " +  primeNumbers.get(k);
    				}
    			}
    		}
    	}
    	
    	System.out.println(strResult);
    } 
    
    public static ArrayList<Integer> getPrimeNumberList(int n) {
    	
    	for(int i=2 ; i<n ; i++) {
    		if(isPrime(i))
    			primeNumbers.add(i);
    	}
    	
    	return primeNumbers;
    }
    
    public static boolean isPrime(int p) {
    	
    	boolean primeYn = true;
    	
    	for(int i=2 ; i<=p ; i++) {
    		
    		if(p == i)
    			break;
    		
    		if(p%i != 0)
    			continue;
    		else {
    			primeYn = false;
    			break;
    		}
    	}
    	
    	return primeYn;
    }
	
}
