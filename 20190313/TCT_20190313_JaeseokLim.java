import java.util.Scanner;

public class TCT_20190313_JaeseokLim {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] makgulli = new int[N];
		
		for ( int i = 0 ; i < makgulli.length; i++) {
			makgulli[i] = sc.nextInt();
		}
		
		System.out.println(fnDivide(makgulli,K));
    }
	
	
	private static int fnDivide(int[] makgulli , int K) {
		int retVal = 0;
		//최대 가져갈수 있는  Beer의 양
		int maxBeer = 0;
		for ( int i = 0 ;i < makgulli.length;i++) {
			maxBeer+= makgulli[i];
		}
		maxBeer = maxBeer/K;
		int initVal = 0;
		 //2진검색응용
		 while(true) {
			 
			retVal = (initVal + maxBeer)/2;
			System.out.println("initVal : " + initVal + ",maxBeer : "+ maxBeer + "retVal : " + retVal);
			int temp = 0 ; 
			for ( int i = 0 ;i < makgulli.length;i++) {
				temp += makgulli[i]/retVal;
			}
			if ( temp < K) {
				maxBeer = retVal;
			} else {
				initVal = retVal;
			}
			
			if ( maxBeer-initVal <=1 && temp == K) {
				break;
			}
		 }
		return retVal;
		
	}

}
	