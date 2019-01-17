package test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class TCT_NaTaeUng {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String args[]) throws IOException {
        run();
        bw.flush();
        br.close();
        bw.close();
    }
    
   
    public static void run() throws IOException {
    	System.out.print("입력 : ");
    	StringTokenizer st = new StringTokenizer(br.readLine()," ");    
    	
    	int   N = Integer.parseInt(st.nextToken());
    	int num = 0;
    	
    	num = N/3; // 쪼갤수있는 총 덩어리 개 수
       
    	if(num > 3) System.out.println("출력 : " + ((num-1) * (num-2)) / 2 ); // num이라는 수를 3등분 하는 경우의 수
    	else if(num ==3) System.out.println("출력 : 1");
    	else  	System.out.println("출력 : " + 0);
      }

}
