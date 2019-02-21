

public class TCT_20190221_JaeseokLim {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		//Scanner sc = new Scanner(System.in);
		
		//int count = sc.nextInt();
		
		
		int[][] testInputList= {{0,32,0,3},{3,13,1,0},{28,25,1,5},{39,0,6,0}};
		
		System.out.println(fnFindMaxPay(testInputList));
		
    }
	
	private static int fnFindMaxPay(int[][] testInputList) {
		int maxPay = 0 ; 
		
		int firstPay = 0; //Ã¹¹øÂ° Å¾½Â
		int secondPay = 0;//È¯½Â
		for ( int idx = 0 ; idx < testInputList.length ; idx++) {
			
			firstPay  = firstPay  - testInputList[idx][0] +testInputList[idx][1];
			secondPay = secondPay - testInputList[idx][2] +testInputList[idx][3];
			
			if ( firstPay * 1000 + secondPay * 200 > maxPay ) {
				maxPay = firstPay * 1000 + secondPay * 200; 
			}
		}
		
		

		return maxPay;
		
		
	}
	

}
		