package teamExcercise;

import java.util.ArrayList;
import java.util.Collections;

public class TCT_20190227_NaHyejeong {

	public static void main(String[] args) {
		
		printBestSet(2,9);
		printBestSet(2,1);
		printBestSet(3,13);
		
	}

	private static void printBestSet(int cnt, int sum) {

		ArrayList<Integer> nums = new ArrayList<>();
		
		if( sum < cnt ) {
			nums.add(-1);
		}else{
			int avg = sum/cnt;
			for (int i = 0; i < cnt-1 ; i++) {
				nums.add(avg);
			}
			nums.add(sum - avg*(cnt-1));
		}
		
		Collections.sort(nums);
		
		//출력 
		System.out.println(nums.toString());
		
	}

}
