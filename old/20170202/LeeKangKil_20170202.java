package com.lgcns.lkk;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main (String arg[]) throws IOException  {
		run();
	}

	static void run(){
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
		int idx=0;
		int comNum[] = new int[3];
		int str = 0;
		int ball = 0;
		int tryCnt=0;
		
		while(idx<comNum.length){
			
			boolean checkDup = false;
			int rndNum = (int) (Math.round(Math.random()*10)%9);
			
			for(int i=0;i<idx+1;i++)
			{
				if(	comNum[i] == rndNum ){
					checkDup=true;
				}
			}
			if(!checkDup) comNum[idx++] = rndNum; 
		}
		
		for(int j=0; j<comNum.length; j++){
			System.out.print(comNum[j] + " " );
		}
		
		while(true){
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader in = new BufferedReader(isr);
				try{
							int intInput[] = new int[comNum.length];
							
							for(int i=0;i<intInput.length;i++){
								intInput[i] = Integer.parseInt(in.readLine()) ;
							}
							
							for(int i=0; i<comNum.length; i++){
								int temp = comNum[i];
								for(int j=0; j<intInput.length;j++){
									if (intInput[j] == temp){
										if(i==j) str++;
									  else  ball++;
									}
								}
							}

							tryCnt++;
							System.out.println(str + " strike " + ball + " ball");
							if(str == 3) { 
								System.out.println( tryCnt + " 회만에 Strike Out"  ); 
								break;
							} 
				}catch(IOException e){
			}
		}		
	}
}
