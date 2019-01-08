package helper;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


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
public class LeeJinKyoung20170202 {

    public static void main(String[] args) throws Exception{
        int number3 = randomRange(1,9);

        int number2 = randomRange(0,9);
        while (number3 == number2){
            number2 = randomRange(0,9);
        }

        int number1 = randomRange(0,9);
        while (number1 == number3 || number1 == number2){
            number1 = randomRange(0,9);
        }

        int number = number3 * 100 + number2 * 10 + number1;

        int strike = 0;
        int ball = 0;

        int count = 0;
        System.out.println(number);

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        Scanner sc = new Scanner( System.in );

        while ( true ) {
            System.out.println("3 개 숫자를 입력하세요");

            for(int i = 3; i > 0; i++) {
                int input = Integer.parseInt(br.readLine());

                /*
                if((int)(number/Math.pow(10, i-1)) == input){
                    strike = strike + 1; //Strike
                } else {
                    for(int j = 3; j > 0; j++) {
                        if((int)(number/Math.pow(10, j-1)) == input){
                            ball = ball + 1; //Ball
                            break;
                        }
                    }
                }
                */
            }

            System.out.print(strike + " Strike " + ball + " Ball");
            count = count + 1;
            if(strike == 3){
                System.out.print( count + " 회만에 Strike Out!!!");
                break;
            }
        }
    }
    // 지정된 범위의 정수 1개를 램덤하게 반환하는 메서드
    // n1 은 "하한값", n2 는 상한값
    public static int randomRange(int n1, int n2) {
      return (int) (Math.random() * (n2 - n1 + 1)) + n1;
    }
}
