package test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class TCT_NaTaeUng {
    
    public static void main(String args[]) throws IOException {
        run();
    }
    
    /*
    works N result
    [4, 3, 3] 4 12
    [2, 1, 2] 1 6
    [1,1] 3 0
    */
   
    public static void run() throws IOException {
    	int works[] = {4,3,3};
    	int N = 4;
    	int maxidx = 0;
    	int result = 0;
    	System.out.print("[");
    	for(int j = 0; j < works.length; j++) {
    		if(j !=0 ) System.out.print(",");
    		System.out.print(works[j]);
    		
    	}
    	System.out.print("]");
    	
    	for(int i = 0 ; i < N; i++) {
    		for(int j = 0; j < works.length; j++) {
    			if(works[maxidx] <= works[j]) {
    				maxidx = j;
    			}
    		}    		
    		if(works[maxidx] != 0) works[maxidx] = works[maxidx]-1;
    	}
        
    	for(int j = 0; j < works.length; j++) {
    		
			result = (int) (result + Math.pow(works[j], 2));
		}
    	 System.out.println(" " + N + " " + result);
      }
}
