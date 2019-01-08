package LCP_Example;

public class KimHyeRyoung_20170124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cnt = 0;
		for ( int i = 1 ; i < 10000; i++ ) {
			String str = String.valueOf(i);
			for ( int j = 0 ; j < str.length() ; j++ ) {
				if ( str.charAt(j) == '7' ) {
					cnt++;
				}
			}
		}
		System.out.println("7ÀÇ °³¼ö : " +  cnt);
	}
}
