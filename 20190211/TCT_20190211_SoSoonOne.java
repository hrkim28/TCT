public class TCT_20190211_SoSoonOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int n = 13;
		String income[] = {"BAPC","AABA","ABCABCBBAAACC"};
		//int[] r={2,5,3,3};
		
		for(int i = 0 ; i < income.length ; i ++){
			System.out.println( checkWords ( income[i] ) ? "OK" : "FAKE" );
		}
		
	}
	
	private static boolean checkWords ( String income ){
		
		//String result[] =  new String[n];
		boolean result = true;
		int[] cArr = new int[26];
		String[] sArr = income.split("");
		
		for(int i = 0 ; i < sArr.length -1 ; i ++){
			if(!"".equals(sArr[i])){
				cArr[(int)sArr[i].charAt(0)-65] ++;
				if (sArr[i].equals(sArr[i+1])){
					if(!(cArr[(int)sArr[i].charAt(0)-65] >= 2)){
						return false;
					}
				}
			}
		}
		
		return result;
	}
	
	
}
