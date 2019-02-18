public class TCT_20190218_HyeryoungKim {
	
	private static int zeroCnt = 0;
	private static int oneCnt = 0;
	
    public static void main(String[] args) {
    	fibonacci(0, true);
    	System.out.println(zeroCnt + " " + oneCnt);
    	fibonacci(1, true);
    	System.out.println(zeroCnt + " " + oneCnt);
    	fibonacci(3, true);
    	System.out.println(zeroCnt + " " + oneCnt);
    }

    private static int fibonacci(int n, boolean isFirst) {
    	if ( isFirst ) {
    		zeroCnt = 0;
    		oneCnt = 0;
    		isFirst = false;
    	}
    	
    	if ( n == 0 ) {
    		zeroCnt++;
    		return 0;
    	} else if ( n == 1 ) {
    		oneCnt++;
    		return 1;
    	} else {
    		return fibonacci(n-1, false) + fibonacci(n-2, false);
    	}
    }
}