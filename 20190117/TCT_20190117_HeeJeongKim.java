package com.tctstudy;

import java.util.Scanner;

/*
	윤영이는 3의 배수 마니아이다. 그는 모든 자연수를 3개의 3의 배수의 자연수로 분해하는 것을 취미로 가지고 있다. 
	문득 그는 자신에게 주어진 수를 3개의 3의 배수로 분리하는 경우의 수가 몇 개인지 궁금해졌다.
	하지만 윤영이는 마지막 학기이기 때문에 이런 계산을 하기에는 너무 게을러졌다.
	그래서 당신에게 이 계산을 부탁했다.
	
	즉, 임의의 3의 배수 자연수 n이 주어졌을 때, 해당 수를 3의 배수의 자연수 3개로 분리하는 방법의 개수를 출력해라.
	단 분해한 수의 순서가 다르면 다른 방법으로 간주한다.
	예를 들어 12 = 3 + 6 + 3 과 12 = 3 + 3 + 6 은 다른 방법이다.
	
	>> 입력
	임의의 3의 배수 자연수 n이 주어진다. (3 ≤ n ≤ 3000)
	
	>>출력
	자연수 n을 분해하는 방법의 개수를 출력하라
	
	>>예제1
	     입력: 9
	     출력: 1(3,0,0)
	                (2,1,0) 
	                (2,0,1)
	                (1,2,0)
	                (1,0,2)
	                (1,1,1)
	                
	
	9 = 3+3+3 외 다른 방법이 없기에 1
	
	>>예제2
		입력: 12
		출력: 3
		12 = 3 + 3 + 6, (1,1,2)
		12 = 3 + 6 + 3, (1,2,1)
		12 = 6 + 3 + 3  (2,1,1)
		총 3개
		
		(4,0,0)
		(3,1,0)
		(3,0,1)
		(2,2,0)
		(2,1,1)
		(1,3,0)
		(1,2,1)
		(1,1,2)
		(1,0,3)
		
	>>예제3
	    입력: 15
		출력: 6
		15 = (3,1,1), (1,3,1),(1,1,3)
		         (2,2,1), (2,1,2),(1,2,2)
*/
public class TCT_20190117_HeeJeongKim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number:");
	
		int in_value = sc.nextInt();
		
		int cnt = 0;
		int remain_num = in_value / 3; //3의배수 갯수
	
		for (int i=remain_num; i>0; i--) {
			
			for (int j=remain_num-i; j>0; j--) {
				
				for (int k=remain_num-i-j; k>0; k--) {
					
					int sum = i+j+k;
					if  (remain_num==sum)  cnt++;
					
					//System.out.print("\n"+i+","+j+","+k+"\n");
					
				}
			}
		      
		}
		
		System.out.println("cnt---->"+cnt);
		sc.close();
	}

}
