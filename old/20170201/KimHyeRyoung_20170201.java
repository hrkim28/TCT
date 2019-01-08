import java.util.Random;

public class KimHyeRyoung_20170201_v2 {
	/**
		[2017.02.01 오늘의 문제]
	문제: 주사위 게임
	두 개의 주사위를 던저 값을 합산, 출력합니다.
	[조건]
	재귀 함수를 이용해 구현해주세요.
	단, 두 주사위의 값이 같을 경우 한번 더 던집니다.
	주사위 값은 1~6 사이 난수
	[출력 예시]
	3 3
	6 6
	5 4
	27 만큼 전진!
    */
	
	public static void main(String[] args) {
		System.out.println(DiceGame() + " 만큼 전진!");
	}
	
	static int DiceGame() {
		Random rd1 = new Random();
		Random rd2 = new Random();
		int num1, num2;
		
		int sum = 0;
		while ( 1 == 1 ) {
			num1 = rd1.nextInt(6) + 1;
			num2 = rd2.nextInt(6) + 1;
			System.out.println(num1 + " " + num2);
			if ( num1 == num2 ) {
				sum += num1 + num2;
			} else {
				sum += num1 + num2;
				break;
			}
		}
		
		return sum;
	}
}
