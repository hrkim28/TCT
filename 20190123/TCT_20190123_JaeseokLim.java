import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TCT_20190123_JaeseokLim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list;
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        
        calculXOR(list);
    }
	
	private static void calculXOR(int[] list) {
		
		List<Integer> xorList = new ArrayList<Integer>();
		
		xorList.add(list[0]);
		//홀수 갯수인것만 xorList에 발라내기
		for ( int i = 1 ; i < list.length; i++ ) {
			if ( xorList.contains(list[i])) {
				xorList.remove(xorList.indexOf(list[i]));
			} else {
				xorList.add(list[i]);
			}
		}
		
		int jaritsu = 1;// 10진수로 바꿔줄 2진수 자리수 
		int xorCnt = 0; // 2로 나눴을때 나머지가 1인경우의 cnt
		int endCnt = 0 ;// xor대상이 0이 되었을때 cnt
		
		int result = 0 ; //xor 최종 결과값
		
		while(true) {
			
			endCnt = 0 ;
			xorCnt = 0 ;
			
			for ( int i = 0 ; i < xorList.size();i++) {
				//2로 나눴을때 나머지
				if ( xorList.get(i)%2 == 1) {
					xorCnt++;
				}
				//list값이 0일때 종료cnt증가
				if ( xorList.get(i) == 0 ) {
					endCnt++;
				}
				//2로 나눈값 재셋팅
				xorList.set(i, xorList.get(i)/2);
				
			}
			//xorCnt 가홀수 일때 jaritsu 값 sum
			if ( xorCnt % 2 !=0 ) {
				result += jaritsu;
			}
			//endCnt 가 xorList의 대상의 갯수와 동일해졌을때
			if  (endCnt == xorList.size()) {
				break;
			}
			//2진수 자리수 증가
			jaritsu = jaritsu*2;
			
		}
		
		System.out.println(result);
	}
}
