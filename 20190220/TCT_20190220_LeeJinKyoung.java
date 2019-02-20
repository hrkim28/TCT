
/**
 * ===========================================
 * System Name : LGE PLM Project
 * Program ID : TCT_20190220_LeeJinKyoung.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 2019. 2. 20.  70705   Initial
 * ===========================================
 */

/**
 * <pre>
 * Class : TCT_20190220_LeeJinKyoung
 * Description : TODO
 * </pre>
 * 
 * @author 70705
 */
public class TCT_20190220_LeeJinKyoung {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        int[] input = {10, -4, 3, 1, 5, 6, -35, 12, 21, -1};
        
        //int[] input = {10, -4, -3, 1, 5, 6, -35, 12, 1, -1};
        //int[] input = {10, -4, 3, 1, 5, 6, -35, 12, 21, -1};
        //int[] input = {100, -99, -101, 102, 103};
        int preResult = 0;
        int result = 0;
        
        for(int inx = 0 ; inx < input.length; inx++ ){            
            if( input[inx] > 0 ){
                result = result + input[inx];
            } else {
                int sumPost = 0;
                boolean check = false;
                for(int jnx = inx + 1 ; jnx < input.length; jnx++ ){
                    sumPost= sumPost + input[jnx]; 
                    if(input[inx] + sumPost > 0){
                        check = true;
                        break;
                    }
                }

                if( result + input[inx] > 0 && check){
                        result = result + input[inx];
                } else {
                    if(preResult < result ) {
                        preResult = result;
                }   
                    result = 0;
                }
            }
        }
        
        if(result == 0){
            System.out.println(preResult);
        } else {
            System.out.println(result);
        }
    }

}
