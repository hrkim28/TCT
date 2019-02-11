import java.util.HashMap;


/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : TCT_20190211_WonYoungMi.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 2019. 2. 11.  youngmi.won   Initial
 * ===========================================
 */

/**
 * <pre>
 * Class : TCT_20190211_WonYoungMi
 * Description : TODO
 * </pre>
 * 
 * @author youngmi.won
 */
public class TCT_20190211_WonYoungMi {
    public static void main(String[] args){
        String[] input = {
                "BAPC",
                "AABA",
                "ABCABCBBAAACC"
        };
        
        checkValid(input);
    }
    
    private static void checkValid( String[] input ){
        for( int inx = 0; inx < input.length; inx++ ){
            System.out.println( isValid(input[inx]) ? "OK" : "FAKE" );
        }
    }
    
    private static boolean isValid( String targetStr ){
        boolean isValid = true;
        HashMap<Character,Integer> result = new HashMap<Character,Integer>();
        char digit = 0;
        
        for( int inx = 0; inx < targetStr.length(); inx++ ){
            digit = targetStr.charAt( inx );
            if( result.containsKey(digit) ){
                result.put( digit, result.get(digit) + 1 );
            }
            else{
                result.put( digit, 1 );
            }
            
            if( inx < targetStr.length() - 1 ){
                if( result.get(digit)%3 == 0 && targetStr.charAt(inx+1) != digit ){
                    isValid = false;
                    break;
                }
            }
            else{
                if( result.get(digit)%3 == 0 ){
                    isValid = false;
                    break;
                }
            }
        }
        
        return isValid;
    }
}
