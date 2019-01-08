
public class KimHyeRyoung_20170119 {

	public static void main(String[] args) {
		/*
		    100부터 1000 사이의 숫자 중 각 자릿수에 해당하는 세제곱 값의 합이 해당 숫자와 동일한 숫자를 출력한다.
			  ex) 153 = 1x1x1 + 5x5x5 + 3x3x3
			= 1 + 125 + 27
			[조건]
			1) Armstrong Number 출력한다.
			[예상결과]
			153
			370
			371
			407
		 */
		System.out.println("[예상결과]");
		
		int x,y,z = 0;
		int power = 3;
		for ( int idx = 100; idx < 1000 ; idx++ ) {
			x = idx/100;
			y = (idx - x*100)/10;
			z = idx - x*100 - y*10;
			
			if ( idx == (int)Math.pow(x, power) + (int)Math.pow(y, power) + (int)Math.pow(z, power) ) {
				System.out.println(idx);
			}
		}
	}
}
