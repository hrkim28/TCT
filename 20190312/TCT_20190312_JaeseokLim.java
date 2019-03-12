public class TCT_20190312_JaeseokLim {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	/*
		Scanner sc = new Scanner(System.in);
		String check = sc.nextLine();
		
	*/
		int[][] result = makeCombination(4,4);
		
		for ( int i = 0; i < result.length; i++) {
			for ( int j = 0; j < result[i].length;j++) {
				System.out.print(result[i][j]);
			}
			System.out.println("");
		}
    }
	
	
	private static int[][] makeCombination(int N, int K) {
		int temp = K;
		for ( int i = 0 ; i < N-1 ; i++) {
			temp = temp* K;
		}
		int [][] retVal = new int[temp][K];
	
		int plusVal = 0 ;
		int val = 0;
		
		for (int i = 0 ; i <retVal.length; i++) {
			val = plusVal;
			int loopCnt =temp/K;
			
			for ( int j =0 ; j < K; j++ ) {
				if ( val == 0 ) {
					retVal[i][j] = 0;
				} else if ( val >= loopCnt){
					
					retVal[i][j] = val/loopCnt;
					val = val - retVal[i][j]*loopCnt; 
				}
				loopCnt = loopCnt/K;
				
			}
			plusVal++;
		}
		return retVal;
		
	}

}
	