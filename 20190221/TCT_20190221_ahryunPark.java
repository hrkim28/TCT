package com.lgcns.exercise.plmtct;


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
public class TCT_20190221_ahryunPark {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190221_ahryunPark tct = new TCT_20190221_ahryunPark();
//		0 32 0 3
//		3 13 1 0
//		28 25 1 5
//		39 0 6 0

		int[][] inputList1 = {{0, 32, 0, 3}, 
							  {3, 13, 1, 0}, 
							  {28, 25, 1, 5}, 
							  {39, 0, 6, 0}};
		
		System.out.println(tct.getReuslt(inputList1));
		
	}

	
	public int getReuslt(int[][] inputList){
		
		int sumMax = 0;
		
		
		for(int inx= 0; inx<inputList.length; inx++) {
			int singleAccount = 0;
			int transferAccount = 0;
			for(int jnx = 0; jnx < inx+1; jnx++) {
				
				singleAccount = singleAccount + (inputList[jnx][1]-inputList[jnx][0])*1000;
				transferAccount = transferAccount + (inputList[jnx][3]-inputList[jnx][2])*200;
			}
			
			if(sumMax < singleAccount+transferAccount) {
				sumMax = singleAccount+transferAccount;
			}
		
		}
		
		
		

		return sumMax;
	}
	

	
}
