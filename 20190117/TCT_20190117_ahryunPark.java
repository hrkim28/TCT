package com.lgcns.exercise.plmtct;

public class TCT_20190117_ahryunPark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190117_ahryunPark tct = new TCT_20190117_ahryunPark();
	       
		
		System.out.println(tct.getReuslt(9));
	    System.out.println(tct.getReuslt(15));
	    System.out.println(tct.getReuslt(18));
		

	}
	
	public int getReuslt(int input){
		
		int result = 0;
		if(input > 0 && input/3>2){
			int devid = input/3;
			
			//중복을 허락하지 않는 순열
			//3으로 나눈 갯수부터 -1씩 빼서 더함
			
			
			for(int inx = devid-2; inx >0 ; inx--){
				result = result + inx;
			}
			
		}
		
		return result;
		
	}

}
