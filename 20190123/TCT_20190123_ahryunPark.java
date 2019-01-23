package com.lgcns.exercise.plmtct;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * 주어진 숫자들 중 홀수갯수인 숫자의 XOR 연산 값 구하기
 *
 */
public class TCT_20190123_ahryunPark {
	
	/**
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190123_ahryunPark tct = new TCT_20190123_ahryunPark();
		
		
		Scanner sc = new Scanner(System.in);
    	System.out.println("총 자연수 갯수를 입력하세요");
    	int totalSize = sc.nextInt();
    	
        System.out.println("N 개의 숫자들을 입력하세요(,로 구분하세요)");
        String sInput = sc.next();
        String[] input = sInput.split(",");
        if ( input.length != totalSize ) {
        	System.err.println("총 자연수 갯수와 입력한 N 개의 숫자의 개수가 일치하지 않습니다.");
        } else {
        	System.out.println("결과값 : " + tct.getReuslt(input));
        }
		
		
//		int n = 4;
//		int[] input = {2,5,3,3};
//		int[] input = {2,5,5,3,3,3};
//		System.out.println(tct.getReuslt(input));

	}
	
	
	public int getReuslt(String[] input){
		
		int result = 0;
		//홀수인 자연수 추출 및 XOR 연산 
		int count = 1;
		for(int inx = 0; inx < input.length; inx++) {
			
			if(inx != input.length-1) {
				if( (input[inx].equals(input[inx+1]))) {
					count++;
				}else {
					if(count%2 != 0) {
						//XOR 연산 
						result ^= Integer.valueOf(input[inx]);
					}
					count = 1;
				}
			}else {
				if(count%2 != 0) {
					//XOR 연산 
					result ^= Integer.valueOf(input[inx]);
				}
			}
		}

		return result;
		
	}

}
