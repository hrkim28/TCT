package com.lgcns.tct;

public class TCT_20190115_LimYoungChan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int inputNumber = 500000;  

		int firstNum = 0;
		int secondNum = 1;
		int thirdNum = 0;
		
		System.out.print(firstNum);
		System.out.print(", " + secondNum);
		
		for(int i = 0; i <= inputNumber; i++) {
			
			thirdNum = firstNum + secondNum;

			if(thirdNum > 1 && thirdNum >= inputNumber) break;
			
			System.out.print(", " + thirdNum);
			
			firstNum = secondNum;
			secondNum = thirdNum;
			
		}
		
		
	}
}
