package helper;

import java.io.IOException;
import java.util.Arrays;

public class LeeJinKyoung20170125 {

	public static void main (String arg[]) throws IOException  {
		run();
	}

	public  static void run(){

	    /*
	    문자열 중앙값 구하기
	    입력한 문자열 리스트를 오름차순으로 정렬했을 때 중앙에 해당하는 문자열을 출력하시오.
	    (단, 문자열 리스트의 갯수가 짝수일 경우, 중앙에 해당하는 두 문자열 중 앞에 있는 문자열을 출력한다.)
	    출력예시
	    input : test, war, holiday, window, project
	    median : test
	    input : apple, peach, fly, money, room, cow, test, air, dog, spider
	    median : fly
		*/

	    String[] strArray= new String[]{"test", "war", "holiday", "window", "project"};

	    Arrays.sort(strArray);
	    String median = "";

	    if(strArray.length%2 == 1 ){
	        median = strArray[strArray.length/2];
	    } else {
	        median = strArray[strArray.length/2-1];
	    }

		System.out.println(median);
	}
}
