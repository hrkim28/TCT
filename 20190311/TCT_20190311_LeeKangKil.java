import java.util.Stack;
public class   TCT_20190311_LeeKangKil{

	public static void main(String args[])  {
	        
		TCT_20190311_LeeKangKil tct = new TCT_20190311_LeeKangKil();
        
	    System.out.println(tct.validateBrace ("{[()]}[{}]"));
	    System.out.println(tct.validateBrace ("{()[][{}]{({})}}"));
	    System.out.println(tct.validateBrace ("{[()]}[{}["));
	    System.out.println(tct.validateBrace ("{[()]}[{)]"));
	    System.out.println(tct.validateBrace ("{[(]}[{}]"));
	    System.out.println(tct.validateBrace ("{[(]}[{}"));
	    System.out.println(tct.validateBrace ("{(["));
	    System.out.println(tct.validateBrace ("}])]"));
	    
	    }
	
	public boolean validateBrace(String str){
		 Stack stack = new Stack();
		 
		 for(int i=0;i<str.length();i++) {
	            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') 
	            	stack.push(str.charAt(i));
	            
	            else if(str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']' ) {

	            	if(stack.isEmpty()) return false;
	            	char pop = (char) stack.pop();
           	
	                if (   (str.charAt(i) == ')' && pop !='(' )	 || (str.charAt(i) == '}' && pop !='{' )  || (str.charAt(i) == ']' && pop !='[')){
	                	return false;
	                }
	            }
		 }
		 return (stack.size() == 0) ? true : false;
	}
}
