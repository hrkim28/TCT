public class TCT_20190116_JaeseokLim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testSet = {4,3,3};
		mansur(testSet,4);
		int[] testSet2 = {2,1,2};
		mansur(testSet2,1);
		int[] testSet3 = {1,1};
		mansur(testSet3,3);
	}
	
	private static void mansur(int[] tempTest,int n) {
		//Copy value
		int [] testSet;
		testSet = new int[tempTest.length];
		for ( int i = 0 ; i < testSet.length; i++) {
			testSet[i] = tempTest[i];
		}
		//야근 피로도 체크 로직
		/* 
		 *  1씩 감소시키며 행의 갯수 만큼1씩 감소시키며 최소값인것을 하나씩 감소시키면서 체크하는 로직 
		 */
		int chkSumVal = 100000000;
		int tempSumVal = 0;
		int minusVal = 0;
		for ( int i = 0 ; i < n ; i++) {
			minusVal = 0 ; // 초기화
			//야근 피로도가 0일때 더이상 진행하지 않음
			if ( chkSumVal == 0 ) {
				break;
			}
			// works갯수만큼 돔
			for ( int j = 0 ; j< testSet.length;j++) {
				//야근피로도 최소 비교값
				tempSumVal = 0;	
				//1차감
				if ( testSet[j] != 0) {
					testSet[j] = testSet[j]-1;
				}
				
				//제곱근 합 구하기
				for ( int k = 0 ; k< testSet.length;k++) {
					tempSumVal += testSet[k] * testSet[k];
				}
				if ( chkSumVal >= tempSumVal) {
					chkSumVal = tempSumVal;
					minusVal = j;
				}
				//원상 복구
				testSet[j] = testSet[j]+1;
			}
			//최소값 셋팅
			testSet[minusVal] = testSet[minusVal] - 1;
		}
		
		//출력
		System.out.print("[");
		for ( int i = 0 ; i < tempTest.length; i++) {
			System.out.print(tempTest[i]);
			if ( i != tempTest.length-1) {
				System.out.print(",");	
			}
		}
		System.out.println("] "+ n + " " + chkSumVal);
	}

}
