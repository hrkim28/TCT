/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : 임용원_20170109.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 2017. 1. 19.  youngwon.lim   Initial
 * ===========================================
 */
package daily;


/**
 * <pre>
 * Class : 임용원_20170109
 * Description : TODO
 * </pre>
 * 
 * @author youngwon.lim
 */
public class 임용원_20170119 {

    /**
100 부터 1000사이의 숫자 중 각 자릿수에 해당하는 세제곱의 합이 해당숫자와 동일한 숫자를 출력한다.
ex) 153 = 1*1*1 + 5*5*5 + 7*7*7 
153
370
371
407
     */
    public static void main(String[] args){
        // TODO Auto-generated method stub

        int result =0;
        int sum =0;
        int tmp =0;
        
        for(int i=100; i< 1000; ++i)
        {
            sum =0;
            
            String[] strNum = (Integer.toString(i)).split("");
            
            for(int j =0; j< strNum.length; ++j)
            {
                if(strNum[j].isEmpty())
                {
                    continue;
                }else
                {
                    tmp = Integer.valueOf(strNum[j]);
                    sum = sum + tmp*tmp*tmp;
                }
             }
            
            if( i == sum)
            {
                System.out.println(Integer.toString(i));
            }
        }
    }

}
