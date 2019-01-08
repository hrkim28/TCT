package helper;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


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
public class LeeJinKyoung_20170215 {

    static List<HashMap> result = new ArrayList<HashMap>();

    public static void main(String[] args) throws Exception{

        /*
           알파벳 a=1, b=2....z=26으로 할당할때 주어진 숫자를 가지고 만들수 있는 모든 가능한 문자열을 출력하세요...
           예를 들면 입력된 숫자가 1123이면 출력해야 할 문자열은 aabc, kbc, alc, aaw, kw 입니다.
         */
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String name;
        while ( true ) {
            name = in.readLine();
            if ( name == null || name.length() == 0 ) {
                continue;
            }
            //System.out.println();
            break;
        }

        generator(name);
    }

    public static void generator(String input) throws Exception{
        int startChar = 96; //ASCII Code

        /* 1 자리 */
        HashMap strList = new HashMap();
        strList.put(0, String.valueOf((char)(Integer.parseInt("" +input.charAt(0)) + startChar)));
        result.add(strList);

        /* 2 자리
        strList = new HashMap();
        strList.put(0, String.valueOf((char)(Integer.parseInt("" +input.charAt(0)) + startChar)) + String.valueOf((char)(Integer.parseInt("" +input.charAt(1)) + startChar)));
        strList.put(1, String.valueOf((char)(Integer.parseInt(input.substring(0, 2)) + startChar)));

        result.add(strList);
        */

        /* 2자리 이상 */
        for(int i = 1; i < input.length() ; i++){
            strList = new HashMap();

            String newStr1 = String.valueOf((char)(Integer.parseInt("" +input.charAt(i)) + startChar));
            String newStr2 = String.valueOf((char)(Integer.parseInt(input.substring(i-1, i+1)) + startChar));

            /* -1번째 자리에서 1자리 숫자에 해당하는 알파벳을 붙힘 */
            int newIndex = 0;
            for( int j = 0 ; j < result.get(i-1).size() ; j++ ){
                strList.put(newIndex, result.get(i-1).get(j) + newStr1);
                newIndex ++;
            }
            if(i-1 > 0) {
                /* -2번째 자리에서 2자리 숫자에 해당하는 알파벳을 붙힘 */
                for( int j = 0 ; j < result.get(i-2).size() ; j++ ){
                    strList.put(newIndex, result.get(i-2).get(j) + newStr2);
                    newIndex ++;
                }
            } else {
                strList.put(newIndex, String.valueOf((char)(Integer.parseInt(input.substring(0, 2)) + startChar)));
            }
            result.add(strList);
        }
        System.out.println(strList);
    }
}
