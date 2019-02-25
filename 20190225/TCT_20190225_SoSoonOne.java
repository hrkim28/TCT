
public class TCT_20190225_SoSoonOne {

	public static void main(String[] args){
        int[][] input = {{0,32,0,3},{3,13,1,0},{28,25,1,5},{39,0,6,0}};
        
        System.out.println(maxSum(input));
    	}
    	
    	private static int maxSum ( int[][] n ){
    	
    		int max = 0;
    		int temp1 = 0;
    		int temp2 = 0;
    		
    		for(int i = 0 ; i < n.length ; i ++){
    			temp1 += ( n[i][1] - n[i][0] )* 1000;
    			temp2 += ( n[i][3] - n[i][2] ) * 200;
    			
    			if(temp1+temp2 > max) max = temp1+temp2;
    		}
    		
    		return max;
    		
    	}
    		
    	
}
