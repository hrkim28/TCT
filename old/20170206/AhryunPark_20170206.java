import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;




public class AhryunPark_20170206 {

	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws  
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		/**
		문제: 로또!!! 맞춰봅시다~

		1) 1~45 사이의 중복되지 않는 임의의 정수 6개를 선정하여 출력
		2) 선정된 6개의 정수를 오름차순 Sorting하여 출력
		
		[조건]
		단, 정수 6개는 난수 생성할 것.
		
		[출력 예시]
		
		생성된 숫자 : 23 45 7 12 38 9
		정렬 결과 : 7 9 12 23 38 45

		*/
		
		ArrayList<Integer> randomList = new ArrayList<>();
		
//		Random rand = new Random();
				
		for(int i = 0 ; i < 6 ; i++){
			
			int rand1 = (int)( Math.random()*45) +1;
			randomList.add(rand1);
			if(i != 0){
				for(int j = 0; j < randomList.size()-1 ; j++){
					while(rand1 == randomList.get(j)){
						rand1 = (int)( Math.random()*7) +1;
						randomList.set(i, rand1);
						j = 0;
					}
				}
			}
		}
		System.out.println("생성된 숫자 : " + randomList.toString());
		
		
		ArrayList<Integer> resultList = randomList;
		for(int i = 0 ; i < resultList.size() ; i++){
			for(int j = i ; j < resultList.size(); j++){
				
				if(resultList.get(i) > resultList.get(j)){
					int temp = resultList.get(i);
					resultList.set(i,  resultList.get(j)) ;
					resultList.set(j,  temp) ;
				}
			}
			
		}
		System.out.println("정렬 결과 : " + resultList.toString());
	}
	
	
}

