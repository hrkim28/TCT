package tct;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
public class TCT_20190226_LeeJoonWoo {

    /**
     * @param args
     */
    public static void main(String[] args) {
    	
    	HashMap<Integer, String> keyNumberMap = new HashMap<Integer, String>();
                
    	keyNumberMap.put(1, "");
    	keyNumberMap.put(2, "abc");
    	keyNumberMap.put(3, "def");
    	keyNumberMap.put(4, "ghi");
    	keyNumberMap.put(5, "jkl");
    	keyNumberMap.put(6, "mno");
    	keyNumberMap.put(7, "pqrs");
    	keyNumberMap.put(8, "tuv");
    	keyNumberMap.put(9, "wxyz");
    	
    	Scanner sc = new Scanner(System.in);
    	String input = sc.next();
	    String data[] = input.split(" ");
        
	    HashMap<Integer, String> brokenKeyNumberMap = new HashMap<Integer, String>();
	    
	    for(int i=0 ; i<data.length; i++){
	    	brokenKeyNumberMap.put(Integer.parseInt(data[i]), keyNumberMap.get(i+1));
	    }
	    
	    String inputText = sc.next();
	    String selectedLetter = "";
	    String keyLetterSet ="";
	    String outPut ="";
	    
	    int selectedNumber = 0;
	    int pushCount =0;
	    for(int i=0 ; i<inputText.length(); i++){
	    	selectedLetter = inputText.substring(i, i+1);
	    	for(int j=0 ; j < brokenKeyNumberMap.size(); j++){
	    		if(brokenKeyNumberMap.get(j).contains(selectedLetter)){
	    			selectedNumber = j+1;
	    			pushCount=0;
	    			keyLetterSet = brokenKeyNumberMap.get(j);
	    			for(int k=0 ; k<selectedLetter.length(); k++){
	    				if(keyLetterSet.substring(k,k+1).equals(selectedLetter)){
	    					pushCount = k+1;
	    				}
	    			}
	    			for(int m=0 ; m<pushCount; m++){
	    				outPut = outPut + selectedNumber;
	    			}
	    		}
	    	}
	    }
        
        System.out.println("===================================="); 
        System.out.println("°á°ú°ª :"+outPut);
        System.out.println("====================================");

    }
    
}
