import java.util.ArrayList;
import java.util.Arrays;



public class AhryunPark_20170126 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/**
		 *다음과 같은 형태의 배열을

		[a1,a2,a3...,an,b1,b2...bn]

		다음과 같은 형태로 바꾸시오

		[a1,b1,a2,b2.....an,bn]

		 */
		
//		String inputStr = "test, war, holiday, window, project";
		String inputStr = "a1,a2,a3,an,b1,b2,b3,bn";
		
		ArrayList<String> resultList = new ArrayList<>();
		ArrayList<String> tempList = new ArrayList<>();
		
		if(!"".equals(inputStr) && inputStr.length() > 0){
			String[] inputList = inputStr.split(",");
			
			for(int i = 0 ; i < inputList.length; i++){
				tempList.add(inputList[i].toString());
			}
			
			
				
			for(int i = 0 ; i < tempList.size(); i++){
				for(int j = i+1; j < tempList.size(); j++){
					
					String firstStr = tempList.get(i).toString().substring(1);
					String secondStr = tempList.get(j).toString().substring(1);
					
					if(firstStr.equals(secondStr)){
						resultList.add(tempList.get(i).toString());
						resultList.add(tempList.get(j).toString());
						tempList.remove(j);
						break;
					}
					
				}
			}
				
			
//				System.out.println( "결과값 " +inputList[medianCnt]);
		}
				
	}

}

