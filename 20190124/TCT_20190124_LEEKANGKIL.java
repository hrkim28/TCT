
import java.util.ArrayList;
import java.util.Scanner;

public class   TCT_20190124_LEEKANGKIL{

	public static void main(String args[])  {
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		TCT_20190124_LEEKANGKIL lkk = new TCT_20190124_LEEKANGKIL();
		
		if(!(n%2==0&&n>=4&&n<=10000)) {System.out.println("입력 오류"); return;} 
		
		
		for(int i=2; i<n; i++){
			
			if(i%2 !=0 && lkk.checkPrimeNum(i)) primeList	.add(i);
		}
		
		
		int minInterval = n;
		int minIntervalFirtNum = -1;
		
		for(int i=0; i<(primeList.size()+1)/2;i++){
			int firstNum = primeList.get(i);
			int secondNum =  n - primeList.get(i);
			int interval = secondNum - firstNum;
			
			if(primeList.contains(secondNum)) {
				if(minInterval > interval) {
					minInterval = interval;
					minIntervalFirtNum = firstNum;
				}
				
			}
		}
		
		System.out.println( minIntervalFirtNum + " " + (n-minIntervalFirtNum));
		
	}
	
	public boolean checkPrimeNum( int num){
		for(int i=2;i<num;i++){
			if(num%i==0 && num!=i ) return false;
		}
		return true;
	}

}