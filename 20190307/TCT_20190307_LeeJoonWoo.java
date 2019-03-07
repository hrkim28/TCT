package tct;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
public class TCT_20190307_LeeJoonWoo {

    /**
     * @param args
     */
    public static void main(String[] args) {
    	
    	    	
    	
    	int targetMeter = 7;
        ArrayList<Integer> treeLi = new ArrayList();
        treeLi.add(20);
        treeLi.add(15);
        treeLi.add(10);
        treeLi.add(17);
        
        int hight = 0;
        int maxHight = 0;
        int sumHight = 0;
        boolean stopFlag = false;
        int stopHight = 0;
        
	    for(int i=0 ; i<treeLi.size(); i++){
	    	if(treeLi.get(i) > maxHight){
	    		maxHight = treeLi.get(i);
	    	}
	    }
	    for(int k=0 ; k<maxHight; k++){
		    for(int i=0 ; i<treeLi.size(); i++){
		    	if(treeLi.get(i) >= maxHight){
		    		treeLi.set(i,treeLi.get(i)-1);
		    		sumHight = sumHight + 1;
		    	}
		    	
		    	if(sumHight >= targetMeter){
		    		stopFlag = true;
		    		break;
		    	}
		    }
		    
		    if(stopFlag){
		    	break;
		    }
		    stopHight = k+1;
	    }
	    
	    maxHight = maxHight - stopHight;
        //결과값이 15가 나와야 되는데... 0 이나오네요.. 나중에 디버깅 해 보겠습니다.
        System.out.println("===================================="); 
        System.out.println("결과값 :"+maxHight);
        System.out.println("====================================");

    }
    
}
