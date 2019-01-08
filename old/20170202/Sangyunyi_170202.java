import java.util.Random;
import java.util.Scanner;

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


public class Sangyunyi_170202 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iRandom = Random();		
		
		int iCount = 0;
		int iRound = 0;
		Scanner scannerInput = new Scanner (System.in);

		System.out.println("iRandom\n"+iRandom[0]+"/"+iRandom[1]+"/"+iRandom[2]);
		while(iRound<10){
			iRound++;
			int strike = 0;
			int ball = 0;
			System.out.println("3 개 숫자를 입력하세요");
			int[] iArray = new int[3];
			iArray[0] = scannerInput.nextInt();
			iArray[1] = scannerInput.nextInt();
			iArray[2] = scannerInput.nextInt();

			for(int idx=0;idx<3;idx++){
				for(int idy=0;idy<3;idy++){
					if( (iArray[idx] == iRandom[idy]) && (idx==idy) ){
						strike++;
					}else if( (iArray[idx] == iRandom[idy]) && (idx!=idy) ){
						ball++;
					}
				}
			}
			System.out.println(strike+"Strike "+ball+" Ball");
			if(strike==3){
				System.out.println(iRound+" 회만에 Strike Out!!!");
				break;
			}
		}
	}
	public static int[] Random(){
		Random random = new Random();
		int[] iRandom = new int[3];
		iRandom[0] = random.nextInt(9)+1;
		iRandom[1] = random.nextInt(9)+1;
		iRandom[2] = random.nextInt(9)+1;
		while(1==1){
			if ( iRandom[0]==iRandom[1] || iRandom[0]==iRandom[2] || iRandom[1]==iRandom[2] ) {
				Random();
			} else {
				return iRandom;
			}
		}
		
	}
}


