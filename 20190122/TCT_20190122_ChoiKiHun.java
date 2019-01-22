public class TCT_20190122 {
	
	public static void main(String[] args){

		int n = 6;
		int[] stairsScore = { 10, 20, 15, 25, 10, 20 };

		getUpstairsScore(n, stairsScore);
		
    }
    
    public static void getUpstairsScore(int n, int[] stairsScore){

    	int maxSum = 0;
    	int consecutive = 0;
    	
    	for(int i=0 ; i<n ; i++) {

    		if(consecutive < 2) {
	    		maxSum += stairsScore[i];
	    		consecutive++;
    		}
    		else {
    			i++;
    			maxSum += stairsScore[i];
    			consecutive = 0;
    		}
    		
    		if(stairsScore[i+2] == stairsScore[n-1]) {
    			maxSum += stairsScore[n-1];
    			break;
    		}
    	}
    	
    	System.out.println(maxSum);
    } 
	
}