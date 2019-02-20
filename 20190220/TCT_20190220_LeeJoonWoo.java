package tct;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
public class TCT_20190220_LeeJoonWoo {

    /**
     * @param args
     */
    public static void main(String[] args) {
                
        String input = "10 -4 3 1 5 6 -35 12 21 -1";
        
        StringTokenizer tokenInput = new StringTokenizer(input, " ");
       
        //선택된 각 숫자가 몇번 나왔는지 저장하는  Map
        HashMap<String, Integer> countedMapList = new HashMap<String, Integer>();
        
        int maxSum =0;
        int sum =0;
        int tokenedNum =0;
        
        while(tokenInput.hasMoreElements()){
        	tokenedNum =	Integer.parseInt(tokenInput.nextToken());
        	
        	if(tokenedNum >= 0){
        		sum = sum + tokenedNum;
        		if( sum > maxSum) {
        			maxSum = sum;
        		}
        	}else{
        		sum = 0;
        	}
        }
        
        
        System.out.println("===================================="); 
        System.out.println("가장 큰 숫자 :"+maxSum);
        System.out.println("====================================");

    }
    
}
