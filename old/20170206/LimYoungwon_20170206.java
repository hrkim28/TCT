/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : LimYoungwon_20170206.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 2017. 2. 6.  youngwon.lim   Initial
 * ===========================================
 */
package daily;

import java.util.Random;


/**
 * <pre>
 * Class : LimYoungwon_20170206
 * Description : TODO
 * </pre>
 * 
 * @author youngwon.lim
 */
public class LimYoungwon_20170206 {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        // TODO Auto-generated method stub
        
        int[] lottoNum = new int[5];
        int[] lottoNumAsc = new int[5];
        
        lottoNum = createRandomNumber();

        lottoNumAsc = changeOrderNumber(lottoNum);
        
        System.out.print("생성된 숫자 : ");
        printNum(lottoNum);
        System.out.print("정렬 결과 : ");
        printNum(lottoNumAsc);

    }
    
    public static int[] createRandomNumber()
    {
        int[] intRandomNum = new int[5];
        
        Random rd = new Random();
        
        for( int inx =0; inx < intRandomNum.length; ++inx)
        {
            intRandomNum[inx] = rd.nextInt(45) +1;
        }
        
        // 중복 체크
        if(checkNumber(intRandomNum))
        {
            return createRandomNumber();
        }
        
        return intRandomNum;
    }
    
    public static int[] changeOrderNumber(int[] inputNumber)
    {
        int[] tempNum = inputNumber.clone();
        int temp =0;
        
        for(int inx =0; inx< tempNum.length-1; ++inx)
        {
            for(int jdx =inx+1 ; jdx< tempNum.length ; ++jdx)
            {
                if(tempNum[inx] > tempNum[jdx])
                {
                    temp = tempNum[inx];
                    tempNum[inx] = tempNum[jdx];
                    tempNum[jdx] = temp;
                }
            }
        }
        
        return tempNum;
    }
    
    public static boolean checkNumber(int[] inputNumber)
    {
        int[] tempNum = inputNumber;
        boolean flagDup = false;
        
        for(int inx =0; inx< tempNum.length-1; ++inx)
        {
            for(int jdx =inx+1 ; jdx< tempNum.length ; ++jdx)
            {
                if(tempNum[inx] == tempNum[jdx])
                {
                    flagDup = true;
                    break;
                }
            }
        }
        return flagDup;
    }
    
    public static void printNum(int[] printNum){
        
        for(int inx =0; inx < printNum.length ; ++inx)
        {
            System.out.print(printNum[inx]);
            System.out.print(" ");
            if(inx == printNum.length -1)
            {
                System.out.println("");
            }
        }
    }

}
