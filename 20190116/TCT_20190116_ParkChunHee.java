package com.lgcns.m3.exercise10;

/*
 * 만수르가 1시간 동안 작업량 1만큼을 처리할 수 있다고 할 때, 퇴근까지 남은 N 시간과 각 일에 대한 작업량 works에 대해 
 * 야근 피로도를 최소화한 값을 리턴하는 Code를 완성해주세요.
 * 
 */
public class TCT_20190116_ParkChunHee {

    public static void main( String[] args ) {
    	
    	int works[] = {4,3,3};
    	//int works[] = {2,1,2};
    	int remainHour = 4;
    	//int remainHour = 1;
    	
    	int overTimeIndex = reduceOverTime(remainHour,works);
    	
    	System.out.println(overTimeIndex);
    	
    	
    }
    
    public static int reduceOverTime(int remainHour, int[] works) {
    	int result = 0;
    	
    	int maxNum = 0;
    	int inx = 0;
    	//야근의 피로도는 제곱으로 증가 하므로 남은 업무의 시간 동안 야근의 편차를 줄여야 함
    	for(int i=0 ; i < remainHour; i++){
    		for(int j=0 ; j < works.length; j++){
    			if(works[j] >= maxNum){
    				maxNum = works[j];
    				inx = j;
    			}
    		}
    		works[inx] = works[inx]-1;
    		maxNum = 0;
    		
    	}
    	
    	for(int k=0; k < works.length; k++) {
    		result = result + (works[k]*works[k]);
        }
    	
        return result;
    }
    
    

}




