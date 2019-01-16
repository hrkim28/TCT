package com.lgcns.tct;

import java.util.Scanner;

public class TCT_20190115_LimYoungChan {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number:");

		int inputNumber = sc.nextInt();

		int firstNum = 0;
		int secondNum = 1;
		int sumNum = 0;
		
		System.out.print(firstNum);
		System.out.print(", " + secondNum);
		
		while (firstNum + secondNum  <= inputNumber) {
			
			sumNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sumNum;
			
			System.out.print(", " + sumNum);
		} 
	}
}
