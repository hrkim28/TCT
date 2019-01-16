import java.util.Arrays;

/**
 * 
    문제
	금수저 만수르 형님도 회사를 다니고 야근을 합니다. 야근을 하면 야근 피로도가 쌓입니다. 
	야근 피로도는 야근을 시작한 시점에서 남은 일의 작업량을 제곱하여 더한 값입니다. 만수르는 N시간 동안 야근 피로도를 최소화하도록 일할 겁니다. 
	만수르가 1시간 동안 작업량 1만큼을 처리할 수 있다고 할 때, 퇴근까지 남은 N 시간과 각 일에 대한 작업량 works에 대해 야근 피로도를 최소화한 값을 리턴하는 Code를 완성해주세요.
	
	제한 사항
	works는 길이 1 이상, 10 미만인 자연수로 구성된 배열입니다.
	N은 12 이하인 자연수입니다.
	
	입력
	works, N
	
	출력
	works N 야근지수
	
	입출력 예제
	works	N	result
	[4, 3, 3]	4	12
	[2, 1, 2]	1	6
	[1,1]	3	0
	
	입출력 예제 설명
	#1
	n=4 일 때, 남은 일의 작업량이 [4, 3, 3] 이라면 야근 지수를 최소화하기 위해 4시간동안 일을 한 결과는 [2, 2, 2]입니다. 이 때 야근 지수는 2^2 + 2^2 + 2^2 = 12 입니다.
	
	#2
	n=1일 때, 남은 일의 작업량이 [2,1,2]라면 야근 지수를 최소화하기 위해 1시간동안 일을 한 결과는 [1,1,2]입니다. 야근지수는 1^2 + 1^2 + 2^2 = 6입니다.
 *
 */
public class TCT_20190116_KimJinKwui {
	static int[] works;
	static int n;
	
	public static void main(String[] args) {
		testCase();
		int angry = getAngry(works,n);
		System.out.println(Arrays.toString(works) + " " + n + " " + angry);
		
		testCase1();
		angry = getAngry(works,n);
		System.out.println(Arrays.toString(works) + " " + n + " " + angry);
		
		testCase2();
		angry = getAngry(works,n);
		System.out.println(Arrays.toString(works) + " " + n + " " + angry);
		
		testCase3();
		angry = getAngry(works,n);
		System.out.println(Arrays.toString(works) + " " + n + " " + angry);

	}
	
	public static void testCase() {
		works = new int[3];
		works[0] = 4;
		works[1] = 3;
		works[2] = 3;
		n=4;
	}
	
	public static void testCase1() {
		works = new int[3];
		works[0] = 2;
		works[1] = 1;
		works[2] = 2;
		n=1;
	}
	
	public static void testCase2() {
		works = new int[2];
		works[0] = 1;
		works[1] = 1;
		n=3;
	}
	
	public static void testCase3() {
		works = new int[2];
		works[0] = 9;
		works[1] = 1;
		n=7;
	}
	
	public static int getAngry(int[] inWorks,int inN) {
		int rtnAngry = 0;
		int[] copyInworks = Arrays.copyOf(inWorks, inWorks.length);
		
		while ( inN > 0 ) {
			Arrays.sort(copyInworks);
			if ( copyInworks[copyInworks.length-1] > 0 ) {
				copyInworks[copyInworks.length-1] = copyInworks[copyInworks.length-1] - 1;
			}
			inN--;
		}
		
		for ( int p : copyInworks ) {
			rtnAngry += Math.pow(p, 2);
		}
		
		return rtnAngry;
	}

}
