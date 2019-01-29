import java.util.Stack;

import org.springframework.beans.factory.annotation.Autowired;

public class TCT_20190129_LeeJinKyoung {

    public static void main(String[] args){
        TCT_20190129_LeeJinKyoung test = new TCT_20190129_LeeJinKyoung();
        
        test.calucator( "9+5-4+8" );
        test.calucator( "5+6*3-6/2+5" );
        test.calucator( "15+6*3-6/2+5" );
    }

    /**
     *
     * @param str
     */
    private void calucator(String input){
        Stack<String> num = new Stack<String>();

        String[] arNum = input.split("[+]|[*]|[-]|[/]");
        String[] arCalcVar = input.split("[0-9]+");
        
        for(int inx = arNum.length-1; inx >=0; inx-- ){
            num.push(arNum[inx]);
            
            if(!"".equals(arCalcVar[inx])){
                num.push(arCalcVar[inx]);
            }
        }
        
        print(num);
        while(!num.isEmpty()){
            String left = num.pop();
            String operlator = num.pop();
            String right = num.pop();
            String nextOperlator = "";
            String nextRight = "";
            
            int result = 0;
            if(num.isEmpty()){
                result = operation(left, right, operlator);
                num.push(String.valueOf(result));
                print(num);
                //System.out.println(num.toString().replaceAll("\\[", "").replaceAll("]", ""));
                break;
            } else {
                nextOperlator = num.pop();
                nextRight = num.pop();
            }

            if(operlator.equals("+") || operlator.equals("-")) {
                if(nextOperlator.equals("*") || nextOperlator.equals("/")){
                    result = operation(right, nextRight, nextOperlator);
                    num.push(String.valueOf(result));
                    num.push(operlator);
                    num.push(left);
                    
                    print(num);
                    //System.out.println(num.toString().replaceAll("\\[", "").replaceAll("]", ""));
                } else {
                    result = operation(left, right, operlator);
                    num.push(nextRight);
                    num.push(nextOperlator);
                    num.push(String.valueOf(result));
                    print(num);
                    //System.out.println(num.toString().replaceAll("\\[", "").replaceAll("]", ""));
                }
            } else if(operlator.equals("*") || operlator.equals("/"))  {
                result = operation(left, right, operlator);
                num.push(nextRight);
                num.push(nextOperlator);
                num.push(String.valueOf(result));
                
                print(num);
                //System.out.println(num.toString().replaceAll("\\[", "").replaceAll("]", ""));
            }
        }
    }
    
    private int operation(String left, String right, String operlator){
        int result = 0;
        if(operlator.equals("+")) {
            result =Integer.parseInt(left) + Integer.parseInt(right);
        } else if(operlator.equals("-")) {
            result = Integer.parseInt(left) - Integer.parseInt(right);
        } else if(operlator.equals("*")) {
            result = Integer.parseInt(left) * Integer.parseInt(right);
        } else if(operlator.equals("/")) {
            result = Integer.parseInt(left) / Integer.parseInt(right);
        }

        return result;
    }
 
    @Autowired(required = false)
    private void print(Stack<String> num){
        @SuppressWarnings("unchecked")
        Stack<String> printNum = (Stack<String>)num.clone();
        
        while(!printNum.isEmpty()){
            System.out.print(printNum.pop() + " ");
        }
        System.out.println("");
    }
    
}
