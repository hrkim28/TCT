import java.util.Scanner;

public class TCT_20190214_LeeJinKyoung {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		int [][]input = new int[n+1][n+1];
		
		String[] line = new String[n];
				
	    line[0] = sc.nextLine();
		line[1] = sc.nextLine();
		line[2] = sc.nextLine();
		line[3] = sc.nextLine();
		
		String [] splitStr = new String[n];
		
		for(int inx = 0 ; inx < n ; inx++) {
			splitStr = line[inx].split("\\ ");
			for(int jnx = 0; jnx < n; jnx++) {
				input[inx][jnx] = Integer.parseInt(splitStr[jnx]);
				input[inx][n] = input[inx][n] + input[inx][jnx];
				input[n][jnx] = input[n][jnx] + input[inx][jnx];
			}
		}
		sc.close();
		
		checkParity(input, n);
	}

	private static void checkParity(int[][] input, int n) {		
		int x = -1;
		for(int inx = 0 ; inx < n + 1 ; inx++) {
			if(input[inx][n]%2 == 1 && x == -1) {
				x = inx;
			} else if(input[inx][n]%2 == 1 && x != -1){
				x = -9;
				break;
			}
		}
		
		int y = -1;
		for(int inx = 0 ; inx < n + 1 ; inx++) {
			if(input[n][inx]%2 == 1 && y == -1) {
				y = inx;
			} else if(input[n][inx]%2 == 1 && y != -1){
				y = -9;
				break;
			}
		}

		if(x == -1 && y == -1) {
			System.out.println("OK");
		} else if(x == -9 || y == -9) {
			System.out.println("Corrupt");
		} else if(x == -1){
			System.out.println("Corrupt");
		} else if(y == -1){
			System.out.println("Corrupt");
		} else {
			System.out.println("Change bit ("+(x+1)+","+(y+1)+")");
		}		
    }
}
