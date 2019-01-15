package test1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;




public class test {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String args[]) throws IOException {
        run();
        bw.flush();
        br.close();
        bw.close();
    }
    
    
    static int N;
    static int result = 1;
    static int a1 = 0;
    static int a2 = 1; 
    
    public static void run() throws IOException {
    	System.out.println("예제 입력");
        StringTokenizer st = new StringTokenizer(br.readLine()," ");    
        N = Integer.parseInt(st.nextToken());
        System.out.println("예제 출력");
     if(N==0){
    	 System.out.println("0");
     }else if(N==1) {
    	 System.out.println("0,1,1");
     }else {
    	 System.out.print("0,1");
    	 
    	 while(N >= result) {
        	 System.out.print(",");	 
             System.out.print(result);
             a1 = a2;
        	 a2 = result;
             result = a1 + a2;
    	
    	 
         }
       	 
     }
    	 
      }
}
