package com.lgcns.LCP01;

import java.util.Arrays;

public class JungHyunSeok_20170125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = new String[]{"test","war","holiday","window","project"};
		
		Arrays.sort(str);
		
		if ( str.length % 2 == 0 ) {
			
			System.out.println(str[str.length/2-1]);
			
		} else {
			
			System.out.println(str[str.length/2]);
		}

	}

}

/*[2017.01.25 오늘의 문제]
문자열 중앙값 구하기
입력한 문자열 리스트를 오름차순으로 정렬했을 때 중앙에 해당하는 문자열을 출력하시오.
(단, 문자열 리스트의 갯수가 짝수일 경우, 중앙에 해당하는 두 문자열 중 앞에 있는 문자열을 출력한다.)
출력예시
input : test, war, holiday, window, project
median : test
input : apple, peach, fly, money, room, cow, test, air, dog, spider
median : fly
*/
