package com.lgcns.lkk;

import java.util.Scanner;

public class   Test{

	public static void main(String args[])  {
		int inNum = 0;
		
		
		int a=0,  b=1,result=0;
		Scanner sc = new Scanner(System.in);
		inNum = sc.nextInt();
		
		//  0, 1, 1, 2, 3, 5, 8, 13
		
		while(a<=inNum){
			result=a;
			System.out.print(result + " ");
			
			a=b;
			b=a+result;
			
			
		}
		
		
	}

}