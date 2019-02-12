import java.util.HashSet;
import java.util.Set;

public class TCT_20190212_LeeJinKyoung {

	public static void main(String[] args) {
		genNumber(222);
		genNumber(5000);
		genNumber(100);
	}

	private static void genNumber(int input) {
		int case1 =  case1(input);		
		int case2 =  case2(input);
		
		if(Integer.compareUnsigned( Math.abs(input-case1), Math.abs(input-case2)) < 0 ){
			System.out.println(case1);
		} else {
			System.out.println(case2);
		}
	}

	private static int case1(int input) {
		String numStr = String.valueOf(input);
		int result = 0;
		Set<Integer> usedNums = new HashSet<Integer>();
		
		for(int inx = numStr.length()-1; inx >= 0 ;inx--) {
			int selNum = -1;
			int lowNum = -1;
			
			for(int jnx = 9 ; jnx >= 0; jnx--) {				
				int temp = result + jnx*(int)Math.pow(10, inx);
				if(!usedNums.contains(jnx) && temp <= input) {
					selNum = jnx;
					break;
				}
				
				if(!usedNums.contains(jnx)) {
					lowNum = jnx;
				}
			}

			if(selNum != -1) {
				result = result + selNum*(int)Math.pow(10, inx);
				usedNums.add(selNum);
			} else {
				result = result + lowNum*(int)Math.pow(10, inx);
				usedNums.add(lowNum);
			}

			
		}
		return result;
	}
	
	private static int case2(int input) {
		String numStr = String.valueOf(input);
		int result = 0;
		Set<Integer> usedNums = new HashSet<Integer>();
		for(int inx = numStr.length()-1; inx >= 0 ;inx--) {
			int selNum = -1;
			
			if(inx == numStr.length()-1) {
				selNum = input/(int)Math.pow(10, inx) -1;
			}
			else {
				for(int jnx = 9 ; jnx >= 0; jnx--) {
				
				int temp = result + jnx*(int)Math.pow(10, inx);
				if(!usedNums.contains(jnx) && temp <= input) {
					selNum = jnx;
					break;
				}
			}
			}
			result = result + selNum*(int)Math.pow(10, inx);
			
			usedNums.add(selNum);
		}
		return result;
	}
}