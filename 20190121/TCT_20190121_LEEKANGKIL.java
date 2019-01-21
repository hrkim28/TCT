public class   TCT_20190121_LEEKANGKIL{                                              
                                                                                     
	public static void main(String args[])  {                                          
//		int []r = {4,6,2,4};                                                           
//		int []p = {6,4,2,4};                                                           
		                                                                                 
		                                                                                 
		int []r = {4,6,2,4};                                                             
		int []p = {7,4,2,4};                                                             
                                                                                     
		                                                                                 
//		int []r = {4,5,6};                                                             
//		int []p = {1,2,3};                                                             
                                                                                     
		                                                                                                                   
		int n = r.length;                                                                                                  
		                                                                                                                   
		if( !(1<= n && n<=200) ){ System.out.println("n값 입력오류"); return; }                                            
		for(int i=0; i<p.length ;i++){                                                                                     
			if ( !(p[i] >=0 && p[i]<=1000)){System.out.println("p값 입력오류"); return; }                                    
			if ( !(r[i] >=1 && r[i]<=1000)){ 	System.out.println("r값 입력오류");return;	}                                  
		}                                                                                                                  
		                                                                                                                   
		float max_rate= 0, rate=0;;                                                                                        
		for(int i=0; i<n; i++){                                                                                            
			rate = ((float)p[i]/(float)r[i]);                                                                                
			if(rate > max_rate) max_rate = rate;                                                                             
		}                                                                                                                  
		                                                                                                                   
		System.out.println("n : " + n);                                                                                    
		System.out.print("r : ");                                                                                          
		                                                                                                                   
		for(int i=0; i<n; i++){                                                                                            
			System.out.print(r[i] + " ");                                                                                    
		}                                                                                                                  
		                                                                                                                   
		System.out.print("\np : ");                                                                                        
		for(int i=0; i<n; i++){                                                                                            
			System.out.print(p[i] + " ");                                                                                    
		}                                                                                                                  
		                                                                                                                   
		System.out.println("\n");                                                                                          
		                                                                                                                   
		boolean bCheck = false;                                                                                            
		for(int i=0; i<n; i++){                                                                                            
			if( (max_rate * r[i] - p[i])%1!=0) { bCheck=true; break; }                                                       
		}                                                                                                                  
		                                                                                                                   
		if(bCheck){                                                                                                        
			max_rate = (float) Math.ceil(max_rate) ;                                                                         
		}                                                                                                                  
		for(int i=0; i<n; i++){                                                                                            
			System.out.print((int)(max_rate * r[i] - p[i]) + " " );                                                          
		}                                                                                                                  
		                                                                                                                   
	}                                                                                                                    
                                                                                                                       
}                                                                                                                      
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  