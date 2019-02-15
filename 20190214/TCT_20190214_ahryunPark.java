package com.lgcns.exercise.plmtct;

import java.util.HashMap;


/**
 *  
 *  [����]
	�и�Ƽ �˻���� �޽����� �ְ���� �� �޽����� �и�Ƽ ������ ������ ���� ��쿣 �޽����� ����� ������ �Ͽ��� ���� 
	�׷��� ���� ��� �޽����� ����� ������ ���� �ʾҴٰ� �Ǻ��� �ϴ� �޽��� ���۽��� ���� �Ǻ� �� ������ �ϴ� ����� ���Ѵ�.
	�Ҹ��� ����� ������ ���� ������ ���� ¦�� ���� ���� �� �и�Ƽ ������ ������ �ִٰ� ����. �ٽ� �����ڸ� �� ���տ� ¦������ 1�� �ִٴ� �̾߱� �̴�.

	�Ʒ��� �и�Ƽ ������ ���� 4 x 4�� ����̴�.
	1 0 1 0
	0 0 0 0
	1 1 1 1
	0 1 0 1
	������ ���� ���� 2, 0, 4, 2 �̰� ���� ���� 2, 2, 2, 2 �̴�.
	
	����� ������ ����� ������ �о �̰��� �и�Ƽ ������ ������ �ִ��� ������ �Ǵ��ؾ��Ѵ�. 
	���� �׷��� ���� ��� �ϳ��� ��Ʈ�� �ٲ㼭 �� ����� �и�Ƽ ������ ���� �� �ִ°� Ȯ���ϰ� �׷��� ���� ��� ����� �߸��� ����̶�� �Ǵ��Ѵ�.
	
	**[�Է�����]**
	ù�ٿ��� ����� ũ���� n(n<100) �� �ԷµǸ� n���� �ٿ� n���� 0Ȥ�� 1�� �Էµȴ�.
	
	**[�������]**
	���� ����� �и�Ƽ ������ ���� ��� "OK"�� ����ϰ� �ϳ��� ��Ʈ���� �����ؼ� �и�Ƽ ������ ���� ��� �ٲ�� �� ��Ʈ�� �ִ� 
	i�� j�� �� ���� "Change bit (i,j)" �� ����ϸ� �� ��쿡 �ش���� ���� ���� "Corrupt"��� ����Ѵ�.
	
	* ���� - ������ ��� ���� 1���� �����Ѵ�.
	
	**[�Է�1]**
	4
	1 0 1 0
	0 0 0 0
	1 1 1 1
	0 1 0 1
	**[���1]**
	OK
	
	**[�Է�2]**
	4
	1 0 1 0
	0 0 1 0
	1 1 1 1
	0 1 0 1
	**[���2]**
	Change bit (2,3)
	
	**[�Է�3]**
	4
	1 0 1 0
	0 1 1 0
	1 1 1 1
	0 1 0 1
	**[���3]**
	Corrup
	
 */
public class TCT_20190214_ahryunPark {
	
	/**
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190214_ahryunPark tct = new TCT_20190214_ahryunPark();
		
		
		int[][] inputList1 = { {1, 0, 1, 0},{0, 0, 0, 0}, {1, 1, 1, 1 }, {0, 1, 0, 1}};
		int[][] inputList2 = { {1, 0, 1, 0},{0, 0, 1, 0}, {1, 1, 1, 1 }, {0, 1, 0, 1}};
		int[][] inputList3 = { {1, 0, 1, 0},{0, 1, 1, 0}, {1, 1, 1, 1 }, {0, 1, 0, 1}};
		
		System.out.println("����� 1 : " + tct.getReuslt(inputList1));
		System.out.println("����� 2 : " + tct.getReuslt(inputList2));
		System.out.println("����� 3 : " + tct.getReuslt(inputList3));

	}
	
	
	public String getReuslt(int[][] inputList){
		
		String result = "Corrup";
		
		
		int x = -1;
		int xCnt = 0;
		
		int y = -1;
		int yCnt = 0;
		
		for(int inx = 0 ;inx < inputList.length; inx++) {
			int xSum = 0;
			int ySum = 0;
			int yTemp = -1;
			for(int jnx = 0 ; jnx < inputList.length; jnx++) {
				xSum = xSum + inputList[inx][jnx];
				ySum = ySum + inputList[jnx][inx];
				yTemp = jnx;
			}
			if(xSum %2 == 1) {
				xCnt++;
				x = inx+1;
			}
			
			if(ySum %2 == 1) {
				yCnt++;
				y = inx+1;
			}
		}
		
		
		if( xCnt == 0 && yCnt == 0) {
			result = "OK";
		}else if( xCnt == 1 && yCnt == 1) {
			result = "Change bit(" + x +"," + y+")";
		}
		
		return result;
	}
	
	
	
	
	
}
