package com.lgcns.lkk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class Test {

	public static void main (String arg[]) throws IOException  {
		run();
	}

	public  static void run(){
		
		/*
		100부터 1000 사이의 숫자 중 각 자릿수에 해당하는 세제곱 값의 합이 해당 숫자와 동일한 숫자를 출력한다.
		  ex) 153 = 1x1x1 + 5x5x5 + 3x3x3
		= 1 + 125 + 27
		[조건]
		1) Armstrong Number 출력한다.
		[예상결과]
		153
		370
		371
		407*/

			for(int i=100; i<=1000; i++){

				String strNum = String.valueOf(i);
				int a = 0;
				int sum = 0 ;
				
				for(int j=0; j<strNum.length();j++){
					a = (Integer.valueOf(strNum.charAt(j)).intValue()-48);
					sum += a*a*a;
				}
				
				if(sum == i) System.out.println(i);
		
     }
}	

}
