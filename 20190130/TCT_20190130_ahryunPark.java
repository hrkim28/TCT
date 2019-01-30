package com.lgcns.exercise.plmtct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 *  2018�⵵ �������
 *  ���� ������ 100�� �� 21���� �Ʒ��� ���� �������� ����� �ο��Ͽ���.
 *  ����	���	�ο�
	1��	500����	1��
	2��	300����	2��
	3��	200����	3��
	4��	50����	4��
	5��	30����	5��
	6��	10����	6��
 *
 *  2019�⵵ �������
 *  ���� ������ 64�� �� 31���� �Ʒ��� ���� �������� ����� �ο��� �����̴�.
 *  ����	���	�ο�
	1��	512����	1��
	2��	256����	2��
	3��	128����	4��
	4��	64����	8��
	5��	32����	16��
	
	�Է�
	ù ��° �ٿ� �¿찡 ������ �����Ͽ� ������ Ƚ�� T(1 �� T �� 1,000)�� �־�����.
	���� T�� �ٿ��� �� �ٿ� �ϳ��� �¿찡 �غ� ������ ���� ������ �־�����. 
	�� �ٿ��� �� ���� ���� �ƴ� ���� a(0 �� a �� 100)�� b(0 �� b �� 64)�� ���� �ϳ��� ���̷� �ΰ� �־�����.
	
	
	���
	�� ������ ������ �� �¿찡 ���� ����� �� ������ ������ �� �ٿ� �ϳ��� ����Ѵ�. �Է��� ������ ������� ����ؾ� �Ѵ�.
	
	�����Է�
	6
	8 4
	13 19
	8 10
	18 18
	8 25
	13 16
	
	
	�������
	1780000
	620000
	1140000
	420000
	820000
	620000
	
 */
public class TCT_20190130_ahryunPark {
	
	/**
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190130_ahryunPark tct = new TCT_20190130_ahryunPark();
		
		int testNum = 6;
		
		int[][] inputList = { {8,4}, 
							  {13, 19},
							  {8, 10},
							  {18, 18},
							  {8, 25},
							  {13, 26},
							};
		
		tct.getReuslt(inputList);

	}
	
	
	public void getReuslt(int[][] inputList){
		
		//����� ���
		int[] rankA = {500, 300, 200, 50, 30, 10};
		int[] rankB = {512, 256, 128, 64, 32};
		
		//����� ���
		int[] placeA = {1,2,3,4,5,6};
		int[] placeB = {1,2,4,8,16};
		
		for(int i = 0; i < inputList.length; i++) {
			int totalRankA = 0;
			int resultA = 0;
			for(int inx = 0; inx < placeA.length; inx++) {
			
				resultA = resultA + placeA[inx];
				if(resultA >= inputList[i][0]) {
					totalRankA = rankA[inx]*1000;
					break;
					
				}
			}
			
			int totalRankB = 0;
			int resultB = 0;
			for(int inx = 0; inx < placeB.length; inx++) {
				
				resultB = resultB + placeB[inx];
				if(resultB >= inputList[i][1]) {
					totalRankB = rankB[inx]*1000;
					break;
					
				}
			}
			
			int total = totalRankA + totalRankB;
			System.out.println("��� : " + total + "��");
		}
	}

}
