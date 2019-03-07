import java.util.Arrays;
import java.util.Scanner;

public class TCT_20190307_Kimsiwon {

	public static void main ( String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		
		String [] inputCond = sc.nextLine().split(" ");
		
		int numTree = Integer.parseInt(inputCond[0]);
		int lenNeed = Integer.parseInt(inputCond[1]);
		
		int sumLen = 0;
		
		double result = 0;
		
		String [] lenTree = new String[numTree];
		
		lenTree = sc.nextLine().split(" ");
		
		Arrays.sort(lenTree);
		
		
		for (int idx = 0; idx < lenTree.length; idx++) {
			
			sumLen = 0;
			
			for (int jdx = idx; jdx < lenTree.length; jdx++) {
				sumLen = sumLen + (Integer.parseInt(lenTree[jdx]) - Integer.parseInt(lenTree[idx]));
			}
			
			if (sumLen == lenNeed ) {
				result = Integer.parseInt(lenTree[idx]);
				break;
			} else if (sumLen < lenNeed) {
				for (int kdx = idx; kdx < lenTree.length; kdx++) {
					result = result + Integer.parseInt(lenTree[kdx]); 
				}
				
				result = (result - lenNeed) / (numTree - idx); 
				break;
			}
			
		}	
		
		System.out.println(result);
		
	}
	
}
