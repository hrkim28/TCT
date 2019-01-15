
/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : TCT_20190114_WonYoungMi.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 2019. 1. 14.  youngmi.won   Initial
 * ===========================================
 */

/**
 * <pre>
 * Class : TCT_20190114
 * Description : TODO
 * </pre>
 * 
 * @author youngmi.won
 */
public class TCT_20190115_WonYoungMi {
    public static void main(String[] args){
        int inputNum = 500000;
        System.out.println( getFibonacciNumStr(inputNum) );
    }
    
    public static String getFibonacciNumStr( int inputNum ){
        StringBuffer sbReturn = new StringBuffer();
        int firstValue = 0;
        int secondValue = 1;
        int sumValue = 0;

        sbReturn.append( firstValue );
        while( secondValue <= inputNum ){
            sbReturn.append( "," );
            sbReturn.append( secondValue );
            sumValue = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = sumValue;
        }
        
        return sbReturn.toString();
    }
}
