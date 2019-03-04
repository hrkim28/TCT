package com.lgcns.exercise.plmtct;

import java.util.ArrayList;

/**
 *  
 *  [����]
 *  
 *  
	ȸ��(����, palindrome)�̶� "madam�̳� nurses runó�� �տ������� ������ �ڿ������� ������ ������ �ܾ ��"�� ���մϴ�.
	
	���ڿ��� 0�� �̻��� ���ڸ� �߰��� ȸ���� �����Ҷ�,
	���� ª�� ������ ȸ���� ���ϱ� ���� �ʿ��� �ߺ��� ������ ������ ������ ���Ͻÿ�.
	
	[���ѻ���]
	���� �ҹ��� (a ~ z)�� ������ 1 ~ 50 ������ ���ڿ�
	
	�Է¿��� : madam
	��¿��� : 0 (madam ��ü�� ȸ��)
	
	�Է¿��� : abab
	��¿��� : 1 ( = a)
	
	�Է¿��� : lalavla
	��¿��� : 3 ( = a, v, l)
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
