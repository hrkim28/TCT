public class TCT_20190211_LeeJinKyoung {

	public static void main(String[] args) {
		checkString("BAPC");
		checkString("AABA");
		checkString("ABCABCBBAAACC");
	}

	private static void checkString(String str) {
		int aCh = (int)'A';
		String result = "OK";

		int[] az = new int[24];
		
		for(int inx = 0; inx < str.length(); inx++) {
		    az[(int)str.charAt(inx) - aCh]++;
		}

		for(int inx = 0; inx < 24; inx++) {

			if(az[inx]%3 == 0 && az[inx] > 2) {
				result = "FAKE";
				break;
			}
		}
		
		System.out.println(str);
		System.out.println(result);
	}
}