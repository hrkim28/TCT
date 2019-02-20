import java.util.Scanner;


public class TCT_20190220_JaeseokLim {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		int count = sc.nextInt();
		
		
		int[] integerList = new int[count];
		for ( int idx = 0 ; idx < count ; idx++ ) {
			integerList[idx] = sc.nextInt();
		}
		
		System.out.println(fnFindMaxSum(integerList));
		
		
		
    }
	
	private static int fnFindMaxSum(int[] integerList) {
		int maxSum = 0 ; 
		//2부터 length까지 BruteForce방식으로 다 돌린다.
		
		for ( int a = 2 ; a < integerList.length; a++) {
			
			for ( int b = 0 ; b < integerList.length; b++) {
				int tempSum = 0 ;
				for ( int c = b ; c-b < a ; c++) {
					if ( (b+a) >integerList.length) {
						break;
					} else {
						tempSum+= integerList[c];
					}
				}
				if ( tempSum > maxSum) {
					maxSum = tempSum;
				}
			}
		}
		//10
		//10 -4 3 1 5 6 -35 12 21 -1

		return maxSum;
		
		
	}
	

}
		