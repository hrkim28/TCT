package helper;

import java.io.IOException;


/**
 *
 * @author yongsik1.kim
 */
public class LeeJinKyoung_20170117 {

    public static void main(String[] args) throws IOException{
        String s1= "aaabbcccccca";
        String s2= "abbcccccca";
        String s3= "apple";

        StringBuffer sb1 = new StringBuffer();

        int count = 1;
        for(int i = 0; i < s1.length();i++){
            if( i == 0 ) {
                sb1.append(s1.charAt(i));
                if(s1.charAt(i) == s1.charAt(i+1)){
                    count = count + 1;
                } else {
                    sb1.append(s1.charAt(i+1));
                }
            } else if( i ==  s1.length() - 1 ){
                if(count > 1){
                    sb1.append(count);
                }
            } else if(s1.charAt(i) == s1.charAt(i+1)){
                count = count + 1;
            } else {
                if(count > 1){
                    sb1.append(count);
                }
                sb1.append(s1.charAt(i+1));
                count = 1;
            }
        }

        System.out.println(sb1.toString());

        /*
입력 예시: aaabbcccccca
출력 예시: a3b2c6a
입력 예시: abbcccccca
출력 예시: ab2c6a
입력 예시: apple
출력 예시: ap2le
*/
    }


}
