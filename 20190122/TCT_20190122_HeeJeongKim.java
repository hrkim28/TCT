package com.tctstudy;

import java.util.Scanner;

public class TCT_20190122_HeeJeongKim {

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
		 
		int stair_cur = 0;
		int total_points = 0;
		for (int j=0; j<stair_count/3; j++) {		
			
			stair_cur = j*3;
			
			total_points = total_points + stair_points[stair_cur];
			
			if (stair_cur==stair_count-2) { //다음칸이 마지막
				total_points = total_points + stair_points[stair_cur+1];
			} else  if (stair_points [stair_cur+1]>=stair_points [stair_cur+2]) { //다음칸 선택 
				total_points = total_points + stair_points [stair_cur+1];
			} else { //다다음칸 선택
				total_points = total_points + stair_points [stair_cur+2];
			}
			
		}
	
		System.out.println("total_points----->"+total_points);
		
	}

}
