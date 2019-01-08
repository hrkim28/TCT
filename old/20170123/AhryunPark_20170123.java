

public class AhryunPark_20170123 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/**
		 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
예를들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.

입력받은 양의 정수 n이 하샤드수인지 아닌지 판단하는 함수를 완성하세요.
예를들어 n이 10, 12, 18, 153, 142857.. 이면 True를 리턴 11, 13..이면 False를 리턴하면 됩니다.


		 */
		
		String str = args[0].toString();
		int num = Integer.parseInt(str);
		
		if(num > 0 ){
			
			int numSize = str.length();
			
			float totalSum = 0;
			
			for(int i = 0; i < numSize ; i++){
				String a = str.substring(i, i+1);
				totalSum = totalSum + Integer.valueOf(a);
			}
			
			float result = num/totalSum ;
			
			String resultStr =  String.valueOf(result);
			
			
			if( resultStr.substring(resultStr.lastIndexOf(".") +1).equals("0")){
				System.out.println(" 결과값 ==   True" );
			}
			else{
				System.out.println(" 결과값 ==   false" );
			}
		}
	}
		

}

