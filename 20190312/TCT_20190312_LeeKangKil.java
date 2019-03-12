
public class   TCT_20190312_LeeKangKil{

	public static void main(String[] args) {
	    int[][] result = makeCombination(4, 4);
	    for (int i = 0; i < result.length; i++) {
	        for (int j = 0; j < result[i].length; j++) {
	            System.out.print(result[i][j]);
	        }
	        System.out.println("");
	    }
	}

	private static int[][] makeCombination(int N, int K) {
		int maxDecimal = 0;
		for(int i=0; i<K;i++) maxDecimal += (N-1)*Math.pow(N, i);

		int [][] result = new int[maxDecimal+1][K];		
		for(int i=0;i<=maxDecimal;i++){
			int val = i;
			for( int j=K-1; j>=0; j--){
				int mod = val%N;
				val = val/N;
				result[i][j] = mod;
			}
		}
	    return result;
	}
}
