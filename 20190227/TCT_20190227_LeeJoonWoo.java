package tct;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
public class TCT_20190227_LeeJoonWoo {

    /**
     * @param args
     */
    public static void main(String[] args) {
    	
    	    	
    	Scanner sc = new Scanner(System.in);
    	int listSize = sc.nextInt();
    	int totalSum = sc.nextInt();
        
	    
	    int maxNumber = (int) Math.pow(10, listSize)-1;
	    
	    int ingSum = 0;
	    int tryToltalSum = 0;
	    int tryToltalMulti = 1;
	    int maxInt =0;
	    
	    
	    String ingSumString = "";
	    String finalString = "";
	    for(int i=0 ; i<maxNumber; i++){
	    	ingSum = ingSum++;
	    	ingSumString = Integer.toString(ingSum);
	    	if(ingSum >= maxNumber/9 && !ingSumString.contains("0") ){
	    		for(int j=0; j<ingSumString.length(); j++){
	    			tryToltalSum = tryToltalSum + Integer.parseInt(ingSumString.substring(j,j+1));
	    			tryToltalMulti = tryToltalMulti * Integer.parseInt(ingSumString.substring(j,j+1));
	    		}
	    		if(tryToltalSum == totalSum && tryToltalMulti > maxInt){
	    			maxInt = tryToltalMulti;
	    			finalString = ingSumString;
	    		}
	    				
	    	}
	    }
	    ArrayList returnList = new ArrayList();
	    for(int i=0; i<finalString.length(); i++){
	    	returnList.add(i, ingSumString.substring(i,i+1));
	    }
        //객체를 return하면 값이 안보이니깐 String으로 return
        System.out.println("===================================="); 
        System.out.println("결과값 :"+finalString);
        System.out.println("====================================");

    }
    
}
