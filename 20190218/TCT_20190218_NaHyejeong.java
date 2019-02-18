package teamExcercise;
import java.util.Scanner;

public class TCT_20190218_NaHyejeong {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] n = new int [sc.nextInt()];
		
		for (int i = 0; i < n.length; i++) {
			 n[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n.length; i++) {
			if( n[i] < 0  || n[i] > 40) {
				 System.out.println("n은 40이하의 자연수로 입력해주세요");
				 sc.close();
			}else {
				 getFibonacciCnt(n[i]);
			}
		}
		
		sc.close();
	}

	private static void getFibonacciCnt(int n) {
		
		int[][] fibonacciMap = new int [n+1][2];
		
		if( n >= 0 ){
			fibonacciMap[0][0] = 1;
			fibonacciMap[0][1] = 0;
		}
		if( n >= 1) {
			fibonacciMap[1][0] = 0;
			fibonacciMap[1][1] = 1;
			
		}
		if( n > 1 ) {
			int tmpIdx  = 2;
			while( tmpIdx < n+1 ) {
				fibonacciMap[tmpIdx][0] = fibonacciMap[tmpIdx-1][0]  +fibonacciMap[tmpIdx-2][0] ;
				fibonacciMap[tmpIdx][1] = fibonacciMap[tmpIdx-1][1]  +fibonacciMap[tmpIdx-2][1] ;
				tmpIdx++;
			}
		}
				
		System.out.println("입력값 : " +  n);
		System.out.println("출력값 : " + java.util.Arrays.toString(fibonacciMap[n]));		
	}
}
