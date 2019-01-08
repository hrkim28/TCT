package com.lcptest;

public class Test0221 {

	static int inputSquare(int input) {
		int num = 0;
		for(int inx = 0 ; inx < input ; inx++) {
			num = num + input;
		}
		return num;
	}	

	public static void main (String arg[]) throws Exception  {
		int inNum = 44;
		
		for(int inx = 1 ; inx <= inNum ; inx++){
			int tmpNum = inputSquare(inx);
			//System.out.println( tmpNum );
			
			if(tmpNum == inNum){
				System.out.println("TRUE");
				break;
			} else if (tmpNum > inNum){
				System.out.println("FALSE");
				break;
			}
		}
	}
	

}
