package com.lgcns.lkk;

public class   TCT_20190212_LEEKANGKIL{

	public static void main(String args[])  {

		// CPU�� �޸𸮵� ����� �ϰ� ������ �� ���� ��ƾ���..
		
		TCT_20190212_LEEKANGKIL lkk = new TCT_20190212_LEEKANGKIL();
		int input = 5000;
		int left=input;
		int right=input;
	
		while(!lkk.checkNum(String.valueOf(left)))	 left--;
		while(!lkk.checkNum(String.valueOf(right)))	right++;
		
		if( input - left > right - input ) System.out.println(right);
		else System.out.println(left);
		
	}
	
	public boolean checkNum(String strInput){
		for(int j=0; j<strInput.length();j++){
			if(strInput.lastIndexOf(strInput.charAt(j))!=j){
				return false;
			}
		}
		return true;
	}
	
}

