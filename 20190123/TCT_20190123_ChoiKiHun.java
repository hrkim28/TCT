public class TCT_20190123 {
		
	public static void main(String[] args){

		int n = 4;
		int[] naturalNumber = { 2, 5, 3, 3 };

		getXOR(n, naturalNumber);
		
    }
    
    public static void getXOR(int n, int[] naturalNumber){

    	int xorResult = 0;
    	ArrayList<Integer> oddsCount = new ArrayList<Integer>();
    	
    	for(int i=0 ; i<n ; i++) {
    		int current = naturalNumber[i];
    		int count = 0;
    		for(int j=0 ; j<n ; j++) {
    			if(current == naturalNumber[j])
    				count++;
    		}
    		
    		if(count%2 == 1)
    			oddsCount.add(naturalNumber[i]);
    		
    	}
    	
    	for(int i=0 ; i<oddsCount.size() ; i++) {
    		xorResult ^= oddsCount.get(i);
    	}
    	
    	System.out.println(xorResult);
    } 
	
}