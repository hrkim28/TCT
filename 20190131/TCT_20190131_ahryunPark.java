package com.lgcns.exercise.plmtct;


/**
 *  ����
	���ĺ� �ҹ��ڷ� �̷���� N���� �ܾ ������ �Ʒ��� ���� ���ǿ� ���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	���̰� ª�� �ͺ���
	���̰� ������ ���� ������
	
	�Է�
	ù° �ٿ� �ܾ��� ���� N�� �־�����. (1��N��20,000) ��° �ٺ��� N���� �ٿ� ���� ���ĺ� �ҹ��ڷ� �̷���� �ܾ �� �ٿ� �ϳ��� �־�����. �־����� ���ڿ��� ���̴� 50�� ���� �ʴ´�.
	
	���
	���ǿ� ���� �����Ͽ� �ܾ���� ����Ѵ�. ��, ���� �ܾ ���� �� �Էµ� ��쿡�� �� ������ ����Ѵ�.
	
	���� �Է�
	13
	but
	i
	wont
	hesitate
	no
	more
	no
	more
	it
	cannot
	wait
	im
	yours
	
	���� ���
	i
	im
	it
	no
	but
	more
	wait
	wont
	yours
	cannot
	hesitate
	
 */
public class TCT_20190131_ahryunPark {
	
	/**
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190131_ahryunPark tct = new TCT_20190131_ahryunPark();
		
		int testNum = 13;
		
		String[] inputList = {"but", "i", "wont", "hesitate", "no", "more", "no", "more", "it", "cannot", "wait", "im", "yours"};
		
		tct.getReuslt(inputList);

	}
	
	
	public void getReuslt(String[] inputList){
		
		
		for(int inx = 0; inx < inputList.length; inx++) {
			
			for(int jnx = inx+1; jnx < inputList.length; jnx++) {
				int preSize = inputList[inx].length();
				int nextSize = inputList[jnx].length();
				String preText = inputList[inx];
				String nextText = inputList[jnx];
				if(preSize > nextSize) {
					
					inputList[inx] = inputList[jnx];
					inputList[jnx] = preText;
					
						
				}else if(preSize == nextSize) {
					if(preText.charAt(0) > nextText.charAt(0)) {
						inputList[inx] = inputList[jnx];
						inputList[jnx] = preText;
					}
				}
			}
		}
		
		
		for(int inx = 0; inx < inputList.length; inx++) {
			if(inx != 0 && !inputList[inx].equals(inputList[inx-1])) {
				System.out.println(inputList[inx]);
			}
			
		}
	}

}
