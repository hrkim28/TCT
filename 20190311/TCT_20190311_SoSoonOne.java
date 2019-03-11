import java.sql.Array;
import java.util.Arrays;


public class TCT_20190311_SoSoonOne {

	public static void main(String[] args){
        	String ch= "{[(])}[{}]";
        	
        	char[] c = ch.toCharArray();
		
        	Arrays.sort(c);
        	System.out.println(c);
        	System.out.println(isOK(c));
    	}
    	
    	private static boolean isOK (char[] c){
    		
    		int[] arr = new int[15];
    	
    		if (c.length%2 != 0 ){
    			return false;
    		}else {
    			for(int i = 0 ; i<c.length ;i ++){
    				arr[(byte)c[i]%40]++;
    			}
    			if(arr[0] == arr[1] && arr[3] == arr[5] && arr[11] == arr[13]) return true;
    			else return false;
    		}
    	}
    		
}
