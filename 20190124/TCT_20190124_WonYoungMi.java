import java.util.ArrayList;
import java.util.List;


/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : TCT_20190124_WonYoungMi.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 2019. 1. 23.  youngmi.won   Initial
 * ===========================================
 */

/**
 * <pre>
 * Class : TCT_20190124_WonYoungMi
 * Description : TODO
 * </pre>
 * 
 * @author youngmi.won
 */
public class TCT_20190124_WonYoungMi {
    public static void main(String[] args){
        generate( 6 );
        generate( 10 );
        generate( 16 );
        generate( 88 );
    }
    
    private static void generate( int targetNum ){
        List<Integer> primeNumList = new ArrayList<Integer>();
        for( int inx = 1; inx < targetNum; inx++ ){
            if( isPrimeNumber(inx) ){
                primeNumList.add( inx );
            }
        }
        
        int[] resultNum = new int[]{ 0, 0 };
        if( primeNumList.size() > 0 ){
            for( int inx = 0; inx < primeNumList.size(); inx++ ){
                for( int jnx = inx+1; jnx < primeNumList.size(); jnx++ ){
                    if( primeNumList.get(inx) + primeNumList.get(jnx) == targetNum ){
                        if( resultNum[0] == 0 ){
                            resultNum[0] = primeNumList.get(inx);
                            resultNum[1] = primeNumList.get(jnx);
                        }
                        else if( Math.abs(primeNumList.get(inx) - primeNumList.get(jnx)) < Math.abs(resultNum[0] - resultNum[1]) ){
                            resultNum[0] = primeNumList.get(inx);
                            resultNum[1] = primeNumList.get(jnx);
                        }
                    }
                }
            }
        }
        
        System.out.println( resultNum[0] + " " + resultNum[1] );
    }
    
    private static boolean isPrimeNumber( int num ){
        boolean isPrimeNumber = true;
        for( int inx = 2; inx < num; inx++ ){
            if( num % inx == 0 ){
                isPrimeNumber = false;
                break;
            }
        }
        
        return isPrimeNumber;
    }
}
