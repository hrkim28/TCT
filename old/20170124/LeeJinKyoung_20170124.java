package helper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yongsik1.kim
 */
public class LeeJinKyoung_20170124 {
    List<String> list = new ArrayList<String>();

    public static void main(String[] args) throws IOException{

        int max = 100000;
        int input = 7;
        int sumInput = 0;
        int result = 0;

        for(int i = 1; i <= String.valueOf(max).length() ; i++){
            sumInput = sumInput + input * (int)Math.pow(10, i-1);
            if( sumInput < max) {
                result = result +  (int)Math.pow(10, i-1);
            }
        }
        System.out.println(result);
    }
}
