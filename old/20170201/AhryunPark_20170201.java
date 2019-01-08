import java.util.Random;




public class AhryunPark_20170201 {

	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/**
		문제: 주사위 게임
		두 개의 주사위를 던저 값을 합산, 출력합니다.
		
		[조건]
		
		•재귀 함수를 이용해 구현해주세요.
		•단, 두 주사위의 값이 같을 경우 한번 더 던집니다.
		•주사위 값은 1~6 사이 난수
		[출력 예시]
		3 3
		6 6
		5 4
		27 만큼 전진!
		
		
		public static void main(String[] args) {
		         System.out.println(DiceGame());
		}

		 */
		
		
		System.out.println(DiceGame());
	}
	
	
	static int DiceGame() {
	    //작성하세요 ^^
		
		Random rand = new Random();
		int firstNum  = rand.nextInt(6);
		while(firstNum == 0){
			 firstNum  = rand.nextInt(6);
		}
		
		int secondNum = rand.nextInt(6);
		while(secondNum == 0){
			secondNum  = rand.nextInt(6);
		}
		
		int totalNum = 0;
		if(firstNum ==  secondNum){
			totalNum = DiceGame() + firstNum + secondNum ;
		}
		else{
			totalNum = firstNum + secondNum;
		}
		
		return totalNum;
		
	}

}

