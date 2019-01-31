package com.tctstudy;

public class TCT_20190131_HeeJeongKim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 13;
		String inputStr[] = {"but","i", "wont", "hesitate", "no", "more", "no", "more", "it", "cannot", "wait","im","yours"};
        String temp = "";
        
		for (int i=0; i<inputStr.length-1; i++) {
			
			for (int j=1; j<inputStr.length-i; j++) {
				
				//길이가 짧은 것부터
				if (inputStr[j-1].length() >inputStr[j].length()) {
					temp = inputStr[j-1];
					inputStr[j-1] = inputStr[j];
					inputStr[j] = temp;
					
				} else if (inputStr[j-1].length()== inputStr[j].length()) {  //길이가 같으면 사전 순으로
					
					for (int k=0; k<inputStr[j-1].length(); k++) {
						
						if (inputStr[j-1].charAt(k) > inputStr[j].charAt(k)) {	
							temp = inputStr[j-1];
							inputStr[j-1] = inputStr[j];
							inputStr[j] = temp;
						    break;
						}
						
					}
				}
			}

        }

        for (int j=0; j<inputStr.length; j++) {
        	if (j>0 && !inputStr[j].equals(inputStr[j-1])) System.out.println(inputStr[j]);
        }
        
	}
}
