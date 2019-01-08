package com.test02;

import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Random;


public class SoSoonOne_20170214 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {0,3,2,1,4,5,7,8,9,6}; // {0,2,2,2,4,5,7,8,9,6}
		
		System.out.println(checkSum(input));
			
		
	}
	
	public static boolean checkSum(int[] n){
		
		int sum = 0;
		
		for(int i = 0 ; i < n.length ; i++){
			sum += n[i];
		}
	
		if (sum == 45) return true;
		else return false;
		
	}

}
