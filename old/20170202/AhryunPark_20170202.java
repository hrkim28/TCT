import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;




public class AhryunPark_20170202 {

	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws  
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		/**
		문제 : 야구게임 
		컴퓨터가 생성한 임의의 숫자 3개와 입력받은 숫자 3개를 비교하여 Strike, Ball 결과를 출력합니다.
		3개 숫자를 모두 맞추면 strike out 으로 게임 종료!!
		
		[조건]
		
		•컴퓨터가 생성한 임의의 숫자 3개는 서로 중복되면 안됩니다. 
		•입력받는 숫자 3개에 대해, 컴퓨터가 생성한 임의의 숫자와 "자릿수, 숫자가 같으면 스트라이크" "숫자가 같고 자릿수가 다르면 볼" 을 출력합니다. 
		•컴퓨터가 생성한 임의의 숫자와 입력받는 숫자가 일치하면 게임이 종료되며 시도횟수와 함께 게임종료 메시지를 출력합니다. 
		[출력 예시 > 컴퓨터가 생성한 임의의 숫자 4 5 1 의 경우]
		3 개 숫자를 입력하세요
		1
		4
		6
		0 Strike 2 Ball
		3 개 숫자를 입력하세요
		4
		1
		6
		1 Strike 1 Ball
		3 개 숫자를 입력하세요
		4
		1
		5
		1 Strike 2 Ball
		3 개 숫자를 입력하세요
		4
		5
		1
		3 Strike 0 Ball
		4 회만에 Strike Out!!!

		*/
		
		ArrayList<Integer> randomList = new ArrayList<>();
		
		Random rand = new Random();
		int rand1  = rand.nextInt(9);
		int rand2  = rand.nextInt(9);
		int rand3  = rand.nextInt(9);
		
		while( (rand1 == rand2) || (rand2 == rand3) || (rand3 == rand1) ){
			 rand1  = rand.nextInt(9);
			 rand2  = rand.nextInt(9);
			 rand3  = rand.nextInt(9);
		}
		
		randomList.add(rand1);
		randomList.add(rand2);
		randomList.add(rand3);
		
		InputStreamReader isr = new InputStreamReader(System.in); 
		BufferedReader br= new BufferedReader(isr); 
		
		boolean isStrikeOut = false;
		int totalCnt = 0;
		
		while(!isStrikeOut){
			
			totalCnt = totalCnt +1;
			ArrayList<Integer> inputList = new ArrayList<>();
			System.out.println("3 개 숫자를 입력하세요");
			int input1 = Integer.parseInt(br.readLine());
			
			int input2 = Integer.parseInt(br.readLine());
			int input3 = Integer.parseInt(br.readLine());
			
			System.out.println("첫번째 숫자 : " + input1);
			System.out.println("두번째 숫자 : " + input2);
			System.out.println("세번째 숫자 : " + input3);
			
			inputList.add(input1);
			inputList.add(input2);
			inputList.add(input3);
			
			int strikeCnt = 0;
			int ballCnt = 0;
			
			for(int i =0 ; i < randomList.size(); i++ ){
				for(int j = 0 ; j < inputList.size(); j++){
					if(randomList.get(i) == inputList.get(j)){
						
						if(i == j){
							strikeCnt += 1;
						}
						else{ballCnt += 1;
							
						}
						
					}
				}
				
			}
			
			System.out.println(strikeCnt + " Strike " + ballCnt + " Ball");
			
			if(3 == strikeCnt){
				isStrikeOut = true;
			}
			
		}
		
		System.out.println(totalCnt+ "회만에 Strike Out!!!" ) ;
		
	}
	
	
}

