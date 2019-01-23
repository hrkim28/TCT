package test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


public class TCT_NaTaeUng {

	
	
    public static void main(String args[]) throws IOException {
        run();
    }
    
    public static void run() throws IOException {

    	int Answer;
    	
		Scanner sc = new Scanner(System.in);
		
			System.out.println("[입력 예제]");
			int N = sc.nextInt(); // 계단계수
			int K = 2; // 점프가능 수
			
			int[] score = new int[N+1];
			int d[][] = new int[N + 1][K + 1]; //[계단][점프가능수+1]
			int sum[] = new int[N + 1];
			
			for(int i = 1; i <= N; i++) {
				score[i] = sc.nextInt();//계단 점수 입력
			}
			// 초기화
			d[1][1] = score[1];
			sum[1] = 10;
	    	/*
	    	[입력 예제]
			6
			10
			20
			15
			25
			10
			20
			[출력 예제]
			75
	    	*/
			
			for (int n = 2; n <= N; n++) {
				// 점화식
				for (int k = 1; k <= K; k++) {
					if (n - k > 0) {
						if(n==2)
						{
							d[n][k] = (sum[n-k] +  score[n]); //동일 점프 2번안됨, 첫 시작은 예외
						}else {
							if(k==1) {
								d[n][k] = (sum[n-k] + score[n] - d[n - k][k]); //연속 3계단 밟으면 안됨 
							}
							else {
								d[n][k] = (sum[n-k] + score[n]); //
								//System.out.println("score[n] " + score[n]);
							}
						}
						//System.out.println("[d[n][k]] : " + n +" / "+ k +" / " + d[n][k]);
					}
					if (n == k) { //처음에 2칸이동시
						d[n][k] = score[k];
						//System.out.println("[d[n][k]] : " + n +" / "+ k +" / " + d[n][k]);
					}
				}

				// sum 계산
				int maxScore = 0;
				for (int k = 1; k <= K; k++) {
					if(maxScore < d[n][k]) 
					{
						maxScore = d[n][k];
					}					
				}
				sum[n] = (maxScore );
				//System.out.println("sum[n] : " + "/ " + n +" / "	+ sum[n]);
			}

			System.out.println("[출력 예제]");
			System.out.println(sum[N]);
  
      }

}
