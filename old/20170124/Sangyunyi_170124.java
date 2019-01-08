import java.util.Scanner;

public class Sangyunyi_170124 {

	public static void main(String[] args) {
/*
1부터 10,000까지 7이라는 숫자가 총 몇번 나오는가?
7이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 7이라는 숫자를 모두 카운팅 해야 한다.
(※ 예를들어 7707은 3, 7777은 4로 카운팅 해야 함)
오늘을 마지막으로 숫자 핸들링하는 문제는 그만 내기로 하시죠
1부터 10000 까지 loop 돌리지 않고 풀어보세요.
 */
		//Scanner scannerInput = new Scanner (System.in);
		//System.out.print("숫자입력 : ");
		//int iInput = scannerInput.nextInt();
		int iResult = 0;
		for(int idx=1; idx<=10000; idx++){
			String sTemp = String.valueOf(idx);
			for(int idy=0; idy<sTemp.length();idy++){//System.out.println(sTemp.length());
				if( sTemp.charAt(idy)=='7'){
					iResult ++;
				}
			}
		}
		System.out.println("1부터 10,000까지 7이라는 숫자가 총 몇번 나오는가?\n"+iResult+" 번");
	        
	}

}
