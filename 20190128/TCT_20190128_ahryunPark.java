package com.lgcns.exercise.plmtct;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * 문제
	영어로 된 문장이 주어졌을 때, 대소문자 구분없이 가장 많이 사용된 알파벳을 출력하는 프로그램을 작성하시오.
	
	입력
	첫째 줄부터 글의 문장이 주어진다.
	글은 최대 5000글자로 구성되어 있고, 공백, 알파벳, 특수문자, 엔터로만 이루어져 있다.
	그리고 적어도 하나의 알파벳이 있다.
	
	[case1]
	I think I'm lost.
	[case2]
	I think I'm lost.I can't tell.
	[case3]
	I think I'm lost. I can't tell what's where.
	
	출력
	가장 많이 사용된 알파벳과 그 횟수를 출력한다.
	가장 많이 쓰인 알파벳이 여러개인 경우 알파벳순서대로 모두 출력한다.
	
	[case1]
	가장많이 쓰인 알파벳 : i = 3회
	[case2]
	가장많이 쓰인 알파벳 : i, t = 4 회
	[case3]
	가장많이 쓰인 알파벳 : t = 5 회
 *
 */
public class TCT_20190128_ahryunPark {
	
	/**
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190128_ahryunPark tct = new TCT_20190128_ahryunPark();
		
		String input1 = "I think I'm lost.";
		String input2 = "I think I'm lost.I can't tell.";
		String input3 = "I think I'm lost. I can't tell what's where.";
		
		System.out.println(tct.getReuslt(input1));
		System.out.println(tct.getReuslt(input2));
		System.out.println(tct.getReuslt(input3));
    	
		

	}
	
	
	public String getReuslt(String input){
		
		String msg = "";
		
		//Input 값 아스키코드로 변환하여 sorting 하여 List
		input = input.toLowerCase();
		char[] charList = input.toCharArray();
		ArrayList<Integer> textList = new ArrayList<>();
		for(int inx = 0 ; inx < charList.length; inx++) {
			int temp = (int)charList[inx];
			if(temp >= 97 && temp <= 122) {
				textList.add((int)charList[inx]);
			}
			
		}
		Collections.sort(textList);
		
		//int 배열로 아스키코드값에 count하면서 max 값 구하기
		int max = 0;
		int[] result = new int[123];
		for(int inx = 0 ; inx < textList.size(); inx++) {	
			result[textList.get(inx)]++; //= result[textList.get(inx)]+1;
			
			if(inx != 0 && !textList.get(inx).equals(textList.get(inx-1))) {
				if(max < result[textList.get(inx-1)]) {
					max = result[textList.get(inx-1)];
				}
			}
				

		}
		
		//max값일때만 출력하기 
		for(int inx = 0 ; inx <result.length; inx++ ) {
			if(result[inx] == max) {
				char a= (char)inx;
				msg = msg + a + " ";
			}
		}
		
			msg = "가장많이 쓰인 알파벳 : " + msg + " = " + String.valueOf(max) + "회";
			

		return msg;
		
	}

}
