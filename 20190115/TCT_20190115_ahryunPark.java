package com.lgcns.exercise.plmtct;

import java.util.ArrayList;

public class TCT_20190115_ahryunPark{
	
	public static void main(String[] args) {
		int input = 100;
		
		ArrayList<Integer> result = new ArrayList<>();
		
		result.add(0);
		result.add(1);
		
		if(input > 2) {
			
			for(int inx = 2 ; inx <input; inx++) {
				int sum = 0;
				sum = result.get(inx-2) + result.get(inx-1);
				if(sum < input ) {
					result.add(sum);
				}else {
					break;
				}
				
			}
			
		}else {
			System.out.println("Input값은 3이상이어야 합니다.");
		}
		
		
		//값 출력
		for(int i=0; i< result.size(); i++){
			if(i == 0 ) {
				System.out.print(result.get(i));
			}else {
				System.out.print( " , "+ result.get(i));
			}
			
		}

	}

	

}

