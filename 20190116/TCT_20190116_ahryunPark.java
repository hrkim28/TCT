package com.lgcns.exercise.plmtct;

import java.util.ArrayList;
import java.util.Collections;


/**
 * 문제
금수저 만수르 형님도 회사를 다니고 야근을 합니다. 야근을 하면 야근 피로도가 쌓입니다. 야근 피로도는 야근을 시작한 시점에서 남은 일의 작업량을 제곱하여 더한 값입니다. 
만수르는 N시간 동안 야근 피로도를 최소화하도록 일할 겁니다. 
만수르가 1시간 동안 작업량 1만큼을 처리할 수 있다고 할 때, 퇴근까지 남은 N 시간과 각 일에 대한 작업량 works에 대해 야근 피로도를 최소화한 값을 리턴하는 Code를 완성해주세요.

제한 사항
works는 길이 1 이상, 10 미만인 자연수로 구성된 배열입니다.
N은 12 이하인 자연수입니다.

입력
works, N

출력
works N 야근지수

입출력 예제
works	N	result
[4, 3, 3]	4	12
[2, 1, 2]	1	6
[1,1]	3	0

입출력 예제 설명
#1
n=4 일 때, 남은 일의 작업량이 [4, 3, 3] 이라면 야근 지수를 최소화하기 위해 4시간동안 일을 한 결과는 [2, 2, 2]입니다. 이 때 야근 지수는 2^2 + 2^2 + 2^2 = 12 입니다.

#2
n=1일 때, 남은 일의 작업량이 [2,1,2]라면 야근 지수를 최소화하기 위해 1시간동안 일을 한 결과는 [1,1,2]입니다. 야근지수는 1^2 + 1^2 + 2^2 = 6입니다.
 *
 */

public class TCT_20190116_ahryunPark{
	
	public static void main(String[] args) {
		
		
		//초기값 Setting
		int n = 4; //남은 시간
		
		//직압랭
		ArrayList<Integer> workList = new ArrayList<>();
		workList.add(4);
		workList.add(3);
		workList.add(3);
		Collections.sort(workList);
		
		int workSize = 3; 
		int tempWorkSize = workSize;
		
		if( (n>0) && (workList.size() > 0)){
			for(int inx = n ; inx > 0; inx--) {
				if(workList.get(tempWorkSize -1) != 0 ) {
					workList.set(tempWorkSize-1, workList.get(tempWorkSize-1)-1);
					
				}
				tempWorkSize--;
				if(tempWorkSize == 0) {
					tempWorkSize = workSize;
				}
			}
				
			
		
			//값 출력
			int resultSum = 0;
			for(int i=0; i< workList.size(); i++){
				if(workList.get(i) != 0) {
					double result = (double)workList.get(i);
					resultSum = resultSum + (int)Math.pow(result, result);
				}
				
			}
			
			System.out.println("야근지수는 " + resultSum + "입니다.");

		}
		
		
	}

	

}

