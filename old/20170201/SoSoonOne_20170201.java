package com.test02;

public class SoSoonOne_20170201 {
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
			static int DiceGame() {
			    int dice1= 0, dice2 = 0;
			    int dice = 0;
			    
			    dice1 = (int) (Math.random()*6) + 1;
			    dice2 = (int) (Math.random()*6) + 1;
			    
			    dice = dice1+dice2;
			    System.out.println(dice1 + " " + dice2);
			    if(dice1 == dice2){
			    	return dice + DiceGame();
			    }
			    return dice;
			}

			public static void main(String[] args) {
			         System.out.println(DiceGame() + " 만큼 전진!");
			}


}
