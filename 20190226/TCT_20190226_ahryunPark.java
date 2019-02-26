package com.lgcns.exercise.plmtct;

import java.util.ArrayList;

/**
 *  
 *  [����]
 *  
 *  
 	[�Է�]
	ù° �ٿ� 9���� ������ �־�����. ù ��° ������ ���� ���ǿ��� 1�� ������ �� ������ ���ڰ� ��� ������ ������ �� ��������, �� ��° ������ ���� ���ǿ��� 2�� ������ �� ������ ���ڰ� ��� ������ ������ ������ �Ǿ�����...�̷� ���̴�.
	
	�缮�̴� *�̶� 0�� �� ���� ����. #Ű�� �������� �ʾҴ�.
	
	�� ��° �ٿ� �ҹ��ڷ� �� ���ڿ��� �־�����. ���̴� 100 ���ڸ� ���� �ʴ´�.
	
	[���]
	�缮���� �޼����� ���� ���� ������ �ϴ� Ű�� ����Ѵ�.
	
	[�����Է�1]
	2 3 4 5 6 7 8 9 1
	klor
	[�����Է�2]
	7 8 9 1 2 3 6 5 4
	djevojka
	[�����Է�3]
	9 8 7 6 5 4 3 2 1
	skakavac
	
	[�������1]
	44#444555666
	[�������2]
	68662227778#885
	[�������3]
	33335585582228#888
 */
public class TCT_20190226_ahryunPark {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190226_ahryunPark tct = new TCT_20190226_ahryunPark();

		int[] inputList1 = { 2, 3, 4, 5, 6, 7, 8, 9, 1 };
		String inputStr1 = "klor";
		int[] inputList2 = { 7, 8, 9, 1, 2, 3, 6, 5, 4 };
		String inputStr2 = "djevojka";
		int[] inputList3 = { 9, 8, 7, 6, 5, 4, 3, 2, 1};
		String inputStr3 = "skakavac";
		
		
		
		System.out.println(tct.getReuslt(inputList1, inputStr1));
		System.out.println(tct.getReuslt(inputList2, inputStr2));
		System.out.println(tct.getReuslt(inputList3, inputStr3));
		
	}

	
	public String getReuslt(int[] inputList, String inputStr){
		
		String result = "";
		String orgResult = "";
		
		//Original Key ���ϱ�
		for(int inx = 0; inx < inputStr.length(); inx++) {
			String key = this.getOriginalKey(inputStr.substring(inx, inx+1));
			if(inx != 0) {
				if(orgResult.substring(orgResult.length()-1).equals(key.substring(0, 1))) {
					orgResult = orgResult + "#" + key;
				}else {
					orgResult = orgResult + key;
				}
			}else {
				orgResult = key;
			}
		}
		
		//Index�� ���ϱ�
		for(int inx = 0; inx< orgResult.length(); inx++) {
			String check = orgResult.substring(inx, inx+1);
			if(!check.equals("#")) {
				result = result + this.getIndex(inputList, Integer.valueOf(check));
			}else {
				result = result + "#";
			}
		}
			

		return result;
	}
	
	
	
	private String getOriginalKey(String inputStr) {
		
		String orgKey = "";
		String[] orgKeyList = { "abc","def","ghi", "jkl", "mno", "pqrs", "tuv", "xwyz"};
				 
		
		int key = 0;
		int cnt = 0;
		for(int inx = 0 ; inx < orgKeyList.length; inx++ ) {
			String check = orgKeyList[inx];
			if(check.contains(inputStr)) {
				key = inx+2;
				cnt = check.indexOf(inputStr)+1;
				break;
			}
		}
		
		for(int inx = 0 ; inx < cnt; inx++) {
			orgKey = orgKey + String.valueOf(key);
		}
		
		return orgKey;
	}
	
	
	
	private String getIndex(int[] inputList, int check) {
		int index = 0;
		for(int inx = 0 ; inx < inputList.length; inx++) {
			if(inputList[inx] == check) {
				index = inx+1;
			}
			
		}
		
		return String.valueOf(index);
	}
	
	
}
