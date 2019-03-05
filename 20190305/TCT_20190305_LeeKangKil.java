package com.lgcns.lkk;
import java.util.Scanner;

public class   TCT_20190305_LeeKangKil{

	public static void main(String args[])  {
		Scanner sc =new Scanner(System.in);
		int base = sc.nextInt();
		for(int i=2; i<base ;i++) if(checkNum(base,i)) System.out.println(i);
	}
	
	public static boolean checkNum(int base, int num){

		for(int i=0;i<base;i++){
			for (int j=0; j<base;j++){
				for(int k=0; k<base;k++){
					int decimal = (int) (Math.pow(base,2)*i +base*j +k);   
					if(decimal % num ==0 ){
						if((i+j+k)%num !=0) return false; 
					} 
				}
			}
		}
		return true;
	}
}