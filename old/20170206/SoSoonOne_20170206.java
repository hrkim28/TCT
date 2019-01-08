package com.test02;

import java.util.Random;


public class SoSoonOne_20170206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rnd = new Random();
		int a, b, c, d, e, f = 0;
		int[] lotto = {0, 0, 0, 0, 0, 0};
		//int i = 0;
		
		
		
		for(int i = 0 ; i<lotto.length ; i++){
			while(lotto[i] == 0 ){
				a = rnd.nextInt(45)+1;
					for(int j = 0 ; j<lotto.length ; j++){
						if(a != lotto[j] ){
							f++ ;
						}
						if(f == 6){
							lotto[i] = a;
							f = 0;
						}
				
					}
			}
		}
		
		System.out.println("정렬 전");
		for(int i=0;i<lotto.length;i++){
			System.out.print("[ "+lotto[i] + " " + "]");
		}
		System.out.println("");
		
		for(int i = 0; i<lotto.length ; i++){
			for(int j = i+1 ; j<lotto.length ; j ++){
				if(lotto[i]>lotto[j]){
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}

		System.out.println("정렬 후");
		for(int i=0;i<lotto.length;i++){
			System.out.print("[ "+lotto[i] + " " + "]");
		}

	}

}
