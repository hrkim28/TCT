package helper;

import java.io.IOException;


/**
 *
 * @author yongsik1.kim
 */
public class LeeJinKyoung_20170118 {

    public static void main(String[] args) throws IOException{
        int m= 3;
        int n= 4;
        int maxCnt = 16;

        //char startChar = 'A';
        int startChar = 65; //ASCII Code

        String[] garo = new String[m*n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if( (i * n) + j >= maxCnt) {
                    garo[(i * n) + j] = String.valueOf( (char)(startChar));
                } else {
                    garo[(i * n) + j] = String.valueOf( (char)(startChar + (i * n) + j));
                }
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(garo[(i * n) + j]);
            }
            System.out.println("");
        }

        System.out.println("");

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(garo[(j * m) + i]);
            }
            System.out.println("");
        }

        System.out.println("");
    }
/*
3*4 배열에 maxCnt 16 이면
(가로)
ABCD
EFGH
IJKL
(세로)
ADGJ
BEHK
CFIL
3*4 maxCnt 10 이면
(가로)
ABCD
EFGH
IJIH
(세로)
ADGJ
BEHI
CFIH
3*4 maxCnt 5 이면
(가로)
ABCD
EDCB
AAAA
(세로)
ADCA
BEBA
CDAA
*/
}
