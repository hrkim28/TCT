package com.lgcns.team.lcp;

public class Dongsshin_20170124 {

	public static void main(String[] args) {
		int toNumber = 10000;
		int cnt      = 0;
        for (int i = 1; i < toNumber; i++){
        	char[] charArray = (String.valueOf(i)).toCharArray();
        	for (int j = 0; j < charArray.length; j++)
        	{
        		if (charArray[j] == '7') cnt++;
        	}
        }
        System.out.println("7's Count : " + cnt);
	}
}
