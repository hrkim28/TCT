package com.lgcns.exercise.plmtct;

import java.util.ArrayList;

/**
 *  
 *  [문제]
 *  
 *  
	회문(回文, palindrome)이란 "madam이나 nurses run처럼 앞에서부터 읽으나 뒤에서부터 읽으나 동일한 단어나 구"를 말합니다.
	
	문자열에 0개 이상의 문자를 추가해 회문을 생성할때,
	가장 짧은 길이의 회문을 구하기 위해 필요한 중복을 제외한 문자의 갯수를 구하시오.
	
	[제한사항]
	영어 소문자 (a ~ z)로 구성된 1 ~ 50 글자의 문자열
	
	입력예시 : madam
	출력예시 : 0 (madam 자체가 회문)
	
	입력예시 : abab
	출력예시 : 1 ( = a)
	
	입력예시 : lalavla
	출력예시 : 3 ( = a, v, l)
 */
public class TCT_20190304_ahryunPark {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190304_ahryunPark tct = new TCT_20190304_ahryunPark();
		
		String inputStr1 = "madam";
		String inputStr2 = "abab";
		String inputStr3 = "lalavla";
		
		System.out.println(tct.getReuslt(inputStr1));
		System.out.println(tct.getReuslt(inputStr2));
		System.out.println(tct.getReuslt(inputStr3));
		
	}

	
	public int getReuslt(String input){
		ArrayList<String> resultList = new ArrayList<String>();
		int cnt = 0;
		char[] orgList = input.toCharArray();
		char[] copyList = new char[orgList.length];
		for(int inx = 0 ; inx < orgList.length; inx++) {
			copyList[inx] = orgList[orgList.length-1-inx];
		}
		
		
		boolean isPalindrome = false;
		while(!isPalindrome) {
			isPalindrome = this.isPalindrome(orgList, copyList, cnt);
			if(!isPalindrome) {
				cnt++;
			}
		}
		
		if(cnt > 0) {
			String result = input.substring(0, cnt);
            for (int inx = 0; inx < result.length(); inx++) {
                if (!resultList.contains(result.substring(inx, inx+1))) {
                    resultList.add(result.substring(inx, inx+1));
                }
            }
		}
		
		return resultList.size();
	}
	
	
	private boolean isPalindrome(char[] orgList, char[] copyList, int cnt) {
		
		boolean isPalindrome = true;
		int copyCnt = 0;
		for(int inx = cnt ; inx < orgList.length; inx++) {
			if(orgList[inx] != copyList[copyCnt]) {
				isPalindrome = false;
				break;
			}
			
			copyCnt++;
		}
		
		return isPalindrome;
		
		
	}
	
	
}
