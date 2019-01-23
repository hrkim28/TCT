package com.lgcns.m3.exercise14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
초등학교교 학생인 정우와 석환이는 최근 학교에서 두 이진수의 XOR 연산에 대해 배웠다.
둘은 매우 영특한 학생이라 새로 배운 연산을 갖고 이리저리 장난치기 시작했다.
다만 석환이는 정우에게 일을 시키는 것을 좋아하는지라 다음과 같은 제안을 했다.
“내가 N 개의 10진수를 주면, 등장하는 숫자들 중 홀수번만 나타나는 숫자들을 모두 XOR 한 결과를 구해줘.”

예를 들어 '2, 5, 3, 3' 이 주어질 경우, '2'와'5'는 1번(홀수 번) 나타나고 '3' 은 2번 (짝수 번) 나타나므로
홀수 번 나타난 '2' 와 '5'를 XOR 한 결과를 구해야 하고,
'2, 5, 3, 3, 2, 4, 5, 3' 이 주어질 경우 '2' 와 '5' 는 2번 나타나고, '3' 은 3번, '4' 는 1번 나타나므로
홀수 번 나타난 '3' 과 '4'를 XOR 한 결과를 구해야 한다.

정우는 제안을 수락했지만, 가면 갈수록 매번 XOR 연산을 수행하는 일에 지치고 있다.
정우를 도와서 주어 진 문제를 해결하는 프로그램을 작성시오.

입력
첫 번째 줄에는 석환이가 말한 숫자 N ( N은 3,000,000 이하의 자연수)이 주어진다.
다음 줄에는 N 개의 숫자들이 주어진다.
각 숫자는 32bit 정수형 변수에 담을 수 있는 음이 아닌 정수이다.

출력
주어진 숫자들 중에서 '홀수' 번만 나타나는 숫자들을 모두 XOR 한 결과를 출력한다.

입출력 예제
예제 입력
1
4
2
5
3
3
예제 출력
7
 */
public class TCT_20190123_ParkChunHee {

    public static void main( String[] args ) {
    	
    	int[] input = {4,2,5,3,3};
    	
    	HashMap findMap = findValue(input);
    	calculateXor(findMap);
    	
    }
    
    public static HashMap findValue( int[] input) {
    	
    	HashMap<Integer, Integer> tmpMap = new HashMap<Integer, Integer>();
		
    	for(int i=0 ; i < input.length ; i++){
    		if(tmpMap.containsKey(input[i])){
    			tmpMap.put(input[i], tmpMap.get(input[i])+1);
    		}else{
    			tmpMap.put(input[i], 1);
    		}
    	}
    	
		return tmpMap;
        
    }
    public static void calculateXor(HashMap findMap){
    	
    	Set<Integer> keySet = findMap.keySet();
    	Set keyset = findMap.keySet();
    	Iterator iter = keyset.iterator();
    	
    	int result = 0 ;
    	while(iter.hasNext()){
    		int key = (int)iter.next();
    		if((int)findMap.get(key)%2 == 1){
    			result ^= key;
    		}
    		
    	}
    	
    	
    	System.out.println("result : " + result);
    	
    	
    }
    
    

}




