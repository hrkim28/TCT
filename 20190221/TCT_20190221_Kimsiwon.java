import java.util.Scanner;

public class TCT_20190221_Kimsiwon {
	
	public static void main ( String[] args ) {
		
		int maxFee = 0;
		int maxStation = 0;
		int currentOneway = 0;
		int currentTrans = 0;
		int currentFee = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int stationCount = Integer.parseInt(sc.nextLine());
		
		String [][] input = new String[stationCount][4];
		
		for (int idx = 0; idx < stationCount; idx++) {
			input[idx] = sc.nextLine().split(" ");
			
			currentOneway = currentOneway + Integer.parseInt(input[idx][1]) - Integer.parseInt(input[idx][0]);
			currentTrans = currentTrans + Integer.parseInt(input[idx][3]) - Integer.parseInt(input[idx][2]);
			currentFee = currentOneway * 1000 + currentTrans * 200;
			
			if (currentFee > maxFee) {
				maxFee = currentFee;
				maxStation = idx + 1;
			}
		}
		
		System.out.println("Max Fee: " + maxFee + "( " + maxStation + " Station)");
		
	}

}
