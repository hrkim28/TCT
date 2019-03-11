import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TCT_20190311_HyeryoungKim {
    
    private static String[] opens = {"{", "[", "("};
    private static String[] closes = {"}", "]", ")"};
    
    public static void main(String[] args) {
        TCT_20190311_HyeryoungKim tct = new TCT_20190311_HyeryoungKim();
        String[] inputStr = { "{[()]}[{}]" , "{[()]}[{}[", "{[()]}[{)]", "{[(]}[{}]" , "}])]", "{[(]})[{]}" };
        
        tct.checkValidation(inputStr);
    }
    
    private void checkValidation(String[] inputStr) {
        List<String> openList = Arrays.asList(opens);
        List<String> closeList = Arrays.asList(closes);
        
        for ( String str : inputStr ) {
            boolean isValid = true;
            Stack<Integer> idxSt = new Stack<Integer>();
            for ( int idx = 0 ; idx < str.length() ; idx++ ) {
                char c = str.charAt(idx);
                if ( idx == 0 && !openList.contains(String.valueOf(c)) ) {
                    isValid = false;
                } else if ( idx == str.length()-1 && !closeList.contains(String.valueOf(c)) ) {
                    isValid = false;
                } else {
                    if ( openList.contains(String.valueOf(c)) ) {
                        idxSt.push(openList.indexOf(String.valueOf(c)));
                    } else if ( closeList.contains(String.valueOf(c)) ) {
                        if ( !String.valueOf(c).equals(closes[idxSt.pop()]) ) {
                            isValid = false;
                        }
                    } else {
                        isValid = false;
                    }
                }
                
                if ( !isValid ) {
                    break;
                }
            }
            
            System.out.println(str + " : " + isValid);
        }
    }
}