package com.tctstudy;

import java.util.HashMap;
import java.util.Scanner;

public class TCT_20190123_HeeJeongKim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int  n = 4;
		int  numList[] = {2, 5, 3, 3};
		int  oddnumList[] = new int[2];
		
		HashMap <Integer, Integer> oddnumCntMap = new HashMap <Integer, Integer> ();
		int oddnumCnt = 1;
		for (int i=0; i<numList.length; i++) {
			if (oddnumCntMap.containsKey(numList[i])) {
				oddnumCnt = oddnumCntMap.get(numList[i])+1;
			}
			oddnumCntMap.put(numList[i], oddnumCnt);
		}
	
		int idx = 0;
		for (Integer numCK : oddnumCntMap.keySet()) {
			if (oddnumCntMap.get(numCK)%3==1)  {
				oddnumList[idx++] = numCK;
			}
		}
		
		int xor_result = oddnumList[0] ^ oddnumList[1];
		
		System.out.println("XOR결과--->"+xor_result);
	}

}
