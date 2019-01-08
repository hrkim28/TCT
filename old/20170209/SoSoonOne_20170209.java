package com.test02;

import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Random;


public class SoSoonOne_20170209 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		String [] input = {"3,7","4,6","5,5"};
		String [] check = {};
		int c = 0, midCount = 0, tmp=0, sVal=0, eVal=0;
		
		
		while(c < input.length){
			check = input[c].split(",");
			sVal = Integer.parseInt(check[0]);
			eVal = Integer.parseInt(check[1]);
			
			midCount = (eVal-sVal)+1/2;
			
			for(int i = 0  ; i < midCount ; i++ ){
				tmp = array[sVal-1 + i];
				array[sVal-1 + i] = array[eVal-1 - i];
				array[eVal-1 - i] = tmp;
			}
			c++;
		}
		
		for(int i = 0; i < array.length ; i++){
			System.out.print(array[i] + " ");
		}
		
		
	}

}
