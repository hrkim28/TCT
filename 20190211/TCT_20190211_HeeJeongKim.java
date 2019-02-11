package com.tctstudy;

public class TCT_20190211_HeeJeongKim {
	
	public static void main(String[] args) {
	
		int n = 3;
		String inputStr[] = {"BAPC","AABA","ABCABCBBAAACC"};
	  
		for (int i=0; i<inputStr.length; i++) {

	    	int  inputArray[] = new int[26];
	    	for (int j=0; j<inputStr[i].length(); j++) inputArray[inputStr[i].charAt(j)-65]++;
	    	
	    	boolean isFake = false;
	    	for (int k=0; k<inputArray.length; k++) {
	    		if (inputArray[k]%3==0) isFake = true;
	    		break;
	    	}
	    	
	    	if (isFake) System.out.println("FAKE");
	    	else  System.out.println("OK");
	   }
	    
	}
}
