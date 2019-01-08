import java.io.IOException;
import java.util.ArrayList;



public class AhryunPark_20170215 {

	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws  
	 */
	
	static String[] inputList = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		/**
		알파벳 a=1, b=2....z=26으로 할당할때 주어진 숫자를 가지고 만들수 있는 모든 가능한 문자열을 출력하세요...

		예를 들면 입력된 숫자가 1123이면 출력해야 할 문자열은 aabc, kbc, alc, aaw, kw 입니다.

		*/
		
		
		
		
		
		int inputNum = 1123;
		ArrayList<String> resultList = new ArrayList<String>();
	
		
		if(inputNum <10){
			resultList.add(inputList[inputNum-1]);
		}
		else{
			
		}
		
		
		
		System.out.println("결과 :");
		for(int i = 0; i < resultList.size(); i++){
			System.out.println(resultList.get(i));
		}
	}
	
	
	public static String getResultStr (int inputNum){
		
	
		
		
		return "";
	}
	
}

