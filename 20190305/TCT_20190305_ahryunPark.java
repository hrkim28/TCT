package com.lgcns.exercise.plmtct;

import java.util.ArrayList;

/**
 *  
	[문제]
	10진수에서 3 또는 9의 배수로 만들어진 숫자는 각 자릿수의 합도 3 또는 9의 배수가 됩니다.(아셨나요?^^)
	예를 들어 354는 1183=354로 3의 배수이자 3+5+4=12 로 12 역시 3의 배수입니다.
	9의 배수 972는 1089=972로 9의 배수이자 9+7+2=18로 18 역시 9의 배수입니다.
	(2 또는 5의배수인 100은 2와5의배수는 만족하지만, 1+0+0=1이 되므로 합계가 2 또는 5의 배수가 안 됩니다.)
	
	3진수에서 숫자 2가 이런 성질을 가지고 있습니다.
	예를 들어 10진수 6을 3진수로 표현하면 20이고 2+0=2 로 2의 배수입니다.
	10진수 26을 3진수로 표현하면 222이고 2+2+2=6으로 2의 배수입니다.
	
	입력값으로 진수가 주어졌을때 위와 같은 성질을 가지는 숫자를 모두 출력하세요. (단, 0과 1은 제외함)
	어떤 수가 이러한 합의 배수가 되는 성질을 가지는지 알고자 모든 숫자의 곱을 고려할 필요는 없습니다.
	만약 4자리 미만의 곱으로 성립되면 더 큰 자리에서도 성립된다고 할 수 있습니다.
	(예를 들어 10진수에서는 999보다 큰숫자를 고려하지 않아도 됩니다.)
	
	[제한사항]
	진수(base) : 3~30까지의 정수
	
	[입출력]
	입력예시 : 진수 = 10
	출력예시 : 3,9
	
	입력예시 : 진수 = 3
	출력예시 : 2
	
	입력예시 : 진수 = 26
	출력예시 : 5, 25
	
	입력예시 : 진수 = 30
	출력예시 : 29
 */
public class TCT_20190305_ahryunPark {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190305_ahryunPark tct = new TCT_20190305_ahryunPark();
		
		
		int inputN1 = 10;
		int inputN2 = 3;
		int inputN3 = 26;
		int inputN4 = 30;
		
		
		tct.getReuslt(inputN1);
		tct.getReuslt(inputN2);
		tct.getReuslt(inputN3);
		tct.getReuslt(inputN4);
		
	}

	
	public void getReuslt(int input){
		
		
		ArrayList<Integer> resultList = this.getMultiple(input);
		
		for(int inx = 0 ; inx < resultList.size(); inx++) {
			System.out.print(resultList.get(inx));
			if(inx != resultList.size()-1) {
				System.out.print(" , ");
			}
		}
		System.out.println("");
	}
	
	
	private ArrayList<Integer> getMultiple(int input) {
		
		ArrayList<Integer> multiList = new ArrayList<Integer>();
		for(int inx = 2; inx < input ; inx++) {
			boolean isMulti = true;
			for(int jnx = 2; jnx < input; jnx++) {
				int multi = inx*jnx;
				int sum = this.toDeposition(multi, input) ;
			
				if(sum%inx != 0) {
					isMulti = false;
					break;
				}
			}
			
			if(isMulti) {
				multiList.add(inx);
			}
		}
		
		return multiList;
		
	}
	
	
	private int toDeposition(int multi, int input) {
		int sum = 0;

	    while(multi != 0){
        	sum = sum + (multi % input) ;
        	multi /= input;
	    }

	    return sum;
	}
	
}
