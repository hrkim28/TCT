/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : LimYoungwon_20170202.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 2017. 2. 2.  youngwon.lim   Initial
 * ===========================================
 */
package daily;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;


/**
 * <pre>
 * Class : LimYoungwon_20170202
 * Description : TODO
 * </pre>
 * 
 * @author youngwon.lim
 */
public class LimYoungwon_20170202 {

    /**
야구게임
컴퓨터가 생성한 임의의 숫자 3개와 입력받은 3개의 숫자에 대해서 Strike , Ball 결과 출력
> 숫자 일치 자리수 다르면 ball
> 3개의 숫자가 전부 일치하면 Strike out으로 게임종료
> 컴퓨터가 생성한 숫자 3개는 중복 X

     */
    public static void main(String[] args){
        // TODO Auto-generated method stub
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isr);
        boolean result = true;
        int[] intRdNum = new int[3];
        int[] intInputNum = new int[3];
        
        
        intRdNum = createRandomNum();
        
        //System.out.println(intRdNum[0]);
        //System.out.println(intRdNum[1]);
        //System.out.println(intRdNum[2]);
        
        while(result)
        {
            intInputNum = inputFunction();
            result = playGame(intRdNum ,intInputNum);
        }
        
         
    }
    
    public static int[] inputFunction()
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isr);
        
        String[] strNum = new String[3];
        int[] intNum = new int[3];
        
        try{
            System.out.println("3 개의 숫자를 입력하세요");
            for(int i=0; i < 3; ++i)
            {
                strNum[i] = in.readLine();
                intNum[i] = Integer.valueOf(strNum[i]);
            }
            
        }catch (Exception e) {
            // TODO: handle exception
            System.out.println("잘못된 형식의 숫자를 입력하셨습니다.");
            return inputFunction();
        }
        return intNum;
    }
    
    public static int[] createRandomNum()
    {
        int[] intRdNum = new int[3];
        Random rd = new Random();
        intRdNum[0] = rd.nextInt(9) + 1;
        intRdNum[1] = rd.nextInt(9) + 1;
        intRdNum[2] = rd.nextInt(9) + 1;

        for(int i=0 ;i< intRdNum.length-1 ; ++i)
        {
            for(int j=i+1 ;j< intRdNum.length ; ++j)
            {
                if(intRdNum[i] == intRdNum[j])
                {
                    return createRandomNum();                  
                }
            }
        }
        
        return intRdNum;
    }
    
    public static boolean playGame(int[] computerNum ,int[] inputNum)
    {
        boolean result = false;
        
        int intStrikeNum =0;
        int intBallNum =0;
        
        for(int i=0; i<computerNum.length; ++i)
        {
            for(int j=0; j< inputNum.length; ++j)
            {
                if(computerNum[i] == inputNum[j])
                {
                    if(i==j)
                    {
                        intStrikeNum = intStrikeNum+1; 
                    }else
                    {
                        intBallNum = intBallNum +1;
                    }
                }
            }
        }
        


        
        if(intStrikeNum == 3)
        {
            System.out.println("Strike out ");
            result = false;
        }else
        {
            System.out.print(intStrikeNum );
            System.out.print(" Strike, ");
            System.out.print(intBallNum );
            System.out.println(" Ball");
            
            result = true;
        }
                
        return result;
    }
    

}
