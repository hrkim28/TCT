package com.LCP_20170117;

public class Youngmiwon_20170117 {
    
    public static void main(String[] args) {
        
        String input = "aaabbcccccca";
        String arr[] = input.split("");
        String result = "";
        int sameCount = 0;
        
        System.out.println("Input : " + input);
        
        for( int inx = 0; inx < arr.length ; inx++){
            if( inx < arr.length -1 && arr[inx].equals( arr[inx + 1] ) ){
                ++sameCount;
            }
            else{
                if( sameCount == 0 ){
                    result += arr[inx];
                }
                else{
                    result += arr[inx] + (sameCount + 1);
                    sameCount = 0;
                }
            }
        }
        
        System.out.println("Result : " + result);
        
    }
    
}
