public class TCT_20190117 {

	public static void main(String[] args){

		int n = 30;
        System.out.println(getDigitMania(n/3));
    }
    
    public static int getDigitMania( int n ){
        int caseCount = 0;
        int sum = 0;
        
        for(int first = 1 ; first < n-1 ; first++) {
        	for(int second = 1 ; second < n-1 ; second++) {
        		for(int third = 1 ; third < n ; third++) {
        			sum = first + second + third;
        			if(sum == n)
        				caseCount++;
        			
        			if(sum > n)
        				break;
        		}
        		
        	}
        }
        
        
        return caseCount;
    }
}