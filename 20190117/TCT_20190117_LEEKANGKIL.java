
import java.util.Scanner;

public class   TCT_20190117_LEEKANGKIL{

	public static void main(String args[])  {
		
		System.out.print("입력 : " );
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		if(! (n%3 == 0 && n>=3 && n<=3000) ) { System.out.println("입력오류"); return; }
		
		int resultCnt =0;
		
		for(int i=3; i<n; i=i+3){
			for(int j=3; j<n; j=j+3){
				for(int k=3; k<n; k=k+3){
					if((i+j+k) == n ){
						System.out.println(i + "+" +j+"+" + k);
						resultCnt++;
					}
				}
			}
		}
		System.out.println("출력 : " + resultCnt);
				
		
	}

}