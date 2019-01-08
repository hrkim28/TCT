import java.util.Arrays;
import java.util.Random;

public class KimHyeRyoung_20170206 {
	/**
	 [2017.02.06 오늘의 문제]
	 문제: 로또!!! 맞춰봅시다~
	 1) 1~45 사이의 중복되지 않는 임의의 정수 6개를 선정하여 출력
	 2) 선정된 6개의 정수를 오름차순 Sorting하여 출력
	 
	 [조건]
 	 단, 정수 6개는 난수 생성할 것.

	 [출력 예시]
 	생성된 숫자 : 23 45 7 12 38 9
	정렬 결과 : 7 9 12 23 38 45 
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lottoArr[] = new int[6];
		int cnt = 0;
		int lottoNumber = 0;
		String flagList = "";
		while ( true ) {
			lottoNumber = chooseLottoNumber();
			if ( cnt == 0 ) lottoArr[0] = lottoNumber;
			flagList = "";
			
			for ( int inx = cnt ; inx > 0 ; inx-- ) {
				if ( lottoNumber == lottoArr[inx-1] ) {
					flagList += "N";
				} else {
					flagList += "Y";
				}
			}
			
			if ( !flagList.contains("N") ) {
				if ( cnt < 6 ) {
					lottoArr[cnt] = lottoNumber;
					cnt++;
				} else {
					break;
				}
			}
		}
		
		System.out.print("생성된 숫자 : ");
		for ( int jnx = 0 ; jnx < lottoArr.length ; jnx++ ) {
			System.out.print(lottoArr[jnx] + " ");
		}
		
		int tempNum = 0;
		for ( int knx = 0 ; knx < lottoArr.length ; knx++ ) {
			for ( int lnx = knx+1 ; lnx < lottoArr.length ; lnx++ ) {
				if ( lottoArr[knx] > lottoArr[lnx] ) {
					tempNum = lottoArr[knx];
					lottoArr[knx] = lottoArr[lnx];
					lottoArr[lnx] = tempNum;
				}
			}
		}
		
		System.out.print("\n정렬 결과 : ");
		for ( int lnx = 0 ; lnx < lottoArr.length ; lnx++ ) {
			System.out.print(lottoArr[lnx] + " ");
		}
		
	}
	
	public static int chooseLottoNumber() {
		Random random = new Random();
		int randomNum = random.nextInt(45)+1;
		return randomNum;
	}
}
