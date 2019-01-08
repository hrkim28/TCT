package com.lgcns.LCP01;

import java.util.Scanner;

public class JungHyunSeok_20170202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[3];
		int[] b = new int[3];
		int[] result = new int[10];
		int cnt = 0;
		boolean bool = false;
		
		for(int i=0; i<a.length;++i){
			do{
				bool = false;
				a[i] = (int)(Math.random() * 10);
				
				for(int j=0; j<i;++j){
					if(a[i] == a[j]){
						bool = true;
					}
				}
				
			}while(bool);
		}
		
		while(true){
			int strike =0;
			int ball =0;
			System.out.println("3개 숫자 입력");
			
			for(int i=0; i<b.length;++i){
				b[i] = scan.nextInt();
			}
			
			for(int i=0; i<b.length;++i){
				for(int j=0; i<b.length;++j){
					if(b[i] == a[j]){
						if(i == j){
							strike++;
						}else{
							ball++;
						}
					}
				}
			}
			System.out.println( strike + " Strike," + ball + " Ball");
			cnt++;
			
			if(strike ==3){
				break;
			}
			
		}
		
		System.out.println(cnt +"회만에 Strike Out!!!");
		
	}

}
/*
[2017.02.02 오늘의 문제]
문제 : 야구게임 
컴퓨터가 생성한 임의의 숫자 3개와 입력받은 숫자 3개를 비교하여 Strike, Ball 결과를 출력합니다.
3개 숫자를 모두 맞추면 strike out 으로 게임 종료!!
[조건]
컴퓨터가 생성한 임의의 숫자 3개는 서로 중복되면 안됩니다.
입력받는 숫자 3개에 대해, 컴퓨터가 생성한 임의의 숫자와 "자릿수, 숫자가 같으면 스트라이크" "숫자가 같고 자릿수가 다르면 볼" 을 출력합니다.
컴퓨터가 생성한 임의의 숫자와 입력받는 숫자가 일치하면 게임이 종료되며 시도횟수와 함께 게임종료 메시지를 출력합니다.
[출력 예시 > 컴퓨터가 생성한 임의의 숫자 4 5 1 의 경우]
3 개 숫자를 입력하세요
1
4
6
0 Strike 2 Ball
3 개 숫자를 입력하세요
4
1
6
1 Strike 1 Ball
3 개 숫자를 입력하세요
4
1
5
1 Strike 2 Ball
3 개 숫자를 입력하세요
4
5
1
3 Strike 0 Ball
4 회만에 Strike Out!!!

*/

