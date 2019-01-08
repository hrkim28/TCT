package helper;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;


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
public class LeeJinKyoung_20170221 {

    public static void main(String[] args) throws Exception{

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String name;
        while ( true ) {
            System.out.print("Enter : ");
            name = in.readLine();
            if ( name == null || name.length() == 0 ) {
                continue;
            }
            //System.out.println();
            break;
        }

        int n = Integer.parseInt(name);

        int power = 0;
        for(int i = 0; i < n; i++){
            power = 0;
            for(int j = 0; j < i; j++){
                power = power + i;
            }

            if( power == n ){
                System.out.println(n + "==>True");
                break;
            } else if ( power > n ) {
                System.out.println(n + "==>False");
                break;
            }
        }
    }
}
