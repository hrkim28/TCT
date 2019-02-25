import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TCT_20190225_Kimsiwon {
	
	public static void main ( String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		
		int numCount = Integer.parseInt(sc.nextLine());
		
		String [] input = new String[numCount];
		int[][] value = new int[numCount][2];
		int[] check = new int[numCount];
		int sum = 0;
		
		input = sc.nextLine().split(" ");
		
		for (int idx = 0; idx < numCount; idx++) {
			value[idx][0] = Integer.parseInt(input[idx]);
			value[idx][1] = idx;
			check[idx] = 0;
		}		
		
		Arrays.sort(value, new Comparator<int[]>() {
			  @Override
			  public int compare(final int[] entry1, final int[] entry2) {
				  final int time1 = entry1[0];
				  final int time2 = entry2[0];
				  return Integer.compare(time2, time1);
			  }
});
		
		if (numCount > 2) {
			for (int idx = 0; idx < numCount; idx++) {
				if(value[idx][1] == 0) {
					if(check[numCount - 1] == 0 && check[value[idx][1]+1] == 0) {
						check[idx] = 1;
						sum = sum + value[idx][0];
					}
					
				}else if(value[idx][1] == numCount - 1 ) {
					if(check[value[idx][1] - 1] == 0 && check[0] == 0) {
						check[idx] = 1;
						sum = sum + value[idx][0];
					}
					
				}else {
					if(check[value[idx][1]-1] == 0 && check[value[idx][1]+1] == 0) {
						check[value[idx][1]] = 1;
						sum = sum + value[idx][0];
					}
				}
			}
		} else {
			sum = sum + value[0][0];
		}
		
		System.out.println("Sum is " + sum);
		
	}
	
}
