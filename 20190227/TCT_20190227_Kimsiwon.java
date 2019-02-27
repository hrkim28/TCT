import java.util.Scanner;

public class TCT_20190227_Kimsiwon {
	
	public static void main ( String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		
		String [] inputNum = new String[2];
		
		inputNum = sc.nextLine().split(" ");
		
		int num = Integer.parseInt(inputNum[0]);
		int sum = Integer.parseInt(inputNum[1]);
		
		int ave = 0;
		int last = 0;
		
		String array = "";		
		
		if (num > sum) {
			System.out.println("[-1]");
		} else {
			ave = (int)Math.round((sum + 0.01)/num);
			
			last = sum - ave * (num - 1);
			
			if (ave < last) {
				for (int idx = 0; idx < num - 1; idx++) {
					array = array + ave + ", ";
				}				
				array = "[" + array + last + "]";				
			} else {
				array = "[" + last;
				
				for (int idx = 0; idx < num - 1; idx++) {
					array = array + ", " + ave;
				}
				
				array = array + "]";				
			}
			
			System.out.println(array);			
			
		}		
		
	}
	
}
