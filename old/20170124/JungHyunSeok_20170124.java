package com.lgcns.LCP01;


public class JungHyunSeok_20170124 {


    public static void main(String[] args) {

		int count = 0;
		
		for(int i = 1 ; i < 10000; i++){
			
			String str = String.valueOf(i);
			
			for(int j = 0; j <str.length(); j++){
				
				if(str.charAt(j) == '7' )
					
					count += 1;
			}
		}
		
		System.out.println(count);
    	
    }    
}

/*1부터 10,000까지 7이라는 숫자가 총 몇번 나오는가?
7이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 7이라는 숫자를 모두 카운팅 해야 한다.
(※ 예를들어 7707은 3, 7777은 4로 카운팅 해야 함)*/
