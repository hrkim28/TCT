package com.lgcns.exercise.plmtct;

import java.util.HashMap;


/**
 *  
 *  [문제]
	패리티 검사법은 메시지를 주고받을 때 메시지가 패리티 성질을 가지고 있을 경우엔 메시지가 제대로 도착을 하였다 보고 
	그렇지 않을 경우 메시지가 제대로 도착을 하지 않았다고 판별을 하는 메시지 전송시의 오류 판별 및 교정을 하는 방법을 말한다.
	불리언 행렬의 각각의 열과 각각의 행이 짝수 합을 가질 때 패리티 성질을 가지고 있다고 하자. 다시 말하자면 한 집합에 짝수개의 1이 있다는 이야기 이다.

	아래는 패리티 성질을 가진 4 x 4의 행렬이다.
	1 0 1 0
	0 0 0 0
	1 1 1 1
	0 1 0 1
	각각의 행의 합은 2, 0, 4, 2 이고 열의 합은 2, 2, 2, 2 이다.
	
	당신이 할일은 행렬의 정보를 읽어서 이것이 패리티 성질을 가지고 있는지 없는지 판단해야한다. 
	만약 그렇지 않을 경우 하나의 비트를 바꿔서 이 행렬이 패리티 성질을 가질 수 있는가 확인하고 그렇지 않을 경우 행렬은 잘못된 행렬이라고 판단한다.
	
	**[입력형식]**
	첫줄에는 행렬의 크기인 n(n<100) 이 입력되며 n개의 줄에 n개의 0혹은 1이 입력된다.
	
	**[출력형식]**
	만약 행렬이 패리티 성질을 가질 경우 "OK"라 출력하고 하나의 비트만을 변경해서 패리티 성질을 가질 경우 바꿔야 될 비트가 있는 
	i행 j열 에 대해 "Change bit (i,j)" 라 출력하며 두 경우에 해당되지 않을 때는 "Corrupt"라고 출력한다.
	
	* 주의 - 각각의 행과 열은 1부터 시작한다.
	
	**[입력1]**
	4
	1 0 1 0
	0 0 0 0
	1 1 1 1
	0 1 0 1
	**[출력1]**
	OK
	
	**[입력2]**
	4
	1 0 1 0
	0 0 1 0
	1 1 1 1
	0 1 0 1
	**[출력2]**
	Change bit (2,3)
	
	**[입력3]**
	4
	1 0 1 0
	0 1 1 0
	1 1 1 1
	0 1 0 1
	**[출력3]**
	Corrup
	
 */
public class TCT_20190214_ahryunPark {
	
	/**
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190214_ahryunPark tct = new TCT_20190214_ahryunPark();
		
		
		int[][] inputList1 = { {1, 0, 1, 0},{0, 0, 0, 0}, {1, 1, 1, 1 }, {0, 1, 0, 1}};
		int[][] inputList2 = { {1, 0, 1, 0},{0, 0, 1, 0}, {1, 1, 1, 1 }, {0, 1, 0, 1}};
		int[][] inputList3 = { {1, 0, 1, 0},{0, 1, 1, 0}, {1, 1, 1, 1 }, {0, 1, 0, 1}};
		
		System.out.println("결과값 1 : " + tct.getReuslt(inputList1));
		System.out.println("결과값 2 : " + tct.getReuslt(inputList2));
		System.out.println("결과값 3 : " + tct.getReuslt(inputList3));

	}
	
	
	public String getReuslt(int[][] inputList){
		
		String result = "Corrup";
		
		
		int x = -1;
		int xCnt = 0;
		
		int y = -1;
		int yCnt = 0;
		
		for(int inx = 0 ;inx < inputList.length; inx++) {
			int xSum = 0;
			int ySum = 0;
			int yTemp = -1;
			for(int jnx = 0 ; jnx < inputList.length; jnx++) {
				xSum = xSum + inputList[inx][jnx];
				ySum = ySum + inputList[jnx][inx];
				yTemp = jnx;
			}
			if(xSum %2 == 1) {
				xCnt++;
				x = inx+1;
			}
			
			if(ySum %2 == 1) {
				yCnt++;
				y = inx+1;
			}
		}
		
		
		if( xCnt == 0 && yCnt == 0) {
			result = "OK";
		}else if( xCnt == 1 && yCnt == 1) {
			result = "Change bit(" + x +"," + y+")";
		}
		
		return result;
	}
	
	
	
	
	
}
