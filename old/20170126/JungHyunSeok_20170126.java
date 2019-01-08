package com.lgcns.LCP01;

public class JungHyunSeok_20170126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] str = {"a1","a2","a3","a4","a5","b1","b2","b3","b4","b5"}; 
		String[] test = new String[str.length]; 
		
		int j =0; 
		int k =str.length/2; 
		int m =0; 
		
		for(int i=0; i<str.length; i++){ 
			if(i%2 == 0){ 
				test[j++]=str[m++]; 
			}else{ 
				test[j++]=str[k++]; 
			}
		}

		for(String result: test){ 
			System.out.print(result+" "); 
		}
		
	}

}
/*
[2017.01.26 오늘의 문제]
다음과 같은 형태의 배열을
[a1,a2,a3...,an,b1,b2...bn]
다음과 같은 형태로 바꾸시오
[a1,b1,a2,b2.....an,bn]
*/
