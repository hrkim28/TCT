import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TCT_20190227_HyeryoungKim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 자연수 개수 n을 입력하세요.");
		int n = sc.nextInt();
		
		System.out.println("2. Sum값을 입력하세요.");
		int sum = sc.nextInt();
		
		TCT_20190227_HyeryoungKim tct = new TCT_20190227_HyeryoungKim();
		List<int[]> list = tct.getBestSet(n, sum);
		System.out.println(Arrays.toString(list.get(0)));
		
		sc.close();
	}
	
	private List<int[]> getBestSet(int n, int sum) {
		int[] set = null;
		
		if ( n > sum ) {
			set = new int[1];
			set[0] = -1;
		} else {
			set = new int[n];
			int idx = 0;
			while ( sum > 0 ) {
				set[idx] = sum/(n-idx);
				sum = sum - (sum/(n-idx));
				idx++;
			}
		}
		return Arrays.asList(set);
	}
}
