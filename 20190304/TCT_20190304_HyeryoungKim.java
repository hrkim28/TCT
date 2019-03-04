import java.util.ArrayList;
import java.util.List;

public class TCT_20190304_HyeryoungKim {
    private static List<String> list = new ArrayList<String>();
    
    public static void main(String[] args) {
        TCT_20190304_HyeryoungKim tct = new TCT_20190304_HyeryoungKim();
        String input1 = "madam";
        System.out.println(tct.getAdditionalAlphabetForPalindrome(input1) + " (=" + list.toString() + ")");
        
        String input2 = "lalavla";
        System.out.println(tct.getAdditionalAlphabetForPalindrome(input2) + " (=" + list.toString() + ")");
        
        String input3 = "nurses run";
        System.out.println(tct.getAdditionalAlphabetForPalindrome(input3) + " (=" + list.toString() + ")");
        
        String input4 = "level";
        System.out.println(tct.getAdditionalAlphabetForPalindrome(input4) + " (=" + list.toString() + ")");
        
        String input5 = "abab";
        System.out.println(tct.getAdditionalAlphabetForPalindrome(input5) + " (=" + list.toString() + ")");
        
        String input6 = "rotat";
        System.out.println(tct.getAdditionalAlphabetForPalindrome(input6) + " (=" + list.toString() + ")");
    }
    
    private int getAdditionalAlphabetForPalindrome(String input) {
        list.clear();
        String str = input.replaceAll("\\p{Z}", "");
        
        List<String> originList = new ArrayList<String>();
        for ( int idx = 0 ; idx < str.length() ; idx++ ) {
            if ( !originList.contains(str.substring(idx, idx+1)) ) {
                originList.add(str.substring(idx, idx+1));
            }
        }
        
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