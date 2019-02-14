package com.tctstudy;

/*
 * * 문제
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
 * 
 */
public class TCT_20190213_HeeJeongKim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		int opertimes = 0;

		while (n>1) {
			
		    if (n%3==0) n=n/3;
			else if ((n-1)%3==0) n=n-1;
			else if (n%2==0) n=n/2;
			else n=n-1;
			opertimes++;
	    
		}
		System.out.println(opertimes);
	}
}
