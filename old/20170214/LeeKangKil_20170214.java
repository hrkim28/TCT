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
				[2017.02.14 오늘의 문제]
				0~9까지의 문자로 된 숫자를 입력 받았을 때, 
				이 입력 값이 0~9까지의 숫자가 각각 한 번 씩만 사용된 것인지 확인하는 함수를 구하시오.
				[조건]
				숫자의 순서는 바뀔 수 있음.
				단, 0~9까지의 숫자가 모두 포함되어야 함.
				[출력 예시]
				입력 : 0123456789 01234 01234567890 6789012345 012322456789
				결과 : true false false true false
				다음 출제는 원영미 과장님께 부탁드립니다.
		 */
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		int result[] = new int[10];


		try{
			String strInput[] = (in.readLine()).split(" "); // 공백 분리
			
			for (int i=0;i<strInput.length; i++){
				String value = strInput[i];
				Boolean checkFlag = true;
				
				for (int k=0; k<result.length; k++) { // 초기화
					result[k]=0;
				}
				
				for(int j=0; j<value.length();j++){
					int idx = Integer.parseInt(String.valueOf(value.charAt(j)));
					result[idx] ++;
				}
				
				for(int w=0; w<result.length;w++){
					if(result[w] != 1) { 
						checkFlag=false;
					}
				}
				
				System.out.print(checkFlag + " " );
			
			}
			
			
			
		}catch (IOException e){
			
		}
	
	}
	

}
