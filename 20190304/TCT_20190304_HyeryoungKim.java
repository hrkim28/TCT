import java.util.ArrayList;
import java.util.List;

public class TCT_20190304_HyeryoungKim {
    private List<String> list = null;
    
    public static void main(String[] args) {
        TCT_20190304_HyeryoungKim tct = new TCT_20190304_HyeryoungKim();
        String input1 = "madam";
        System.out.println(tct.getAdditionalAlphabetForPalindrome(input1));
        
        String input2 = "lalavla";
        System.out.println(tct.getAdditionalAlphabetForPalindrome(input2));
        
        String input3 = "nurses run";
        System.out.println(tct.getAdditionalAlphabetForPalindrome(input3));
        
        String input4 = "level";
        System.out.println(tct.getAdditionalAlphabetForPalindrome(input4));
        
        String input5 = "abab";
        System.out.println(tct.getAdditionalAlphabetForPalindrome(input5));
    }
    
    private int getAdditionalAlphabetForPalindrome(String input) {
        list = new ArrayList<String>();
        String str = input.replaceAll("\\p{Z}", "");
        if ( !isPalindrome(str) ) {
            makePalindrome(str, str.length()-2);
        }
        
        return list.size();
    }
    
    private void makePalindrome(String str, int lastIndex) {
        String tmp = str;
        if ( !isPalindrome(str) ) {
            char c = tmp.charAt(lastIndex);
            tmp = tmp + String.valueOf(c);
            if ( !list.contains(String.valueOf(c)) ) {
                list.add(String.valueOf(c));
            }
            
            makePalindrome(tmp, lastIndex-1);
        }
    }
    
    private boolean isPalindrome(String input) {
        String strReverse = new StringBuilder(input).reverse().toString();
        if ( input.equals(strReverse) ) {
            return true;
        } else {
            return false;
        }
    }
}