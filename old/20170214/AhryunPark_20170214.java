import java.io.IOException;
import java.util.ArrayList;



public class AhryunPark_20170214 {

	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws  
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		/**
		0~9까지의 문자로 된 숫자를 입력 받았을 때, 
		이 입력 값이 0~9까지의 숫자가 각각 한 번 씩만 사용된 것인지 확인하는 함수를 구하시오.
		
		[조건]
		숫자의 순서는 바뀔 수 있음.
		단, 0~9까지의 숫자가 모두 포함되어야 함.
		
		[출력 예시]
		입력 : 0123456789 01234 01234567890 6789012345 012322456789
		결과 : true false false true false



		*/
		
		
		String[] inputList = {"0123456789", "01234", "01234567890", "6789012345", "012322456789"};
		
		
		System.out.println("입력 : ");
		for(int i = 0 ; i < inputList.length; i++){
			System.out.print(inputList[i] + " ");
		}
		
		System.out.println();
		System.out.println("결과 : ");
		for(int i = 0; i < inputList.length ; i++){
			System.out.print(isExist(inputList[i] ) + " ");
		}
	}
	
	
	public static boolean isExist(String input){
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for(int i = 0; i < 10 ; i++){
			numList.add(i);
		}
		
		boolean result = true;
		
		if(!"".equals(input) && null != input){
			for(int i = 0; i < input.length() ; i++){
				String subInput = input.substring(i,i+1);
				boolean isExist = false;
				for(int j = 0 ; j < numList.size(); j++){
					if(subInput.equals(String.valueOf(numList.get(j)))){
						numList.remove(j);
						isExist = true;
						break;
					}
				}
				
				if(!isExist){
					result = false;
					break;
				}
			}
			
			if(numList.size() > 0){
				result = false;
			}
			
		}
		
		
		return result;
	}
	
}

