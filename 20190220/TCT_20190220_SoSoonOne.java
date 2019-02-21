
public class TCT_20190220_SoSoonOne {

	public static void main(String[] args){
        int[] input = {10, -4, 3, 1, 5, 6, -35, 12, 21, -1, 9};
        
        System.out.println(maxSum(input));
    	}
    	
    	private static int maxSum ( int[] n ){
    	
    		int max = 0;
    		int temp = 0;
    		
    		for(int i = 0 ; i < n.length-1 ; i ++){
    			temp = n[i];
    			for(int j = i+1; j < n.length ; j ++){
    				temp += n[j];
    				if(max < temp) max = temp;
    				//if(max > temp) continue;
    			}
    		}
    		
    		return max;
    		
    	}
    		
    	
}
