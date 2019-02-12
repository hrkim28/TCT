package com.lgcns.exercise.plmtct;

import java.util.HashMap;


/**
 *  
 *  [����]
	0���� 9������ ���ڸ� �� ���� ����Ͽ� ���� ���� �߿� �Է¼���(1�� N ��10,000,000,000)�� ���� ���̰� ���� ���ڸ� ����Ѵ�.
	���� ���� ���� ���, �� ���� ���ڸ� ����Ѵ�.

	---------- �� �� ----------
	[�Է�1]
	222
	[���1]
	219
	
	[�Է�2]
	5000
	[���2]
	5012
	
 */
public class TCT_20190212_ahryunPark {
	
	/**
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190212_ahryunPark tct = new TCT_20190212_ahryunPark();
		
		
		int inputN1 = 222;
		int inputN2 = 5000;
		
		System.out.println("����� 1 : " + tct.getReuslt(inputN1));
		System.out.println("����� 2 : " + tct.getReuslt(inputN2));

	}
	
	
	public int getReuslt(int input){
		
		int result = 0;
		
		//�ּҰ� ���ϱ�
		boolean isMin = false;
		int min = input;
		while(!isMin) {
			min--;
			isMin = this.isDiffNum(min);
		}
		
		//�ִ밪 ���ϱ�
		boolean isMax = false;
		int max = input;
		while(!isMax) {
			max++;
			isMax = this.isDiffNum(max);
		}
		
		//���̰��� ���� ��� �ּҰ� ���
		if(Math.abs(input-min) == Math.abs(input-max) ) {
			result = min;
		}else if(Math.abs(input-min) < Math.abs(input-max)) {
			result = min;
		}else if(Math.abs(input-min) > Math.abs(input-max)) {
			result = max;
		}
		

		return result;
	}
	
	
	/**
	 * �� �ڸ����� ���ڰ� ��� �ٸ� ��� true
	 * @param input
	 * @return
	 */
	private boolean isDiffNum(int input) {
		boolean isDiff = true;
		String check = String.valueOf(input);
		HashMap<String, Integer> checkList = new HashMap();
		for(int inx = 0; inx < check.length(); inx++) {
			String key = String.valueOf(check.substring(inx, inx+1));
			if(checkList.containsKey(key)) {
				isDiff = false;
				break;
			}else {
				checkList.put(key, 1);
			}
		}
		
		return isDiff;
	}
		
}
