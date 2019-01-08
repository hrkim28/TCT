package com.test02;

public class SoSoonOne_20170126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input[] = {"a1","a2","a3","a4","b1","b2","b3","b4"};
		String result[] = new String[input.length];
		
		int length = 0;
		
		
		length = input.length/2;
		
		for(int i=0,j = 0 ; i<input.length ; i ++){
			if(i%2 == 0){
				result[i] = input[j]; 
			}
			else {
				result[i] = input[j+length];
				j++;
			}
			
		}
		
		
		for(int i=0 ; i<result.length ; i ++){
			System.out.println(result[i]);
		}
		
		
	}

}
