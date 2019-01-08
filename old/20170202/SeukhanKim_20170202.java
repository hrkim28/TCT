package com.lcptest;

import java.util.Random;
import java.io.*;
import java.util.*;

public class Test0202 {

	public static void main (String arg[]) throws Exception  {
		
		Random random = new Random();
		Vector vector = new Vector();
		for( int i = 1; i <= 9; i++ ) vector.addElement( new Integer( i ) );

		int ranNum[] = {0,0,0};
		int tmpIndex = 0;
		for( int i = 0; i < 3; i++ ) {
			tmpIndex = random.nextInt( vector.size() );
			ranNum[i] =  (Integer)vector.elementAt( tmpIndex );
			System.out.println( "ranNum["+i+"] : " + ranNum[i] );
			vector.remove( tmpIndex );
		}

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int strike = 0, ball = 0;
		
		while(strike!=3){
			strike = 0; ball = 0;
			System.out.println("Type 3 numbers! ex) 4 5 6 : ");
	
			int inNum[] = {0,0,0};
			try {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	
				int i = 0;
				while(st.hasMoreTokens()) {
					inNum[i] = Integer.parseInt(st.nextToken());
					System.out.println("inNum["+i+"] : " + inNum[i]);
				    i++;
				}
	
			} catch(IOException ie){};
	
			for(int i=0 ; i < inNum.length ; i++){
				for(int j=0 ; j < ranNum.length ; j++) {
					//System.out.println(inNum[i]+", "+ ranNum[j] +", "+ i+", "+j);
					if(inNum[i] == ranNum[j]) 
						if(i==j)strike++; else ball++;
				}
			}
			System.out.println("결과 : "+strike+" 스트라이크, "+ball+" 볼.");
		}
		System.out.println("----------------------------------------------");
	}
	

}
