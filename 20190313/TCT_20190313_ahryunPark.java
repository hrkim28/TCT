package com.lgcns.exercise.plmtct;

import java.util.ArrayList;
import java.util.Collections;

/**
 *  
[문제]
	동기모임을 하고 뒷풀이로 평소 자주가는 막걸리집을 찾았다.
	이곳은 특이하게 막걸리를 시키면 주전자의 용량은 같은데 안에 들어 있는 막걸리 양은 랜덤이다.
	즉, 한 번 주문에 막걸리 용량이 802ml 이기도 1002ml가 나오기도 한다.
	나는 막걸리 N 주전자를 주문하고, 자신을 포함한 친구들 K명에게 막걸리를 똑같은 양으로 나눠주려고 한다.
	
	그런데 나와 친구들은 다른 주전자의 막걸리가 섞이는 것이 싫어서,
	배분 후 주전자에 막걸리가 조금 남아 있더라도 그냥 막걸리를 버리기로 한다.
	즉, 한 번 주문한 막걸리에 남은 것을 모아서 친구들에게 다시 주는 경우는 없다.
	
	예를 들어 5명이 3 주전자를 주문하여 1002, 802, 705 ml의 막걸리가 각 주전자에 담겨져 나왔고,
	이것을 401ml로 동등하게 나눴을 경우 각각 주전자에서 200ml, 0m, 304ml 만큼은 버린다.)
	이럴 때 K명에게 최대한의 많은 양의 막걸리를 분배할 수 있는 용량 ml는 무엇인지 출력해주세요.
	
	[입력]
	첫째 줄에는 내가 주문한 막걸리 주전자의 개수 N, 그리고 나를 포함한 친구들 K명이 입력된다.
	N은 10000이하의 정수이고, K는 1,000,000이하의 정수이다. 막걸리 용량은 231 -1 보다 작거나 같은 자연수이다.
	단, 항상 N ≤ K 이다. 즉, 주전자의 개수가 사람 수보다 많을 수는 없다
	
	[출력]
	첫째 줄에 K명에게 나눠줄 수 있는 최대의 막걸리 용량 ml 를 출력한다.
	
	예제 입력 1
	2 3
	702
	429
	
	예제 출력 1
	351
	
	예제 입력 2
	4 11
	427
	541
	774
	822
	
	예제 출력 2
	205

 */
public class TCT_20190313_ahryunPark {
	
	
	public static void main(String[] args) {
		
		TCT_20190313_ahryunPark tct = new TCT_20190313_ahryunPark();
		
		int[] NK1 = {2,3};
		int[] inputList1 = {702, 429};
		
		int[] NK2 = {4,11};
		int[] inputList2 = {427, 541, 774, 822};
		
		System.out.println(tct.getResult(NK1, inputList1));
		System.out.println(tct.getResult(NK2, inputList2));
	}

	private int getResult(int[] NK, int[] inputList) {
		
		int result = 0;
		int N = NK[0];
		int K = NK[1];
		
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		for(int inx = 0 ; inx < inputList.length; inx++) {
			tempList.add(inputList[inx]);
		}
		
		Collections.sort(tempList);
		
		int max = tempList.get(N-1);
		int temp = 0;
		int mid = 0;
		
		while(temp < max) {
			mid = (max+temp)/2;
			int cnt = 0;
			for(int inx = 0; inx < inputList.length; inx++) {
				cnt += inputList[inx]/mid;
			}
			if(cnt < K) {
				max = mid;
			}else {
				temp = mid+1;
			}
		}
		
		result = mid-1;
	    return mid;
	}
	
	
}
