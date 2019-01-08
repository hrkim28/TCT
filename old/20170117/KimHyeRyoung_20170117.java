/**
 * ===========================================
 * Program ID : khr_test.java
 * ===========================================
 * Modify Date    Modifier    Description
 * -------------------------------------------
 * 2017. 1. 17.  hyeryoung.kim   Initial
 * ===========================================
 */

/**
 * @author hyeryoung.kim
 *
 */
public class KimHyeRyoung_20170117 {

	/**
	 * @param args
	 *  1. 문자열 압축 알고리즘 (LCP 기출문제)
			문자열을 입력받아서, 같은 문자가 연속적으로 반복되는 경우에 그 반복 횟수를 표시하여 문자열을 압축하기.
			단, 한번만 반복되는 문자는 숫자 없이  그대로 표기할것

			입력 예시: aaabbcccccca
			출력 예시: a3b2c6a

			입력 예시: abbcccccca
			출력 예시: ab2c6a

			입력 예시: apple
			출력 예시: ap2le
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String str = args.toString();
		String str = "apple";
		System.out.println("입력값 : " + str);

		String chr = "";
		String[] arr = new String[str.length()];
		for ( int i = 0 ; i < str.length(); i++ ) {
			chr = str.substring(i, i+1);
			arr[i] = chr;
		}

		String result = "";
		int cnt = 1;
		for ( int j = 0 ; j < arr.length ; j++ ) {
			if ( j != arr.length -1 && arr[j+1].equals(arr[j]) ) {
				//result += arr[j].concat(String.valueOf(cnt));
				cnt++;
			} else {
				if ( cnt != 1 ) {
					result += arr[j] + String.valueOf(cnt);
					cnt = 1;
				} else {
					result += arr[j];
				}
			}
		}
		System.out.println("결과값 : " + result);
	}

}
