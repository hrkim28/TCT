package com.lgcns.exercise.plmtct;

import java.util.HashMap;


/**
 *  
 *  [문제]
	0부터 9까지의 숫자를 한 번만 사용하여 만든 숫자 중에 입력숫자(1≤ N ≤10,000,000,000)와 가장 차이가 적은 숫자를 출력한다.
	답이 여러 개일 경우, 더 작은 숫자를 출력한다.

	---------- 예 시 ----------
	[입력1]
	222
	[출력1]
	219
	
	[입력2]
	5000
	[출력2]
	5012
	
 */
public class TCT_20190212_ahryunPark {
	
	/**
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190212_ahryunPark tct = new TCT_20190212_ahryunPark();
		
		
		int inputN1 = 222;
		int inputN2 = 5000;
		
		System.out.println("결과값 1 : " + tct.getReuslt(inputN1));
		System.out.println("결과값 2 : " + tct.getReuslt(inputN2));

	}
	
	
	public int getReuslt(int input){
		
		int result = 0;
		
		//최소값 구하기
		boolean isMin = false;
		int min = input;
		while(!isMin) {
			min--;
			isMin = this.isDiffNum(min);
		}
		
		//최대값 구하기
		boolean isMax = false;
		int max = input;
		while(!isMax) {
			max++;
			isMax = this.isDiffNum(max);
		}
		
		//차이값이 같을 경우 최소값 출력
		if(Math.abs(input-min) == Math.abs(input-max) ) {
			result = min;
		}else if(Math.abs(input-min) < Math.abs(input-max)) {
			result = min;
		}else if(Math.abs(input-min) > Math.abs(input-max)) {
			result = max;
		}
		

		return result;
	}
	
	
	/**
	 * 각 자릿수의 숫자가 모두 다를 경우 true
	 * @param input
	 * @return
	 */
	private boolean isDiffNum(int input) {
		boolean isDiff = true;
		String check = String.valueOf(input);
		HashMap<String, Integer> checkList = new HashMap();
		for(int inx = 0; inx < check.length(); inx++) {
			String key = String.valueOf(check.substring(inx, inx+1));
			if(checkList.containsKey(key)) {
				isDiff = false;
				break;
			}else {
				checkList.put(key, 1);
			}
		}
		
		return isDiff;
	}
		
}
