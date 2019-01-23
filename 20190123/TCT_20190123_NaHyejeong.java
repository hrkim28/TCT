package teamExcercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TCT_20190123_NaHyejeong {
	

	public static void main(String[] args) {
		int [] inputNum = { 2, 5, 3, 3};
		ArrayList<Integer> xorNumStr = findXORNum(inputNum);
		int result = calXor(xorNumStr);
		System.out.println(result);

	} 

	// XOR연산
	private static int calXor(ArrayList<Integer> xorNumStr) {
		int result = 0;
		for (Integer integer : xorNumStr) {
			result = result^integer;
		}
		return result;
	}
	
	//'홀수' 번만 나타나는 숫자를 찾아서 리턴
	private static ArrayList<Integer> findXORNum(int[] inputNum) {
		
		ArrayList<Integer> xorNumStr = new ArrayList<Integer>();
		String inputNumstr = "" ;
		
		for (int i = 0; i < inputNum.length; i++) {
			inputNumstr += inputNum[i];
		}
		
		for (int i = 0; i < inputNum.length; i++) {
			String str = inputNumstr;
			String find = String.valueOf(inputNum[i]);
			
			int cnt = 0;
			while ( str.indexOf(find) > -1 ) {
				cnt++;
				str = str.substring(str.indexOf(find)+1);
			}
			
			if( cnt%2 == 1 ) {
				if( xorNumStr.indexOf(find) < 0) {
					xorNumStr.add(Integer.parseInt(find));
				}
			}
		}
		
		return  xorNumStr;
		
	}

}
