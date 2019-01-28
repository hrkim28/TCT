package com.lgcns.m3.exercise15;

import java.util.HashMap;
import java.util.Scanner;

/*
	[문제]
	1보다 큰 자연수 중에서 1과 자기 자신을 제외한 약수가 없는 자연수를 소수라고 한다.
	예를 들어, 5는 1과 5를 제외한 약수가 없기 때문에 소수이다.
	
	2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다.
	예를 들면, 4=2+2,6=3+3, 8=3+5 이다.
	
	2보다 큰 짝수 n에 두 소수로 출력하는 프로그램을 작성하여라.
	만약 그 가지수가 여러가지라면 두 소수의 차이가 가장 적은 것을 출력하여라
	
	예를 들면,
	6을 두 소수로 나누는 경우의 수는 두가지 이다.
	3,3과 5,1 이 두가지 경우 중 두 소수의 차이가 적은 3 3을 출력하면 된다.
	
	[입력]
	n (4<=n<=10,000)
	
	[출력]
	두 수를 공백으로 구분하여 출력
	
	[예제]
	입력
	16
	출력
	5 11
 */
public class TCT_20190124_ParkChunHee {

    public static void main( String[] args ) {
    	
    	Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        HashMap<Integer, Integer> targetMap = findPrimeNumber(num);
        
        calculateResult(targetMap, num);
       
    }
    
    // 주어진 4이상의 짝수에서 소수만 추출
    public static HashMap findPrimeNumber(int num){
    	
    	HashMap<Integer, Integer> tmpMap = new HashMap<Integer, Integer>();
    	int inx = 0;
    	
    	for(int i=1; i <= num ; i++){
    		int cnt = 0;
    		
    		for(int j=1 ; j <= i ; j++){
    			if(i%j == 0){
    				cnt++;
    			}
    		}
    		
    		if(cnt < 3){
    			
    			tmpMap.put(inx, i);
    			inx++;
    		}
    	}
    	
    	return tmpMap;
    }
    
    public static void calculateResult(HashMap targetMap, int num){
    	
    	int x = 0;
    	int tmp = 0;
    	int jnx = 0;
    	int result1 = 0;
    	int result2 = 0;
    	
    	for(int i=0 ; i < targetMap.size() ; i++){
    		for(int j=1 ; j < targetMap.size() ; j++){
        		if((int)targetMap.get(i) + (int)targetMap.get(j) == num){
        			x = (int)targetMap.get(i) - (int)targetMap.get(j);
        			if(x <= 0){		//loop 두번 돌려 두수의 차이 중 하나만 보면 되므로
        				x = x * -1;
        				if(jnx == 0){
        					tmp = x;
        					jnx++;
        				}else{
        					if(tmp > x){
        						tmp = x;
        						result1 = (int)targetMap.get(i);
        						result2 = (int)targetMap.get(j);
            				}
        				}
        			}
        		}
        	}
    	}
    	
    	System.out.println(result1 + "  " + result2);
    	
    }
    
    

}




