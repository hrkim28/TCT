package com.lgcns.exercise.plmtct;



/**
 *  
 *  [����]
 *  
 *  

���ϸ��� ũ�� HEAD, NUMBER, TAIL�� �� �κ����� �����ȴ�.

* HEAD�� ���ڰ� �ƴ� ���ڷ� �̷���� ������, �ּ��� �� ���� �̻��̴�.
* NUMBER�� �� ���ڿ��� �ִ� �� ���� ������ ���ӵ� ���ڷ� �̷���� ������, ���ʿ� 0�� �� �� �ִ�. 0���� 9999 ������ ���ڷ�, 000�̳� 0101 � �����ϴ�.
* TAIL�� �� ������ �κ�����, ���⿡�� ���ڰ� �ٽ� ��Ÿ�� ���� ������, �ƹ� ���ڵ� ���� �� �ִ�
* 
* **���ѻ���**
���ϸ��� �� �κ����� ���� ��, ���� ���ؿ� ���� ���ϸ��� �����Ѵ�.

* ���ϸ��� �켱 HEAD �κ��� �������� ���� ������ �����Ѵ�. �̶�, ���ڿ� �� �� ��ҹ��� ������ ���� �ʴ´�. CNS�� cns, CnS�� ���� �ÿ� ���� ������ ��޵ȴ�.
* ���ϸ��� HEAD �κ��� ��ҹ��� ���� �ܿ��� ���� ���, NUMBER�� ���� ������ �����Ѵ�. 9 < 10 < 0011 < 012 < 13 < 014 ������ ���ĵȴ�. ���� ���� 0�� ���õǸ�, 023�� 23�� ���� �ÿ� ���� ���� ������ ó���ȴ�.
* �� ������ HEAD �κа�, NUMBER�� ���ڵ� ���� ���, ���� �Է¿� �־��� ������ �����Ѵ�. CNS01.zip�� cns1.png�� �Է����� ������, ���� �Ŀ��� �Է� �� �־��� �� ������ ������ �ٲ��� �� �ȴ�.

���ϸ� ���� ���α׷��� �����϶�.

�Է� ����

�Է����� �迭 files�� �־�����.

* files�� 1000 �� ������ ���ϸ��� �����ϴ� ���ڿ� �迭�̴�.
* �� ���ϸ��� 100 ���� ���� ���̷�, ���� ��ҹ���, ����, ����(�� ��), ��ħǥ(��.��), ���� ��ȣ(��-��)������ �̷���� �ִ�. ���ϸ��� �����ڷ� �����ϸ�, ���ڸ� �ϳ� �̻� �����ϰ� �ִ�.
* �ߺ��� ���ϸ��� ������, ��ҹ��ڳ� ���� �պκ��� 0 ���̰� �ִ� ���� �Բ� �־��� �� �ִ�. (cns1.txt, CNS1.txt, cns001.txt, cns1.TXT�� �Բ� �Է����� �־��� �� �ִ�.)

��� ����

�� ���ؿ� ���� ���ĵ� �迭�� ����Ѵ�.

����� ����

�Է�: [��img12.png��, ��img10.png��, ��img02.png��, ��img1.png��, ��IMG01.GIF��, ��img2.JPG��]
���: [��img1.png��, ��IMG01.GIF��, ��img02.png��, ��img2.JPG��, ��img10.png��, ��img12.png��]

�Է�: [��F-5 Freedom Fighter��, ��B-50 Superfortress��, ��A-10 Thunderbolt II��, ��F-14 Tomcat��]
���: [��A-10 Thunderbolt II��, ��B-50 Superfortress��, ��F-5 Freedom Fighter��, ��F-14 Tomcat��
	
 */
public class TCT_20190219_ahryunPark {
	
	int zeroCnt;
	int oneCnt;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190219_ahryunPark tct = new TCT_20190219_ahryunPark();
		
		String[] inputList1 = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF","img2.JPG"};
		String[] inputList2 = {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
		
		tct.getReuslt(inputList1);
		tct.getReuslt(inputList2);
		
	}

	
	public void getReuslt(String[] inputList){
		
		
		for(int inx = 0 ; inx < inputList.length; inx++) {
			String preStr = this.getHeader(inputList[inx]);
			for(int jnx = 0 ;jnx < inputList.length; jnx++) {
				String nextStr = this.getHeader(inputList[jnx]);
				if( preStr.equals(nextStr)) {
					int preN = this.getNumber((inputList[inx]));
					int nextN = this.getNumber((inputList[jnx]));
					if( preN < nextN ) {
						String temp = inputList[jnx];
						inputList[jnx] = inputList[inx];
						inputList[inx] = temp;
					}
				}else {
					if( preStr.charAt(0) < nextStr.charAt(0) ) {
						String temp = inputList[jnx];
						inputList[jnx] = inputList[inx];
						inputList[inx] = temp;
					}
				}
			}
		}
		
		System.out.print("[");
		for(int inx = 0 ; inx < inputList.length; inx++) {
			System.out.print("'"+inputList[inx]+"'");
			if(inx != inputList.length -1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
	
	private String getHeader(String input) {
		
		String result = "";
		String strCheck = input.replaceAll("[0-9]", ",");
		if(strCheck.split(",").length > 0) {
			result =  strCheck.split(",")[0];
		}
		return result.toLowerCase();
	}
	
	private int getNumber(String input) {
		int result = 0;
		input = input.replaceAll("[^0-9]", " ");
		String[] chekcList = input.trim().split(" ");
		if(chekcList.length > 0) {
			result = Integer.valueOf(chekcList[0]);
		}
		
		return result;
	}
	
	
}
