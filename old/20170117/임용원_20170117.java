/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : 임용원_20170117.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 2017. 1. 17.  youngwon.lim   Initial
 * ===========================================
 */
package daily;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * <pre>
 * Class : 임용원_20170117
 * Description : TODO
 * </pre>
 * 
 * @author youngwon.lim
 */
public class 임용원_20170117 {

    /**
    문자열을 입력받아서, 같은 문자가 연속적으로 반복되는 경우에 그 반복 횟수를 표시하여 문자열을 압축하기.
    단, 한번만 반복되는 문자는 숫자 없이  그대로 표기할것 
     */
    public static void main(String[] args){
        // TODO Auto-generated method stub
        String strInput = new String();
        String strVar = new String();
        int intNum =0;
        
        //strInput = "aaabbcccccca";
        //strInput = "abbcccccca";
        strInput = "apple";
        
        
        System.out.println("Start");
        System.out.print("Input Data :");
        System.out.println(strInput);
        System.out.print("Result :");
        
        strInput = strInput.concat("/");
        String[] strAryword = strInput.split("");
        for(int i=0; i< strAryword.length; ++i) 
        {
            strVar = strAryword[i].toString();
            
            if(strAryword.length == i+1 )
            {
                
            }else{
            if(strVar.equals(strAryword[i+1].toString()))
            {     
                intNum +=1;
            }else
            {
                System.out.print(strVar);
                
                if(intNum != 0)
                {
                    System.out.print(intNum+1);
                    intNum =0;
                }
            }}

        }
        System.out.println("");
        System.out.println("end");
        

    }

}
