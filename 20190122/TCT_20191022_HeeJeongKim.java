package com.tctstudy;

import java.util.Scanner;

public class TCT_20191022_HeeJeongKim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("계단수와 계단별 점수를 입력하시요...");
		
		int stair_count = sc.nextInt();
		
		int stair_points[] = new int [stair_count];
		for (int i=0; i<stair_count; i++) {
			stair_points[i] = sc.nextInt();
		}
		sc.close();
		
		int total_points = 0;
		int stair_cur = 0;
		for (int j=0; j<stair_count; j=j+3) {
			
			stair_cur = j;
			total_points = total_points + stair_points[stair_cur];
			
			int next_points = 0;
			if (stair_cur==stair_count-1) break;
		    else if (stair_cur>stair_count-2)  next_points = stair_points [j+3]; 
			
			//다음칸 또는 다다음칸을 선택하기 위한, 포인트 계산 
			int onePlace = stair_points [j+1] + next_points;
			int twoPlace = stair_points [j+2] + next_points;
			if (onePlace>=twoPlace) {
				total_points = total_points + stair_points [j+1];
			} else {
				total_points = total_points + stair_points [j+2];
			}

		}
	
		System.out.println("total_points----->"+total_points);
		
	}

}
