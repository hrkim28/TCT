package helper;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


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
public class LeeJinKyoung_20170228 {

    /*
     * <2진수 더하기>
두개의 이진수(0과 1로 이루어진 숫자)를 입력받은 다음 더하는 프로그램을 구현하라.
기본적인 이진수의 덧셈은 다음과 같다.
0 + 0 = 0
1 + 0 = 1
0 + 1 = 1
1 + 1 = 10
1 + 1 + 1 = 11
만약 1011101과 0010010을 더하면 다음과 같이 덧셈이 이뤄진다.
1 <- 자리올림
1011101
+ 0010010
1101111
입력형식
입력은 한 줄로 이루어지며 2개의 0과 1로 이루어진 이진수가 입력된다.
이진수 사이에는 공백이 포함되어 있으며 이진수의 자릿수는 최대 80자리 이하이며 앞에 0이 붙는 경우도 존재한다.
출력형식
입력된 두개의 이진수를 더한 결과를 출력한다.
앞자리에 0이 붙어 나올 경우 이 경우는 앞의 0은 모두 출력한다.
만약 두개의 숫자를 더한 값이 0일 경우에는 0을 하나만 출력한다.
입력 예시
1001101 10010
출력예시
1011111
     */
    /**
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ( true ) {
            System.out.print("Enter Number : ");
            input = in.readLine();
            if ( input == null || input.length() == 0 ) {
                continue;
            }
            //System.out.println();
            break;
        }

        String num[] = input.split(" ");
        String num1 = num[0];
        String num2 = num[1];
        int count = num[0].length();
        if(num[1].length() > num[0].length()){
            count = num[1].length();
            num1 = num[1];
            num2 = num[0];
        }

        ArrayList<Integer> al = new ArrayList<Integer>();

        int addition = 0;
        for(int i = count-1; i >= 0; i--) {
            if(count - num2.length() <= i) {
                if(num1.charAt(i) == num2.charAt(i - (count - num2.length()))){
                    al.add(addition);
                    addition = Integer.valueOf("" + num1.charAt(i));

                } else {
                    if (addition == 0) {
                        al.add(1);
                    } else {
                        al.add(0);
                    }
                }
            } else {
                char tempNumber = num1.charAt(i);

                if(addition == 1) {
                    if(tempNumber == '0'){
                        al.add(1);
                        addition = 0;
                    } else {
                        al.add(0);
                        addition = 1;
                    }
                } else {
                    al.add(Integer.valueOf("" + tempNumber));
                }
            }

        }

        if(addition == 1) al.add(1);

        for(int i = al.size()-1; i >= 0; i--) {
            System.out.print(al.get(i));
        }
    }
}