package com.lgcns.exercise.plmtct;

import java.util.HashMap;


/**
 *  
 *  [문제]
	정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
	
	1. X가 3으로 나누어 떨어지면, 3으로 나눈다.
	2. X가 2로 나누어 떨어지면, 2로 나눈다.
	3. 1을 뺀다.
	
	정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다.
	연산을 사용하는 횟수의 최소값을 출력하시오.
	
	* 입력
	  첫째 줄에 1보다 크거나 같고, 1000000보다 작거나 같은 정수 N이 주어진다.
	* 출력
	  첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.
	
	[입력1]
	10
	[출력1]
	3
	
	[입력2]
	30
	[출력2]
	4
	
	[힌트]
	10의 경우 10 -> 9 -> 3 -> 1	: 3번
	30의 경우 30 -> 10 -> 9 -> 3 -> 1	: 4번
	
 */
public class TCT_20190213_ahryunPark {
	
	/**
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190213_ahryunPark tct = new TCT_20190213_ahryunPark();
		
		
		int inputN1 = 10;
		int inputN2 = 30;
		int inputN3 = 17;
		
		System.out.println("결과값 1 : " + tct.getReuslt(inputN1));
		System.out.println("결과값 2 : " + tct.getReuslt(inputN2));
		System.out.println("결과값 3 : " + tct.getReuslt(inputN3));

	}
	
	
	public int getReuslt(int input){
		
		int result = 0;
		
		while(input != 1) {
			
			//Input값을 3으로 나눈 몫이 3의 배수인지 Check
			//3의 배수가 아닌 경우 2의 배수일때까지 -1
			//3의 배수인 경우 3의 배수일때까지 -1
			if(this.isCheck(input)) {
				if(input%3!=0) {
					input--;
					result++;
				}else if(input%3 == 0) {
					input = input/3;
					result++;
				}
			}else {
				if(input%2!=0) {
					input--;
					result++;
				}else if(input%2 == 0) {
					input = input/2;
					result++;
				}
			}
			
			
		}
		return result;
	}
	
	/**
	 * 
	 * 몫이 3의 배
	 * @param input
	 * @return
	 */
	private boolean isCheck(int input) {
		boolean isCheck = false;
		
		if((input/3)%3 == 0) {
			isCheck = true;
		}
		
		return isCheck;
	}
	
	
	
}
