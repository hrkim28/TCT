import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : TCT_20190131_WonYoungMi.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 2019. 1. 31.  youngmi.won   Initial
 * ===========================================
 */

/**
 * <pre>
 * Class : TCT_20190131_WonYoungMi
 * Description : TODO
 * </pre>
 * 
 * @author youngmi.won
 */
public class TCT_20190131_WonYoungMi {
    public static void main(String[] args){
        String[] input = {
                "but",
                "i",
                "wont",
                "hesitate",
                "no",
                "more",
                "no",
                "more",
                "it",
                "cannot",
                "wait",
                "im",
                "yours"
        };
        
        printOrder( input );
    }
    
    private static void printOrder( String[] input ){
        List<String> result = new ArrayList<String>();
        
        // 중복제거
        for( int inx = 0; inx < input.length; inx++ ){
            if( !result.contains(input[inx]) ){
                result.add( input[inx] );
            }
        }
        
        // 오름차순 정렬
        Collections.sort( result );
        Collections.reverse( result );
        
        // 짧은 순으로 출력
        int minLength = getMinLength( result );
        while( result.size() > 0 ){
            for( int inx = result.size() - 1; inx >= 0; inx-- ){
                if( minLength == result.get(inx).length() ){
                    System.out.println( result.get(inx) );
                    result.remove(inx);
                }
            }
            minLength = getMinLength( result );
        }
    }
    
    private static int getMinLength( List<String> input ){
        int minLength = 0;
        
        for( int inx = 0; inx < input.size(); inx++ ){
            if( minLength == 0 || minLength > input.get(inx).length() ){
                minLength = input.get(inx).length();
            }
        }
        
        return minLength;
    }
}
