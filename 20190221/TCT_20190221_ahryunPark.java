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
		
		
		int singleAccount = (inputList[0][1]-inputList[0][0])*1000;
		int transferAccount = (inputList[0][3]-inputList[0][2])*200;
		int sumMax = singleAccount + transferAccount;
		
		for(int inx= 1; inx<inputList.length; inx++) {
				
			singleAccount = singleAccount + (inputList[inx][1]-inputList[inx][0])*1000;
			transferAccount = transferAccount + (inputList[inx][3]-inputList[inx][2])*200;
			
			if(sumMax < singleAccount+transferAccount) {
				sumMax = singleAccount+transferAccount;
			}
		}

		return sumMax;
	}
		
		
	
	
}
