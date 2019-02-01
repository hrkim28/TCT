package com.lgcns.exercise.plmtct;

import java.util.ArrayList;
import java.util.Collections;

/**
 *  문제
 * 현우는 초등학생인 여동생의 수학 숙제를 도와주고 있었다.
	현우는 동생을 좀 더 잘 가르치고 싶어 답을 구하는 과정을 되도록 자세히 알려주려고 오른쪽에서 왼쪽으로 순차적으로 계산하는 과정을 보여주고자 한다.
	
	단, 일반적인 수식과 같이 곱하기(*)와 나누기(/)는 연산자 우선순위가 높으므로 먼저 계산해야 한다. 현우를 도와 수식을 입력 받으면 계산과정과 결과를 보여주는 코드를 작성하도록 하자.
	
	입력)
	한 줄로 숫자와 사칙 연산 기호 +, -, *, /로 이루어진 수식이 입력된다.
	
	출력)
	한 줄마다 오른쪽에서 왼쪽으로 한 단계씩 계산된 결과와 나머지 수식을 출력한다.
	
	예시1)
	
	입력
	9+5-4+8
	
	출력
	14-4+8
	10+8
	18
	
	예시 2)
	
	입력
	5+6*3-6/2+5
	
	출력
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
		
			
		//곱셈 , 나눗셈 사칙연산
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
		
		//더하기, 빼기 사칙연산
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
	
	//사칙연산 결과값 구하기
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
