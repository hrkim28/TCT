import java.util.Stack;

public class TCT_20190311_LeeJinKyoung {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        String[] input = {"{[()]}[{}]","{[()]}[{}[","{[()]}[{)]","{[(]}[{}]","}])]"};
        String opens = "{[(";
        String closes = "}])";
        boolean result = true;        
        
        Stack<String> st = new Stack<String>();
        
        for(int inx = 0; inx < input.length; inx++){
            
            for(int jnx = 0; jnx < input[inx].length(); jnx++){
                int openIndex = opens.indexOf(input[inx].charAt(jnx));
                int closeIndex = closes.indexOf(input[inx].charAt(jnx));
                if(openIndex == -1){
                    if( st.isEmpty() || opens.charAt(closeIndex) != st.pop().charAt(0)){
                        result = false;
                        break;
                    }
                } else {
                    st.push(String.valueOf(input[inx].charAt(jnx)));
                }
            }
            
            if(result && st.isEmpty()){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
