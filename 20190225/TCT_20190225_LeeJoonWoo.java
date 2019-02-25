package tct;

import java.util.HashMap;
import java.util.Scanner;
public class TCT_20190225_LeeJoonWoo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				    
	    HashMap<Integer, Integer> countedMapList = new HashMap<Integer, Integer>();
	    countedMapList.put(0, 1000);
	    countedMapList.put(1, 10000);
	    countedMapList.put(2, 8000);
	    countedMapList.put(3, 5000);
	    countedMapList.put(4, 7000);
	    countedMapList.put(5, 3000);
	    countedMapList.put(6, 9000);
	    
	    
	    //입력된 레서피 중에서 가장 큰수를 찾기
	    int moneyMax = 0;
	    int maxIndex = 0;
	    int moneySum = 0;
	    
	    while(countedMapList.size() <= 1){
		    for (int i =0; i<countedMapList.size(); i++) { 
				if (countedMapList.get(i) > moneyMax) { 
					moneyMax = countedMapList.get(i) ;  
				    maxIndex = i;
				    countedMapList.remove(i);
				}
			}
		    moneySum = moneySum + moneyMax;
		    if(maxIndex==0){
		    	countedMapList.remove(0);
		    	countedMapList.remove(countedMapList.size()+1);
		    }else if(maxIndex==1){
		    	countedMapList.remove(0);
		    	if(countedMapList.size()>=1){
		    		countedMapList.remove(1);
		    	}
		    }else if(maxIndex>1){
			    	countedMapList.remove(maxIndex-1);
			    	countedMapList.remove(maxIndex);
		    }
	    }
 		System.out.println("====================================");
	    System.out.println("moneySum: "+moneySum);
	    System.out.println("====================================");

	}

}
