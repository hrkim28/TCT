import java.util.Scanner;


public class TCT_20190227_JaeseokLim {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int sum = sc.nextInt();
		
		fnReturnList(number,sum);

		
		
    }
	
	private static void fnReturnList(int number, int sum) {
		
		int[] returnVal = new int[number];
		if ( number > sum ) {
			System.out.println("-1");
		} else {
			
			System.out.print("[");
			for ( int idx = 0 ; idx < number-1; idx++) {
					
				returnVal[idx] = sum/number;
				System.out.print(returnVal[idx]+ " , ");
			}
			
			returnVal[number-1] = sum%number == 0 ? sum/number : sum/number+1;
			System.out.print(returnVal[number-1]);
			
			System.out.println("]");
		}
	}

}
	