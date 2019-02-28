package com.lgcns.exercise.plmtct;

import java.util.ArrayList;

/**
 *  
 *  [문제]
 *  
 *  
 	결혼 적령기인 LG CNS 모 책임은 동시에 여러명의 상대를 소개받아 데이트를 하게 되었습니다.
	그러나 모 책임은 상대적으로 기억력이 좋지 않아 상대방이 많아질수록 실수를 하게 될 Risk가 증가하게됩니다.
	모 책임을 위해 모 책임의 기억력에 따른 위험도를 산출하는 프로그램을 작성해야 합니다.
	
	제한 사항
	입력 형식
	. 모 책임의 기억력 사이즈와 데이트하는 상대의 이름 배열을 입력받습니다.
	. 기억력 사이즈는 정수이며 범위는 0 이상 10 이하입니다.
	. 상대방의 이름은 문자열 배열로 최대 100개입니다.
	
	출력 형식
	. 입력된 상대의 이름을 순서대로 만날때 실수를 하게될 위험도를 출력합니다.
	
	조건
	. 기억력은 가장 최근에 만나 사람을 기억합니다.(Least Recently Used)
	. 기억력 범위 안일 경우 위험도는 1 증가합니다.
	. 기억력 범위 밖일 경우 위험도는 5 증가합니다.
	
	입출력 예
	예제 1
	(1) 입력
	. 기억력: 3
	. 상대: ["전지현", "손예진", "송혜교", "수지", "설현", "전지현", "손예진", "송혜교", "수진", "설현"]
	(2) 출력
	. 위험도: 50
	
	예제 2
	(1) 입력
	. 기억력: 3
	. 상대: ["전지현", "손예진", "송혜교", "전지현", "손예진", "송혜교", "전지현", "손예진", "송혜교"]
	(2) 출력
	. 위험도: 21
	
	예제 3
	(1) 입력
	. 기억력: 2
	. 상대: ["전지현", "손예진", "송혜교", "수지", "설현", "김하늘", "송혜교", "이나영", "한가인", "전지현", "수지", "이나영"]
	(2) 출력
	. 위험도: 60
	
	예제 4
	(1) 입력
	. 기억력: 5
	. 상대: ["전지현", "손예진", "송혜교", "수지", "설현", "김하늘", "송혜교", "이나영", "한가인", "전지현", "수지", "이나영"]
	(2) 출력
	. 위험도: 52
 */
public class TCT_20190228_ahryunPark {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190228_ahryunPark tct = new TCT_20190228_ahryunPark();
		
		int memory1 = 3;
		String[] inputList1 = {"전지현", "손예진", "송혜교", "수지", "설현", "전지현", "손예진", "송혜교", "수진", "설현"};
		
		int memory2 = 3;
		String[] inputList2 = {"전지현", "손예진", "송혜교", "전지현", "손예진", "송혜교", "전지현", "손예진", "송혜교"};
		
		int memory3 = 2;
		String[] inputList3 = {"전지현", "손예진", "송혜교", "수지", "설현", "김하늘", "송혜교", "이나영", "한가인", "전지현", "수지", "이나영"};

		
		int memory4 = 5;
		String[] inputList4 = {"전지현", "손예진", "송혜교", "수지", "설현", "김하늘", "송혜교", "이나영", "한가인", "전지현", "수지", "이나영"};

		
		System.out.println("위험도 " + tct.getReuslt(memory1, inputList1));
		System.out.println("위험도 " + tct.getReuslt(memory2, inputList2));
		System.out.println("위험도 " + tct.getReuslt(memory3, inputList3));
		System.out.println("위험도 " + tct.getReuslt(memory4, inputList4));
		
	}

	
	public int getReuslt(int memory, String[] inputList){
		
		
		int risk = 0;
		
		for(int inx = 0 ; inx < inputList.length; inx++) {
			
			boolean isExist = false;
			int check = 0;
			if(inx < memory) {
				check = 0;
			}else {
				check = inx - memory;
			}
			for(int jnx = check; jnx < inx ; jnx++) {
				if(inputList[inx].equals(inputList[jnx])) {
					isExist = true;
					break;
				}
			}
			
			if(isExist) {
				risk++;
			}else {
				risk = risk + 5;
			}
			
		}
		
		
		return risk;
	}
	
	
}
