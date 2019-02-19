package com.lgcns.exercise.plmtct;



/**
 *  
 *  [문제]
 *  
 *  

파일명은 크게 HEAD, NUMBER, TAIL의 세 부분으로 구성된다.

* HEAD는 숫자가 아닌 문자로 이루어져 있으며, 최소한 한 글자 이상이다.
* NUMBER는 한 글자에서 최대 네 글자 사이의 연속된 숫자로 이루어져 있으며, 앞쪽에 0이 올 수 있다. 0부터 9999 사이의 숫자로, 000이나 0101 등도 가능하다.
* TAIL은 그 나머지 부분으로, 여기에는 숫자가 다시 나타날 수도 있으며, 아무 글자도 없을 수 있다
* 
* **제한사항**
파일명을 세 부분으로 나눈 후, 다음 기준에 따라 파일명을 정렬한다.

* 파일명은 우선 HEAD 부분을 기준으로 사전 순으로 정렬한다. 이때, 문자열 비교 시 대소문자 구분을 하지 않는다. CNS와 cns, CnS는 정렬 시에 같은 순서로 취급된다.
* 파일명의 HEAD 부분이 대소문자 차이 외에는 같을 경우, NUMBER의 숫자 순으로 정렬한다. 9 < 10 < 0011 < 012 < 13 < 014 순으로 정렬된다. 숫자 앞의 0은 무시되며, 023와 23는 정렬 시에 같은 같은 값으로 처리된다.
* 두 파일의 HEAD 부분과, NUMBER의 숫자도 같을 경우, 원래 입력에 주어진 순서를 유지한다. CNS01.zip과 cns1.png가 입력으로 들어오면, 정렬 후에도 입력 시 주어진 두 파일의 순서가 바뀌어서는 안 된다.

파일명 정렬 프로그램을 구현하라.

입력 형식

입력으로 배열 files가 주어진다.

* files는 1000 개 이하의 파일명을 포함하는 문자열 배열이다.
* 각 파일명은 100 글자 이하 길이로, 영문 대소문자, 숫자, 공백(“ “), 마침표(“.”), 빼기 부호(“-“)만으로 이루어져 있다. 파일명은 영문자로 시작하며, 숫자를 하나 이상 포함하고 있다.
* 중복된 파일명은 없으나, 대소문자나 숫자 앞부분의 0 차이가 있는 경우는 함께 주어질 수 있다. (cns1.txt, CNS1.txt, cns001.txt, cns1.TXT는 함께 입력으로 주어질 수 있다.)

출력 형식

위 기준에 따라 정렬된 배열을 출력한다.

입출력 예제

입력: [“img12.png”, “img10.png”, “img02.png”, “img1.png”, “IMG01.GIF”, “img2.JPG”]
출력: [“img1.png”, “IMG01.GIF”, “img02.png”, “img2.JPG”, “img10.png”, “img12.png”]

입력: [“F-5 Freedom Fighter”, “B-50 Superfortress”, “A-10 Thunderbolt II”, “F-14 Tomcat”]
출력: [“A-10 Thunderbolt II”, “B-50 Superfortress”, “F-5 Freedom Fighter”, “F-14 Tomcat”
	
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
