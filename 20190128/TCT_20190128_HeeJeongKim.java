package com.tctstudy;


public class TCT_20190128_HeeJeongKim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String inputStr = "I think I'm lost.";
		//String inputStr = "I think I'm lost.I can't tell.";
		String inputStr = "I think I'm lost. I can't tell what's where.";
		
		inputStr = inputStr.toLowerCase();
		
		char inputChr[] = inputStr.toCharArray();
		
		
		char inputAlp[] = new char[25];
		int    inputAlpCnt[] = new int[25];
		int    maxCnt = -1;
		for (int i=0; i<inputAlp.length; i++) {
			inputAlp[i] = (char) (97 +  i);
			inputAlpCnt[i] = 0;
			for (int j=0; j<inputChr.length; j++) {
				if (inputChr[j]==inputAlp[i]) inputAlpCnt[i]++;
				if ( inputAlpCnt[i]>maxCnt) maxCnt= inputAlpCnt[i];
			}
		}
		
		for (int j=0; j<inputAlp.length; j++) {
			if (inputAlpCnt[j]==maxCnt)  System.out.print(inputAlp[j]+",");
		}
		System.out.println(" = "+maxCnt+"회");
	}

}
