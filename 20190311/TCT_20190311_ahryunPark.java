package com.lgcns.exercise.plmtct;

import java.util.ArrayList;
import java.util.Collections;

/**
 *  
[����]
	3 ������ ��ȣ���ڵ� '()', '[]', '{}' �� �̷���� ���ڿ��� �־�����.
	�� ���ڿ��� ���� ��ȣ���� ¦�� ��� �´��� �Ǻ��ϴ� ���α׷��� �ۼ��Ѵ�.
	���� ��� �Ʒ��� ���� ���ڿ��� ��ȿ�ϴٰ� �Ǵ��� �� �ִ�.
	
	{[()]}[{}]
	
	�Ʒ��� ���� ���ڿ��� ��ȿ���� ���� ���ڿ��̴�. '[' ��ȣ�� ¦�� ã�� �� ���� �����̴�
	{[()]}[{}
	
	�Ʒ� ���ڿ��� ���� �ݴ� ��ȣ�� ������ ��ȿ�ϳ� ¦�� ���� �ʴ� ��ȣ�� ��� �Ǿ��� ������ ��ȿ���� �ʴ� ==> {)
	{[()]}[{)]
	
	[��/��� ����]
	�Է� : {[()]}[{}]
	��� : true
	
	�Է� : {[()]}[{}[
	��� : false
	
	�Է� : {[()]}[{)]
	��� : false
	
	�Է� : {[(]}[{}]
	��� : false

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
