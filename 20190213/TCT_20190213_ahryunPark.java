package com.lgcns.exercise.plmtct;

import java.util.HashMap;


/**
 *  
 *  [����]
	���� X�� ����� �� �ִ� ������ ������ ���� �� ���� �̴�.
	
	1. X�� 3���� ������ ��������, 3���� ������.
	2. X�� 2�� ������ ��������, 2�� ������.
	3. 1�� ����.
	
	���� N�� �־����� ��, ���� ���� ���� �� ���� ������ ����ؼ� 1�� ������� �Ѵ�.
	������ ����ϴ� Ƚ���� �ּҰ��� ����Ͻÿ�.
	
	* �Է�
	  ù° �ٿ� 1���� ũ�ų� ����, 1000000���� �۰ų� ���� ���� N�� �־�����.
	* ���
	  ù° �ٿ� ������ �ϴ� Ƚ���� �ּڰ��� ����Ѵ�.
	
	[�Է�1]
	10
	[���1]
	3
	
	[�Է�2]
	30
	[���2]
	4
	
	[��Ʈ]
	10�� ��� 10 -> 9 -> 3 -> 1	: 3��
	30�� ��� 30 -> 10 -> 9 -> 3 -> 1	: 4��
	
 */
public class TCT_20190213_ahryunPark {
	
	/**
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190213_ahryunPark tct = new TCT_20190213_ahryunPark();
		
		
		int inputN1 = 10;
		int inputN2 = 30;
		int inputN3 = 17;
		
		System.out.println("����� 1 : " + tct.getReuslt(inputN1));
		System.out.println("����� 2 : " + tct.getReuslt(inputN2));
		System.out.println("����� 3 : " + tct.getReuslt(inputN3));

	}
	
	
	public int getReuslt(int input){
		
		int result = 0;
		
		while(input != 1) {
			
			//Input���� 3���� ���� ���� 3�� ������� Check
			//3�� ����� �ƴ� ��� 2�� ����϶����� -1
			//3�� ����� ��� 3�� ����϶����� -1
			if(this.isCheck(input)) {
				if(input%3!=0) {
					input--;
					result++;
				}else if(input%3 == 0) {
					input = input/3;
					result++;
				}
			}else {
				if(input%2!=0) {
					input--;
					result++;
				}else if(input%2 == 0) {
					input = input/2;
					result++;
				}
			}
			
			
		}
		return result;
	}
	
	/**
	 * 
	 * ���� 3�� ��
	 * @param input
	 * @return
	 */
	private boolean isCheck(int input) {
		boolean isCheck = false;
		
		if((input/3)%3 == 0) {
			isCheck = true;
		}
		
		return isCheck;
	}
	
	
	
}
