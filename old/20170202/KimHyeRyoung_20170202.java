import java.util.Random;
import java.util.Scanner;

public class KimHyeRyoung_20170202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 [2017.02.02 오늘의 문제]
		문제 : 야구게임 
		컴퓨터가 생성한 임의의 숫자 3개와 입력받은 숫자 3개를 비교하여 Strike, Ball 결과를 출력합니다.
		3개 숫자를 모두 맞추면 strike out 으로 게임 종료!!
		[조건]
		컴퓨터가 생성한 임의의 숫자 3개는 서로 중복되면 안됩니다.
		입력받는 숫자 3개에 대해, 컴퓨터가 생성한 임의의 숫자와 "자릿수, 숫자가 같으면 스트라이크" "숫자가 같고 자릿수가 다르면 볼" 을 출력합니다.
		컴퓨터가 생성한 임의의 숫자와 입력받는 숫자가 일치하면 게임이 종료되며 시도횟수와 함께 게임종료 메시지를 출력합니다.
		[출력 예시 > 컴퓨터가 생성한 임의의 숫자 4 5 1 의 경우]
		3 개 숫자를 입력하세요
		1
		4
		6
		0 Strike 2 Ball
		3 개 숫자를 입력하세요
		4
		1
		6
		1 Strike 1 Ball
		3 개 숫자를 입력하세요
		4
		1
		5
		1 Strike 2 Ball
		3 개 숫자를 입력하세요
		4
		5
		1
		3 Strike 0 Ball
		4 회만에 Strike Out!!!
		 */
		
		String pcRst = makePCNumber();
		String[] pcStr = pcRst.split(",");
		int pcNum1 = Integer.parseInt(pcStr[0]);
		int pcNum2 = Integer.parseInt(pcStr[1]);
		int pcNum3 = Integer.parseInt(pcStr[2]);
		System.out.println("컴퓨터가 만든 숫자 : " + pcNum1 + " " + pcNum2 + " " + pcNum3);
		int[] pcNumArr = {pcNum1, pcNum2, pcNum3};
		
		int strikeCnt = 0;
		int ballCnt = 0;
		int cnt = 1;
		Scanner input = new Scanner(System.in);
		
		while ( true ) {
			if ( strikeCnt == 3 ) {
				cnt = cnt-1;
				break;
			} else {
				strikeCnt = 0;
				ballCnt = 0;
				System.out.println("3개 숫자를 입력하세요.");
				int inputNum1 = input.nextInt();
				int inputNum2 = input.nextInt();
				int inputNum3 = input.nextInt();
				int[] inputNumArr = {inputNum1,inputNum2,inputNum3}; 
				
				for ( int i = 0 ; i < pcNumArr.length ; i++ ) {
					for ( int j = 0 ; j < inputNumArr.length ; j++ ) {
						if ( pcNumArr[i] == inputNumArr[j] ) {
							if ( i != j ) {
								ballCnt++;
							} else {
								strikeCnt++;
							}
						}
					}
				}
			}
			
			System.out.println(strikeCnt + " Strike, " + ballCnt + " Ball");
			cnt++;
		}
		System.out.println(cnt + "회만에 Strike Out!!!" );
	}
	
	public static String makePCNumber() {
		Random rd = new Random();
		int pcNum1 = rd.nextInt(9);
		int pcNum2 = rd.nextInt(9);
		int pcNum3 = rd.nextInt(9);
		
		while ( true ) {
			if ( pcNum1 == pcNum2 || pcNum1 == pcNum3 || pcNum2 == pcNum3 ) {
				makePCNumber();
			} else {
				break;
			}
		}
		
		return pcNum1+","+pcNum2+","+pcNum3;
	}
}
