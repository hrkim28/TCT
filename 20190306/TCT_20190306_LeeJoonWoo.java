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
    	
    	System.out.println(" �Է��ϼ���.");
    	String inputStr = sc.next();
        String returnStr = "";
	    
        //�Էµ� String�� ArrayList�� ����ϴ�.
	    ArrayList<String> finalString = new ArrayList();
	    for(int i=0 ; i<inputStr.length(); i++){
	    	finalString.add(inputStr.substring(i,i+1));
	    }
	    
	    //ArrayList�� �Էµ� String�߿��� _ �� ������ �����ϰ� ���� ���� �빮�ڷ� �����մϴ�..
	    for(int i=0 ; i<finalString.size(); i++){
	    	if(finalString.get(i).equals("_") ){
	    		finalString.remove(i);
	    		finalString.set(i, finalString.get(i).toUpperCase());
	    				
	    	}
	    }
	    
	    //��ȯ�� ArrayList�� String�� Return String ���� �־��ݴϴ�.
	    for(int i=0; i<finalString.size(); i++){
	    	returnStr = returnStr.concat(finalString.get(i));
	    }
        //���� String���� return
        System.out.println("===================================="); 
        System.out.println("����� :"+returnStr);
        System.out.println("====================================");

    }
    
}
