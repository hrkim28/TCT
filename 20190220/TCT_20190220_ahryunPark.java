package com.lgcns.exercise.plmtct;

import java.util.ArrayList;
import java.util.Collections;

/**
 *  
 *  [����]
 *  
 *  
	n���� ������ �̷���� ������ ������ �־�����.
	�츮�� �� �� ���ӵ� �� ���� ���� �����ؼ� ���� �� �ִ� �� �� ���� ū ���� ���Ϸ��� �Ѵ�.
	��, ���� �� �� �̻� �����ؾ� �Ѵ�.
	
	���� �� 10, -4, 3, 1, 5, 6, -35, 12, 21, -1 �̶�� ������ �־����ٰ� ����.
	���⼭ ������ 12+21�� 33�� ������ �ȴ�.
	
	* �Է�
	
	ù° �ٿ� ���� n(1 �� n �� 100,000)�� �־����� ��° �ٿ��� n���� ������ �̷���� ������ �־�����.
	���� -1,000���� ũ�ų� ����, 1,000���� �۰ų� ���� �����̴�.
	
	* ���
	
	ù° �ٿ� ���� ����Ѵ�.
	
	* ���� �Է�
	  10
	  10 -4 3 1 5 6 -35 12 21 -1
	* ���� ���
	  33
	
 */
public class TCT_20190220_ahryunPark {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190220_ahryunPark tct = new TCT_20190220_ahryunPark();
		
		int[] inputList1 = {10, -4, 3, 1, 5, 6, -35, 12, 21, -1};
		
		System.out.println(tct.getReuslt(inputList1));
		
	}

	
	public int getReuslt(int[] inputList){
		
		int sumMax = 0;
		for(int inx = 0 ; inx < inputList.length; inx++) {
			
			int sum = inputList[inx];
			for(int jnx = inx+1; jnx < inputList.length; jnx++) {
				if(sum > sum + inputList[jnx]) {
					inx = jnx;
					if(sumMax < sum) {
						sumMax = sum;
					}
					break;
					
				}else {
					sum = sum+ inputList[jnx];
				}
			}
	
		}
		
		

		return sumMax;
	}
	

	
}
