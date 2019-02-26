import java.util.Scanner;

public class TCT_20190226_Kimsiwon {
	
	static int [][] alpha = {{2,1}, {2,2}, {2,3}, {3,1}, {3,2}, {3,3}, {4,1}, {4,2}, {4,3}, {5,1}, {5,2}, {5,3}, {6,1}, {6,2}, {6,3}, {7,1}, {7,2}, {7,3}, {7,4}, {8,1}, {8,2}, {8,3}, {9,1}, {9,2}, {9,3}, {9,4}};
	
	
	public static void main ( String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		
		String [] inputNum = new String[9];
		int [] convertNum = new int[9];
		String inputString = "";
		String result = "";
		int charIndex = 0;
		int checkPrev = 0;
		
		inputNum = sc.nextLine().split(" ");
		
		for (int idx = 0; idx < 9; idx++) {
			convertNum[Integer.parseInt(inputNum[idx]) - 1] = idx + 1;
		}
		
		inputString = sc.nextLine();
				
		for (int idx = 0; idx < inputString.length(); idx++) {
			charIndex = inputString.charAt(idx) - 97;
			
			if(convertNum[alpha[charIndex][0] - 1] == checkPrev) {
				result = result + "#";
			}
			
			for (int jdx = 0; jdx < alpha[charIndex][1]; jdx++) {
				result = result + convertNum[alpha[charIndex][0] - 1];
			}	
			
			checkPrev = convertNum[alpha[charIndex][0] - 1];
		}		
		
		System.out.println(result);
		
	}

}
