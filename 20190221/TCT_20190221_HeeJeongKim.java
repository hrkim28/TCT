package com.tctstudy;

public class TCT_20190221_HeeJeongKim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int person[][] =  {{0,32,0,3}, {3,13,1,0}, {28,25,1,5}, {39,0,6,0}};
		
		int maxPay = 0;    //최대비불비용
		int directCnt = 0;   //단구간 승차인원
		int trasferCnt = 0; //환승 승차인원
		for (int i=0; i<person.length; i++) {
			
			directCnt = directCnt + person[i][1] - person[i][0];
		    trasferCnt = trasferCnt + person[i][3] - person[i][2];
		    
		    int totalPay = directCnt*1000 + trasferCnt*200;
		    if (totalPay>maxPay) maxPay=totalPay;
		}
		
		System.out.println(maxPay);
	}

}
