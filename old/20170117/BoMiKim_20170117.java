package com.test02;

public class BoMiKim_20170117 {

	public static void main(String[] args) {
		 String input = "aaabbccccccca";
            String before = "";
            int count = 0 ; 
            String output = "";
            for(int i=0; i <= input.length(); i++){ 
                
                String temp = ""; 
                if( i == input.length()){
                    temp = before;
                }else{
                    temp = input.charAt(i)+"";
                }
                
                if("".equals( before ) || before.equals( temp )){
                    count++;
                    before = temp + "";
                    if( i == input.length()){
                        output += before + count;
                    }                    
                }else{
                    output += before + count;
                    before = temp + "";
                    count = 0 ; 
                }
            }            
            System.out.println(output)
	}

}
