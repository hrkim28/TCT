import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
    문제
	윤영이는 3의 배수 마니아이다. 그는 모든 자연수를 3개의 3의 배수의 자연수로 분해하는 것을 취미로 가지고 있다. 
	문득 그는 자신에게 주어진 수를 3개의 3의 배수로 분리하는 경우의 수가 몇 개인지 궁금해졌다.
	하지만 윤영이는 마지막 학기이기 때문에 이런 계산을 하기에는 너무 게을러졌다.
	그래서 당신에게 이 계산을 부탁했다.
	
	즉, 임의의 3의 배수 자연수 n이 주어졌을 때, 해당 수를 3의 배수의 자연수 3개로 분리하는 방법의 개수를 출력해라.
	단 분해한 수의 순서가 다르면 다른 방법으로 간주한다.
	예를 들어 12 = 3 + 6 + 3 과 12 = 3 + 3 + 6 은 다른 방법이다.
	
	입력
	임의의 3의 배수 자연수 n이 주어진다. (3 ≤ n ≤ 3000)
	
	출력
	자연수 n을 분해하는 방법의 개수를 출력하라
	
	예제1
	입력: 9
	출력: 1
	
	9 = 3+3+3 외 다른 방법이 없기에 1
	
	예제2
	입력: 12
	출력: 3
	
	12 = 3 + 3 + 6,
	12 = 3 + 6 + 3,
	12 = 6 + 3 + 3
	총 3개
 *
 */
public class TCT_20190117_KimJinKwu {
	static int[] works;
	static int n;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
		int scanNumber = scan.nextInt();
		
		System.out.println("총 " + getMultiple(scanNumber, 3) + "개");
		
	}
	
	public static int getMultiple(int inNumber,int inN) {
		int rtnCount = 0;
		List<Integer> aList = new ArrayList<Integer>();
		StringBuffer sb = new StringBuffer();
				
		if ( ( inNumber >= 3 && inNumber <= 3000 ) && ( inNumber % inN == 0 ) ) {
			for ( int i = 1 ; i <= inNumber / inN ; i++ ) {
				aList.add(i*inN);
			}
			for ( int i = 0 ; i < aList.size() ; i++ ) {
				for ( int j = 0 ; j < aList.size() ; j++ ) {
					for ( int k = 0 ; k < aList.size() ; k++ ) {
						if ( ( (aList.get(i) + aList.get(j) + aList.get(k)) == inNumber ) ) {
							sb.append(inNumber + " = " + aList.get(i) + " + " + aList.get(j) + " + " + aList.get(k) + ",\r\n");
							rtnCount++;
						}
					}
				}
			}
		} else {
			return 0;
		}
		
		
		if ( sb.length() > 0  ) {
			System.out.println(sb.substring(0,sb.length()-3));
		} 
		
		return rtnCount;
	}

}