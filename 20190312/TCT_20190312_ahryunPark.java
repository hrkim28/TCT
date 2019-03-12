package com.lgcns.exercise.plmtct;


/**
 *  
[¹®Á¦]

 */
public class TCT_20190312_ahryunPark {
	
	
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
		
		int cnt = (int)Math.pow(N, K);
		int[][] result = new int[cnt][K];
		
		for(int inx = 0; inx < cnt; inx++) {
			int temp = inx;
			for(int jnx = K-1 ; jnx >= 0 ; jnx--) {
				result[inx][jnx] = temp%N;
				temp = temp/N;
			}
			
		}
	    return result;
	}
	
	
}
