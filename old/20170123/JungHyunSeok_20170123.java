package com.lgcns.LCP01;

public class JungHyunSeok_20170123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JungHyunSeok_20170123 aa = new JungHyunSeok_20170123();
		System.out.println(aa.isTrue(142857));

	}
	
	public boolean isTrue(int num){
		int a = 0;
		int b = num;
		
		if(num/10 == 0){
			return true;
		}else{
			while(true){
				while(b >= 1){
					a += b % 10;
					b /= 10;
				}
				a += b;
				break;
			}
		}
		
		if(num % a == 0){
			return true;
		}else{
			return false;
		}
	}

}

/*[2017.01.23 오늘의 문제]
양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
예를들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
입력받은 양의 정수 n이 하샤드수인지 아닌지 판단하는 함수를 완성하세요.
예를들어 n이 10, 12, 18, 153, 142857.. 이면 True를 리턴 11, 13..이면 False를 리턴하면 됩니다.
*/
