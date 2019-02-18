import java.util.Scanner;


/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : TCT_20190218_LeeJinKyoung.java
 * ===========================================
 * Modify Date    Modifier    Description
 * -------------------------------------------
 * 2019. 2. 18.  70705   Initial
 * ===========================================
 */

/**
 * <pre>
 * Class : TCT_20190218_LeeJinKyoung
 * Description : TODO
 * </pre>
 *
 * @author 70705
 */
public class TCT_20190218_LeeJinKyoung {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0 ; i < n; i++) {
            calculator(sc.nextInt());
        }
        sc.close();
    }

    private static void calculator(int input) {
        /* 일정 수 이상이면 int가 넘어가기 때문에 long으로 해야 결과를 받아야 합니다. */
        long result[][] = new long[input+1][2];

        for(int inx = 0;inx <= input; inx++ ) {
            if(inx == 0) {
                result[inx][0] = 1;
                result[inx][1] = 0;
            } else if(inx == 1) {
                result[inx][0] = 0;
                result[inx][1] = 1;
            } else {
                result[inx][0] = result[inx-1][0] + result[inx-2][0];
                result[inx][1] = result[inx-1][1] + result[inx-2][1];
            }
        }

        System.out.println(result[input][0] + " " + result[input][1]);
    }
}
