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
		/*
		1부터 10,000까지 7이라는 숫자가 총 몇번 나오는가?
		7이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 7이라는 숫자를 모두 카운팅 해야 한다.
		(※ 예를들어 7707은 3, 7777은 4로 카운팅 해야 함)
		 */
		
		
		int sum =0; 
		for (int i=0; i<10000;i++){
			String temp  = String.valueOf(i);
			for(int j=0; j<temp.length();j++){
				if(temp.charAt(j)=='7' ) sum ++;
				
			}
		}
		System.out.println(sum);
		
		
		
		
	}

}
