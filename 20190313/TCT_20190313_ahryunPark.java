package com.lgcns.exercise.plmtct;

import java.util.ArrayList;
import java.util.Collections;

/**
 *  
[����]
	��������� �ϰ� ��Ǯ�̷� ��� ���ְ��� ���ɸ����� ã�Ҵ�.
	�̰��� Ư���ϰ� ���ɸ��� ��Ű�� �������� �뷮�� ������ �ȿ� ��� �ִ� ���ɸ� ���� �����̴�.
	��, �� �� �ֹ��� ���ɸ� �뷮�� 802ml �̱⵵ 1002ml�� �����⵵ �Ѵ�.
	���� ���ɸ� N �����ڸ� �ֹ��ϰ�, �ڽ��� ������ ģ���� K���� ���ɸ��� �Ȱ��� ������ �����ַ��� �Ѵ�.
	
	�׷��� ���� ģ������ �ٸ� �������� ���ɸ��� ���̴� ���� �Ⱦ,
	��� �� �����ڿ� ���ɸ��� ���� ���� �ִ��� �׳� ���ɸ��� ������� �Ѵ�.
	��, �� �� �ֹ��� ���ɸ��� ���� ���� ��Ƽ� ģ���鿡�� �ٽ� �ִ� ���� ����.
	
	���� ��� 5���� 3 �����ڸ� �ֹ��Ͽ� 1002, 802, 705 ml�� ���ɸ��� �� �����ڿ� ����� ���԰�,
	�̰��� 401ml�� �����ϰ� ������ ��� ���� �����ڿ��� 200ml, 0m, 304ml ��ŭ�� ������.)
	�̷� �� K���� �ִ����� ���� ���� ���ɸ��� �й��� �� �ִ� �뷮 ml�� �������� ������ּ���.
	
	[�Է�]
	ù° �ٿ��� ���� �ֹ��� ���ɸ� �������� ���� N, �׸��� ���� ������ ģ���� K���� �Էµȴ�.
	N�� 10000������ �����̰�, K�� 1,000,000������ �����̴�. ���ɸ� �뷮�� 231 -1 ���� �۰ų� ���� �ڿ����̴�.
	��, �׻� N �� K �̴�. ��, �������� ������ ��� ������ ���� ���� ����
	
	[���]
	ù° �ٿ� K���� ������ �� �ִ� �ִ��� ���ɸ� �뷮 ml �� ����Ѵ�.
	
	���� �Է� 1
	2 3
	702
	429
	
	���� ��� 1
	351
	
	���� �Է� 2
	4 11
	427
	541
	774
	822
	
	���� ��� 2
	205

 */
public class TCT_20190313_ahryunPark {
	
	
	public static void main(String[] args) {
		
		TCT_20190313_ahryunPark tct = new TCT_20190313_ahryunPark();
		
		int[] NK1 = {2,3};
		int[] inputList1 = {702, 429};
		
		int[] NK2 = {4,11};
		int[] inputList2 = {427, 541, 774, 822};
		
		System.out.println(tct.getResult(NK1, inputList1));
		System.out.println(tct.getResult(NK2, inputList2));
	}

	private int getResult(int[] NK, int[] inputList) {
		
		int result = 0;
		int N = NK[0];
		int K = NK[1];
		
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		for(int inx = 0 ; inx < inputList.length; inx++) {
			tempList.add(inputList[inx]);
		}
		
		Collections.sort(tempList);
		
		int max = tempList.get(N-1);
		int temp = 0;
		int mid = 0;
		
		while(temp < max) {
			mid = (max+temp)/2;
			int cnt = 0;
			for(int inx = 0; inx < inputList.length; inx++) {
				cnt += inputList[inx]/mid;
			}
			if(cnt < K) {
				max = mid;
			}else {
				temp = mid+1;
			}
		}
		
		result = mid-1;
	    return mid;
	}
	
	
}
