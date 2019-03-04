import java.util.HashSet;
import java.util.Scanner;

public class TCT_20190304_Kimsiwon {
	
public static void main ( String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		boolean check = false;
		int resultVal = 0;
		
		HashSet<String> sl  = new HashSet<String>();
		
		for (int idx = 0; idx < input.length(); idx++) {
			if(input.substring(idx, idx + 1).equals(input.substring(input.length() - 1, input.length()))){
				
				check = true;
				for (int jdx = idx; jdx < input.length(); jdx++) {
					if (!input.substring(jdx, jdx + 1).equals(input.substring(input.length() - 1 - jdx + idx, input.length() - jdx + idx))){
						check = false;
						break;
					}					
				}				
			}
			
			if (check) {
				resultVal = idx;
				break;
			}
			
		}
		
		for (int idx = 0; idx < resultVal; idx++) {
			sl.add(input.substring(idx, idx + 1));
		}
		
		System.out.println(sl.size() + " " + sl );
		
		
}

}
