package com.lgcns.LCP01;

import java.io.IOException;

public class JungHyunSeok_20170118 {
	
	/*	오늘의 문제
	n * m 행렬에 maxCnt 의 알파벳 넣기 입니다.
	nm 보다 maxCnt 가 크면 nm 개만 배열
	작으면 증가 -> 감소 배열
	그러고도 남으면 A 로 채우기 입니다.
	( 가로방향 배열, 세로방향 배열)
	
	출력예
	3*4 배열에 maxCnt 16 이면 
	(가로)
	ABCD
	EFGH
	IJKL
	(세로)
	ADGJ
	BEHK
	CFIL
	3*4 maxCnt 10 이면
	(가로)
	ABCD
	EFGH
	IJIH
	(세로)
	ADGJ
	BEHI
	CFIH
	3*4 maxCnt 5 이면
	(가로)
	ABCD
	EDCB
	AAAA
	(세로)
	ADCA
	BEBA
	CDAA*/

	    public static void main(String[] args) throws IOException{
	        
	    	int m= 3;
	        int n= 4;
	        int maxCnt = 16;

			String[] arrStr = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","X","Y","Z"};
			String[][] rset = new String[m][n];

			int k = 0;
			int cnt = 0;

			String result;

			for ( int i = 0 ; i < m ; i++ ) {
				for ( int j = 0; j < n ; j++ ) {
					if ( cnt < arrStr.length ) {
						rset[i][j] = arrStr[k];
						result = rset[i][j];
						System.out.print(result);
						k++;
						cnt++;
					}
				}
				
				System.out.println();
			}

	}

}
