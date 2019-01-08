
public class dailyTest {
	public static void main( String[] args ) {
	    	
		
		
	    	int argsLen = args[0].length();
	    	int tempCount = 0;
	    	    	
	    	String tempString = args[0].substring(0,1);
	    	String splitString ="";
	    	String results = "";
	    	    	
	    	System.out.println("Input Data: " + args[0]);
	    	   	
	    	   	
	    	for (int i = 0; i < argsLen; i++)
	    	{
	    		splitString = args[0].substring(i,i+1);
	    		if (tempString.equals(splitString)){
	    			tempCount = tempCount + 1;
	    			
	    		}else{
	    			results = results.concat(tempString);
	    			if(tempCount > 1){
	    				results = results.concat(Integer.toString(tempCount));
	    			}
	    			tempCount = 1;
	    			tempString = splitString;
	    			
	    		}
	    		
	    	}
	
	    	results = results.concat(tempString);
	    	if(tempCount > 1){
	    		results = results.concat(Integer.toString(tempCount));
	    	}
	        System.out.println("Result Data: " + results); 
	
	    }
}
