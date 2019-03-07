import java.sql.Array;
import java.util.Arrays;


public class TCT_20190307_SoSoonOne {

	public static void main(String[] args){
        	int[] array = {20, 15, 10, 17};
		
        	System.out.println(isTree(7, array));
    	}
    	
    	private static int isTree (int n, int[] c){
    	
            Arrays.sort(c);
            int j = c[c.length-1];
            
            
            while(1==1){
            	int count = 0;
            	
            	for(int i = 0 ; i<c.length ; i ++){
            		if(c[i] - j > 0 ){
            			count += c[i] - j ;
            		}
            	}
            	if(count >= n){
            		break;
            	}else if(count < n){
            		j--;
            	}
            	
            }
            
            return j;
            
    	}
    		
    	
}
