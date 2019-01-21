import java.lang.reflect.Array;
import java.util.Scanner;


/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : TCT_20190117_YOUNGWONLIM.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 2019. 1. 17.  75615   Initial
 * ===========================================
 */

/**
문제
마법의 약 수업 시간에 교수님의 설명을 안 듣고 졸던 헤리는 실수로 냄비에 몇 가지 재료의 양을 잘못 넣고 말았습니다. 
약의 색깔이 심상치 않게 변하는 것을 눈치챈 해르미온느가 재빨리 레시피의 정확한 양을 알려주어서 약을 전부 망치는 것은 면했습니다. 
지금 얼른 재료를 더 넣어서 약을 완성해야 합니다.
이번 시간에 만드는 마법의 약은 n 종류의 재료를 각 r 숟가락씩 넣어서 만들어야 합니다. 
모든 재료를 정확히 넣었을 경우 만들어진 마법의 약은 정확히 한 병 분량이 됩니다. 헤리가 이미 냄비에 넣은 각 재료들의 양은 p 로 주어집니다. 
헤리는 적절히 냄비에 재료를 최소한으로 더 넣어 각 재료의 비율을 정확히 맞추고 싶습니다. 이를 위해 한 병보다 많은 약을 만들어도 상관 없지만, 
최소한 한 병은 만들어야 합니다. 헤리는 항상 숟가락 단위로만 재료를 넣을 수 있기 때문에, 반 숟가락의 재료를 더 넣는다거나 하는 일은 불가능합니다.
넣어야 할 각 재료의 최소량을 계산하는 프로그램을 작성하세요.

[입력]
각 테스트 케이스는 세 줄로 구성됩니다. 첫 줄에는 재료의 수 n (1 <= n <= 200) 이 주어지고, 다음 줄에는 n 개의 정수로 약에 들어가야 하는 각 재료의 양 r (1 <= r <= 1000), 그 다음 줄에는 n 개의 정수로 이미 냄비에 넣은 재료의 양 p (0 <= p <= 1000) 가 주어집니다.
case 1)
n : 4
r : 4 6 2 4 
p : 6 4 2 4 
case 2)
n : 4
r : 4 6 2 4
p : 7 4 2 4 
case 3)
n : 3
r : 4 5 6
p : 1 2 3

[출력]
각 테스트 케이스마다 한 줄에 n 개의 정수로 각 재료마다 더 넣어야 하는 양을 출력합니다.
case 1)
0 5 1 2
case 2)
1 8 2 4
case 3)
3 3 3
 */
public class TCT_20190121_YOUNGWONLIM {
    public static void main(String[] args){
        
        int intInputCnt = 0;
        int intMinRate = 0;
        int intRealRate =0;
        int intPrintValue = 0;
        
        Scanner SC = new Scanner(System.in);
        intInputCnt = Integer.parseInt(SC.nextLine());
         
        String[] strRequired = new String[intInputCnt];
        String[] strRealInput = new String[intInputCnt];
        
        strRequired = SC.nextLine().split(" ");
        strRealInput = SC.nextLine().split(" ");
        
        
        intMinRate = calcRate(strRequired , intInputCnt);
        intRealRate = calcRealRate(strRequired, strRealInput , intMinRate, intInputCnt);
        
        
        for(int inx =0; inx < intInputCnt ; inx++ )
        {
            intPrintValue = (Integer.parseInt(strRequired[inx])/intMinRate) * intRealRate - Integer.parseInt(strRealInput[inx]);
            
            System.out.print(intPrintValue);
            if(inx != intInputCnt-1 )
            {
                System.out.print(" ");
            }
        }
     }
    
    public static int calcRate(String[] strRequired, int intInputCnt)
    {
        int intGcd =0;
        
        intGcd = Integer.parseInt(strRequired[0]);
        for(int inx =1; inx< intInputCnt ; inx ++)
        {
            intGcd = gcd(intGcd, Integer.parseInt(strRequired[inx]));
        }
        return intGcd;       
    }
    
    public static int gcd(int a, int b)
    {
        int tmp =0;
        if(a < b)
        {
            tmp = a;
            a = b;
            b = tmp;
        }
        if (a % b == 0)
            return b;
        else
            return gcd(b, a % b);
    }
    
    public static int calcRealRate(String[]strRequired, String[]strRealInput , int intMinRate, int intInputCnt  )
    {
        boolean flagRun = true;
        int intCorrectCnt = 0;
        int intMaxRate =0;
        int inx = 0;
        while(flagRun)
        {
            ++inx ;
            intCorrectCnt = 0;
            
            for(int jdx =0; jdx < intInputCnt ; jdx++ )
            {
                if(Integer.parseInt(strRealInput[jdx]) <= (Integer.parseInt(strRequired[jdx])/intMinRate) * inx)
                {
                    intCorrectCnt = intCorrectCnt+1;
                }
            }
            
            if(intCorrectCnt == intInputCnt)
            {
                flagRun = false;
                intMaxRate = inx;
            }
        }
        return intMaxRate;
    }
    
    


}
