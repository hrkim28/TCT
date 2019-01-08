package LCP_Example;

import java.util.Scanner;

public class KimHyeRyoung_20170207_v2 {
	/*
	[2017.02.07 오늘의 문제]
	임의의 수와 그 수를 뒤집은 수를 더하는 과정을 반복한다.
	합이 뒤집어서 읽어도 동일한 숫자가 되면 반복 횟수와 숫자를 출력한다.
	 195      786       1473      5214
	+591    +687    +3741     +4125
	 786     1473       5214      9339
	** 반복횟수는 100번 미만으로 제한함, 형변환 없음
	Input: 숫자 배열 입력
	101
	195
	265
	750
	Sample Output
	0 101
	4 9339
	5 45254
	3 6666
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input 숫자 배열 입력");
		Scanner in = new Scanner(System.in);
		int inputNum = in.nextInt();
		System.out.println(inputNum);
		
		int cnt = 0;
		int sum = 0;
		
		while ( cnt < 100 ) {
			if ( cnt == 0 ) {
				int reverseNum = reverseNum2(inputNum);
				if ( inputNum == reverseNum ) {
					System.out.println("Output\n" + cnt + " " + inputNum);
					break;
				} else {
					sum = inputNum + reverseNum;
					cnt++;
				}
			} else {
				sum = sum + reverseNum2(sum);
			}
			
			if ( sum != reverseNum2(sum) ) {
				cnt++;
			} else {
				System.out.println("Output\n" + cnt + " " + sum);
				break;
			}
		}
	}
	
	public static int reverseNum(int input) {
		int reverseNum = 0;
		while (input > 0) {
			reverseNum = reverseNum * 10; // 0, 50, 590 
			double temp = input%10; // 5, 9, 1
			input = input/10; // 19, 1, 0
			
			reverseNum += temp; // 590 + 1 = 591  
		}
		return reverseNum;
	}
	
	public static int reverseNum2(int input) {
		int jarisu = 0;
		int tempNum = input;
		
		while ( input > 0 ) {
			input = input/10;
			jarisu++;
		}
		
		int[] jariArr = new int[jarisu];
		int iljari = 0;
		for ( int inx = 0 ; inx < jariArr.length ; inx++ ) {
			iljari = tempNum%10;
			tempNum = tempNum/10;
			jariArr[inx] = iljari;
		}
		
		int reverseNum2 = 0;
		for ( int jnx = 0 ; jnx < jariArr.length ; jnx++ ) {
			double ten = 10;
			ten = Math.pow(ten, jariArr.length -1 - jnx);
			reverseNum2 += jariArr[jnx] * ten;
		}
		
		return reverseNum2;
	}
}
