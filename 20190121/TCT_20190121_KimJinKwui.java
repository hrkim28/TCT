import java.util.Arrays;

public class TCT_20190121_KimJinKwui {
	static int n;
	static int[] arrN;
	static int[] arrP;
	
	public static void main(String[] args) {
		
		System.out.println("===============================================");
		testCase1();
		printScreen(getMinimum(n, arrN, arrP));
		System.out.println("===============================================");
		testCase2();
		printScreen(getMinimum(n, arrN, arrP));
		System.out.println("===============================================");
		testCase3();
		printScreen(getMinimum(n, arrN, arrP));
		System.out.println("===============================================");
		testCase4();
		printScreen(getMinimum(n, arrN, arrP));
		System.out.println("===============================================");
		
	}
	
	public static void printScreen(int[] out) {
		System.out.println("n : " + n);
		System.out.println("r : " + Arrays.toString(arrN));
		System.out.println("p : " + Arrays.toString(arrP));
		System.out.println("Output : " + Arrays.toString(out));
	}

	public static void testCase1() {
		n = 4;
		
		arrN = new int[4];
		arrN[0] = 4;
		arrN[1] = 6;
		arrN[2] = 2;
		arrN[3] = 4;
		
		arrP = new int[4];
		arrP[0] = 6;
		arrP[1] = 4;
		arrP[2] = 2;
		arrP[3] = 4;
	}
	
	public static void testCase2() {
		n = 4;
		
		arrN = new int[4];
		arrN[0] = 4;
		arrN[1] = 6;
		arrN[2] = 2;
		arrN[3] = 4;
		
		arrP = new int[4];
		arrP[0] = 7;
		arrP[1] = 4;
		arrP[2] = 2;
		arrP[3] = 4;
	}
	
	public static void testCase3() {
		n = 3;
		
		arrN = new int[3];
		arrN[0] = 4;
		arrN[1] = 5;
		arrN[2] = 6;
		
		arrP = new int[3];
		arrP[0] = 1;
		arrP[1] = 2;
		arrP[2] = 3;
	}
	
	public static void testCase4() {
		n = 3;
		
		arrN = new int[3];
		arrN[0] = 4;
		arrN[1] = 5;
		arrN[2] = 7;
		
		arrP = new int[3];
		arrP[0] = 7;
		arrP[1] = 4;
		arrP[2] = 10;
	}
	
	private static int[] getMinimum(int n2, int[] arrN2, int[] arrP2) {
		int rtnCount[] = new int[n2];
		int max = 0 ;
		int arrNum = 0;
		boolean isExistsOdd = false;
		
		for ( int i = 0 ; i < n2 ; i++ ) {
			if ( arrN2[i] < arrP2[i] ) {
				if ((arrP2[i] - arrN2[i] > max)) {
					max = arrP2[i] - arrN2[i];
					arrNum = i;
				}
			}
			if ( arrN2[i] % 2 != 0 ) {
				isExistsOdd = true;
			}
		}
		
		if ( max > 0 ) {
			
			double divCeilNum = Math.ceil((double)arrP2[arrNum] / (double)arrN2[arrNum]);
			double divRoundNum = Math.round((double)arrP2[arrNum] / (double)arrN2[arrNum]);
			double divFloorNum = Math.floor((double)arrP2[arrNum] / (double)arrN2[arrNum]);
			double remain = (double)arrP2[arrNum] % (double)arrN2[arrNum];
			
			if ( isExistsOdd ) {
				for ( int i = 0 ; i < rtnCount.length ; i++ ) {
					rtnCount[i] = (int) (( arrN2[i] * divCeilNum ) - arrP2[i]);
				}
			} else {
				if ( remain == 0)  {
					for ( int i = 0 ; i < rtnCount.length ; i++ ) {
						rtnCount[i] = (int) (( arrN2[i] * (divRoundNum) ) - arrP2[i]);
					}
				} else if (remain <= arrN2[arrNum] * 0.5) {
					for ( int i = 0 ; i < rtnCount.length ; i++ ) {
						rtnCount[i] = (int) (( arrN2[i] * (divFloorNum + 0.5) ) - arrP2[i]);
					}
				} else {
					for ( int i = 0 ; i < rtnCount.length ; i++ ) {
						rtnCount[i] = (int) (( arrN2[i] * (divRoundNum) ) - arrP2[i]);
					}
				}
			}
		} else {
			for ( int i = 0 ; i < n2 ; i++ ) {
				rtnCount[i] = arrN2[i] - arrP2[i]; 
			}
		}
		
		return rtnCount;
	}	

}