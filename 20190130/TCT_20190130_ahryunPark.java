package com.lgcns.exercise.plmtct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 *  2018년도 순위상금
 *  본선 진출자 100명 중 21명에게 아래와 같은 기준으로 상금을 부여하였다.
 *  순위	상금	인원
	1등	500만원	1명
	2등	300만원	2명
	3등	200만원	3명
	4등	50만원	4명
	5등	30만원	5명
	6등	10만원	6명
 *
 *  2019년도 순위상금
 *  본선 진출자 64명 중 31명에게 아래와 같은 기준으로 상금을 부여할 예정이다.
 *  순위	상금	인원
	1등	512만원	1명
	2등	256만원	2명
	3등	128만원	4명
	4등	64만원	8명
	5등	32만원	16명
	
	입력
	첫 번째 줄에 승우가 상상력을 발휘하여 가정한 횟수 T(1 ≤ T ≤ 1,000)가 주어진다.
	다음 T개 줄에는 한 줄에 하나씩 승우가 해본 가정에 대한 정보가 주어진다. 
	각 줄에는 두 개의 음이 아닌 정수 a(0 ≤ a ≤ 100)와 b(0 ≤ b ≤ 64)가 공백 하나를 사이로 두고 주어진다.
	
	
	출력
	각 가정이 성립할 때 승우가 받을 상금을 원 단위의 정수로 한 줄에 하나씩 출력한다. 입력이 들어오는 순서대로 출력해야 한다.
	
	예제입력
	6
	8 4
	13 19
	8 10
	18 18
	8 25
	13 16
	
	
	예제출력
	1780000
	620000
	1140000
	420000
	820000
	620000
	
 */
public class TCT_20190130_ahryunPark {
	
	/**
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190130_ahryunPark tct = new TCT_20190130_ahryunPark();
		
		int testNum = 6;
		
		int[][] inputList = { {8,4}, 
							  {13, 19},
							  {8, 10},
							  {18, 18},
							  {8, 25},
							  {13, 26},
							};
		
		tct.getReuslt(inputList);

	}
	
	
	public void getReuslt(int[][] inputList){
		
		//등수별 상금
		int[] rankA = {500, 300, 200, 50, 30, 10};
		int[] rankB = {512, 256, 128, 64, 32};
		
		//등수별 명수
		int[] placeA = {1,2,3,4,5,6};
		int[] placeB = {1,2,4,8,16};
		
		for(int i = 0; i < inputList.length; i++) {
			int totalRankA = 0;
			int resultA = 0;
			for(int inx = 0; inx < placeA.length; inx++) {
			
				resultA = resultA + placeA[inx];
				if(resultA >= inputList[i][0]) {
					totalRankA = rankA[inx]*1000;
					break;
					
				}
			}
			
			int totalRankB = 0;
			int resultB = 0;
			for(int inx = 0; inx < placeB.length; inx++) {
				
				resultB = resultB + placeB[inx];
				if(resultB >= inputList[i][1]) {
					totalRankB = rankB[inx]*1000;
					break;
					
				}
			}
			
			int total = totalRankA + totalRankB;
			System.out.println("상금 : " + total + "원");
		}
	}

}
