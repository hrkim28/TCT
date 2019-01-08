package com.lcptest;

public class Test0119 {

	public static void main (String arg[]) throws Exception  {

		int num1,num2,num3;
		
		try{
			for(int i=100;i<1000;i++){
				num1 = i/100;
				num2 = i/10 - num1 * 10;
				num3 = i - ( num1 * 100 + num2 * 10 );
				
				if(i == (num1*num1*num1+num2*num2*num2+num3*num3*num3)){
					System.out.println("Result : " + i);
				}
			}

		}catch(Exception e){}
	}	

}
