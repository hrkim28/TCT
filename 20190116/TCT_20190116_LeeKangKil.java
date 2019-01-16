
import java.util.Scanner;

public class   TCT_20190116_LeeKangKil{

	public static void main(String args[])  {
		 int []works = {4,3,3};
		//int []works = {2,1,2};
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		
		int result = 0;
		
//		for(int i=0; i<works.length; i++){
//			System.out.print(works[i] + " ");
//		}
		
		
		
		for(int a=0; a<n; a++){
			int max = -1,  maxPos = 0;
			for(int i=0; i<works.length; i++){
				if( max < works[i]) {
					max = works[i];
					maxPos = i;
				}
			}
			
			works[maxPos]--;
		}

		for(int i=0; i<works.length; i++){
			result += (works[i] * works[i]);
//			System.out.print(works[i] + " ");
		}
		
		System.out.println(result);
		
	}

}