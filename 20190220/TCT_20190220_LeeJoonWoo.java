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
       
        //���õ� �� ���ڰ� ��� ���Դ��� �����ϴ�  Map
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
        System.out.println("���� ū ���� :"+maxSum);
        System.out.println("====================================");

    }
    
}
