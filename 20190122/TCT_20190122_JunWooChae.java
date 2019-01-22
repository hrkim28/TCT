package com.lgcns.m1.example;

public class TCT_20190122_JunWooChae {	
	
	public static void main(String[] args) {
		int cnt = 6;
		int[] n = {10, 20, 15, 25, 10, 20};
		
		int sum = 0;
		int tmpSum = 0;
		
		for (int inx = 0; inx < 3; inx ++){
			tmpSum = 0;
			for (int jnx = 0; jnx < cnt; jnx ++){
				if(jnx % 3 != inx){
					tmpSum += n[jnx];
				}
				
				if(jnx + 1 == cnt && cnt % 3 == inx){
					tmpSum = tmpSum - n[jnx -1];
					tmpSum += n[jnx];
				}
			}
			if(tmpSum > sum){
				sum = tmpSum;
			}
		}
		
		System.out.println("총 합은 " + sum);
	}	
	
}
