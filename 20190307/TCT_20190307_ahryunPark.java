package com.lgcns.exercise.plmtct;

import java.util.ArrayList;
import java.util.Collections;

/**
 *  
	[����]
	����̴� ���� M���Ͱ� �ʿ��ϴ�. ��ó�� ������ ������ ���� ��� ���ع��ȱ� ������, ���ο� ���� �㰡�� ��û�ߴ�. 
	���δ� ����̳� �� ��ó�� ���� �� �ٿ� ���� ���� �㰡�� ���־���, ����̴� ���� ������ �������ܱ��� �̿��ؼ� ������ ���Ұ��̴�.
	
	�������ܱ�� ������ ���� �����Ѵ�. ����, ����̴� ���ܱ⿡ ���� H�� �����ؾ� �Ѵ�. 
	���̸� �����ϸ� �鳯�� �����κ��� H���� ���� �ö󰣴�. �� ����, �� �ٿ� �������ִ� ������ ��� �����ع�����. 
	����, ���̰� H���� ū ������ H ���� �κ��� �߸� ���̰�, ���� ������ �߸��� ���� ���̴�. 
	���� ���, �� �ٿ� �������ִ� ������ ���̰� 20, 15, 10, 17�̶�� ����. ����̰� ���̸� 15�� �����ߴٸ�, 
	������ �ڸ� ���� ���̴� 15, 15, 10, 15�� �� ���̰�, ����̴� ���̰� 5�� ������ 2�� ������ ��� ���� �� ���̴�. (�� 7���͸� ���� ��� ����)
	
	����̴� ȯ�濡 �ſ� ������ ���� ������, ������ �ʿ��� ��ŭ�� ������ ���������� �Ѵ�. 
	�̶�, ��� M������ ������ ���� �������� ���ؼ� ���ܱ⿡ ������ �� �ִ� ������ �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է�
	 ù° �ٿ� ������ �� N�� ����̰� ������ ���������� �ϴ� ������ ���� M�� �־�����. (1 �� N �� 1,000,000, 1 �� M �� 2,000,000,000)
	
	��° �ٿ��� ������ ���̰� �־�����. ������ ������ ���� �׻� M�� �ѱ� ������, ����̴� ���� �ʿ��� ������ �׻� ������ �� �ִ�. 
	���̴� 1,000,000,000���� �۰ų� ���� ���� ���� �Ǵ� 0�̴�.
	
	���
	 ��� M������ ������ ���� �������� ���ؼ� ���ܱ⿡ ������ �� �ִ� ������ �ִ��� ����Ѵ�.
	
	����
	
	�Է�
	4 7
	 20 15 10 17
	���
	15

 */
public class TCT_20190307_ahryunPark {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190307_ahryunPark tct = new TCT_20190307_ahryunPark();
		
		int height1 = 7;
		int[] treeList1 = {20,15,10,17};
		
		System.out.println(tct.getReuslt(height1, treeList1));
		
	}

	
	public int getReuslt(int height, int[] treeList){
		
		int result = 0;
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		for(int inx = 0 ; inx < treeList.length; inx++) {
			tempList.add(treeList[inx]);
		}
		
		Collections.sort(tempList);
		int minCnt = tempList.get(0);
		Collections.reverse(tempList);
		int maxCnt = tempList.get(0);
		
		boolean isOk = false;
		while(!isOk) {
			maxCnt--;
			int temp = 0;
			for(int inx = 0 ; inx < tempList.size() ; inx++) {
				if(maxCnt < tempList.get(inx)) {
					temp = temp + (tempList.get(inx) - maxCnt);
				}
			}
			if(temp >= height) {
				isOk = true;
			}
			
		}
		
		if(maxCnt >= minCnt) {
			result = maxCnt;

		}
		
		return result;
	}
	
	
	
	
}
