import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 문제
	피보나치 수열이란, 첫 번째 항의 값이 0이고 두 번째 항의 값이 1일 때, 이후의 항들은 이전의 두 항을 더한 값으로 이루어지는 수열을 말한다.
	예) 0, 1, 1, 2, 3, 5, 8, 13
	인풋을 정수 n으로 받았을때, n 이하까지의 피보나치 수열을 출력하는 프로그램을 작성하세요
	
	입력
	피보나치 수열 항의 최대 값 정수 n
	
	출력
	n 이하까지의 피보나치 수열 출력
	
	입출력 예제
	예제 입력 1
	n=1
	
	예제 출력 1
	0,1,1
	
	예제 입력 2
	n=100
	
	예제 출력 2
	0,1,1,2,3,5,8,13,21,34,55,89
	
	예제 입력 3
	n=500000
	
	예제 출력 3
	0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946,17711,28657,46368,75025,121393,196418,317811
*/
public class TCT_20190115_KimJinKwui {
	static List<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		list.add(0);
		list.add(1);
		
		while ( fnPlus(list,n) );
	}
	
	public static boolean fnPlus(List<Integer> input , int n){
		
		int x = input.get(input.size()-1)+input.get(input.size()-2);
		
		if ( x <= n ) {
			input.add(x);
		} else {
			for ( int i = 0 ; i < input.size() ; i++ ) {
				if ( i != input.size()-1) {
					System.out.print(input.get(i) + ",");
				} else {
					System.out.print(input.get(i));
				}
			}
			return false;
		}
		
		return true;
	}

}
