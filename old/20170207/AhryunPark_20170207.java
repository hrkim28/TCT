import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import antlr.debug.InputBufferReporter;




public class AhryunPark_20170207 {

	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws  
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		/**
		임의의 수와 그 수를 뒤집은 수를 더하는 과정을 반복한다.
		합이 뒤집어서 읽어도 동일한 숫자가 되면 반복 횟수와 숫자를 출력한다.
		
		 195      786       1473      5214
		+591    +687    +3741     +4125
		
		
		 786     1473       5214      9339
		
		** 반복횟수는 100번 미만으로 제한함, 형변환 없음
		
		Input: 숫자 배열 입력
		
		101
		195
		265
		750
		
		Sample Output
		
		0 101
		4 9339
		5 45254
		3 6666

		*/
		
		int[] inputList = new int[4];
		inputList[0] = 101;
		inputList[1] = 195;
		inputList[2] = 265;
		inputList[3] = 750;
		
		System.out.println("Input :" );
		for(int i = 0 ; i < inputList.length; i++){
			System.out.println(inputList[i]);
		}
		System.out.println("Output :" );
		
//		InputStreamReader ib = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(ib);
//		
//		System.out.println("임의의 수를 입력하세요 ");
//		int inputNum = Integer.parseInt(br.readLine());
		
		int totalNum = 0;
		
		for(int i = 0 ; i < inputList.length; i++){
			
			int inputNum = inputList[i];
			totalNum = inputNum +getReverse(inputNum);
			
			if(totalNum != getReverse(totalNum)){
				int addCnt = 1;
				while(totalNum != getReverse(totalNum)){
					if(addCnt >= 99){
						break;
					}
					totalNum += getReverse(totalNum);
					addCnt ++;
				}
				
				System.out.println("반복횟수  : " + addCnt + " 결과값 : " + totalNum);
			}
			else{
				System.out.println("반복횟수  : 0  결과값 : " + inputNum);
			}
			
		}
	
	}
	
	
	
	static int getReverse(int inputNum){
		
		int reverseNum = 0;
		ArrayList<Integer> reversList = new ArrayList<Integer>();
		
		while( (inputNum/10) > 0 ){
			reversList.add(inputNum%10);
			inputNum = inputNum/10;
		}
		
		reversList.add(inputNum);
		
		for(int i = 0 ; i < reversList.size() ; i++){
			
			int cnt = i;
			int temp = reversList.get(i);
			
			while(cnt < reversList.size()-1){
				temp = temp * 10;
				cnt++;
			}
			
			reverseNum += temp;
		
		}
		
		return reverseNum;
		
	}
	
	
}

