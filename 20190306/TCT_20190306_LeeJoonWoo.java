package tct;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
public class TCT_20190306_LeeJoonWoo {

    /**
     * @param args
     */
    public static void main(String[] args) {
    	
    	    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println(" 입력하세요.");
    	String inputStr = sc.next();
        String returnStr = "";
	    
        //입력된 String을 ArrayList에 담습니다.
	    ArrayList<String> finalString = new ArrayList();
	    for(int i=0 ; i<inputStr.length(); i++){
	    	finalString.add(inputStr.substring(i,i+1));
	    }
	    
	    //ArrayList에 입력된 String중에서 _ 를 만나면 삭제하고 다음 값을 대문자로 저장합니다..
	    for(int i=0 ; i<finalString.size(); i++){
	    	if(finalString.get(i).equals("_") ){
	    		finalString.remove(i);
	    		finalString.set(i, finalString.get(i).toUpperCase());
	    				
	    	}
	    }
	    
	    //변환된 ArrayList의 String을 Return String 값에 넣어줍니다.
	    for(int i=0; i<finalString.size(); i++){
	    	returnStr = returnStr.concat(finalString.get(i));
	    }
        //최종 String으로 return
        System.out.println("===================================="); 
        System.out.println("결과값 :"+returnStr);
        System.out.println("====================================");

    }
    
}
