import java.util.HashMap;
import java.util.Map;

public class TCT_20190128_HyeryoungKim {

    public static void main(String[] args) {
        TCT_20190128_HyeryoungKim tct = new TCT_20190128_HyeryoungKim();

        String input1 = "I think I'm lost.";
        System.out.println("[Case1] " + input1 + " / [결과] " + tct.getMostUsedAlphabet(input1));

        String input2 = "I think I'm lost.I can't tell.";
        System.out.println("[Case2] " + input2 + " / [결과] " + tct.getMostUsedAlphabet(input2));

        String input3 = "I think I'm lost. I can't tell what's where.";
        System.out.println("[Case3] " + input3 + " / [결과] " + tct.getMostUsedAlphabet(input3));
        
        String input4 = "My youth is yours. Truth so loud, you can't ignore.";
        System.out.println("[Case4] " + input4 + " / [결과] " + tct.getMostUsedAlphabet(input4));
        
        String input5 = ".......,,,,,1222223^^^^^Test   ";
        System.out.println("[Case5] " + input5 + " / [결과] " + tct.getMostUsedAlphabet(input5));
    }
    
    public String getMostUsedAlphabet(String input) {
        String str = input.trim();
        str = str.replaceAll("\\p{Z}", "");
        str = str.toLowerCase();
        
        int maxCount = 0;
        Map<String, Integer> map = new HashMap<String, Integer>();
        for ( int idx = 0 ; idx < str.length() ; idx++ ) {
        	String alpha = str.substring(idx, idx+1);
        	if ( isOnlyAlphabet(alpha) ) {
        		if ( idx == 0 ) {
        			map.put(alpha, 1);
        		} else {
            		if ( map.containsKey(alpha) ) {
            			int cnt = map.get(alpha) + 1;
            			map.put(alpha, cnt);
            			if ( maxCount < cnt ) {
            				maxCount = cnt;
            			}
            		} else {
            			map.put(alpha, 1);
            		}
            	}
        	}
        }
        
        String result = "";
        for ( String key : map.keySet() ) {
            if ( map.get(key) == maxCount ) {
            	if ( !result.isEmpty() ) result = result + "," + key;
            	else result = key;
            }
        }
        
        result = result + " : " + maxCount;
        return result;
    }
    
    public boolean isOnlyAlphabet(String alpha) {
    	int num = (int)alpha.charAt(0);
    	if ( (num >= (int)'a' && num <= (int)'z') || (num >= (int)'A' && num <= (int)'Z') ) {
    		return true;
    	}
    	return false;
    }
}