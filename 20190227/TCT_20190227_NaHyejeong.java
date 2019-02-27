package teamExcercise;

import java.util.ArrayList;
import java.util.Collections;

public class TCT_20190227_NaHyejeong {

	public static void main(String[] args) {
		
		printBestSet(2,9);
		printBestSet(2,1);
		printBestSet(3,13);
		printBestSet(4,150);
		printBestSet(5,777);
		
	}

	private static void printBestSet(int cnt, int sum) {

		ArrayList<Integer> nums = new ArrayList<>();
		
		if( sum < cnt ) {
			nums.add(-1);
		}else{
			int avg = sum/cnt;
			int rest = sum%cnt;
			
			for (int i = 0; i < rest; i++) {
				nums.add(avg+1);
			}
			for (int i = rest; i < cnt ; i++) {
				nums.add(avg);
			}
		}
		
		//출력 
		Collections.sort(nums);
		System.out.println(nums.toString());
		
	}

}
