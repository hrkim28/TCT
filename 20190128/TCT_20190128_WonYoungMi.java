import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : TCT_20190128_WonYoungMi.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 2019. 1. 24.  youngmi.won   Initial
 * ===========================================
 */

/**
 * <pre>
 * Class : TCT_20190128_WonYoungMi
 * Description : TODO
 * </pre>
 * 
 * @author youngmi.won
 */
public class TCT_20190128_WonYoungMi {
    public static void main(String[] args){
        genMaxChar( "I think I'm lost." );
        genMaxChar( "I think I'm lost.I can't tell." );
        genMaxChar( "I think I'm lost. I can't tell what's where." );
    }
    
    private static void genMaxChar( String inputStr ){
        char[] arrChar = inputStr.toCharArray();
        HashMap<Character,Integer> charList = new HashMap<Character, Integer>();
        
        if( arrChar != null && arrChar.length > 0 ){
            int charNum = 0;
            char charInput = 0;
            for( int inx = 0; inx < arrChar.length; inx++ ){
                charNum = String.valueOf(arrChar[inx]).toLowerCase().charAt(0);
                charInput = String.valueOf(arrChar[inx]).toLowerCase().charAt(0);
                if( charNum >= 97  && charNum <= 122 ){
                    if( charList.containsKey( charInput ) ){
                        charList.put( charInput, charList.get(charInput) + 1 );
                    }
                    else{
                        charList.put( charInput, 1 );
                    }
                }
            }
        }

        List<Character> maxCharList = new ArrayList<Character>();
        int maxCount = 0;
        if( charList.size() > 0 ){
            Set<Character> keySet = charList.keySet();
            Iterator<Character> iter = keySet.iterator();
            char key = 0;
            while( iter.hasNext() ){
                key = iter.next();
                if( charList.get(key) >= maxCount ){
                    maxCount = charList.get(key);
                }
            }

            iter = keySet.iterator();
            key = 0;
            while( iter.hasNext() ){
                key = iter.next();
                if( charList.get(key) == maxCount ){
                    maxCharList.add( key );
                }
            }
            
        }
        
        Collections.sort( maxCharList ); // 내림차순 정렬
        
        String result = "";
        for( int inx = 0; inx < maxCharList.size(); inx++ ){
            if( result != "" ){
               result += ", "; 
            }
            result += String.valueOf( maxCharList.get(inx) );
        }
        
        System.out.println( "가장많이 쓰인 알파벳 : " + result + " = " + maxCount + "회" );
    }
}
