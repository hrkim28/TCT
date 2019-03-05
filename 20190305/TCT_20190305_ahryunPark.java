package com.lgcns.exercise.plmtct;

import java.util.ArrayList;

/**
 *  
	[����]
	10�������� 3 �Ǵ� 9�� ����� ������� ���ڴ� �� �ڸ����� �յ� 3 �Ǵ� 9�� ����� �˴ϴ�.(�Ƽ̳���?^^)
	���� ��� 354�� 1183=354�� 3�� ������� 3+5+4=12 �� 12 ���� 3�� ����Դϴ�.
	9�� ��� 972�� 1089=972�� 9�� ������� 9+7+2=18�� 18 ���� 9�� ����Դϴ�.
	(2 �Ǵ� 5�ǹ���� 100�� 2��5�ǹ���� ����������, 1+0+0=1�� �ǹǷ� �հ谡 2 �Ǵ� 5�� ����� �� �˴ϴ�.)
	
	3�������� ���� 2�� �̷� ������ ������ �ֽ��ϴ�.
	���� ��� 10���� 6�� 3������ ǥ���ϸ� 20�̰� 2+0=2 �� 2�� ����Դϴ�.
	10���� 26�� 3������ ǥ���ϸ� 222�̰� 2+2+2=6���� 2�� ����Դϴ�.
	
	�Է°����� ������ �־������� ���� ���� ������ ������ ���ڸ� ��� ����ϼ���. (��, 0�� 1�� ������)
	� ���� �̷��� ���� ����� �Ǵ� ������ �������� �˰��� ��� ������ ���� ����� �ʿ�� �����ϴ�.
	���� 4�ڸ� �̸��� ������ �����Ǹ� �� ū �ڸ������� �����ȴٰ� �� �� �ֽ��ϴ�.
	(���� ��� 10���������� 999���� ū���ڸ� ������� �ʾƵ� �˴ϴ�.)
	
	[���ѻ���]
	����(base) : 3~30������ ����
	
	[�����]
	�Է¿��� : ���� = 10
	��¿��� : 3,9
	
	�Է¿��� : ���� = 3
	��¿��� : 2
	
	�Է¿��� : ���� = 26
	��¿��� : 5, 25
	
	�Է¿��� : ���� = 30
	��¿��� : 29
 */
public class TCT_20190305_ahryunPark {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190305_ahryunPark tct = new TCT_20190305_ahryunPark();
		
		
		int inputN1 = 10;
		int inputN2 = 3;
		int inputN3 = 26;
		int inputN4 = 30;
		
		
		tct.getReuslt(inputN1);
		tct.getReuslt(inputN2);
		tct.getReuslt(inputN3);
		tct.getReuslt(inputN4);
		
	}

	
	public void getReuslt(int input){
		
		
		ArrayList<Integer> resultList = this.getMultiple(input);
		
		for(int inx = 0 ; inx < resultList.size(); inx++) {
			System.out.print(resultList.get(inx));
			if(inx != resultList.size()-1) {
				System.out.print(" , ");
			}
		}
		System.out.println("");
	}
	
	
	private ArrayList<Integer> getMultiple(int input) {
		
		ArrayList<Integer> multiList = new ArrayList<Integer>();
		for(int inx = 2; inx < input ; inx++) {
			boolean isMulti = true;
			for(int jnx = 2; jnx < input; jnx++) {
				int multi = inx*jnx;
				int sum = this.toDeposition(multi, input) ;
			
				if(sum%inx != 0) {
					isMulti = false;
					break;
				}
			}
			
			if(isMulti) {
				multiList.add(inx);
			}
		}
		
		return multiList;
		
	}
	
	
	private int toDeposition(int multi, int input) {
		int sum = 0;

	    while(multi != 0){
        	sum = sum + (multi % input) ;
        	multi /= input;
	    }

	    return sum;
	}
	
}
