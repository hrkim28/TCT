/**
 * ===========================================
 * Program ID : KimHyeRyoung_20170118.java
 * ===========================================
 * Modify Date    Modifier    Description
 * -------------------------------------------
 * 2017. 1. 18.  hyeryoung.kim   Initial
 * ===========================================
 */

/**
 * @author hyeryoung.kim
 *
 */
public class KimHyeRyoung_20170118 {

	/**
	 * @param args
	 * n * m 행렬에 maxCnt 의 알파벳 넣기 입니다.
		nm 보다 maxCnt 가 크면 nm 개만 배열
		작으면 증가 -> 감소 배열
		그러고도 남으면 A 로 채우기 입니다.
		( 가로방향 배열, 세로방향 배열)

		출력예)

		3*4 배열에 maxCnt 16 이면
		(가로)
		ABCD
		EFGH
		IJKL

		(세로)
		ADGJ
		BEHK
		CFIL

		3*4 maxCnt 10 이면
		(가로)
		ABCD
		EFGH
		IJIH

		(세로)
		ADGJ
		BEHI
		CFIH

		3*4 maxCnt 5 이면
		(가로)
		ABCD
		EDCB
		AAAA

		(세로)
		A
		B
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 4;
		int maxCnt = 16;
		String result = "";

		int k = 0;
		int cnt = 0;
		String[] enArray = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","X","Y","Z"};
		String [][] matrix = new String[m][n];
		
		// 1. 가로
		System.out.println("(가로)");
		for ( int i = 0 ; i < m ; i++ ) {
			for ( int j = 0; j < n ; j++ ) {
				if ( m*n < maxCnt ) {
					if ( cnt < enArray.length ) {
						matrix[i][j] = enArray[k];
						result = matrix[i][j];
						System.out.print(result);
						k++;
						cnt++;
					}
				} else if ( m*n > maxCnt ) {
					if ( cnt < maxCnt ) {
						matrix[i][j] = enArray[k];
						result = matrix[i][j];
						k++;
					} else {
						if ( k > 1 ) {
							k--;
							matrix[i][j] = enArray[k-1];
						} else {
							matrix[i][j] = enArray[0];
						}
						result = matrix[i][j];
					}
					cnt++;
					System.out.print(result);
				} else {
					System.out.println("m*n=maxCnt");
				}
			}
			System.out.println();
		}
		
		// 2. 세로
		cnt = 0;
		k = 0;
		System.out.println("(세로)");
		for ( int i = 0 ; i < m ; i++ ) {
			for ( int j = 0 ; j < n ; j++ ) {
				if ( m*n < maxCnt ) {
					matrix[i][j] = enArray[i+j*m];
					result = matrix[i][j];
					System.out.print(result);
				} else if ( m*n > maxCnt ) {
					if ( cnt < maxCnt ) {
						matrix[i][j] = enArray[i+j*m];
						result = matrix[i][j];
						System.out.print(result);
						k++;
					}/* else {
						k--;
						matrix[i][j] = enArray[i+j*m-k];
						result = matrix[i][j];
						System.out.print(result);
					}*/
					cnt++;
				} else {
					System.out.println("m*n=maxCnt");
				}
			}
			System.out.println();
		}
	}
}
