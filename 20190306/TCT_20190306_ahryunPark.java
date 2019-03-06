package com.lgcns.exercise.plmtct;

import java.util.ArrayList;

/**
 *  
	[����]
	Java������ ������ �̸��� ���� �ܾ�� �̷�������� ��, ������ ���� ������� �������� ���´�.
	ù �ܾ�� �ҹ��ڷ� ����, ���� �ܾ���ʹ� ù ���ڸ� �빮�ڷ� ����. ��, ��� �ܾ�� �ٿ�����. 
	���� Java�� �������� javaIdentifier, longAndMnemonicIdentifier, name�� ���� �����̴�.
	�ݸ鿡 C++������ ������ �ҹ��ڸ� ����Ѵ�.
	�ܾ�� �ܾ �����ϱ� ���ؼ� ����('_')�� �̿��Ѵ�. 
	C++ �������� c_identifier, long_and_mnemonic_identifier, name �� ���� �����̴�.
	
	C++������ �������� Java������ ����������, �Ǵ� �� �ݴ�� �ٲ��ִ� ���α׷��� ������� �Ѵ�. 
	�� ����� ������ ������ ���� ������ ����� �Ѵ�.
	���� C++���İ� Java���� �� �� �ƴ϶��, ������ �߻���Ų��. �������� ��ȯ�� ��, �ܾ��� ������ �����Ǿ�� �Ѵ�.
	
	[�Է� ��1]
	long_and_mnemonic_identifier
	
	[��� ��1]
	longAndMnemonicIdentifier
	
	[�Է� ��2]
	jobLog
	
	[��� ��2]
	job_log
 */
public class TCT_20190306_ahryunPark {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190306_ahryunPark tct = new TCT_20190306_ahryunPark();
		
		
		String input1 = "long_and_mnemonic_identifier";
		String input2 = "jobLog";
		
		
		System.out.println(tct.getReuslt(input1));
		System.out.println(tct.getReuslt(input2));
		
	}

	
	public String getReuslt(String input){
		
		String result = "";
		char[] charList = input.toCharArray();
		boolean isCheck = false;
		
		if(input.indexOf("_") > 1) {
			for(int inx = 0 ; inx < charList.length; inx++) {
				if(String.valueOf(charList[inx]).equals("_") && inx != charList.length-1) {
					result = result + String.valueOf(charList[inx+1]).toUpperCase();
					isCheck = true;
					inx++;
				}else{
					result = result + String.valueOf(charList[inx]);
				}
			}
			
		}else {
			
			for(int inx = 0 ; inx < charList.length; inx++) {
				String temp = "";
				if( 65 <= charList[inx] &&  charList[inx] <= 90 ) {
					charList[inx] = (char)(charList[inx]+32);
					temp = "_" + charList[inx];
				}else {
					temp = String.valueOf(charList[inx]);
				}
				result = result + temp;
			}
			
			if(result.indexOf("_") > -1) {
				isCheck = true;
			}
			
		}
		
		if(!isCheck) {
			result = "Error";
		}
		
		
		return result;
	}
	
	
	
	
}
