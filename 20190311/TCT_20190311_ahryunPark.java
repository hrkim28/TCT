package com.lgcns.exercise.plmtct;

import java.util.ArrayList;
import java.util.Collections;

/**
 *  
[문제]
	3 종류의 괄호문자들 '()', '[]', '{}' 로 이루어진 문자열이 주어진다.
	이 문자열에 사용된 괄호들의 짝이 모두 맞는지 판별하는 프로그램을 작성한다.
	예를 들어 아래와 같은 문자열은 유효하다고 판단할 수 있다.
	
	{[()]}[{}]
	
	아래와 같은 문자열은 유효하지 않은 문자열이다. '[' 괄호의 짝을 찾을 수 없기 때문이다
	{[()]}[{}
	
	아래 문자열은 열고 닫는 괄호의 개수는 유효하나 짝이 맞지 않는 괄호가 사용 되었기 때문에 유효하지 않다 ==> {)
	{[()]}[{)]
	
	[입/출력 예시]
	입력 : {[()]}[{}]
	출력 : true
	
	입력 : {[()]}[{}[
	출력 : false
	
	입력 : {[()]}[{)]
	출력 : false
	
	입력 : {[(]}[{}]
	출력 : false

 */
public class TCT_20190311_ahryunPark {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190311_ahryunPark tct = new TCT_20190311_ahryunPark();
		
		
		String inputStr1 = "{[()]}[{}]";
		String inputStr2 = "{[()]}[{)]";
		String inputStr3 = "{[(]}[{}]";
		
		System.out.println(tct.getReuslt(inputStr1));
		System.out.println(tct.getReuslt(inputStr2));
		System.out.println(tct.getReuslt(inputStr3));
		
	}

	
	public boolean getReuslt(String input){
		
		boolean result = false;
		
		char checkLeft1 = '{';
		char checkRight1 = '}';
		char checkLeft2 = '[';
		char checkRight2 = ']';
		char checkLeft3 = '(';
		char checkRight3 = ')';
		
		int checkLeft1Cnt = 0;
		int checkLeft2Cnt = 0;
		int checkLeft3Cnt = 0;
		int checkRight1Cnt = 0;
		int checkRight2Cnt = 0;
		int checkRight3Cnt = 0;
		
		char[] inputList = input.toCharArray();
		
		for(int inx = 0 ; inx < inputList.length; inx++) {
			if(checkLeft1 == inputList[inx]) {
				checkLeft1Cnt++;
			}else if(checkRight1 == inputList[inx]) {
				checkRight1Cnt++;
			}else if(checkLeft2 == inputList[inx]) {
				checkLeft2Cnt++;
			}else if(checkRight2 == inputList[inx]) {
				checkRight2Cnt++;
			}else if(checkLeft3 == inputList[inx]) {
				checkLeft3Cnt++;
			}else if(checkRight3 == inputList[inx]) {
				checkRight3Cnt++;
			}
		}
		
		if( (checkLeft1Cnt == checkRight1Cnt) && (checkLeft2Cnt == checkRight2Cnt) && (checkLeft3Cnt == checkRight3Cnt)) {
			result = true;
		}
		
		
		
		return result;
	}
	
	
	
	
}
