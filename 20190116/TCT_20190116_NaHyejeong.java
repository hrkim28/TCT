package teamExcercise;

import java.util.ArrayList;
import java.util.Collections;

public class TCT_20190116_NaHyejeong {

	public static void main(String[] args) {
		
		//입력값 case1
		int n = 4;	
		int[] works = {4,3,3};
		int result = 0;	
		
		ArrayList<Integer> worksArray = new ArrayList<Integer>();
		for (int i = 0; i < works.length; i++) {
			worksArray.add(works[i]);
		}
		
		while (n > 0) {
			Collections.sort(worksArray); // 내림차순 정렬
			Collections.reverse(worksArray); 
			if((int) worksArray.get(0) > 0) {
				worksArray.set(0, (int)worksArray.get(0)-1);
			}
			n--;
		}
		
		// 야근결과 출력
		System.out.print("야근후 남은 작업량 : [ ");
		for (int i = 0; i < worksArray.size(); i++) {
			if (i == worksArray.size()-1) {
				System.out.println(worksArray.get(i) + " ] ");
			}else {
				System.out.print(worksArray.get(i) + " , ");
			}
			// 야근지수계산
			result +=  Math.pow(worksArray.get(i), 2);
		}
		System.out.println("야근지수 : "+result);
		
	}

}
