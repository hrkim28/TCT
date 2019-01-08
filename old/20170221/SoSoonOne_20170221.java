package com.test02;


public class SoSoonOne_20170221 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 14641; //12*12
		
		System.out.println(input+" ---> "+checkSqaure(input));
		
	}
	
	public static boolean checkSqaure(int number){
		boolean result = false;
		int sqaureCount = 5;
		int compareNum = 4;
		
		if(number == 4){
			result = true;
		}
		while(number > compareNum){
			compareNum += sqaureCount;
			sqaureCount += 2;
			
			if(number == compareNum){
				result = true;
				break;
			}
		}
	
		return result;
	}
	
	
}
