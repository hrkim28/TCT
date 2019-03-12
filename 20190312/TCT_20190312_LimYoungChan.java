
public class TCT_20190312_LimYoungChan {

	public static void main(String[] args) {
	    int[][] result = makeCombination(4, 4);  // N: �ִ�� , K: �ڸ���
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
		int rows = (int)Math.pow(N, K);   //N(�ִ��)�� 4 �̰� K(�ڸ���)�� 4�ڸ��̸� 4*4*4*4 ���� row ����
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
