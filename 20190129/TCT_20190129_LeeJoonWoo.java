package tct;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
public class TCT_20190129_LeeJoonWoo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("계산식을 입력하세요.");
        
        String input = sc.next();
        
        StringTokenizer tokenInput = new StringTokenizer(input,"+-/*",true);
        String token ="";
        
        
        //각 연산자와 숫자 배열을 순서대로 저장할 ArrayList
        ArrayList<String[]> numList = new ArrayList();
        
        
        int init = 0;
        while(tokenInput.hasMoreTokens()){
        
        	//연산자와 숫자를  담아 놓을 배열
            String[] calcNum = new String[2];
            //연산자 값을 입력함            
            if(init ==0 ){
            	calcNum[0]="+";
            	init = init+1;
            }else{
            	calcNum[0]= tokenInput.nextToken();
            }
            //숫자 값을 입력함
            calcNum[1]= tokenInput.nextToken();
            numList.add(calcNum);            
        }
        
        
        //ArryList에서 * 와 / 를 먼저 찾아서 계산 하도록 함
        int calcResult;
        for(int i=0; i< numList.size(); i++ ){
            String[] calcNum = new String[2];
           if(numList.get(i)[0].equals("*")){
        	   
        	   calcResult = Integer.parseInt(numList.get(i-1)[1])*Integer.parseInt(numList.get(i)[1]);
        	   calcNum[0]=numList.get(i-1)[0];
               calcNum[1]=String.valueOf(calcResult);
               numList.set(i-1, calcNum);
               numList.remove(i);
               i--;
               printCalcuration(numList);
           }else if( numList.get(i)[0].equals("/") ){
        	   calcResult = Integer.parseInt(numList.get(i-1)[1])/Integer.parseInt(numList.get(i)[1]);
        	   calcNum[0]=numList.get(i-1)[0];
               calcNum[1]=String.valueOf(calcResult);
               numList.set(i-1, calcNum);
               numList.remove(i);
               i--;
               printCalcuration(numList);
           }
           
        }
        
        for(int i=1; i< numList.size(); i++ ){
            String[] calcNum = new String[2];
           if(numList.get(i)[0].equals("+")){
        	   
        	   calcResult = Integer.parseInt(numList.get(i-1)[1])+Integer.parseInt(numList.get(i)[1]);
        	   calcNum[0]=numList.get(i-1)[0];
               calcNum[1]=String.valueOf(calcResult);
               numList.set(i-1, calcNum);
               numList.remove(i);
               i--;
               printCalcuration(numList);
           }else if( numList.get(i)[0].equals("-") ){
        	   calcResult = Integer.parseInt(numList.get(i-1)[1])-Integer.parseInt(numList.get(i)[1]);
        	   calcNum[0]=numList.get(i-1)[0];
               calcNum[1]=String.valueOf(calcResult);
               numList.set(i-1, calcNum);
               numList.remove(i);
               i--;
               printCalcuration(numList);
           }
           
        }
    
    }
    
    public static void printCalcuration(ArrayList<String[]> numList) {
    	String returnString ="";
    	for(int i=0; i< numList.size(); i++ ){
    		returnString = returnString+numList.get(i)[0]+numList.get(i)[1];
        }
    	returnString = returnString.substring(1,returnString.length());
    	System.out.println(returnString);
    }
    
}
