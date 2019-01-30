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
