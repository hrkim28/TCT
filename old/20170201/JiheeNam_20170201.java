package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class TestLCP_20170201 {

	/**
	 * @param args
	 * 
	 * 문제 : 주사위 게임
	 * 두 개의 주사위를 던져 값을 합산, 출력합니다. 
	 * [조건]
	 * 재귀 함수를 이용해 구현해 주세요.
	 * 단, 두 주사위의 값이 같을 경우 한번 더 던집니다.
	 * 주사위 값은 1~6 사이 난수
	 * [출력 예시]
	 * 3 3
	 * 6 6
	 * 5 4
	 * 27 만큼 전진!
	 * 
	 */
    static int DiceGame(){

    	Random dice = new Random(); 
    	 
    	int n1, n2 = 0;
    	int sum = 0;
    	
    	n1 = dice.nextInt( 6 )+1;
    	n2 = dice.nextInt( 6 )+1;
    	System.out.println(n1+ " " + n2);
    	 
		if (n1 == n2){
    		sum += n1 + n2 + DiceGame();
    	}else{
    		sum += n1 + n2;
    	}    		 
    	
    	return sum;
    	
    }
    public static void main(String[] args) {   
    	
    	System.out.println(DiceGame() + " 만큼 전진!" );
    	
    } 
}



