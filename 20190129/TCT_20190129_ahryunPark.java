package com.lgcns.exercise.plmtct;

import java.util.ArrayList;
import java.util.Collections;

/**
 *  ����
 * ����� �ʵ��л��� �������� ���� ������ �����ְ� �־���.
	����� ������ �� �� �� ����ġ�� �;� ���� ���ϴ� ������ �ǵ��� �ڼ��� �˷��ַ��� �����ʿ��� �������� ���������� ����ϴ� ������ �����ְ��� �Ѵ�.
	
	��, �Ϲ����� ���İ� ���� ���ϱ�(*)�� ������(/)�� ������ �켱������ �����Ƿ� ���� ����ؾ� �Ѵ�. ���츦 ���� ������ �Է� ������ �������� ����� �����ִ� �ڵ带 �ۼ��ϵ��� ����.
	
	�Է�)
	�� �ٷ� ���ڿ� ��Ģ ���� ��ȣ +, -, *, /�� �̷���� ������ �Էµȴ�.
	
	���)
	�� �ٸ��� �����ʿ��� �������� �� �ܰ辿 ���� ����� ������ ������ ����Ѵ�.
	
	����1)
	
	�Է�
	9+5-4+8
	
	���
	14-4+8
	10+8
	18
	
	���� 2)
	
	�Է�
	5+6*3-6/2+5
	
	���
	5+18-6/2+5
	5+18-3+5
	23-3+5
	20+5
	25
 *
 */
public class TCT_20190129_ahryunPark {
	
	/**
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190129_ahryunPark tct = new TCT_20190129_ahryunPark();
		
		String input1 = "9+5-4+8";
//		String input2 = "5+6*3-6/2+5";
		String input2 = "5+6*3-6+5";
		
//		System.out.println(tct.getReuslt(input1));
		System.out.println(tct.getReuslt(input2));
    	
		

	}
	
	
	public String getReuslt(String input){
		
		String msg = "";
		
		String add = "+";
		String sub = "-";
		String div = "/";
		String multi = "*";
		int count = 1;
		char[] charList = input.toCharArray();
		int checkIndex = charList.length;
		
//		while(count != 0) {
//			for(int inx = 0 ; inx < checkIndex; inx++) {
//				if(String.valueOf(charList[inx]).equals(div) || String.valueOf(charList[inx]).equals(multi) ) {
//					if(input.equals(div)) {
//						
//					}else {
//						
//					}
//					
//				}else if(String.valueOf(charList[inx]).equals(add) || String.valueOf(charList[inx]).equals(sub)) {
//					if(String.valueOf(charList[inx]).equals(add)) {
//						String result = "";
//						int startN = 0;
//						int ednN = 0;
//						for(int jnx = inx+1; jnx < checkIndex; jnx++) {
//							
//							if(charList[jnx] != '#') {
//								startN = Integer. charList[jnx];
//								charList[jnx] = '#';
//								break;
//							}
//						}
//						
//						for(int jnx = inx-1; jnx > 0; jnx--) {
//							
//							if(charList[jnx] != '#') {
//								ednN = (int)charList[jnx];
//								charList[jnx] = '#';
//								break;
//							}
//						}
//						int temp = startN + ednN;
//						charList[inx] = (char)temp;
//						
//						for(int jnx = 0; jnx < checkIndex; jnx++) {
//							
//							if(charList[jnx] != '#') {
//								result = result + charList[jnx];
//							}
//						}
//						
//						System.out.println(result);
//						count--;
//						
//					}else {
//						
//					}
//				}
//			}
//		}
//		
		
		
		String[] tempList = new String[input.length()];
		
		for(int inx = 0; inx < input.length(); inx++) {
			String check = input.substring(inx, inx+1);
			if(check.equals(add) || check.equals(sub) || check.equals(div) || check.equals(multi)){
			tempList[inx] = check;
			count++;
			}
		}
		
		
		if(input.contains(div) || input.contains(multi)) {
			
			int divIndex = input.indexOf(div);
			int multiIndex = input.indexOf(multi);
			
			if(divIndex < multiIndex && divIndex > 0 ) {
				int startN = 0;
				int endN = 0;
				for(int inx = divIndex+1; inx < input.length(); inx++) {
					if(input.equals(add) || input.equals(sub) || input.equals(div) || input.equals(multi) ) {
						endN = Integer.valueOf(input.substring(divIndex+1, inx));
					}
				}
				
				for(int inx = divIndex-1; inx > 0; inx--) {
					if(input.equals(add) || input.equals(sub) || input.equals(div) || input.equals(multi) ) {
						startN = Integer.valueOf(input.substring(inx, divIndex-1));
					}
				}
				
				int result = startN * endN;
				count--;
				
				
				

				
			}
			else if (multiIndex < divIndex && multiIndex > 0 ) {
				
			}
			
		}else {
			
		}
		
		
		return msg;
		
	}

}
