package com.test02;

public class SoSoonOne_20170124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0 ;
		
		String a = "";
		for (int i = 1; i<1000 ; i++){
			a = a + i;
		}
		
		String b[] = a.split("7");
		System.out.println(10*(b.length-1)+1000); // 10000 = 10*1000개 갯수 + 7000번대 1000개  
		
	}

}
