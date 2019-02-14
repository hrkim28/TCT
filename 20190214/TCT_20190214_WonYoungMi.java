
/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : TCT_20190214_WonYoungMi.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 2019. 2. 13.  youngmi.won   Initial
 * ===========================================
 */

/**
 * <pre>
 * Class : TCT_20190214_WonYoungMi
 * Description : TODO
 * </pre>
 * 
 * @author youngmi.won
 */
public class TCT_20190214_WonYoungMi {
    public static void main(String[] args){
        int[][] input1 = new int[][]{
                {1,0,1,0},
                {0,0,0,0},
                {1,1,1,1},
                {0,1,0,1}
        };
        int[][] input2 = new int[][]{
                {1,0,1,0},
                {0,0,1,0},
                {1,1,1,1},
                {0,1,0,1}
        };
        int[][] input3 = new int[][]{
                {1,0,1,0},
                {0,1,1,0},
                {1,1,1,1},
                {0,1,0,1}
        };
        
        System.out.println( getResult(input1, true) );
        System.out.println( getResult(input2, true) );
        System.out.println( getResult(input3, true) );
    }
    
    private static String getResult( int[][] input, boolean isCallMain ){
        String resultStr = "OK";
        int sum = 0;
        
        for( int inx = 0; inx < input.length; inx++ ){
            sum = 0;
            for( int jnx = 0; jnx < input[inx].length; jnx++ ){
                sum += input[inx][jnx];
            }
            if( sum%2 > 0 ){
                resultStr = "Corrupt";
                break;
            }
        }

        for( int inx = 0; inx < input[0].length; inx++ ){
            sum = 0;
            for( int jnx = 0; jnx < input.length; jnx++ ){
                sum += input[jnx][inx];
            }
            if( sum%2 > 0 ){
                resultStr = "Corrupt";
                break;
            }
        }
        
        if( "Corrupt".equals(resultStr) ){
            if( isCallMain ){
                resultStr = getChangeResult( input );
            }
            else{
                resultStr = "";
            }
        }
        
        return resultStr;
    }
    
    private static String getChangeResult( int[][] input ){
        String resultStr = "";
        int orgValue = 0;
        
        for( int inx = 0; inx < input.length; inx++ ){
            for( int jnx = 0; jnx < input[inx].length; jnx++ ){
                orgValue = input[inx][jnx];
                input[inx][jnx] = (input[inx][jnx] == 0) ? 1 : 0;
                if( "OK".equals(getResult(input, false)) ){
                    resultStr = "Change bit (" + (inx+1) + "," + (jnx+1) + ")";
                    break;
                }
                else{
                    input[inx][jnx] = orgValue;
                }
            }
            if( !"".equals(resultStr) ){
                break;
            }
        }
        
        if( "".equals(resultStr) ){
            resultStr = "Corrupt";
        }
        
        return resultStr;
    }
}
