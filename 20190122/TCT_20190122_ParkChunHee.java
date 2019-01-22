package com.lgcns.m3.exercise13;


/*
[계단 오르기 게임]
계단 오르기 게임은 계단 아래 시작점부터 계단 꼭대기에 위치한 도착점까지 가는 게임이다.
각 계단마다 일정한 점수가 쓰여 있으며 그 계단을 밟으면 그 계단에 쓰여있는 점수를 얻게 된다.

계단 오르는 데에는 다음과 같은 규칙이 있다.

계단은 한 번에 한 계단씩 또는 두 계단씩 오를 수 있다.
즉, 한 계단을 밟으면서 이어서 다음 계단이나, 다음 다음 계단으로 오를 수 있다.
연속된 세 개의 계단을 모두 밟아서는 안된다. 단, 시작점은 계단에 포함되지 않는다.
마지막 도착 계단은 반드시 밟아야 한다.
[입력]
첫째줄에 계단의 개수가 주어진다.
둘째줄부터 한줄에 하나씩 제일 아래에 놓인 계단부터 순서대로 각 계단에 쓰여 있는 점수가 주어진다.
계단의 개수는 300이하의 자연수이고, 계단에 쓰여 있는 점수는 10,000이하의 자연수이다.

[출력]
첫째 줄에 계단 오르기 게임에서 얻을 수 있는 총 점수의 최대값을 출력한다.

[입력 예제]
6
10
20
15
25
10
20
[출력 예제]
75
 */
public class TCT_20190122_ParkChunHee {

    public static void main( String[] args ) {
    	
    	
    	int numberOfStep = 6;
    	int[] stepValue = {10,20,15,25,10,20};
    	
    	
        calculateStepPoint(numberOfStep,stepValue);
    }
    
    public static void calculateStepPoint(int numberOfStep, int[] stairsScore) {
    	
    	int serialStep = 0;
    	int jumpStep = 0;
    	int result = 0;

    	
    	for(int i = 2 ; i < numberOfStep ; i++){
    		serialStep = stairsScore[i-1] + stairsScore[i-2];
    		jumpStep = stairsScore[i] + stairsScore[i-1];
    		
    		System.out.println(i + " : " + serialStep + " -- " + jumpStep);
    		
    		if(serialStep > jumpStep){
    			result += serialStep - stairsScore[i-2];
    		}else{
    			result += jumpStep - stairsScore[i-1];
    		}
    		
    	}
    		
    		
    	System.out.println(result);
        
    }
    
    

}




