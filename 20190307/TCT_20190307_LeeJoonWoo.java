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
        //������� 15�� ���;� �Ǵµ�... 0 �̳����׿�.. ���߿� ����� �� ���ڽ��ϴ�.
        System.out.println("===================================="); 
        System.out.println("����� :"+maxHight);
        System.out.println("====================================");

    }
    
}
