package com.lgcns.LCP01;

public class JungHyunSeok_20170214 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isDuplicate("0123456789");
		isDuplicate("01234");
		isDuplicate("01234567890");
		isDuplicate("6789012345");
		isDuplicate("012322456789");
    }

    private static void isDuplicate(String num){

        int[] arr = new int[10];
        boolean result = true;

        if (num.length() != 10){
            result = false;
            
        }else{
        	
            for (int i = 0; i < num.length(); i++){
                arr[num.charAt(i) - '0']++;
                if (arr[num.charAt(i) - '0'] > 1){
                    result = false;
                    break;
                }
            }
        }

        System.out.println(num + " : " + result);

	}

}
/*
[2017.02.14 오늘의 문제]
0~9까지의 문자로 된 숫자를 입력 받았을 때, 
이 입력 값이 0~9까지의 숫자가 각각 한 번 씩만 사용된 것인지 확인하는 함수를 구하시오.
[조건]
숫자의 순서는 바뀔 수 있음.
단, 0~9까지의 숫자가 모두 포함되어야 함.
[출력 예시]
입력 : 0123456789 01234 01234567890 6789012345 012322456789
결과 : true false false true false

*/



