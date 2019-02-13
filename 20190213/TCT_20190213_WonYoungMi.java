
/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : TCT_20190213_WonYoungMi.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 2019. 2. 11.  youngmi.won   Initial
 * ===========================================
 */

/**
 * <pre>
 * Class : TCT_20190213_WonYoungMi
 * Description : TODO
 * </pre>
 * 
 * @author youngmi.won
 */
public class TCT_20190213_WonYoungMi {
    public static void main(String[] args){
        System.out.println( getMinCalCount(10) );
        System.out.println( getMinCalCount(30) );
    }
    
    private static int getMinCalCount( int input ){
        int calCount = 0;
        
        while( input > 1 ){
            if( canDivide(3, input) ){
                input = input / 3;
                calCount++;
            }
            else if( canDivide(2, input) ){
                input = input / 2;
                calCount++;
            }
            else{
                input--;
                calCount++;
            }
        }
        
        return calCount;
    }
    
    private static boolean canDivide( int base, int input ){
        if( input % 3 == 0 ){
            return true;
        }
        else{
            return false;
        }
    }
}
