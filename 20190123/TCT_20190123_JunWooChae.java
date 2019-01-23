package com.lgcns.m1.example;

import java.util.HashMap;
import java.util.Scanner;

public class TCT_20190123_JunWooChae {	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int cnt = sc.nextInt();
		int[] arrNum = new int[cnt];
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	 		 
		for(int inx = 0; inx < cnt; inx ++){ 
			arrNum[inx] = sc.nextInt();  
		}
		
		for(int inx = 0; inx < arrNum.length; inx ++){
			if(map.containsKey(arrNum[inx])){
				map.put(arrNum[inx], (Integer)map.get(arrNum[inx]) + 1);
			} else {
				map.put(arrNum[inx], 1);
			}
		}
		

		int result = 0;
		for(Integer intKey : map.keySet()){
			if(map.get(intKey) % 2 != 0){
				result = result ^ intKey;	
			}			
		}
		
		System.out.println("Result==" + result);		
		
	}	
	
}
