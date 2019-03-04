import java.util.ArrayList;
import java.util.List;

public class TCT_20190304_HyeryoungKim {
    private static List<String> list = new ArrayList<String>();
    
    public static void main(String[] args) {
        TCT_20190304_HyeryoungKim tct = new TCT_20190304_HyeryoungKim();
        String[] strArr = {"madam", "lalavla", "nurses run", "level", "abab", "rotat"};
        for ( String input : strArr ) {
        	System.out.println(tct.getAdditionalAlphabetForPalindrome(input) + " (=" + list.toString() + ")");
        }
    }
    
    private int getAdditionalAlphabetForPalindrome(String input) {
        list.clear();
        String str = input.replaceAll("\\p{Z}", "");
        
        if ( !isPalindrome(str) ) {
            makePalindrome(str, str, 0);
        }
        
        return list.size();
    }
    
    private void makePalindrome(String str, String originStr, int index) {
        String tmp = str;
        if ( !isPalindrome(tmp) ) {
            char c = tmp.charAt(index);
            tmp = originStr + String.valueOf(c) + str.substring(str.length()-index, str.length());
            if ( !list.contains(String.valueOf(c)) ) {
                list.add(String.valueOf(c));
            }
            
            makePalindrome(tmp, originStr, index+1);
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