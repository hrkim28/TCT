package com.lgcns.exercise.plmtct;

public class TCT_20190122_ahryunPark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190122_ahryunPark tct = new TCT_20190122_ahryunPark();
		
		
		int[] input = {6,10,20,15,25,10,20};
		System.out.println(tct.getReuslt(input));

	}
	
	
	public int getReuslt(int[] input){
		
		int result = input[1];
		
		//연속일 경우 true
		//연속이 아닐 경우 false
		boolean isContinu = false;
		
		
		for(int inx = 1; inx<input.length-2; inx++){
			
			if(!isContinu){
				if(input[inx+1] > input[inx+2]){
					result = result + input[inx+1];
					isContinu = true;
				}else{
					result = result + input[inx+2];
					isContinu = false;
					inx = inx+1;
				}
			}else{
				result = result + input[inx+2];
				isContinu = false;
				inx = inx+1;
			}
			
		}
		
		
		return result;
		
	}
}
