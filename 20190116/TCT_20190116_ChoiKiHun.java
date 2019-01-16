public class TCT_20190116 {
	
	public static void main(){

		int n = 4;
        System.out.println(getPirodo(n));
    }
    
    public static int getPirodo( int n ){
    	int[] worksArray = { 4, 3, 3 };
    	int result = 0;
        
        for(int i=0 ; i<n ; i++) {
        	int biggest = 0;
        	int arrayAddr = 0;
        	
        	for(int w=0 ; w<worksArray.length ; w++) {
        		int current = worksArray[0];
        		if(current >= biggest) {
        			biggest = current;
        			arrayAddr = w;
        		}
        		else
        			continue;
        	}
        	
        	if(worksArray[arrayAddr] > 0)
        		worksArray[arrayAddr] = worksArray[arrayAddr] - 1; 
        }
        
        for(int w=0 ; w<worksArray.length ; w++)
        	result += (worksArray[w] * worksArray[w]);
        
        
        return result;
    }
	
}
