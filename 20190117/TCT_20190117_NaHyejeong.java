package teamExcercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TCT_20190117_NaHyejeong {

	public static void main(String[] args) {

		//입력값 case1
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt(); // 3 ≤ n ≤ 3000 :3의 배수를 입력함.
		
		int quo = inputNum/3;
		
		ArrayList<int[]> set = new ArrayList<int[]>();
		
		int[] array = new int[3];
		
		// 입력값 확인
		if( quo >= 3 && inputNum%3 == 0) {
			
			for (int i = 1; i < quo-1; i++) {
				array[0] = i;
				for (int j = 1; j < quo-i; j++) {
					
					array[1] = j;
					array[2] = quo-i-j;
					set.add(array); // 배열을 결과값 목록에 저장
					
					// 배열 초기화
					array = new int[3];
					array[0] = i;
				}
			}
		}else {
			System.out.println("잘못된 입력값입니다");
		}
		
		System.out.println("");
		//결과 출력 
		for (int[] a : set) {
			System.out.print(inputNum + " = ");
			System.out.print(3*a[0] +" + "+3*a[1] +" + "+3*a[2]);
			System.out.print(" / ");
		}
		System.out.println("");
		System.out.println("총"+set.size()+"개");
	}

}
