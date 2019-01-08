package com.lgcns.LCP01;

public class JungHyunSeok_20170117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// System.out.println("Hello, World~~");
		
        
				String input = "aaabbcccccca";
        String result = "";
        int count = 0;
        
        char tmp = input.charAt(0);
        count++;
        
        for ( int i = 1; i < input.length(); i++ ) {
            
            if ( input.charAt(i) != tmp ) {
            	result += tmp + "" + count;
                count = 0;
                
                tmp = input.charAt(i);
                count++;
                
            } else {
                count++;
            }
            
            if ( i == input.length()-1 ) {
            	result += tmp + "" + count;
            }
            	
        }
        
        System.out.println(result);

	}

}

/*문자열 압축 알고리즘 (LCP 기출문제)
문자열을 입력받아서, 같은 문자가 연속적으로 반복되는 경우에 그 반복 횟수를 표시하여 문자열을 압축하기.
단, 한번만 반복되는 문자는 숫자 없이  그대로 표기할것 
입력 예시: aaabbcccccca
출력 예시: a3b2c6a
입력 예시: abbcccccca
출력 예시: ab2c6a
입력 예시: apple
출력 예시: ap2le*/

