import java.util.ArrayList;
import java.util.Scanner;

public class TCT_20190124_KimJinKwui {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력");
		int inputN = sc.nextInt();
		
		String output;
		
		ArrayList<int[]> sosuList = new ArrayList<int[]>();
		
		if ( inputN >= 4 && inputN <= 10000 ) {
			
			int[] arrInt;
			int[] outInt = new int[2];
			
			for ( int i = 1 ; i < inputN ; i++ ) {
				arrInt = new int[2];
				
				arrInt[0] = i;
				arrInt[1] = inputN - i;
				
				if ( isSosu(arrInt[0]) && isSosu(arrInt[1]) ) {
					sosuList.add(arrInt);
				}
			}
			
			if ( sosuList.size() > 0 ) {
				int minimum = 0;
				
				for ( int i = 0 ; i < sosuList.size() ; i++ ) {
					arrInt = sosuList.get(i);
					if ( i == 0 ) {
						minimum = Math.abs(arrInt[0] - arrInt[1]);
						outInt = arrInt;
					} else {
						if ( minimum > Math.abs(arrInt[0] - arrInt[1]) ) {
							minimum = Math.abs(arrInt[0] - arrInt[1]);
							outInt = arrInt;
						}
					}
				}
			}
			
			output = outInt[0] + " " + outInt[1];
			printOutput(output);
		} else {
			output = "입력 범위 오류(4<=n<=10,000)";
			System.out.println(output);
		}
		
		sc.close();
	}
	
	private static void printOutput(String output) {
		System.out.println("출력");
		System.out.println(output);
	}
	
	private static boolean isSosu(int i ) {
		if ( i == 2 || i == 3 ) {
			return true;
		} else if ( i % 2 == 0 || i % 3 == 0 ) {
			return false;
		} else {
			return true;
		}
	}

}
