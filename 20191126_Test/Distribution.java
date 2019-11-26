package Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @date 19.11.26
 * @desc 막걸리 중량 배분과 관련된 배열 알고리즘 문제
 * @author 박병진
 * @version 1.0.0
 */
public class Distribution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("막걸리 주전자의 갯수를 입력하세요.");
		int alchol = sc.nextInt();

		System.out.println("인원수를 입력해주세요");
		int person = sc.nextInt();

		List<Integer> alcholList = new ArrayList<Integer>();

		int alcholSum = 0;
		alcholSum = calculateAlcholSum(sc, alchol, alcholList, alcholSum); //막걸리 총량 계산
		sc.close();

		int alcholQauntity = alcholSum / person; //막걸리 총량을 인원수로 나눈 막걸리량

		int personSum = calculatePersonSum(alcholList, alcholQauntity); //실실적으로 배분되는 인원수 계산

		alcholQauntity = getResult(person, alcholList, alcholQauntity, personSum); //최종 결과값 산출
		
		System.out.println(alcholQauntity);
	}

	/**
	 * 막걸리 총량을 계산하기 위한 Method
	 * Scanner에 입력됨과 동시에 List에 추가를 해주고, 막걸리 총량에 더해준다.
	 * cf) Loop를 도는 횟수를 줄이기 위해 Scanner 입력과 동시에 막걸리 총량 합산 Logic을 실행
	 * 
	 * @param sc Scanner 입력
	 * @param alchol 막걸리 주전자 갯수
	 * @param alcholList 막걸리 량을 담을 List
	 * @param alcholSum 막걸리 총량 구하기 위한 int 변수(0으로 초기화)
	 * @return int 막걸리 총량을 계산해서 반환
	 */
	private static int calculateAlcholSum(Scanner sc, int alchol, List<Integer> alcholList, int alcholSum) {

		for (int i = 0; i < alchol; i++) {
			if (i == 0)
				sc.nextLine();
			int al = sc.nextInt();
			alcholList.add(al);
			alcholSum += al;
		}
		return alcholSum;
	}
	
	/**
	 * 막걸리 량을 alcholQantity로 나누었을때 실질적으로 배분되는 인원수를 구하는 Method
	 * 막걸리 량 List를 Loop를 돌면서 alcholQauntity로 나눈 값들을 다 더해서 실직적으로 배분되는 인원수 계산
	 * 
	 * @param alcholList 막거리 각각의 량이 들어가 있는 List
	 * @param alcholQauntity 막걸리 총량을 인원수로 나눈 막걸리량
	 * @return
	 */
	private static int calculatePersonSum(List<Integer> alcholList, int alcholQauntity) {
		int personSum = 0;

		for (Integer al : alcholList) {
			personSum += al / alcholQauntity;
		}
		
		return personSum;
	}
	
	/**
	 * 최종 막걸리 분배량을 계산하는 Method
	 * 무한 Loop를 돌면서 최종 막걸리 분배량을 계산
	 * 1. 실질적으로 배분되는 인원수와 실제 인원수가 동일한 경우 Loop를 빠져나옴
	 * 2. 실제 인원수와 불일치하는 경우 personSum을 0으로 초기화하고, alcholQauntity를 1 감소시킴
	 * 3. 수정된 alcholQauntity를 통해 새로운 personSum 계산
	 * 4. 1~3의 과정 반복
	 * 
	 * @param person 실제 인원수
	 * @param alcholList alcholList 막거리 각각의 량이 들어가 있는 List
	 * @param alcholQauntity alcholQauntity 막걸리 총량을 인원수로 나눈 막걸리량
	 * @param personSum 실직적으로 배분되는 인원수
	 * @return
	 */
	private static int getResult(int person, List<Integer> alcholList, int alcholQauntity, int personSum) {
		
		while (true) {
			if (personSum == person) //실제 인원수와 실직적으로 배분되는 인원수가 동일한 경우 break
				break;
			else {
				personSum = 0;
				alcholQauntity--; //불일치할 경우 1씩 감소
				for (Integer al : alcholList) {
					personSum += al / alcholQauntity; //personSum 재계산
				}
			}
		}
		return alcholQauntity;
	}
}
