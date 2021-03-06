package helper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yongsik1.kim
 */
public class LeeJinKyoung_20170123 {
    List<String> list = new ArrayList<String>();

    public static void main(String[] args) throws IOException{

/**
양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
예를들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
입력받은 양의 정수 n이 하샤드수인지 아닌지 판단하는 함수를 완성하세요.
예를들어 n이 10, 12, 18, 153, 142857.. 이면 True를 리턴 11, 13..이면 False를 리턴하면 됩니다.
*/

        int num = 142857;
        int copyNum = num;
        int sum = 0;
        while(num >= 1){
            sum = sum + num%10;
            num = num/10;
        }

        double pow =  (double)copyNum/sum;
        if( pow ==  Math.floor(pow)){
            System.out.println("True");
       } else {
            System.out.println("False");
       }

    }
}
