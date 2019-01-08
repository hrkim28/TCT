package com.lgcns.lkk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class Test {

	public static void main (String arg[]) throws IOException  {
		run();
	}

	public  static void run(){
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader in1 = new BufferedReader(isr);

		try{

			System.out.print("Input n : " );
			String strInput1 = in1.readLine();
			System.out.print("Input m : " );
			String strInput2 = in1.readLine();
			System.out.print("Input maxcnt : " );
			String strInput3 = in1.readLine();
			
			int n = Integer.valueOf(strInput1).intValue();
			int m = Integer.valueOf(strInput2).intValue();
			int maxCnt = Integer.valueOf(strInput3).intValue();
			int k=-1;

			boolean flag = true;
			
			char arr[][] = new char[n][m];
			
			for(int i=0; i<n;i++)
			{
				for(int j=0; j<m; j++)
				{
					if(flag) k++;
					 else	k--;  
					
					arr[i][j] = (char) ('A'+k);
			
				if(k>maxCnt-2 && flag) {
					flag = false;						
				}
				
				if(k<=0) arr[i][j] ='A'; 
				}
			}
			// 가로
			for(int i=0; i<n;i++){
				for(int j=0;j<m;j++){
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
			// 세로
			System.out.println();
			
			for(int i=0; i<n;i++){//3
				int r = i; // 등차
				for(int j=0;j<m;j++){//4
					System.out.print(arr[r/m][r%m] );
					r=r+n; // 0, 3, 6, 9 
				}
				System.out.println();
			}
		} catch(IOException e){
     }
}	

}
