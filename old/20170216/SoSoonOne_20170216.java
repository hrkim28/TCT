package com.test02;

import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Random;


public class SoSoonOne_20170216 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long input = 100;
		long count = 0;
		int i = 1, j =0;
		
		while(count < input){
			count = count + i;
			i = i*2;
			j ++;
		}
		
		System.out.println(j + " count : " + (count));
		
	}
	
	
}
