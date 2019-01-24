package teamExcercise;

import java.util.ArrayList;
import java.util.Scanner;

public class TCT_20190124_NaHyejeong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		int [] result = new int [3];
		
		for (int i = 2; i < n/2 +1 ; i++) {
			// i와 n-i가 모두 소수인지 확인 
			if ( checkNum(i)  && checkNum(n-i) ) {
				
				if( result[2] == 0 ) {
					result[0] = i;
					result[1] = n-i;
					result[2] = Math.abs( i - (n-i));
				}else if( result[2] > Math.abs( i - (n-i))){
					result[0] = i;
					result[1] = n-i;
					result[2] = Math.abs( i - (n-i));
				}
			}
		}
		
		System.out.println( result[0] + ", " + result[1] +" 의 차이는 >> " +result[2] );
		
		sc.close();

	} 

	private static boolean checkNum(int i) {
		boolean chk = true;
		for (int j = 2; j < i; j++) {
			if( i % j == 0 ) {
				chk = false;
			}
		}
		return chk;
	}

	
}
