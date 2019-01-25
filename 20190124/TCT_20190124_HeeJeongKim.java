package com.tctstudy;

import java.util.ArrayList;

public class TCT_20190124_HeeJeongKim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input_n = 16;
		
		ArrayList<Integer> primeNum = new ArrayList<Integer> ();
		primeNum.add(2);
		
		for (int i=2; i<input_n; i++) {
			for (int j=0; j<primeNum.size(); j++) {
				
				if (i%primeNum.get(j)==0) break;				
			    if (j==primeNum.size()-1)  {
			    	primeNum.add(i);
			    }
				
			}
		}
		
		int min_value = -1;
		int resultNum[] = new int[2];
		
		for (int idx_i=0; idx_i<primeNum.size(); idx_i++) {
			
			for (int idx_j=0; idx_j<primeNum.size(); idx_j++) {
			
			       if (primeNum.get(idx_i)+primeNum.get(idx_j)==input_n) {
			    	   if (min_value==-1 || Math.abs(primeNum.get(idx_i)-primeNum.get(idx_j)) < min_value) {
				    	   resultNum[0] = primeNum.get(idx_i);
				    	   resultNum[1] = primeNum.get(idx_j);
				    	   min_value = Math.abs(primeNum.get(idx_i)-primeNum.get(idx_j));
				    	   break;
			    	   }
			       }
			}
		}
		
		System.out.println(resultNum[0]+"  "+resultNum[1]);
	}
	
}
