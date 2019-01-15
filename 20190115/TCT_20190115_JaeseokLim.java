import java.util.HashMap;
import java.util.Scanner;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("예제 입력 : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("예제 출력 : "+ n);
		pivonacci(n);
	}
	
	private static void pivonacci(int n) {
		HashMap<Integer,Integer> piv = new HashMap<Integer,Integer>();
		//Init pivonacci
		piv.put(0, 0);
		piv.put(1, 1);
		
		for (int i = 0 ; i < piv.size(); i++ ) {
			System.out.print(piv.get(i));
			if ( piv.get(i+1) == null ) {
				piv.put(i+1, piv.get(i)+piv.get(i-1));
			}
			if ( piv.get(i+1) <= n) {
				System.out.print(",");
			} else {
				break;
			}
		}
		
		
		
		
	}

}
