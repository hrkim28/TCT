import java.util.Scanner;

public class KimHyeRyoung_20170221 {
	/*
	  	입력된 숫자가 자연수의 제곱수인지 아닌지 판단하는 프로그램을 짜세요.
		제한조건 : 사칙연산 중 덧셈과 뺄셈만 가능합니다.
		i.e) 25 --> True
     		 44 --> False
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자연수를 입력하세요. ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println(num + " --> " + isPowerNumber(num));
	}
	
	public static boolean isPowerNumber( int inputNum ) {
		boolean flag = false;
		for ( int inx = 1 ; inx <= inputNum ; inx++ ) {
			int temp = inputNum;
			int cnt = 0;
			while ( temp > 0 ) {
				temp = temp - inx;
				if ( cnt > inx ) {
					flag = false;
					break;
				}
				cnt++;
			}
			
			if ( temp == 0 && cnt == inx ) {
				flag = true;
				break;
			}
		}
		return flag;
	}

}
