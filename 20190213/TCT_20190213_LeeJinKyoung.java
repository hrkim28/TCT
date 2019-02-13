public class TCT_20190213_LeeJinKyoung {

	public static void main(String[] args) {
		System.out.println(Math.min(makeNumberCount1(10,0),makeNumberCount2(10,0)));
		System.out.println(Math.min(makeNumberCount1(17,0),makeNumberCount2(17,0)));
		System.out.println(Math.min(makeNumberCount1(30,0),makeNumberCount2(30,0)));
	}

	private static int makeNumberCount1(int input, int n) {
        int result = 0;		
		if(input == 1) {
			result = n;
		} else {			
			if( input%3 == 0 ){
				result = makeNumberCount1(input/3,n + 1);
			} else if( input%2 == 0 ){
					result = makeNumberCount1(input-1,n + 1);
			} else {
				result = makeNumberCount1(input-1,n + 1);
			}
		}
		return result;
	}

	private static int makeNumberCount2(int input, int n) {
		int result = 0;
		if(input == 1) {
			result = n;
			//System.out.println(n);
		} else {			
			if( input%3 == 0 ){
				result = makeNumberCount2(input/3,n + 1);
			} else if( input%2 == 0 ){
				result = makeNumberCount2(input/2,n + 1);
			} else {
				result = makeNumberCount2(input-1,n + 1);
			}	
		}
		return result;
	}
}
