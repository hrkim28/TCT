import java.util.Scanner;

public class TCT_20190130_Kimsiwon {
	
	static int [][] reward2018 = {{500,1}, {300,2}, {200, 3}, {50, 4}, {30, 5}, {10, 6}};
	static int [][] reward2019 = {{512,1}, {256,2}, {128, 4}, {64, 8}, {32, 16}};
	
	public static void main ( String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		
		int rowCount = Integer.parseInt(sc.nextLine());
		
		String [][] input = new String[rowCount][2];
		
		for (int idx = 0; idx < rowCount; idx++) {
			input[idx] = sc.nextLine().split(" ");
		}	
		
		for (int idx = 0; idx < rowCount; idx++) {
			System.out.println(10000*(cal2018(Integer.parseInt(input[idx][0])) + cal2019(Integer.parseInt(input[idx][1]))));
		}		
	}
	
	public static int cal2018(int input) {
		
		int sumWinner = 0;
		
		for (int idx = 0; idx < reward2018.length; idx++) {
			sumWinner = sumWinner + reward2018[idx][1];
			
			if (input <= sumWinner) {
				return reward2018[idx][0]; 
			}			
		}
		
		return 0;
	}
	
	public static int cal2019(int input) {
		
		int sumWinner = 0;
		
		for (int idx = 0; idx < reward2019.length; idx++) {
			sumWinner = sumWinner + reward2019[idx][1];
			
			if (input <= sumWinner) {
				return reward2019[idx][0]; 
			}			
		}
		
		return 0;
	}

}
