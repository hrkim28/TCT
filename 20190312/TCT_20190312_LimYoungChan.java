
public class TCT_20190312_LimYoungChan {

	public static void main(String[] args) {
	    int[][] result = makeCombination(4, 4);  // N: 최대수 , K: 자릿수
	    for (int i = 0; i < result.length; i++) {
	        for (int j = 0; j < result[i].length; j++) {
	            System.out.print(result[i][j]);
	        }
	        System.out.println("");
	    }
	}

	private static int[][] makeCombination(int N, int K) {
		
		int inputNum = 0;
		int rowNum = 0;
		int rows = (int)Math.pow(N, K);   //N(최대수)이 4 이고 K(자리수)가 4자리이면 4*4*4*4 개의 row 생성
		int[][] number = new int[rows][K];		
		for(int j = 0; j < K; j++) {   
			for(int i = 0; i < rows; i++) {
				number[i][j] = inputNum;
				
				rowNum++;
				
				if(rowNum >= rows/(Math.pow(N, (j+1)))) {
					inputNum++;
					rowNum = 0;
					if(inputNum >= N) inputNum = 0;
				}
			}
		}
		
	    return number;
	}
}
