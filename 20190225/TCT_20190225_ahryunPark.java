package com.lgcns.exercise.plmtct;

import java.util.ArrayList;

/**
 *  
 *  [문제]
 *  
 *  
 	엄마가 아이에게 용돈을 줍니다.
	요즘 교과과정에 코딩교육이 들어간다고 하여 아이의 알고리즘 학습을 위해 용돈 주는 방법을 이용해 봅니다.
	
	금액이 표시된 용돈 봉투 여러개를 원형으로 배열합니다.
	아이는 봉투 여러개를 선택 할 수 있지만 조건이 있습니다.
	선택한 봉투 양쪽 옆의 봉투는 선택할 수 없습니다.
	
	아래 예시는 원형을 배열로 표현한 것으로 첫번째 1000원과 마지막 5000원은 연속된 것으로 합니다.
	1000원을 선택하면 양옆의 2000원과 5000원은 선택할 수 없습니다.
	예시 : { 1000, 2000, 3000, 4000, 5000 }
	
	예시로 주어진 배열에서 아이가 가질 수 있는 최대 금액을 구하세요.
	
	[제약조건]
	2 ~ 30 개의 배열 요소
	배열의 요소는 1 ~ 50,000 사이의 값
	
	[입력예시]
	예시1 = { 2000, 3000 }
	예시2 = { 1000, 3000, 1000 }
	예시3 = { 2000, 2000, 2000, 2000 }
	예시4 = { 1000, 10000, 8000, 5000, 7000, 3000, 9000 }
	
	[출력예시]
	결과1 = 3000
	결과2 = 3000
	결과3 = 4000 ( = 2000 + 2000 )
	결과4 = 26000 ( = 10000 + 7000 + 9000 )
 */
public class TCT_20190225_ahryunPark {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190225_ahryunPark tct = new TCT_20190225_ahryunPark();

		int[] inputList1 = { 2000, 3000 };
		int[] inputList2 = { 1000, 3000, 1000};
		int[] inputList3 = { 2000, 2000, 2000, 2000 };
		int[] inputList4 = { 1000, 10000, 8000, 5000, 7000, 3000, 9000 };
		
		
		
		System.out.println(tct.getReuslt(inputList1));
		System.out.println(tct.getReuslt(inputList2));
		System.out.println(tct.getReuslt(inputList3));
		System.out.println(tct.getReuslt(inputList4));
		
	}

	
	public int getReuslt(int[] inputList){
		
		int sumMax = 0;
		
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		for(int inx = 0 ;inx < inputList.length; inx++) {
			resultList.add(inputList[inx]);
		}
		
		while(resultList.size() > 0) {
			if(resultList.size() == 1) {
				sumMax = sumMax + resultList.get(0);
				resultList.clear();
			}else {
				int maxIndex = this.getMax(resultList);
				sumMax = sumMax + resultList.get(maxIndex);
				if(resultList.size() > 3) {
					if(maxIndex == 0 ) {
						resultList.remove(maxIndex);
						resultList.remove(maxIndex);
						resultList.remove(resultList.size()-1);
					}else if(maxIndex == resultList.size()-1) {
						resultList.remove(maxIndex);
						resultList.remove(maxIndex-1);
						resultList.remove(0);
					}else {
						resultList.remove(maxIndex);
						resultList.remove(maxIndex-1);
						resultList.remove(maxIndex-1);
					}
				}else {
					resultList.clear();
				}
			}
		}
			

		return sumMax;
	}
	
	
	private int getMax(ArrayList<Integer> resultList) {
		int max = resultList.get(0);
		int maxIndex = 0;
		
		for(int inx = 1; inx < resultList.size(); inx++) {
			if(max < resultList.get(inx)) {
				max = resultList.get(inx);
				maxIndex = inx;
			}
		}
		
		
		return maxIndex;
	}
		
		
	
	
}
