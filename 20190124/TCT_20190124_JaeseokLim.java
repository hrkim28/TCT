import java.util.Scanner;

public class TCT_20190124_JaeseokLim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        twoSosu(n);
    }
	
	private static void twoSosu(int n) {
		
		/*
		 * 로직
		 *  1.기존 N -> 1/2하여 1씩 감소하며 소수 A를 찾음
		 *  2.N-A = B, B가 소수인지 찾음 
		 *  출력
		 *  
		 */
		boolean isExist = false;
		for ( int i = n/2 ; i>= 2;i--) {
			if ( findSosu(i) && findSosu(n-i) ) {
				isExist = true;
				System.out.println(i + " " + (n-i));
				break;
			}
		} 
		if(!isExist) {
			System.out.println("존재하지 않습니다.");
		}
	}
	
	private static boolean findSosu(int n) {
		
		/*
		 * 로직
		 *  1. 2->N-1까지 증가하며 나머지가 0인게 없을경우 True,아니면False
		 *  
		 */
		boolean isSosu = true;
		for (int i = 2 ; i <= n-1 ; i++) {
			if (n % i == 0) {
				isSosu = false;
			}
		}
		
		return isSosu;
	}
}
