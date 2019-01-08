package com.test02;

public class LCP_20170117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test1 = "apple";
		String test2 = "caaacccaazbbbaacd";
		
		String a[] = test2.split("");
		int check = 1;
		String result = "";
		
		System.out.println(test2);
		
		for(int i = 0; i< test2.length() ; i++){
			
			if(i != test2.length()-1 && (a[i].equals(a[i+1]))){
				++check;
			}
			
			else {
				if (check != 1){
					result = result + a[i] + check ;
					check = 1;
				}
				else{
					result = result + a[i] ;
					check = 1;
				}
			}
			
		}
		
		System.out.println(result);

	}

}
