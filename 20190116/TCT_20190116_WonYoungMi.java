
/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : TCT_20190116_WonYoungMi.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 2019. 1. 16.  youngmi.won   Initial
 * ===========================================
 */

/**
 * <pre>
 * Class : TCT_20190116_WonYoungMi
 * Description : TODO
 * </pre>
 * 
 * @author youngmi.won
 */
public class TCT_20190116_WonYoungMi {
    public static void main(String[] args){
        int[] works = { 2, 1, 2 };
        int hours = 1;
        int result = 0;
        int tempResult = 0;
        
        int remainHours = hours;
        int[] tempWorks = works.clone();
        while( remainHours > 0 ){
            for( int inx = 0; inx < tempWorks.length; inx++ ){
                if( remainHours > 0 ){
                    tempWorks[inx] = tempWorks[inx] - 1;
                    remainHours--;
                }
            }
        }
        result = getResult( tempWorks );
        
        remainHours = hours;
        tempWorks = works.clone();
        while( remainHours > 0 ){
            for( int inx = tempWorks.length - 1; inx >= 0; inx-- ){
                if( remainHours > 0 ){
                    tempWorks[inx] = tempWorks[inx] - 1;
                    remainHours--;
                }
            }
        }
        tempResult = getResult( tempWorks );
        if( result > tempResult ){
            result = tempResult;
        }
        
        System.out.print( result );
    }
    
    private static int getResult( int[] tempWorks ){
        int result = 0;
        
        if( tempWorks != null ){
            for( int inx = 0; inx < tempWorks.length; inx++ ){
                if( tempWorks[inx] < 0 ){
                    result = 0;
                    break;
                }
                else{
                    result += tempWorks[inx] * tempWorks[inx];
                }
            }
        }
        
        return result;
    }
}
