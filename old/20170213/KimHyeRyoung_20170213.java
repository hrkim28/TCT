public class KimHyeRyoung_20170213 {
	/*
	 [2017.02.13] 오늘의 문제
		어떤 자연수 n이 있을 때, d(n)을 n의 각 자릿수 숫자들과 n 자신을 더한 숫자라고 정의하자.
		예를 들어
		d(91) = 9 + 1 + 91 = 101
		이 때, n을 d(n)의 제네레이터(generator)라고 한다. 위의 예에서 91은 101의 제네레이터이다.
		
		어떤 숫자들은 하나 이상의 제네레이터를 가지고 있는데, 101의 제네레이터는 91 뿐 아니라 100도 있다. 
		그런데 반대로, 제네레이터가 없는 숫자들도 있으며, 이런 숫자를 인도의 수학자 Kaprekar가 셀프 넘버(self-number)라 이름 붙였다. 
		예를 들어 1,3,5,7,9,20,31 은 셀프 넘버 들이다.
		1 이상이고 5000 보다 작은 모든 셀프 넘버들의 합을 구하라.
	 */
	//public static ArrayList<Integer> list;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[5000];
		for ( int idx = 0 ; idx < 5000 ; idx++ ) {
			arr[idx] = idx+1;
		}
		
		for ( int jdx = 0 ; jdx < arr.length ; jdx++ ) {
			int generator = hasGeneratorNumber(jdx);
			if ( generator < 5000 && generator > 0) {
				arr[generator-1] = 0;
			}
		}
		
		int sum = 0;
		for ( int kdx = 0 ; kdx < arr.length ; kdx++ ) {
			sum += arr[kdx];
		}
		
		System.out.println("Sum of Self-Numbers from 1 to 5000 : " + sum); // 1232365
	}
	
	public static int hasGeneratorNumber( int num ) {
		int jarisuSum = 0;
		int generatorNumber = 0;
		
		int orgNum = num;
		while ( num > 0 ) {
			int temp = num%10; // 1, 9
			jarisuSum += temp; // 0+1+9
			num = num/10;
		}
		
		generatorNumber = jarisuSum + orgNum; // d(n)
		
		return generatorNumber;
	}

}
