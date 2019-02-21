package com.lgcns.exercise.plmtct;


/**
 *  
 *  [문제]
 *  
 *  
 	지하철역  최대금액 구하기 
 */
public class TCT_20190221_ahryunPark {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190221_ahryunPark tct = new TCT_20190221_ahryunPark();

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
