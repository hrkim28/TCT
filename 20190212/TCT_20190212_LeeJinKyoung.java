import java.util.HashSet;
import java.util.Set;

public class TCT_20190212_LeeJinKyoung {

	public static void main(String[] args) {
		genNumber(222);
		genNumber(5000);
	}

	private static void genNumber(int input) {
		int result = 0;
		
		String numStr = String.valueOf(input);

		Set<Integer> usedNums = new HashSet<Integer>();
		
		for(int inx = numStr.length()-1; inx >= 0 ;inx--) {
			int selNum = 0;
			for(int jnx = 9 ; jnx >= 0; jnx--) {
				
				int temp = result + jnx*(int)Math.pow(10, inx);
				if(!usedNums.contains(jnx) && temp <= input) {
					selNum = jnx;
					break;
				}
			}
			
			result = result + selNum*(int)Math.pow(10, inx);
			
			usedNums.add(selNum);
		}
		
		System.out.println(result);
	}	
}
