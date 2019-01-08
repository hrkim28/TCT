package com.lgcns.LCP01;

public class JungHyunSeok_20170119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		<오늘의 문제>
		오후 12:55
		 100부터 1000 사이의 숫자 중 각 자릿수에 해당하는 세제곱 값의 합이 해당 숫자와 동일한 숫자를 출력한다.
		  ex) 153 = 1x1x1 + 5x5x5 + 3x3x3
		= 1 + 125 + 27
		[조건]
		1) Armstrong Number 출력한다.
		[예상결과]
		153
		370
		371
		407*/
		

		int a = 0;
		int b = 0;
		int c = 0;
		int sum = 0;
		String str = "";
		
		for (int i = 100; i < 1000; i++){
			str = Integer.toString(i);
			
            a = Integer.parseInt( str.substring( 0, 1 ) );
            b = Integer.parseInt( str.substring( 1, 2 ) );
            c = Integer.parseInt( str.substring( 2 ) );

            sum = a*a*a + b*b*b + c*c*c;
			
			if(i == sum){
				System.out.println(i);
			}
			
		}
		
	}

}
