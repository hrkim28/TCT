import java.util.Arrays;



public class AhryunPark_20170125 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/**
		 * 문자열 중앙값 구하기
		입력한 문자열 리스트를 오름차순으로 정렬했을 때 중앙에 해당하는 문자열을 출력하시오.
		(단, 문자열 리스트의 갯수가 짝수일 경우, 중앙에 해당하는 두 문자열 중 앞에 있는 문자열을 출력한다.)

		출력예시
		input : test, war, holiday, window, project
		median : test

		input : apple, peach, fly, money, room, cow, test, air, dog, spider
		median : fly

		 */
		
//		String inputStr = "test, war, holiday, window, project";
		String inputStr = "apple, peach, fly, money, room, cow, test, air, dog, spider";
		
		if(!"".equals(inputStr) && inputStr.length() > 0){
			String[] inputList = inputStr.split(", ");
			if(inputList.length > 0){
				
				for(int i = 0 ; i < inputList.length; i++){
					for(int j = i; j < inputList.length; j++){
						
						if( inputList[i].compareTo(inputList[j]) > 0){
							String tempStr = inputList[i];
							inputList[i] =  inputList[j];
							inputList[j] = tempStr;
						}
						
					}
				}
				
				int medianCnt =  inputList.length/2;
				
				if( 0 == ( inputList.length%2)){
					medianCnt = medianCnt -1;
				}
				
				System.out.println( "결과값 " +inputList[medianCnt]);
			}
		}
				
	}

}

