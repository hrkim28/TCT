/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : LeeJinKyoung20170126.java
 * ===========================================
 * Modify Date    Modifier    Description
 * -------------------------------------------
 * 2017. 1. 26.  70705   Initial
 * ===========================================
 */
package helper;


/**
 * <pre>
 * Class : LeeJinKyoung20170126
 * Description : TODO
 * </pre>
 *
 * @author 70705
 */
public class LeeJinKyoung20170126 {

    public static void main(String[] args) throws Exception{
        String[] strArray= new String[]{ "a1","a2","a3","b1","b2","b3"};
        String[] resultArray= new String[strArray.length];

        /*
         * [a1,a2,a3...,an,b1,b2...bn]
            다음과 같은 형태로 바꾸시오
            [a1,b1,a2,b2.....an,bn]
         */
        int f_alpha = (int)strArray[0].charAt(0);
        int l_alpha = (int)strArray[strArray.length-1].charAt(0);
        int count = Integer.parseInt(String.valueOf(strArray[strArray.length-1].charAt(strArray[strArray.length-1].length()-1))) ;

        int strCnt = 0;

        for(int j = 0 ; j < count ; j++){
            for(int i = f_alpha; i < l_alpha + 1 ; i++ ){
                String str = String.valueOf((char)i) + (j+1);
                resultArray[strCnt++] = str;
                System.out.println(str);
            }
        }


    }
}
