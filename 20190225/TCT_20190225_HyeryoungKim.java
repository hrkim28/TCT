import java.util.HashMap;
import java.util.Map;

public class TCT_20190225_HyeryoungKim {

	/*
	 * [입력예시] 
     * 예시1 = { 2000, 3000 } 
     * 예시2 = { 1000, 3000, 1000 } 
     * 예시3 = { 2000, 2000, 2000, 2000 } 
     * 예시4 = { 1000, 10000, 8000, 5000, 7000, 3000, 9000 }
	 * 
	 * [출력예시] 
     * 결과1 = 3000 
     * 결과2 = 3000 
     * 결과3 = 4000 ( = 2000 + 2000 ) 
     * 결과4 = 26000 ( =
	 * 10000 + 7000 + 9000 )
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190225_HyeryoungKim tct = new TCT_20190225_HyeryoungKim();

		int[] case1 = { 2000, 3000 };
		tct.getMaxMoney(case1);

		int[] case2 = { 1000, 3000, 1000 };
		tct.getMaxMoney(case2);

		int[] case3 = { 2000, 2000, 2000, 2000 };
		tct.getMaxMoney(case3);

		int[] case4 = { 1000, 10000, 8000, 5000, 7000, 3000, 9000 };
		tct.getMaxMoney(case4);
	}

	public void getMaxMoney(int[] input) {
		int tmp = 0;
		int max = 0;
		if (input.length <= 3) {
			for (int money : input) {
				tmp = money;
				if (max < tmp) {
					max = tmp;
				}
			}
		} else {
			max = getMaxSelectMoney(input);
		}

		System.out.println(max);
	}

	public Map<String, Integer> getMinSelectMoney(int[] input) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		int tmp = 0;
		int max = 0;
		int maxIndex = 0;
		for (int idx = 0; idx < input.length - 1; idx++) {
			tmp = input[idx];
			if (max < tmp) {
				max = tmp;
				maxIndex = idx;
			}
		}

		map.put("max", max);
		map.put("maxIndex", maxIndex);
		return map;
	}

	public int getMaxSelectMoney(int[] input) {
		int fSum = getSumForOrder(input, true);
		int sSum = getSumForOrder(input, false);

		int result = (fSum > sSum) ? fSum : sSum;
		return result;
	}

	public int getSumForOrder(int[] input, boolean isFirst) {
		int tmp = 0;
		int sum = 0;
		
		if (isFirst) {
			for (int idx = 2; idx < input.length - 1; idx++) {
				tmp = input[0];
				if ( idx + 2 != input.length ) {
					tmp += input[idx];
					for (int jdx = idx + 2; jdx < input.length; jdx++) {
						if (sum < tmp + input[jdx]) {
							sum = tmp + input[jdx];
						}
					}
				} else {
					if (sum < tmp + input[idx]) {
						sum = tmp + input[idx];
					}
				}
			}
		} else {
			for (int idx = 2; idx < input.length; idx++) {
				tmp = input[1];
				if ( idx + 2 != input.length ) {
					tmp += input[idx];
					for (int jdx = idx + 2; jdx < input.length - 1; jdx++) {
						if (sum < tmp + input[jdx]) {
							sum = tmp + input[jdx];
						}
					}
				} else {
					if (sum < tmp + input[idx]) {
						sum = tmp + input[idx];
					}
				}
			}
		}

		return sum;
	}
}
