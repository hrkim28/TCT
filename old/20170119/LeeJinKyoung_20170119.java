package helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yongsik1.kim
 */
public class LeeJinKyoung_20170119 {
    List<String> list = new ArrayList<String>();

    public static void main(String[] args) throws IOException{

 /**
* 100부터 1000 사이의 숫자 중 각 자릿수에 해당하는 세제곱 값의 합이 해당 숫자와 동일한 숫자를 출력한다.
  ex) 153 = 1x1x1 + 5x5x5 + 3x3x3
= 1 + 125 + 27
- [조건]
 1) Armstrong Number 출력한다.

- [예상결과]
153
370
371
407
*/
        int sum = 0;
        for(int i= 100; i < 1001 ; i++){
            sum = 0;
            for(int j = 0;j < String.valueOf(i).length();j++){
                int n = Integer.parseInt(String.valueOf(String.valueOf(i).charAt(j)));
                sum = sum + n * n * n;
            }

            if(i == sum) {
                System.out.println(sum);
            }
        }
    }
}
