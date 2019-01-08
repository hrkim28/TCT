import java.io.IOException;



public class AhryunPark_20170221 {

	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws  
	 */
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		/**
		입력된 숫자가 자연수의 제곱수인지 아닌지 판단하는 프로그램을 짜세요.
		제한조건 : 사칙연산 중 덧셈과 뺄셈만 가능합니다.
		
		i.e) 25 --> True
		     44 --> False


		7
		*/
		
		int inputNum = 44;
		int startNum = 1;
		
		boolean isCheck = false;
		
		int minNum = 1;
		while(startNum > 0 ){
			
			int maxNum  =  minNum + startNum + startNum +1 ;
			
			if(inputNum >= minNum && inputNum <= maxNum ){
				if(minNum == inputNum || maxNum == inputNum){
					isCheck = true;
				}
				
				break;
			}
			else{
				minNum = maxNum;
				startNum++;
			}
		}
		
		System.out.println( inputNum + " --> " + isCheck);
		
	}
	
	
	
	
}

