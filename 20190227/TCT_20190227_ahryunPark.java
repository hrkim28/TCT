package com.lgcns.exercise.plmtct;

import java.util.ArrayList;

/**
 *  
 *  [����]
 *  
 *  
 	�ڿ��� n ���� �̷���� ���� �߿� ���� �� ������ �����ϴ� ������ �ְ��� �����̶�� �մϴ�.

	�� ������ ���� S�� �Ǵ� ���� ����
	�� ������ �����ϸ鼭 �� ������ �� �� �ִ밡 �Ǵ� ����
	���� �� �ڿ��� 2���� �̷���� ���� �� ���� 9�� �Ǵ� ������ ������ ���� 4���� �ֽ��ϴ�.
	{ 1, 8 }, { 2, 7 }, { 3, 6 }, { 4, 5 }
	���� �� ������ ���� �ִ��� { 4, 5 }�� �ְ��� �����Դϴ�.
	
	������ ������ ���� n�� ��� ���ҵ��� �� s�� �Ű������� �־��� ��, �ְ��� ������ return �ϴ� solution �Լ��� �ϼ����ּ���.
	
	### ���� ����
	�ְ��� ������ ������������ ���ĵ� 1���� �迭(list, vector) �� return ���ּ���.
	���� �ְ��� ������ �������� �ʴ� ��쿡 ũ�Ⱑ 1�� 1���� �迭(list, vector) �� -1 �� ä���� return ���ּ���.
	�ڿ����� ���� n�� 1 �̻� 10,000 ������ �ڿ����Դϴ�.
	��� ���ҵ��� �� s�� 1 �̻�, 100,000,000 ������ �ڿ����Դϴ�.
 */
public class TCT_20190227_ahryunPark {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190227_ahryunPark tct = new TCT_20190227_ahryunPark();
		
		int N1 = 2;
		int S1 = 9;
		
		int N2 = 2;
		int S2 = 1;
		
		int N3 = 3;
		int S3 = 13;

		
		tct.getReuslt(N1, S1);
		tct.getReuslt(N2, S2);
		tct.getReuslt(N3, S3);
		
	}

	
	public ArrayList<int[]> getReuslt(int N, int S){
		
		ArrayList<int[]> result = new ArrayList<int[]>();
		int[] maxSet = new int[N];
		
		if(S < 2) {
			int[] temp = {-1};
			result.add(temp);
		}else {
			
			int total = S;
			for(int inx = 0 ; inx < N; inx++) {
				int max = total/(N-inx);
				maxSet[inx] = max;
				total = total-max;
			}
			result.add(maxSet);
		}
		
		
		//�� ���
		System.out.print("[");
		for(int inx = 0 ; inx < N; inx++) {
			System.out.print(maxSet[inx]);
			if(inx == N -1) {
				System.out.print("]");
			}else {
				System.out.print(",");
			}
		}
		
		return result;
	}
	
	
}
