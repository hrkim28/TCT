package com.tctstudy;

public class TCT_20190218_HeeJeongKim {

	public static int count[] = {0,0}; //0,1개수를 카운트하기위한 전역변수
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=3;
		int inputNum[] = {0, 1, 3};
		
		for (int i=0; i<n; i++) {
		    count[0] = 0; //0의개수 카운트
			count[1] = 0; //1의개수 카운트
		    fibonacci ( inputNum[i]);
		    System.out.println(count[0] + " " + count[1]);
		}
		
	}
	
	public static int fibonacci( int n) {
		  if (n == 0) {
			  count[0]++;
		      return 0;
		  } else if (n == 1) {
			  count[1]++;
			  return 1;
		  } else {
			  return fibonacci(n-1)+fibonacci(n-2);
		  }
	}

}
