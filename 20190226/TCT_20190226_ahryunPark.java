package com.lgcns.exercise.plmtct;

import java.util.ArrayList;

/**
 *  
 *  [문제]
 *  
 *  
 	[입력]
	첫째 줄엔 9개의 정수가 주어진다. 첫 번째 정수는 원래 자판에서 1을 눌렀을 때 나오는 문자가 어느 자판을 눌렀을 때 나오는지, 두 번째 정수는 원래 자판에서 2를 눌렀을 때 나오는 문자가 어느 자판을 눌러야 나오게 되었는지...이런 식이다.
	
	재석이는 *이랑 0은 쓸 수가 없다. #키는 망가지지 않았다.
	
	두 번째 줄엔 소문자로 된 문자열이 주어진다. 길이는 100 문자를 넘지 않는다.
	
	[출력]
	재석이의 메세지를 쓰기 위해 눌러야 하는 키를 출력한다.
	
	[예제입력1]
	2 3 4 5 6 7 8 9 1
	klor
	[예제입력2]
	7 8 9 1 2 3 6 5 4
	djevojka
	[예제입력3]
	9 8 7 6 5 4 3 2 1
	skakavac
	
	[예제출력1]
	44#444555666
	[예제출력2]
	68662227778#885
	[예제출력3]
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
		
		//Original Key 구하기
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
		
		//Index값 구하기
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
