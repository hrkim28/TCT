import java.io.InputStream;
import java.io.InputStreamReader;

public class KimHyeRyoung_20170123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputNum = 142857; // 10, 12, 18, 153, 142857..
		int num = inputNum;
		int sum = 0;
		int iljari = 0;
		while ( inputNum > 0 ) { // 142857, 14285, 1428, 142, 14, 1
			iljari = inputNum%10; // 7, 5, 8, 2, 4, 1
			sum += iljari; // 7 + 5 + 8 + 2 + 4 + 1
			inputNum = inputNum/10; // 14285, 1428, 142, 14, 1, 0
		}
		
		boolean isHarshad = false;
		if ( num%sum == 0 ) {
			isHarshad = true;
		} else {
			isHarshad = false;
		}
		
		System.out.println(isHarshad);
	}
}
