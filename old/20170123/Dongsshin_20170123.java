package com.lgcns.team.lcp;
public class Hasad {
	public static void main(String[] args){
        int input = 142857;
        System.out.println("Input:" + input + " is " + chkIsHasad(input));
	}
	static boolean chkIsHasad(int input){
		int sum = 0;
		char[] charArray =  (new String(input + "")).toCharArray();
		for(int i = 0 ; i < charArray.length ; i++)
		{
			sum += charArray[i] - 48;
		}
		if (sum == 0) return false;
		if ((input%sum) == 0) return true;
		return(false);
	}
}