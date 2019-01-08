package com.lgcns.lkk;


import java.io.IOException;
import java.lang.Math;

public class Test {

	public static void main (String arg[]) throws IOException  {
		System.out.println(DiceGame());
	}

	static int DiceGame(){
		/*
		[2017.02.01 오늘의 문제]
		문제: 주사위 게임
		두 개의 주사위를 던저 값을 합산, 출력합니다.
		[조건]
		재귀 함수를 이용해 구현해주세요.
		단, 두 주사위의 값이 같을 경우 한번 더 던집니다.
		주사위 값은 1~6 사이 난수
		[출력 예시]
		3 3 
		6 6  
		5 4 
		27 만큼 전진!
		 */

		int a = (int) (Math.round(Math.random()*10)%6+1);
		int b = (int) (Math.round(Math.random()*10)%6+1);
		int result = a+b;
		
		System.out.print(a);
		System.out.println(" "+b);
		
		if (a==b) result+= DiceGame();
		
		return result;

		
	}

}
