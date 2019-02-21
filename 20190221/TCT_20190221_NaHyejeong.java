package teamExcercise;

import java.util.ArrayList;
import java.util.Collections;

/*
 *  지하철 공사에서 지하철 운행중 차내에 타고있는 승객이 지불해야 하는 금액이 가장 큰 경우를 계산하는 프로그램을 의뢰 받았습니다.
	(단구간 고객은 1000원, 환승 고객은 200원으로 계산, 모든 고객은 하차후 승차함, 최대정원 100명)
	아래표는 각 역에서 승하차 하는 승객의 수를 표시한 표 입니다.
	
	풀이
	2번역에서 운행시작 기준으로 단구간 인원이 42명 환승 인원 2명이 승차해 있으므로 42400원이 가장 많은 금액으로 집계됨
	
	입력
	단구간하차 단구간 승차 환승하차 환승 승차 
	 0 32 0 3
	 3 13 1 0
	 28 25 1 5
	 39 0 6 0
	
	결과
	42400
 * 
 * */
public class TCT_20190221_NaHyejeong {

	public static int nonStopFee  = 1000;
	public static int transferFee = 200;
	
	public static void main(String[] args) {

		// 입력
		int[][] stationPassengers = { {0, 32, 0, 3}, {3 ,13, 1, 0}, {28, 25, 1, 5}, {39, 0, 6, 0} };
		
		// 출력
		System.out.println(getStationFeeSum(stationPassengers));
		
	}

	private static int getStationFeeSum(int[][] stationPassengers) {
		
		ArrayList<Integer> stationFees = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) {
			
			int nonStopCnt = 0;
			int transCnt = 0;
			for (int j = 0; j < i+1; j++) {
				nonStopCnt += stationPassengers[j][1] - stationPassengers[j][0]; 
				transCnt   += stationPassengers[j][3] - stationPassengers[j][2]; 
			}
			stationFees.add( nonStopCnt*nonStopFee + transCnt*transferFee);
		}
		
		Collections.sort(stationFees);
		return stationFees.get(stationFees.size()-1);
	}


}
