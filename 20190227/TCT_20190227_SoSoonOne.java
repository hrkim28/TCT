import java.util.Arrays;


public class TCT_20190227_SoSoonOne {

	public static void main(String[] args){
        
        	System.out.println(Arrays.toString(bestSet(3,13)));
    	}
    	
    	private static int[] bestSet (int n, int s){
    	
            int[] answer = new int[n];

            if(s<n)return new int[]{-1};

            for(int i = 0 ; i < n ; i ++) {
                answer[i] = s/n;
            }

            int x = s - s/n*n;
            int i = 0;

            while(x > 0) {

                answer[i]++;
                if(i == n ) {
                    i = 0;
                }else i++;

                x--;
            }

            Arrays.sort(answer);
            return answer;
    		
    	}
    		
    	
}
