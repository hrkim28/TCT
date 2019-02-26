import java.util.HashMap;


public class TCT_20190226_JaeseokLim {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		//Scanner sc = new Scanner(System.in);
		//int count = sc.nextInt();
		HashMap<String,Integer> phoneDigit = new HashMap<String,Integer>();
		
		initPhoneDigit(phoneDigit);
		
		
		int[][] inputDigit= {{2,3,4,5,6,7,8,9,1},{7,8,9,1,2,3,6,5,4},{9,8,7,6,5,4,3,2,1}};
		String[] inputAlpha  = {"klor","djevojka","skakavac"};
		
		for ( int i = 0 ; i < inputDigit.length;i++) {
			System.out.println(fnReturnDigit(inputDigit[i],inputAlpha[i],phoneDigit));
		}
		
    }
	
	private static String fnReturnDigit(int[] testInputList,String inputAlpha,HashMap<String,Integer> phoneDigit) {
		
		String returnDigit = "";
		
		for ( int i = 0 ; i < inputAlpha.length(); i++) {
			String chkDigit = inputAlpha.substring(i,i+1);
			int temp = phoneDigit.get(chkDigit);
			if ( returnDigit.length() > 0 ) {
				int validDigit = Integer.parseInt(returnDigit.substring(returnDigit.length()-1, returnDigit.length()));
				if ( validDigit == testInputList[temp/10-1]) {
					returnDigit += "#";
				}
			}
			for ( int j = 0 ; j < temp%10 ; j++ ) {
				returnDigit += testInputList[temp/10-1];
			}
			
		}
		

		return returnDigit;
	}
	
	
	private static void initPhoneDigit(HashMap<String,Integer> phoneDigit){
		//21 은 2가 1번 이라는뜻
		phoneDigit.put("a", 21);
		phoneDigit.put("b", 22);
		phoneDigit.put("c", 23);
		phoneDigit.put("d", 31);
		phoneDigit.put("e", 32);
		phoneDigit.put("f", 33);
		phoneDigit.put("g", 41);
		phoneDigit.put("h", 42);
		phoneDigit.put("i", 43);
		phoneDigit.put("j", 51);
		phoneDigit.put("k", 52);
		phoneDigit.put("l", 53);
		phoneDigit.put("m", 61);
		phoneDigit.put("n", 62);
		phoneDigit.put("o", 63);
		phoneDigit.put("p", 71);
		phoneDigit.put("q", 72);
		phoneDigit.put("r", 73);
		phoneDigit.put("s", 74);
		phoneDigit.put("t", 81);
		phoneDigit.put("u", 82);
		phoneDigit.put("v", 83);
		phoneDigit.put("w", 91);
		phoneDigit.put("x", 92);
		phoneDigit.put("y", 93);
		phoneDigit.put("z", 94);
	}
	
	

}
		