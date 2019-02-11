package teamExcercise;

public class TCT_20190211_NaHyejeong {
	
	public static void main(String[] args) {
		
		String m = "AABA";
		
		char[] charArray = m.toCharArray();
		String result = "OK";
		
		for (char c : charArray) {
			if( CountChar( c , m )%3 ==0) {
				result = "FAKE"; 
				break;
			}
		}
		System.out.println(result);
	}

	private static int CountChar(char c, String m) {
		int cnt = 0;
		while(m.indexOf(c) >= 0) {
			cnt++;
			m = m.substring(m.indexOf(c)+1);
		}
		return cnt;
	}

	
}
