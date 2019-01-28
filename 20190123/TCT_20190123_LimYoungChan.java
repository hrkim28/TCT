
public class TCT_20190123_LimYoungChan {

	public static void main(String[] args) {
		
		int[] number = {2,5,3,3};
		
		int result = 0;
		
		for(int i = 0; i < number.length; i++) {
			result ^= number[i];
		}
		
		System.out.println("Result 1 : "+result);
		System.out.println("Result 2 : "+(2^5));
	}
}
