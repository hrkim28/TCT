public class TCT_20190218_SoSoonOne {

	static int[] arr = new int [2];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(fibonacci(3));
		for(int i = 0 ; i < 2; i ++){
			System.out.println( i + " " + arr[i]);
		}
		
	}
	
	private static int fibonacci ( int n ){
		
		int count = 0;
		
		if( n == 0 ){
			// System.out.println("0");
			arr[0]++;
			return 0;
		} else if( n == 1 ){
			// System.out.println("1");
			arr[1]++;
			return 1;
		} else{
			return fibonacci(n-1) + fibonacci(n-2);
		}

	}
}
