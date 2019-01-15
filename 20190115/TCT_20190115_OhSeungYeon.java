
public class TCT_20190115_OhSeungYeon {
    public static void main( String[] args ) {	   	
    	int x= 100;
    	int result =0;
    	
    	for(int i=0 ; i <= x && result <= x; i++) {
    		result = fib(i);
    		if(result <=x)
    			System.out.print( result +",");
    	} 
    }
    
    public static int fib(int x) {
    	
    	if(x==0)return 0;
    	if(x==1)return 1;
    	
    	return fib(x-1)+fib(x-2);
    }

}
