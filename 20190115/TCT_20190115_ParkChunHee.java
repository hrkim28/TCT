package com.lgcns.m3.exercise9;

/*
 * 피보나치 수열
 * 
 */
public class TCT_20190115_ParkChunHee {

    public static void main( String[] args ) {
    	
    	int a = 100;
    	
    	StringBuffer s = new StringBuffer();
    	for(int i = 0 ; i <= a ; i++){
    		if(fibonacci(i) > a){
    			break;
    		}else{
    			s.append(fibonacci(i)+",");
    		}
    	}
    	System.out.println(a + " : " + s);
    }
    
    public static long fibonacci(int b) {
        
    	if (b <= 1) {
    		return b;	
        }else {
        	return fibonacci(b-1) + fibonacci(b-2);
        }
    	
    }

}




