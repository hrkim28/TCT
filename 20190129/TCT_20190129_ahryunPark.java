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
		String input2 = "5+6*3-6/2+5";
		System.out.println("Case1");
		System.out.println(tct.getReuslt(input1));
		System.out.println("Case2");
		System.out.println(tct.getReuslt(input2));
		

	}
	
	
	private String getReuslt(String input){
		
		String msg = "";
		
		String add = "+";
		String sub = "-";
		String div = "/";
		String multi = "*";
		char[] charList = input.toCharArray();
		
		ArrayList<String> wordList = new ArrayList<String>();
		
		for(int inx = 0 ; inx < charList.length; inx++) {
			wordList.add(String.valueOf(charList[inx]));
		}
		
			
		//���� , ������ ��Ģ����
		if(wordList.contains("*") || wordList.contains("/")) {
			
			for(int inx = 0; inx <  wordList.size(); inx++) {
				String check = wordList.get(inx);
				if(check.equals("*") || check.equals("/") ) {
					
					int result = getCal(check, Integer.valueOf(wordList.get(inx-1)), Integer.valueOf(wordList.get(inx+1)));
					wordList.add(inx, String.valueOf(result));
					wordList.remove(inx+1);
					wordList.remove(inx+1);
					wordList.remove(inx-1);
					this.printOperation(wordList);
					inx = 0;
					
				}
			}
		}
		
		//���ϱ�, ���� ��Ģ����
		if(wordList.contains("+") || wordList.contains("-")) {
			
			for(int inx = 0; inx <  wordList.size(); inx++) {
				String check = wordList.get(inx);
				if(check.equals("+") || check.equals("-") ) {
					
					int result = getCal(check, Integer.valueOf(wordList.get(inx-1)), Integer.valueOf(wordList.get(inx+1)));
					wordList.add(inx, String.valueOf(result));
					wordList.remove(inx+1);
					wordList.remove(inx+1);
					wordList.remove(inx-1);
					this.printOperation(wordList);
					inx = 0;
				}
			}
		}
		
		
		return msg;
		
	}
	
	//��Ģ���� ����� ���ϱ�
	private int getCal(String operation, int preNum, int nextNum) {
		int result = 0;
		
		switch(operation) {
			case "*":
				result = preNum * nextNum;
				break;
			case "/":
				result = preNum / nextNum;
				break;
			case "+":
				result = preNum + nextNum;
				break;
			case "-":
				result = preNum - nextNum;	
				break;
		}
		
		return result;
	}
	
	private void printOperation(ArrayList<String> wordList) {
		
		if(!wordList.isEmpty()) {
			for(int inx = 0 ; inx < wordList.size(); inx++) {
				System.out.print(wordList.get(inx));
			}
			System.out.println("");
		}
		
	}
	

}
