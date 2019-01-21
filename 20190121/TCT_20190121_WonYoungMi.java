
/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : TCT_20190121_WonYoungMi.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 2019. 1. 21.  youngmi.won   Initial
 * ===========================================
 */

/**
 * <pre>
 * Class : TCT_20190121_WonYoungMi
 * Description : TODO
 * </pre>
 * 
 * @author youngmi.won
 */
public class TCT_20190121_WonYoungMi {
    public static void main(String[] args){
        printInfo( getAmountToAdd(4, new int[]{4, 6, 2, 4}, new int[]{6, 4, 2, 4}) );
        printInfo( getAmountToAdd(4, new int[]{4, 6, 2, 4}, new int[]{7, 4, 2, 4}) );
        printInfo( getAmountToAdd(3, new int[]{4, 5, 6}, new int[]{1, 2, 3}) );

    }
    
    private static void printInfo( double[] result ){
        StringBuffer sbResult = new StringBuffer();
        for( int inx = 0; inx < result.length; inx++ ){
            if( sbResult.toString() != null && sbResult.toString() != "" ){
                sbResult.append( " " );
            }
            sbResult.append( Math.round(result[inx]) );
        }
        
        System.out.println( sbResult.toString() );
    }
    
    private static double[] getAmountToAdd( int materialCnt, int[] amountInfo, int[] currentInfo ){
        double[] result = new double[materialCnt];
        
        // 차이가 제일 큰 재료 구하기
        int maxGap = 0;
        int baseInx = -1;
        for( int inx = 0; inx < materialCnt; inx++ ){
            if( maxGap < currentInfo[inx] - amountInfo[inx] ){
                maxGap = currentInfo[inx] - amountInfo[inx];
                baseInx = inx;
            }
        }
        
        if( baseInx < 0 ){
            for( int inx = 0; inx < materialCnt; inx++ ){
                if( maxGap < Math.abs(currentInfo[inx] - amountInfo[inx]) ){
                    maxGap = Math.abs(currentInfo[inx] - amountInfo[inx]);
                    baseInx = inx;
                }
            }
            
            for( int jnx = 0; jnx < materialCnt; jnx++ ){
                result[jnx] = amountInfo[jnx] - currentInfo[jnx];
            }
        }
        else{
            double ratio = (double)currentInfo[baseInx] / (double)amountInfo[baseInx];
            if( maxGap % 2 > 0 ){
                ratio = (double)(currentInfo[baseInx]+1) / (double)amountInfo[baseInx];
            }
            for( int jnx = 0; jnx < materialCnt; jnx++ ){
                result[jnx] = (ratio * amountInfo[jnx]) - currentInfo[jnx];
            }
        }
        
        
        return result;
    }
}
