package teamExcercise;

public class TCT_20190214_NaHyejeong {

	static int[] changeIdx = new int[2]; 
	
	public static void main(String[] args) {
		/*
		 * int [][] array1 = {{1, 0, 1, 0}, {0, 0, 0, 0}, {1, 1, 1, 1}, {0, 1, 0, 1}};
		 * int [][] array2 = {{1, 0, 1, 0}, {0, 0, 1, 0}, {1, 1, 1, 1}, {0, 1, 0, 1}};
		 * int [][] array2 = {{1, 0, 1, 0}, {0, 1, 1, 0}, {1, 1, 1, 1}, {0, 1, 0, 1}};
		 */
		
		int n = 4;
		int [][] array =  {{1, 0, 1, 0}, {0, 0, 1, 0}, {1, 1, 1, 1}, {0, 1, 0, 1}};
		
		boolean isParity = checkParity(n, array);
		boolean isChanged = false;
		
		if(!isParity && changeIdx[0] > 0 && changeIdx[1] > 0) {
			//change bit
			if( array[changeIdx[0]-1][changeIdx[1]-1] == 0) {
				array[changeIdx[0]-1][changeIdx[1]-1] = 1;
			}else {
				array[changeIdx[0]-1][changeIdx[1]-1] = 0;
			}
			isParity = checkParity(n, array);
			isChanged = true;
		}
		
		if( isParity ) {
			if (!isChanged) System.out.println("OK");
			else  System.out.println("change bit (" +  changeIdx[0] +","+  changeIdx[1]+")");
		}else System.out.println("Corrupt");
		
		
	}

	private static boolean checkParity(int n, int[][] array) {
	
		boolean isPerity = true;
		int rowSum = 0;
		int colSum = 0;
		
		for (int i = 0; i < n; i++) {
			rowSum = 0;
			colSum = 0;
			
			for (int j = 0; j < array.length; j++) {
				rowSum += array[i][j];
				colSum += array[j][i];
			}
			
			if( rowSum%2 > 0 ) {
				changeIdx[0] = i+1; 
				isPerity = false;
			}
			
			if( colSum%2 > 0 ) {
				changeIdx[1] = i+1;
				isPerity = false;
			}
		}
		return isPerity;
	}

	
}
