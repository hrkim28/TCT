package com.lgcns.exercise.plmtct;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * 주어진 숫자들 중 홀수갯수인 숫자의 XOR 연산 값 구하기
 *
 */
public class TCT_20190124_ahryunPark {
	
	/**
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190124_ahryunPark tct = new TCT_20190124_ahryunPark();
		
		
		Scanner sc = new Scanner(System.in);
    	System.out.println("값을 입력하세요");
    	int n = sc.nextInt();
    	if(n%2 == 0) {
    		if(n >= 4 && n <=10000) {
        		System.out.println(tct.getReuslt(n));
        	}else {
        		System.err.println(" 4이상 10000 이하의 자연수를 입력하세요");
        	}
    	}else {
    		System.err.println(" 짝수만 가능합니다.");
    	}
    	
		
//		int n = 16;
//		System.out.println(tct.getReuslt(n));

	}
	
	
	public String getReuslt(int input){
		
		String msg = "";
		
		//Input값의 소수 List 구하기
		ArrayList<Integer> primList = new ArrayList<>();
		for(int inx = 2 ; inx <= input; inx++) {
			
			int count = 0;
			for(int jnx = 2 ; jnx <= inx; jnx++) {
				if(inx%jnx == 0) {
					count++;
				}
			}
			if(count == 1) {
				primList.add(inx);
			}
		}
		
		int min = input;
		int[] result = {0,0};
		for(int inx = 0 ; inx < primList.size(); inx++) {			
			for(int jnx = inx; jnx< primList.size(); jnx++) {
				if( (primList.get(inx) + primList.get(jnx))  == input ) {
					
					int check = Math.abs(primList.get(inx) - primList.get(jnx) );
					if(min > check) {
						min = check;
						result[0] = primList.get(inx);
						result[1] = primList.get(jnx);
					}
				}
			}
		}
		
		
		if(result[0] == 0 || result[1] == 0 ) {
			msg = "소수합을 구할 수 없습니다.";
			
		}else {
			msg = "결과값 두 수는 " + result[0] +" ," + result[1] + " 입니다.";
		}

		return msg;
		
	}

}
