import java.util.InputMismatchException;
import java.util.Scanner;

public class KimHyeRyoung_20170216 {
	/*
	 주희는 심심해서 다음과 같이 수를 쓰기 시작 했다.
	[그림은 파일 참조]
	이렇게 수를 쓰는 경우 어떤 수가 몇 층에 있는지가 궁금해 졌다.
	참고로 100 은 7 층에 존재 한다.
	입력
	32 비트 정수 범위내의 값이 입력으로 주어진다.
	출력
	층 수를 출력한다.
	입출력 예
	입력
	100
	출력
	7
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("층수를 알고 싶은 수를 입력하세요.");
		Scanner in = new Scanner(System.in);
		
		try {
			int num = in.nextInt();
			System.out.println("입력\n" + num);
			
			int floor = 0;
			if ( Integer.bitCount(num) < 32 ) {
				floor = floorCalculate(num);
			} else {
				System.out.println("32비트 정수 범위 내에서 입력하세요.");
			}
			
			System.out.println("출력\n" + floor);
		} catch ( InputMismatchException ie ) {
			System.out.println("32비트 정수 범위 내에서 입력하세요.");
		}
	}
	
	public static int floorCalculate( int input ) {
		int floor = 1; // 해당 층
		int cnt = 1; // 해당 층의 숫자 개수 = 아래 층의 숫자 개수*2
		int lastNum = 1; // 해당 층의 마지막 숫자
		while ( input > 1 ) {
			floor++;
			cnt = cnt*2;
			lastNum += cnt;
			//System.out.println(floor + "층의 마지막 숫자는 : " + lastNum);
			
			if ( input <= lastNum ) {
				break;
			}
		}
		
		return floor;
	}

}
