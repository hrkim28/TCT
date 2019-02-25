package com.lgcns.exercise.plmtct;

import java.util.ArrayList;

/**
 *  
 *  [����]
 *  
 *  
 	������ ���̿��� �뵷�� �ݴϴ�.
	���� ���������� �ڵ������� ���ٰ� �Ͽ� ������ �˰��� �н��� ���� �뵷 �ִ� ����� �̿��� ���ϴ�.
	
	�ݾ��� ǥ�õ� �뵷 ���� �������� �������� �迭�մϴ�.
	���̴� ���� �������� ���� �� �� ������ ������ �ֽ��ϴ�.
	������ ���� ���� ���� ������ ������ �� �����ϴ�.
	
	�Ʒ� ���ô� ������ �迭�� ǥ���� ������ ù��° 1000���� ������ 5000���� ���ӵ� ������ �մϴ�.
	1000���� �����ϸ� �翷�� 2000���� 5000���� ������ �� �����ϴ�.
	���� : { 1000, 2000, 3000, 4000, 5000 }
	
	���÷� �־��� �迭���� ���̰� ���� �� �ִ� �ִ� �ݾ��� ���ϼ���.
	
	[��������]
	2 ~ 30 ���� �迭 ���
	�迭�� ��Ҵ� 1 ~ 50,000 ������ ��
	
	[�Է¿���]
	����1 = { 2000, 3000 }
	����2 = { 1000, 3000, 1000 }
	����3 = { 2000, 2000, 2000, 2000 }
	����4 = { 1000, 10000, 8000, 5000, 7000, 3000, 9000 }
	
	[��¿���]
	���1 = 3000
	���2 = 3000
	���3 = 4000 ( = 2000 + 2000 )
	���4 = 26000 ( = 10000 + 7000 + 9000 )
 */
public class TCT_20190225_ahryunPark {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190225_ahryunPark tct = new TCT_20190225_ahryunPark();

		int[] inputList1 = { 2000, 3000 };
		int[] inputList2 = { 1000, 3000, 1000};
		int[] inputList3 = { 2000, 2000, 2000, 2000 };
		int[] inputList4 = { 1000, 10000, 8000, 5000, 7000, 3000, 9000 };
		
		
		
		System.out.println(tct.getReuslt(inputList1));
		System.out.println(tct.getReuslt(inputList2));
		System.out.println(tct.getReuslt(inputList3));
		System.out.println(tct.getReuslt(inputList4));
		
	}

	
	public int getReuslt(int[] inputList){
		
		int sumMax = 0;
		
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		for(int inx = 0 ;inx < inputList.length; inx++) {
			resultList.add(inputList[inx]);
		}
		
		while(resultList.size() > 0) {
			if(resultList.size() == 1) {
				sumMax = sumMax + resultList.get(0);
				resultList.clear();
			}else {
				int maxIndex = this.getMax(resultList);
				sumMax = sumMax + resultList.get(maxIndex);
				if(resultList.size() > 3) {
					if(maxIndex == 0 ) {
						resultList.remove(maxIndex);
						resultList.remove(maxIndex);
						resultList.remove(resultList.size()-1);
					}else if(maxIndex == resultList.size()-1) {
						resultList.remove(maxIndex);
						resultList.remove(maxIndex-1);
						resultList.remove(0);
					}else {
						resultList.remove(maxIndex);
						resultList.remove(maxIndex-1);
						resultList.remove(maxIndex-1);
					}
				}else {
					resultList.clear();
				}
			}
		}
			

		return sumMax;
	}
	
	
	private int getMax(ArrayList<Integer> resultList) {
		int max = resultList.get(0);
		int maxIndex = 0;
		
		for(int inx = 1; inx < resultList.size(); inx++) {
			if(max < resultList.get(inx)) {
				max = resultList.get(inx);
				maxIndex = inx;
			}
		}
		
		
		return maxIndex;
	}
		
		
	
	
}
