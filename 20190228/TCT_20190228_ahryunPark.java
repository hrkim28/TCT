package com.lgcns.exercise.plmtct;

import java.util.ArrayList;

/**
 *  
 *  [����]
 *  
 *  
 	��ȥ ���ɱ��� LG CNS �� å���� ���ÿ� �������� ��븦 �Ұ��޾� ����Ʈ�� �ϰ� �Ǿ����ϴ�.
	�׷��� �� å���� ��������� ������ ���� �ʾ� ������ ���������� �Ǽ��� �ϰ� �� Risk�� �����ϰԵ˴ϴ�.
	�� å���� ���� �� å���� ���¿� ���� ���赵�� �����ϴ� ���α׷��� �ۼ��ؾ� �մϴ�.
	
	���� ����
	�Է� ����
	. �� å���� ���� ������� ����Ʈ�ϴ� ����� �̸� �迭�� �Է¹޽��ϴ�.
	. ���� ������� �����̸� ������ 0 �̻� 10 �����Դϴ�.
	. ������ �̸��� ���ڿ� �迭�� �ִ� 100���Դϴ�.
	
	��� ����
	. �Էµ� ����� �̸��� ������� ������ �Ǽ��� �ϰԵ� ���赵�� ����մϴ�.
	
	����
	. ������ ���� �ֱٿ� ���� ����� ����մϴ�.(Least Recently Used)
	. ���� ���� ���� ��� ���赵�� 1 �����մϴ�.
	. ���� ���� ���� ��� ���赵�� 5 �����մϴ�.
	
	����� ��
	���� 1
	(1) �Է�
	. ����: 3
	. ���: ["������", "�տ���", "������", "����", "����", "������", "�տ���", "������", "����", "����"]
	(2) ���
	. ���赵: 50
	
	���� 2
	(1) �Է�
	. ����: 3
	. ���: ["������", "�տ���", "������", "������", "�տ���", "������", "������", "�տ���", "������"]
	(2) ���
	. ���赵: 21
	
	���� 3
	(1) �Է�
	. ����: 2
	. ���: ["������", "�տ���", "������", "����", "����", "���ϴ�", "������", "�̳���", "�Ѱ���", "������", "����", "�̳���"]
	(2) ���
	. ���赵: 60
	
	���� 4
	(1) �Է�
	. ����: 5
	. ���: ["������", "�տ���", "������", "����", "����", "���ϴ�", "������", "�̳���", "�Ѱ���", "������", "����", "�̳���"]
	(2) ���
	. ���赵: 52
 */
public class TCT_20190228_ahryunPark {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190228_ahryunPark tct = new TCT_20190228_ahryunPark();
		
		int memory1 = 3;
		String[] inputList1 = {"������", "�տ���", "������", "����", "����", "������", "�տ���", "������", "����", "����"};
		
		int memory2 = 3;
		String[] inputList2 = {"������", "�տ���", "������", "������", "�տ���", "������", "������", "�տ���", "������"};
		
		int memory3 = 2;
		String[] inputList3 = {"������", "�տ���", "������", "����", "����", "���ϴ�", "������", "�̳���", "�Ѱ���", "������", "����", "�̳���"};

		
		int memory4 = 5;
		String[] inputList4 = {"������", "�տ���", "������", "����", "����", "���ϴ�", "������", "�̳���", "�Ѱ���", "������", "����", "�̳���"};

		
		System.out.println("���赵 " + tct.getReuslt(memory1, inputList1));
		System.out.println("���赵 " + tct.getReuslt(memory2, inputList2));
		System.out.println("���赵 " + tct.getReuslt(memory3, inputList3));
		System.out.println("���赵 " + tct.getReuslt(memory4, inputList4));
		
	}

	
	public int getReuslt(int memory, String[] inputList){
		
		
		int risk = 0;
		
		for(int inx = 0 ; inx < inputList.length; inx++) {
			
			boolean isExist = false;
			int check = 0;
			if(inx < memory) {
				check = 0;
			}else {
				check = inx - memory;
			}
			for(int jnx = check; jnx < inx ; jnx++) {
				if(inputList[inx].equals(inputList[jnx])) {
					isExist = true;
					break;
				}
			}
			
			if(isExist) {
				risk++;
			}else {
				risk = risk + 5;
			}
			
		}
		
		
		return risk;
	}
	
	
}
