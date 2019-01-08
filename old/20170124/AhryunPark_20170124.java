

public class AhryunPark_20170124 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/**
		 * 1부터 10,000까지 7이라는 숫자가 총 몇번 나오는가?

			7이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 7이라는 숫자를 모두 카운팅 해야 한다.
			(※ 예를들어 7707은 3, 7777은 4로 카운팅 해야 함)
j
		 */
		
		
		int totalSum = 0;
		
		for(int i = 1 ; i < 10000; i++){
			
			String str = String.valueOf(i);
			
			for(int j = 0; j <str.length(); j++){
				String temp = str.substring(j, j+1);
				
				if("7".equals(temp)){
					totalSum += 1;
				}
			}
		}
		
		System.out.println(" 결과값 : " + totalSum);
		
	}

}

