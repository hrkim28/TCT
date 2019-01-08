package com.test02;

import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Random;

/*
 * 
		 * [2017.02.07 오늘의 문제]
		
		임의의 수와 그 수를 뒤집은 수를 더하는 과정을 반복한다.
		합이 뒤집어서 읽어도 동일한 숫자가 되면 반복 횟수와 숫자를 출력한다.
		
		 195      786       1473      5214
		+591    +687    +3741     +4125
		
		 786     1473       5214      9339
		
		** 반복횟수는 100번 미만으로 제한함, 형변환 없음
		
		Input: 숫자 배열 입력
		
		101
		195
		265
		750
		
		Sample Output
		
		0 101
		4 9339
		5 45254
		3 6666

 * 
 */
public class SoSoonOne_20170207 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0, ccount = 0;
		double startNum = 105;
		double sum = 0;
		double reverseNum = 0;
		double testNum = 0;
		double tmp =  0;
		DecimalFormat df = new DecimalFormat("#");
		while (count < 101){
		
			tmp = startNum ;
			
			while(tmp >= 1){
				tmp = tmp/10;
				ccount ++;
			}
			tmp = startNum ;
			
			//System.out.println("ccount : " + ccount);
			
			for(int i = ccount ; i > 0 ; i-- ){
				testNum = Math.floor(tmp%10);
				tmp = tmp/10;
				if(testNum < 1 && testNum > 0) testNum = 0;
					for(int j = i ; j > 1; j --){
						testNum = testNum * 10;
					}
				reverseNum = reverseNum + testNum;
			}
			
			if(startNum == reverseNum){
				System.out.println("같은 숫자 발견 >>>>> " + (count-1) + " : " + df.format(startNum));
			}
			
			ccount = 0;
			sum = startNum + reverseNum;
			
			//System.out.println("start Num : " + startNum + " revserseNum : " + reverseNum);
			
			//System.out.println(count + " : " + sum);
			
			
			
			startNum = sum;
			testNum = 0;
			reverseNum = 0;
			
			count ++;
		}

	}

}
