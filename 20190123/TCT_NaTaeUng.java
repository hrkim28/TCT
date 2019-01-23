package test1;

import java.io.IOException;
import java.util.Scanner;

public class TCT_NaTaeUng {

    public static void main(String args[]) throws IOException {
    	System.out.println("예제 입략");
		Scanner sc = new Scanner(System.in);

            int N;
            int result = 0;
            N = sc.nextInt();
            for(int i=0;i<N;i++){
                int num;
                num = sc.nextInt();
                result ^= num;
            }
        
		System.out.println("예제 출력");
        System.out.println(result);
		
        sc.close();
    }
    
}
