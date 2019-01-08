package com.lgcns.team.lcp;

public class Dongsshin_20160214 {
	public static void main(String[] args) {
		String[] inputList = {"0123456789", "01234", "01234567890", "6789012345", "012322456789"};
		for(int i = 0; i< inputList.length; i++){
			System.out.println(inputList[i] + " : " + chkDup(inputList[i]));
		}

	}
	static private boolean chkDup(String str){
		char[] chrArray = str.toCharArray();
		if(chrArray.length != 10) return false;
		for (int i= 0; i < chrArray.length; i++){
			if(chrArray[i] < '0' || chrArray[i] > '9') return false;
			for(int j = 0; j < chrArray.length; j++){
				if(i != j && chrArray[i] == chrArray[j]) return false;
			}
		}
		return true;
	}
}
