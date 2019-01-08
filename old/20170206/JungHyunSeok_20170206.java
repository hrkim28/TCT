package com.lgcns.LCP01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JungHyunSeok_20170206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> lotto = new ArrayList<Integer>();
		
		for(int i=1; i<=45; i++){
			list.add(i);
		}
		
		Collections.shuffle(list);
		
		for(int j=1; j<=6; j++){
			lotto.add(list.get(j));
		}
		
		Collections.sort(lotto);
		
		System.out.print(lotto);
		
	}

}

/*
[2017.02.06 오늘의 문제]
문제: 로또!!! 맞춰봅시다~
1) 1~45 사이의 중복되지 않는 임의의 정수 6개를 선정하여 출력
2) 선정된 6개의 정수를 오름차순 Sorting하여 출력
[조건]
단, 정수 6개는 난수 생성할 것.
[출력 예시]
생성된 숫자 : 23 45 7 12 38 9
정렬 결과 : 7 9 12 23 38 45
*/

