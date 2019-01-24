package test1;

import java.io.IOException;
import java.util.Scanner;

public class TCT_NaTaeUng {

    public static void main(String args[]) throws IOException {
    	System.out.println("예제 입력");
		Scanner sc = new Scanner(System.in);

            int N;
            N = sc.nextInt();
            
            System.out.println("예제 출력");
            for(int i = N/2; i > 1 ; i--) {
            	if(ChkPrimeNum(i)) {
            		if(ChkPrimeNum(N-i)) {
            			System.out.print(i + " " + (N-i) );
                		break;
            		}
            	}
            }
		
        sc.close();
    }
    
    public static boolean ChkPrimeNum(int n) {
    	
    	 for(int i = 2; i <= n/2 ; i++) {
    		 if( n%i == 0) return false; 
    	 }
    	
    	return true;
    }
    
}
