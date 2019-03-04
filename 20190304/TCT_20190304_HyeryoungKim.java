import java.util.ArrayList;
import java.util.List;

public class TCT_20190304_HyeryoungKim {
    private List<String> list = null;
    
    public static void main(String[] args) {
        TCT_20190304_HyeryoungKim tct = new TCT_20190304_HyeryoungKim();
        String input1 = "madam";
        System.out.println(tct.getAdditionalAlphabetForPailndrome(input1));
        
        String input2 = "lalavla";
        System.out.println(tct.getAdditionalAlphabetForPailndrome(input2));
        
        String input3 = "nurses run";
        System.out.println(tct.getAdditionalAlphabetForPailndrome(input3));
        
        String input4 = "level";
        System.out.println(tct.getAdditionalAlphabetForPailndrome(input4));
    }
    
    private int getAdditionalAlphabetForPailndrome(String input) {
        list = new ArrayList<String>();
        String str = input.replaceAll("\\p{Z}", "");
        if ( !isPailndrome(str) ) {
            makePailndrome(str, str.length()-1);
        }
        
        return list.size();
    }
    
    private void makePailndrome(String str, int lastIndex) {
        String tmp = str;
        if ( !isPailndrome(str) ) {
            char c = tmp.charAt(lastIndex);
            tmp = tmp + String.valueOf(c);
            if ( !list.contains(String.valueOf(c)) ) {
                list.add(String.valueOf(c));
            }
            
            makePailndrome(tmp, lastIndex-1);
        }
    }
    
    private boolean isPailndrome(String input) {
        String strReverse = new StringBuilder(input).reverse().toString();
        if ( input.equals(strReverse) ) {
            return true;
        } else {
            return false;
        }
    }
}