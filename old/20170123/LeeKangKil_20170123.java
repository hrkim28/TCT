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
		양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
		예를들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
		입력받은 양의 정수 n이 하샤드수인지 아닌지 판단하는 함수를 완성하세요.
		예를들어 n이 10, 12, 18, 153, 142857.. 이면 True를 리턴 11, 13..이면 False를 리턴하면 됩니다.
		 */
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);

		System.out.println("Input Number : "  );
		
		try{
			String strInput = in.readLine();
			
			int num = Integer.valueOf(strInput).intValue(); 
			int temp = num; 
			int currVal = num;
			
			int digit = 0; // 자릿수
			int digitVal = 1;
			int sum = 0;
			
			boolean result =false;

			
			while(temp>0){
				temp/=10;
				digit ++;
				digitVal *=10;
			}
			
			for(int i=digit;i>0;i--)
			{
				digitVal/=10;
				sum += (currVal/digitVal);
				currVal = currVal%digitVal;
			}
			if(num%sum == 0) result = true;
			
			System.out.println(result);
			
			
		
		}catch (IOException e){
			
		}
		
	}

}
