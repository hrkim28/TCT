package com.lgcns.lkk;

import java.io.BufferedReader;
import java.io.IOException;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class Test {

	public static void main (String arg[]) throws IOException  {

	}
	public  static void run(){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);

		System.out.println("Input Text : "  );
		StringBuffer result = new StringBuffer();
		
		
		int num=1;
		try{
			String strInput = in.readLine();
			char temp = strInput.charAt(0);
			//result.append(temp);
			
			
			for(int i=1; i<strInput.length();i++)
			{
				//System.out.println(strInput.charAt(i));
				
				if(  strInput.charAt(i) == temp ){
					num++;
					//System.out.println("aaaa");
					
							
				} else {
					if(num>1){
					result.append(temp);
					result.append(num);
					} else{
						result.append(temp);
					}
					num=1;
					
				}
				temp = strInput.charAt(i);
				
			}
			
			result.append(temp);
			if(num>1){
			result.append(num);
			}
			
			System.out.println(result);
			
			
		}catch(IOException e){
		}
		

	}	

	
	
	
	
	
	

}
