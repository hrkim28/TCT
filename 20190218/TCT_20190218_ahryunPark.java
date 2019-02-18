package com.lgcns.exercise.plmtct;

import java.util.HashMap;


/**
 *  
 *  [����]
 *  
 *  

	fibonacci(3)�� ȣ���ϸ� ������ ���� ���� �Ͼ��.

	* fibonacci(3)�� fibonacci(2)�� fibonacci(1) (ù ��° ȣ��)�� ȣ���Ѵ�.
	* fibonacci(2)�� fibonacci(1) (�� ��° ȣ��)�� fibonacci(0)�� ȣ���Ѵ�.
	* �� ��° ȣ���� fibonacci(1)�� 1�� ����ϰ� 1�� �����Ѵ�.
	* fibonacci(0)�� 0�� ����ϰ�, 0�� �����Ѵ�.
	* fibonacci(2)�� fibonacci(1)�� fibonacci(0)�� ����� ���, 1�� �����Ѵ�.
	* ù ��° ȣ���� fibonacci(1)�� 1�� ����ϰ�, 1�� �����Ѵ�.
	* fibonacci(3)�� fibonacci(2)�� fibonacci(1)�� ����� ���, 2�� �����Ѵ�.
	
	1�� 2�� ��µǰ�, 0�� 1�� ��µȴ�. N�� �־����� ��, fibonacci(N)�� ȣ������ ��, 0�� 1�� ���� �� �� ��µǴ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	< �Է� >
	ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
	�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, N�� �־�����. N�� 40���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
	
	< �Է� ����>
	3
	0
	1
	3
	< ��� ���� >
	1 0
	0 1
	1 2
	
 */
public class TCT_20190218_ahryunPark {
	
	int zeroCnt;
	int oneCnt;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190218_ahryunPark tct = new TCT_20190218_ahryunPark();
		tct.getReuslt(3);
		tct.getReuslt(0);
		tct.getReuslt(1);
		
	}

	
	public void getReuslt(int input){
		this.zeroCnt = 0;
		this.oneCnt = 0;
		this.fibonacci(input);
		System.out.println(this.zeroCnt + " " + this.oneCnt);
	
	}
	
	private int fibonacci(int n) {
		
		if (n == 0) {
			zeroCnt++;
			return 0;
		} else if (n == 1) {
			oneCnt++;
			return 1;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	
}
