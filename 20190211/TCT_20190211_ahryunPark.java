package com.lgcns.exercise.plmtct;

import java.util.HashMap;

/**
 *  
 *  ����

	�����̵��� ��ɺο� ����ϱ� ���ؼ� SMTP(��� �޽��� ���� ��������)�� ����� ��� ȸ������ ���� �޽����� ������.
	�޽����� ���鿡 ���� ���۵Ǿ� ������ ���� �ƴ� ��¥ �޽������ ���� ǥ���ϱ� ���� ��� �޽����� �����Ǵµ�, 
	�� ���� �˰����� �޽����� ����ä�� �ڵ��� �쿬�� ���� ��Ģ�� �䳻 �� �� ���� ������ �����ϴ�.
	���� ������� �Ӹ��� �ѱ��� �ܴ��� ������ �޽����� ���� ��� ������ �Ǽ��� �ǵ������� �־� 
	�� �޽����� ������ ���� �޽������ ���� �˷��� �� �ִ�.
	
	�˰����� ��Ȯ�ϰ� ������ �޽����� �� ���ڰ� �� �� ������ �� �� �� �� ���ڰ� ���Եȴ�.
	
	���� ��� ����� "HELLOTHEREWELLBEFINE" ��� �޽����� ������ �;� �ߴٸ� "HELLOTHEREEWELLLBEFINEE" �� ��Ȯ�� �����̴�.
	
	�� �� ���� �� �޽������� ��¥ ���δ� ���� �Ʒõ� �����̵��� �Ǻ��س�����. 
	�׷��� ��ɺο� �����ϴ� �޽������� ���� ���� �þ�鼭 �� �۾��� �ڵ����� ó�����ִ� ���α׷��� ����ϱ�� �Ͽ���.
	
	* �Է�
	
	ù° �ٿ� 100 ������ �׽�Ʈ ���̽��� ������ �־�����.
	�׸��� �� �׽�Ʈ ���̽����� �빮�ڷθ� �̷���� 10���� ������ ���ڿ� M�� �� �ٿ� �־�����.
	�� ���ڿ��� �˻��ؾ��� �޽�����.
	
	* ���
	
	�׽�Ʈ ���̽����� �޽��� M�� ��¥ �޽����� "OK"��, ��¥ �޽����� "FAKE"�� �� �ٿ� ����Ѵ�.
	
	* ���� �Է�
	
	3
	BAPC
	AABA
	ABCABCBBAAACC
	
	* ���� ���
	
	OK
	FAKE
	OK
	
 */
public class TCT_20190211_ahryunPark {
	
	/**
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190211_ahryunPark tct = new TCT_20190211_ahryunPark();
		
		int testNum = 3;
		
		String inputS1 = "BAPC";
		String inputS2 = "AABA";
		String inputS3 = "ABCABCBBAAACC";
		
		
		System.out.println("����� 1 : " + tct.getReuslt(inputS1));
		System.out.println("����� 2 : " + tct.getReuslt(inputS2));
		System.out.println("����� 3 : " + tct.getReuslt(inputS3));

	}
	
	
	public String getReuslt(String input){
		
		String result = "OK";
		HashMap<String, Integer> checkList = new HashMap();
		char[] inputList = input.toCharArray();
		
		for(int inx = 0 ; inx < inputList.length; inx++) {
			
			String key = String.valueOf(inputList[inx]);
			if(checkList.containsKey(key)) {
				checkList.put(key, checkList.get(key)+1);
			}else {
				checkList.put(key, 1);
			}
		}
		
		for ( String key : checkList.keySet() ) {
			if(checkList.get(key)%3 == 0) {
				result = "FAKE";
				break;
			}
		}

		return result;
	}
		
}
