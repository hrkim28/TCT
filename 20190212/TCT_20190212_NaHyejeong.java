package teamExcercise;

import java.util.ArrayList;
import java.util.LinkedList;

public class TCT_20190212_NaHyejeong {

	public static void main(String[] args) {
	
		String inputNum = new String ("22222222");
		int result = 0;
		
		ArrayList<Integer> dupcheck = new ArrayList<>();
		int i = 0;
		int temp = Integer.parseInt(inputNum.substring(0, 1));
		
		while ( !dupcheck.contains(temp) ) {
			result += Math.pow(10, inputNum.length()-1-i) * temp;
			dupcheck.add(temp);
			i++;
			temp = Integer.parseInt(inputNum.substring(i, i+1));
		}
		
		int minNum = getSmallDiffMinNum( inputNum, result, temp, i, dupcheck );
		int maxNum =  getSmallDiffMaxNum( inputNum, result, temp, i, dupcheck );
		
		//결과 출력
		if( temp-1 < 0 ) {
			  result = minNum; 
		}else if ( temp+1 > 9) { 
			  result = maxNum;
		}else if ( (minNum- Integer.parseInt(inputNum)) < (Integer.parseInt(inputNum)-maxNum ) ) {
			  result = minNum;
		}else { 
		      result = maxNum; 
		}
				 
		System.out.println("result : " + result );
	}
	
	// 입력값보다 작은수중 최대값 구하기
	private static int getSmallDiffMaxNum(String inputNum, int result, int maxTemp, int i, ArrayList<Integer> dupcheck) {
		
		ArrayList<Integer> dupcheckCopy = new ArrayList<>();
		dupcheckCopy.addAll(dupcheck);
		int maxNum = result;
		
		maxTemp--;
		while ( dupcheckCopy.contains(maxTemp) ) {
			maxTemp--;
		}
		
		dupcheckCopy.add(maxTemp);
		maxNum += Math.pow(10, inputNum.length()-1-i) * maxTemp;
		i++;
		
		for (int j = 9; j > 0; j--) {
			if ( !dupcheckCopy.contains(j) ) {
				maxNum += Math.pow(10, inputNum.length()-1-i) * j;
				dupcheckCopy.add(j);
				i++;
			}
			if(i == inputNum.length()) break;
		}
		return maxNum;
	}

	// 입력값보다 큰수중 최소값 구하기
	private static int getSmallDiffMinNum(String inputNum, int result, int minTemp, int i, ArrayList<Integer> dupcheck) {
		
		ArrayList<Integer> dupcheckCopy = new ArrayList<>();
		dupcheckCopy.addAll(dupcheck);
		
		int minNum = result;
		minTemp++;
		while ( dupcheckCopy.contains(minTemp) ) {
			minTemp++;
		}
		dupcheckCopy.add(minTemp);
		
		minNum += Math.pow(10, inputNum.length()-1-i) * minTemp;
		i++;
		
		for (int j = 0; j < 9 ; j++) {
			if ( !dupcheckCopy.contains(j) ) {
				minNum += Math.pow(10, inputNum.length()-1-i) * j;
				dupcheckCopy.add(j);
				i++;
			}
			if(i == inputNum.length()) break;
		}
	
		return minNum;
	}

	
}
