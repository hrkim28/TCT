package teamExcercise;

public class TCT_20190220_NaHyejeong {
	
	public static void main(String[] args) {

		// 입력
		int n = 10;
		int[] numArray = {10, -4, 3, 1, 5, 6, -35, 12, 21, -1};
		
		int maxSum = 0;
		
		for (int i = 0; i < numArray.length; i++) {
			int tempSum = 0 ;
			int j = i;
			
			while( numArray[j] > 0 ) {
				tempSum +=  numArray[j];
				j++;
			}
			
			if( tempSum > maxSum ) {
				maxSum= tempSum;
			}
		}
		
		System.out.println(maxSum);
		
	}


}
