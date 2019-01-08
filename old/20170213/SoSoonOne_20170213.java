package com.test02;

import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Random;


public class SoSoonOne_20170213 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int GNum = 0;
		int i = 1;
		
		while(Generator(i) < 5000){
			
			GNum += Generator(i);
			i ++;
		}
		
		System.out.println(" resultNum : " + GNum);
		
	}
	
	public static int Generator(int n){
		
		int gNumberSum = 0;
		int checkNumber = n;
		
		while(n >= 1){
			checkNumber += n%10;
			n = n/10;
		}
		gNumberSum += checkNumber;
	
		return gNumberSum;
	}

}
