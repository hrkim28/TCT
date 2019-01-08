package com.lgcns.lkk;

import java.io.IOException;
import java.util.ArrayList;

public class Test {

	public static void main (String arg[]) throws IOException  {
		run();
	}

	public  static void run(){
		/*
			[2017.01.31 오늘의 문제]
		문제: 마지막에 남은 1명의 소개팅녀 출력하기
		소개팅 Rule
		 1) 101명의 소개팅녀들이 O 모양으로 둥글게 앉는다. 
		 2) 첫번째 소개팅녀부터 시계방향으로 대화를 한다.
		 3) 대화를 나눈 소개팅녀는 Yes 또는 No 를 할 수 있다. 
		 4) NO 를 선택한 소개팅녀는 자리를 떠나 집으로 가고, Yes 라고 한 소개팅녀는 자리에 남는다.
		 5) 최종 1명의 소개팅녀만 남을 때까지 계속 시계방향으로 돌며 대화를 한다.
		제약조건 
		  1) 홀수번째 대화를 나눈 소개팅녀는 Yes를 하고, 짝수번째 대화를 나눈 소개팅녀는 No를 한다.
		첫번째 소개팅녀는 Yes, 두번째 소개팅녀는 No , 세번째 소개팅녀는 Yes
		 */
		 ArrayList <Integer> arr = new ArrayList<Integer>();
		 int max = 101;
		 int idx=0;
		 int flag = -1;

		for(int i=1; i<max+1;i++){
			arr.add(i);
		}
		
		while(arr.size()>1){
			if(flag==1)  arr.remove(idx) ;
			else idx++;
			
			idx%=arr.size();
			flag*=-1;
			
		}

		System.out.println(arr.get(0));
	}

}
