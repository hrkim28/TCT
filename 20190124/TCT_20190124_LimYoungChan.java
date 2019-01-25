import java.util.Scanner;

public class TCT_20190124_LimYoungChan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input 4<=n<=10,000 Number : ");
		int inputNum = sc.nextInt();
		
		if(inputNum%2 !=0 || inputNum < 4 || inputNum > 10000) {
			System.out.print("Invalid Number!");
			System.exit(0);
		}
		
		int leftNum  = prevPrime(inputNum / 2);
		int rightNum = nextPrime(inputNum / 2, inputNum);
		int diff = -1;
		
		while(diff != 0 && leftNum > 0) {
			
			diff = (leftNum + rightNum) - inputNum;
			
			if(diff == 0) {
				System.out.println("Result ==> " + leftNum + "  "+ rightNum );
			} else if(diff > 0) {
				leftNum--;
				leftNum = prevPrime(leftNum);
		    } else { 
		    	rightNum++;
				rightNum = nextPrime(rightNum, inputNum);
		    }
		}
		
		sc.close();

	}
	

	static int prevPrime(int num) {
		
		for(int i = num; i > 0; i--) {
			if(isPrime(i)) return i;
		}
		
		return 0;
	}
	
	static int nextPrime(int num, int maxNum) {
		
		for(int i = num; i < maxNum; i++) {
			if(isPrime(i)) return i;
		}
		
		return 0;
	}
	
	static boolean isPrime(int num) {
		
		if(num <= 3) return true;
	
		for(int i = 2; i < num; i++) {
			if(num%i == 0) return false;
		}
		
		return true;
	}

	
	
}
