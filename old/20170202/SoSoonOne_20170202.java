package com.test02;

import java.util.Scanner;

public class SoSoonOne_20170202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 1;
		
		int[] baseball = new int[3];
		int sCount = 0;
		int bCount = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		baseball[0] = (int) (Math.random()*10);
		
		do{
			baseball[1] = (int) (Math.random()*10);
		}while(baseball[0] == baseball[1]);
		
		do{
			baseball[2] = (int) (Math.random()*10);
		}while(baseball[0] == baseball[2] || baseball[1] == baseball[2]);
		
		System.out.println(baseball[0] + " " + baseball[1]+  " " + baseball[2]);
        
		while(sCount != 3){
			sCount = 0;
			bCount = 0;
				System.out.println(" 3개의 숫자를 입력하십시오. ");
				
				int user[] = {scanner.nextInt(),scanner.nextInt(),scanner.nextInt()};

				
				for (int i = 0 ; i < 3 ; i ++){
					for(int j = 0 ; j < 3 ; j++){
						if(i == j){
							if(baseball[i] == user[j]) sCount++;
							}
						else{
							if(baseball[i] == user[j]) bCount++;
						}
					}
				}
				
				if(sCount != 3){
					System.out.println(sCount + " 스크라이크 "+ bCount+" 볼입니다.");
					count ++;
				}
		}
	
		if (count == 1){
			System.out.println("한번에 맞추셨습니다!");
			return;
		}
		else {
			System.out.println(count+" 번만에 맞추셨습니다.");
		}
	}
	
}
