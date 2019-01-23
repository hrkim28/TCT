import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : TCT_20190123_WonYoungMi.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 2019. 1. 23.  youngmi.won   Initial
 * ===========================================
 */

/**
 * <pre>
 * Class : TCT_20190123_WonYoungMi
 * Description : TODO
 * </pre>
 * 
 * @author youngmi.won
 */
public class TCT_20190123_WonYoungMi {
    public static void main(String[] args){
        xorResult( new int[]{2, 5, 3, 3} );
        xorResult( new int[]{4, 2, 5, 3, 3} );
    }
    
    private static void xorResult( int[] targetList ){
        HashMap<Integer,Integer> tempList = new HashMap<Integer, Integer>();
        for( int inx = 0; inx < targetList.length; inx++ ){
            if( tempList.containsKey( targetList[inx] ) ){
                tempList.put( targetList[inx], tempList.get(targetList[inx]) + 1 );
            }
            else{
                tempList.put( targetList[inx], 1 );
            }
        }
        Set<Integer> keySet = tempList.keySet();
        Iterator<Integer> iter = keySet.iterator();
        List<Integer> xorTarget = new ArrayList<Integer>();
        int key = 0;
        while( iter.hasNext() ){
            key = iter.next();
            if( tempList.get(key) % 2 > 0 ){
                xorTarget.add( key );
            }
        }

        int result = 0;
        if( xorTarget.size() > 0 ){
            for( int inx = 0; inx < xorTarget.size(); inx++ ){
                result = (inx == 0) ? xorTarget.get(inx) : result ^ xorTarget.get(inx);
            }
        }
        
        System.out.println( "## Result : " + result );
    }
}
