package com.lgcns.LCP01;

import java.util.Random;

public class JungHyunSeok_20170201 {
	
	static int DiceGame() {
	    //작성하세요 ^^
		
		Random random = new Random();
		
		int a = 0;
		int b = 0;
		int sum = 0;
		
		a = random.nextInt(6) + 1;
		b = random.nextInt(6) + 1;
			
		System.out.println(a + " " + b);
		
		sum = a + b;
		
		if ( a == b ) {
			return sum + DiceGame();
		} 
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println(DiceGame() + " 만큼 전진!");

	}

}
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
static int DiceGame() {
    //작성하세요 ^^
}
public static void main(String[] args) {
         System.out.println(DiceGame());
}

*/
