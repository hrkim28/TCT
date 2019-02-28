package com.tctstudy;

import java.util.ArrayList;

public class TCT_20190228_HeeJeongKim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*TestCase 2
		int forgetN = 3;
		String[] input_Name = {"전지현", "손예진", "송혜교", "전지현", "손예진", "송혜교", "전지현", "손예진", "송혜교"};
		*/
		/*TestCase 3
		int forgetN = 2;
		String[] input_Name = {"전지현", "손예진", "송혜교", "수지", "설현", "김하늘", "송혜교", "이나영", "한가인", "전지현", "수지", "이나영"};
        */
		//TestCase 4
		int forgetN = 5; //기억력
		String[] input_Name = {"전지현", "손예진", "송혜교", "수지", "설현", "김하늘", "송혜교", "이나영", "한가인", "전지현", "수지", "이나영"}; //상대자이름
		
		int riskPoint = 0; //위험도
		ArrayList<String> list = new ArrayList<String>(); //위험도만큼의 만난사람목록
		for (int i=0; i<input_Name.length; i++) {
			
			if (!list.isEmpty() && list.contains(input_Name[i])) { //최근에 만난사람 여부
				riskPoint = riskPoint + 1;
			} else {
				riskPoint = riskPoint + 5;
			}
			
			if (list.size() == forgetN) list.remove(0); //기억력갯수만큼 저장
			list.add(input_Name[i]);
		}
		
		System.out.println("위험도:"+riskPoint);
		
	}

}
