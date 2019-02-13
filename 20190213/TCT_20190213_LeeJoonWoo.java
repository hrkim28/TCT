package tct;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
public class TCT_20190213_LeeJoonWoo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("숫자를 입력하세요.");
        
        int input = sc.nextInt();
        
        int calcuratedInput = 1000001;
        int calcCount =0;
        
        //3으로 나누고 안되면 1 빼고 3으로 나누고 안되면 2로 나눔
        while(calcuratedInput == 1){
        	calcuratedInput = input;	        
        	if(calcuratedInput%3 == 0){
        		calcuratedInput = calcuratedInput/3;
        		calcCount++;
        	}else if((calcuratedInput-1)%3 == 0){
        		calcuratedInput = calcuratedInput/3;
        		calcCount++;
        	}else{
        		calcuratedInput = calcuratedInput/2;
        		calcCount++;
        	}    	
        }
        
        
        System.out.println(calcCount);

    }
    
}
