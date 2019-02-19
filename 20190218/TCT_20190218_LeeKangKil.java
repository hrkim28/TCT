import java.util.Scanner;

public class   TCT_20190218_LeeKangKil{
	static int cnt_0 =0, cnt_1 =0 ;
	
	public static void main(String args[])  {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int []input = new int[T];
		
		for(int i=0; i<input.length;i++)	input[i] = sc.nextInt();
		
		for(int i=0; i<input.length;i++){
			fibonacci(input[i]);
			System.out.println(cnt_0 + " " + cnt_1);
			cnt_0 =cnt_1 =0;
		}
	}
	
	public static int fibonacci(int n) {
		if (n == 0) {
			cnt_0++;
			return 0;
		} else if (n == 1) {
			cnt_1++;
			return 1;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
}
