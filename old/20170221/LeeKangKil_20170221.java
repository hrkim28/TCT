package com.lgcns.lkk;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test {

	public static void main (String arg[]) throws IOException  {
		run();
	}

	static void run(){
		/*
			입력된 숫자가 자연수의 제곱수인지 아닌지 판단하는 프로그램을 짜세요.
			제한조건 : 사칙연산 중 덧셈과 뺄셈만 가능합니다.
			i.e) 25 --> True
     		44 --> False
		 */
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		boolean result = false;
		try{
			String strInput = in.readLine();
			int toNum = Integer.parseInt(strInput);
			
			for(int i=1;i<=toNum;i++){
				int temp = 0;
				for(int j=1; j<=i;j++){
					temp+= i;
				}
				if(temp == toNum) { result = true; break;}
			}
		
			System.out.println(result);
			
				
			
			
		}catch (IOException e){
			
		}
	
	}
	

}
