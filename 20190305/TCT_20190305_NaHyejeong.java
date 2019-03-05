package teamExcercise;

import java.util.ArrayList;


public class TCT_20190305_NaHyejeong {

	public static int startInt  = 3;
	public static int endEnt    = 30;

	public static void main(String[] args) {
		for (int i = startInt ; i <= endEnt; i++) {
			System.out.println("진수 = "+ i);
			System.out.println(getResultNumerArray(i).toString());
		}
	}
	 
	private static ArrayList<Integer> getResultNumerArray(int systemNum) {
		
		int limitNum = 0; // 검증할 최대수 (4자리미만)  
		for (int i = 0; i < 3; i++) {
			limitNum += (int)Math.pow(systemNum, i )*(systemNum-1);
		}
		
		ArrayList<Integer> resultNumList = new ArrayList<>();
		int checkNum = 2;
		while(checkNum < systemNum) {
			if( checkNum (checkNum, systemNum, limitNum) ) {
				resultNumList.add(checkNum);
			};
			checkNum++;
		}
		
		return resultNumList;
	}

	// 진수별로 규칙에 만족하는 숫자 구하기
	private static boolean checkNum(int checkNum, int systemNum, int limitNum) {
		int div = limitNum/checkNum; 
		
		for (int i = 1; i <= div ; i++) {
			//1) 십진수가 checkNum의 배수
			int multiputNum = i*checkNum;
			
			//2) x진수의 자리수 합이 checkNum의 배수
			int [] changeNum = changeSystemNum( multiputNum, systemNum);
			if((changeNum[0] + changeNum[1]+ changeNum[2])% checkNum != 0) {
				return false;
			}
		}
		
		return true;
	}
    
	// 진수변환
    private static int[] changeSystemNum(int multiputNum, int systemNum) {
    	
    	int [] changeSet = new int[3];
    	changeSet[0] = multiputNum/(int)Math.pow(systemNum,0);
    	
    	for (int i = 2; i >= 0; i--) {
    		changeSet[i] =  multiputNum/(int)Math.pow(systemNum,i);
    		multiputNum = multiputNum%(int)Math.pow(systemNum,i);
		}
		
		return changeSet;
	}
 
}
