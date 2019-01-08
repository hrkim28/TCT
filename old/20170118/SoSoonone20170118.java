package com.test02;

public class SoSoonone20170118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int code = 64;
		
		int n = 3, m= 4, count = 5, rcount = 0;
		String Result = "";
		
		if(n*m <= count){
			
			for(int j = 0 ; j < n ; j++){
				for(int k = 0 ; k<m ; k++){
					code++;
					Result = Result + " " + Character.toString((char)code);
				}
				System.out.println(Result);
				Result = "";
			}
			
			System.out.println("");
			
			for(int j = 0 ; j < n ; j++){
				code = 65+j;
				for(int k = 0 ; k<m ; k++){
					Result = Result + " " + Character.toString((char)code);
					code = code + n;
				}
				System.out.println(Result);
				Result = "";
			}
			
		}
		
		else{
			
			for(int j = 0 ; j < n ; j++){
				for(int k = 0 ; k<m ; k++){
					if(rcount < count){
						code++; rcount++; 
						Result = Result + " " + Character.toString((char)code);
					}
					else{
						code--;
						if(code<65) code =65;
						Result = Result + " " + Character.toString((char)code);
					}
				}
				System.out.println(Result);
				Result = "";
			}
			
			System.out.println("");
			
			for(int j = 0 ; j < n ; j++){
					code = 65+j;
					for(int k = 0 ; k<m ; k++){
 						rcount = j+1 + (k)*n;
						if(rcount <= count){
							Result = Result + " " + Character.toString((char)code);
							code = code + n; 
						}
						else{
							code = code - (count-1);
							if(code<65) code =65;
							Result = Result + " " + Character.toString((char)code);
						}
				}
					System.out.println(Result);
					Result = "";
			}
			
		}
		
	
	}

}
