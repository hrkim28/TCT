package com.test02;

public class SoSoonOne_20170123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 142857;
		int iCount = n;
		int iSum = 0;
		
		while (iCount >= 1) {
			iSum = iSum + iCount%10;
			iCount = iCount/10;
		}
		
		if( n%iSum == 0 ){
			System.out.println(n + " 햐사드 수입니다.");
		}

	}

}
