import java.util.Scanner;

public class TCT_20190130_JaeseokLim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] firstPs = new int[6][2];
		int[][] secondPs = new int[5][2];
		
		initPS(firstPs,secondPs);
		
		Scanner sc = new Scanner(System.in);
		
		int loopCnt = sc.nextInt();
		
		int [][] dreaming = new int[loopCnt][2];
		for ( int idx = 0 ; idx< loopCnt ; idx++ ) {
			dreaming[idx][0] = sc.nextInt();
			dreaming[idx][1] = sc.nextInt();
		}
		
		for ( int i = 0 ; i < dreaming.length;i++) {
			calculateDreaming(firstPs,secondPs,dreaming[i][0],dreaming[i][1]);
		}
		
    }
	
	private static void initPS(int[][] firstPs,int[][] secondPs) {
		
		firstPs[0][0] = 1;
		firstPs[0][1] = 5000000;
		
		firstPs[1][0] = 2;
		firstPs[1][1] = 3000000;
		
		firstPs[2][0] = 3;
		firstPs[2][1] = 2000000;
		
		firstPs[3][0] = 4;
		firstPs[3][1] = 500000;
		
		firstPs[4][0] = 5;
		firstPs[4][1] = 300000;
		
		firstPs[5][0] = 6;
		firstPs[5][1] = 100000;
		

		secondPs[0][0] = 1;
		secondPs[0][1] = 5120000;
		
		secondPs[1][0] = 2;
		secondPs[1][1] = 2560000;
		
		secondPs[2][0] = 4;
		secondPs[2][1] = 1280000;
		
		secondPs[3][0] = 8;
		secondPs[3][1] = 640000;
		
		secondPs[4][0] = 16;
		secondPs[4][1] = 320000;
	}
	
	private static void calculateDreaming(int[][] firstPs, int[][] secondPS,int firstDream, int secondDream) {
		int prize = 0;
		
		for ( int i = 0 ; i < firstPs.length;i++) {
			firstDream -= firstPs[i][0];
			
			if ( firstDream <= 0 ) {
				prize += firstPs[i][1];
				break;
			}
		}
		

		for ( int i = 0 ; i < secondPS.length;i++) {
			secondDream -= secondPS[i][0];
			
			if ( secondDream <= 0 ) {
				prize += secondPS[i][1];
				break;
			}
		}
		
		System.out.println(prize);
		
		
		
	}

}
