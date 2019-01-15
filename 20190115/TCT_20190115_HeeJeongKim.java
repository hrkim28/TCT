package com.lgcns.tcttest;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class TCT_20190115_HeeJeongKim {

	public static void FibSequencePrint(int in_value) {
		
		ArrayList<Integer> seqValueList = new ArrayList<>();
		seqValueList.add(0);
		seqValueList.add(1);
			    
		int sum = 0;
		for (int i=1; i<=in_value; i++) {
			
			sum = seqValueList.get(i-1)+seqValueList.get(i);
			if (sum<=in_value) seqValueList.add(sum);
			else break;
		}
		
		for (int i=0; i<seqValueList.size(); i++) System.out.print(seqValueList.get(i)+",");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input n Value-->n:");
	
		int in_value = sc.nextInt();
		
		FibSequencePrint(in_value);
	
	}

}
