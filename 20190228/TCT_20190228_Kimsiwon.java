import java.util.Scanner;

public class TCT_20190228_Kimsiwon {
	
	public static void main ( String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		
		int memSize = Integer.parseInt(sc.nextLine());
		
		String [] memName = new String[memSize];
		
		String [] inputName = sc.nextLine().split(" ");
		
		int riskResult = 0;
		
		boolean checkMem = false; 
		
		for (int idx = 0; idx < inputName.length; idx++) {
			
			checkMem = false;
			
			for (int jdx = 0; jdx < memSize; jdx++) {
				if (memName[jdx] != null && inputName[idx].equals(memName[jdx])) {
					checkMem = true;
					break;
				}
			}
			
			if (checkMem) {
				riskResult = riskResult + 1;
			} else {
				riskResult = riskResult + 5;
			}
			
			
			for (int jdx = 0; jdx < memSize - 1; jdx++) {
				memName[jdx] = memName[jdx+1];
			} 
			
			memName[memSize-1] = inputName[idx];
			
		}
		
		System.out.println(riskResult);
		
		
	}
	
	
}
