import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TCT_20190123_KimJinKwui {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N = ");
		int n = sc.nextInt();
		
		int[] input = new int[n];
		
		for ( int i = 0 ; i < input.length ; i++ ) {
			input[i] = sc.nextInt();
		}
		
		Map<Integer, Integer> inMap = new HashMap<Integer, Integer>();
		
		for (int p : input ) {
			if ( inMap.containsKey(p) ) {
				inMap.put(p, inMap.get(p) + 1);
			} else {
				inMap.put(p, 1);
			}
		}
		
		int xorResult = 0;
		Collection<Integer> keys = inMap.keySet();

		for ( int i : keys ) {
			 if ( inMap.get(i) % 2 != 0 ) {
				 xorResult ^= i;
			 }
		}
		
		System.out.println("===============================================");
		System.out.println("결과값 : " + xorResult);
		System.out.println("===============================================");

		sc.close();
	}
	
}