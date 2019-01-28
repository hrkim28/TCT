package com.lgcns.lkk;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class   TCT_20190128_LEEKANGKIL{

	public static void main(String args[])  {

//		[case1]
//		I think I'm lost.
//		[case2]
//		I think I'm lost.I can't tell.
//		[case3]
//		I think I'm lost. I can't tell what's where.		
		
//		[case1]
//		가장많이 쓰인 알파벳 : i = 3회
//		[case2]
//		가장많이 쓰인 알파벳 : i, t = 4 회
//		[case3]
//		가장많이 쓰인 알파벳 : t = 5 회
		
		Scanner sc = new Scanner(System.in); 
		String strInput = sc.nextLine().toLowerCase();
		String result ="";
		
		TreeMap<Integer,Integer> wordMap = new TreeMap<Integer,Integer>();
		int maxVal = -1;
		
		for(int i=0;i<strInput.length();i++){
			int chr = (int)strInput.charAt(i);
			if( chr >= 97 && chr <= 122){ 
				if(wordMap.containsKey(chr)) wordMap.put(chr, wordMap.get(chr)+1);
				else wordMap.put(chr,1);
			}
		}
		
		for(int value: wordMap.values()) {
			if(value > maxVal ) maxVal = value;
		}
		
		if(maxVal<0) return;
				
		for(int key: wordMap.keySet()){
			if ( wordMap.get(key) == maxVal )  result += (char)key + ","; 
		}
		
		result = result.substring(0, result.length()-1);
		System.out.println( "가장많이 쓰인 알파벳 : " + result +  " = " + maxVal);
		
	}

}