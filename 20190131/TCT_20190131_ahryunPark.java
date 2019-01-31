package com.lgcns.exercise.plmtct;


/**
 *  문제
	알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
	
	길이가 짧은 것부터
	길이가 같으면 사전 순으로
	
	입력
	첫째 줄에 단어의 개수 N이 주어진다. (1≤N≤20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 주어지는 문자열의 길이는 50을 넘지 않는다.
	
	출력
	조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.
	
	예제 입력
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
	
	예제 출력
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
