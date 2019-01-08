package helper;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Random;


/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : DomHelper.java
 * ===========================================
 * Modify Date    Modifier    Description
 * -------------------------------------------
 * 2015. 1. 17.  yongsik1.kim   Initial
 * ===========================================
 */

/**
 * <pre>
 * Class : DomHelper
 * Description : TODO
 * </pre>
 *
 * @author yongsik1.kim
 */
public class LeeJinKyoung20170206 {

    public static void main(String[] args) throws Exception{

        int[] lotto = new int[6];

        int choose = 0;
        while(choose < 6){
            int sel = random(1,45);

            boolean check = true;
            for(int i = 0 ; i < choose; i++){
                if( lotto[i] == sel ){
                    check = false;
                    break;
                }
            }
            if( check ){
                lotto[choose] = sel;
                choose++;
            }
        }

        System.out.print("생성된 숫자 : ");
        for ( int jnx = 0 ; jnx < lotto.length ; jnx++ ) {
            System.out.print(lotto[jnx] + " ");
        }

        int tempNum = 0;
        for ( int knx = 0 ; knx < lotto.length ; knx++ ) {
            for ( int lnx = knx+1 ; lnx < lotto.length ; lnx++ ) {
                if ( lotto[knx] > lotto[lnx] ) {
                    tempNum = lotto[knx];
                    lotto[knx] = lotto[lnx];
                    lotto[lnx] = tempNum;
                }
            }
        }

        System.out.print("\n정렬 결과 : ");
        for ( int lnx = 0 ; lnx < lotto.length ; lnx++ ) {
            System.out.print(lotto[lnx] + " ");
        }

    }

    public static int random(int min, int max) throws Exception{
        Random random = new Random();
        return random.nextInt(max)+min;
    }

}
