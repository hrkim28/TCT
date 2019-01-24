import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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
/*
[문제]
1보다 큰 자연수 중에서 1과 자기 자신을 제외한 약수가 없는 자연수를 소수라고 한다.
예를 들어, 5는 1과 5를 제외한 약수가 없기 때문에 소수이다.

2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다.
예를 들면, 4=2+2,6=3+3, 8=3+5 이다.

2보다 큰 짝수 n에 두 소수로 출력하는 프로그램을 작성하여라.
만약 그 가지수가 여러가지라면 두 소수의 차이가 가장 적은 것을 출력하여라

예를 들면,
6을 두 소수로 나누는 경우의 수는 두가지 이다.
3,3과 5,1 이 두가지 경우 중 두 소수의 차이가 적은 3 3을 출력하면 된다.

[입력]
n (4<=n<=10,000)

[출력]
두 수를 공백으로 구분하여 출력

[예제]
입력
16
출력
5 11
 */
public class TCT_20190124_YOUNGWONLIM {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int intN = sc.nextInt();
      int intD = intN/2;
      int intVariable =0;
      int intFirstNum = intD;
      int intSecondNum =intD;
      Boolean bFlag = true;
      
      while(bFlag)
      {
          //System.out.println(intFirstNum+ " "+intSecondNum );
          if(calcCntDivisor(intFirstNum) == 1  && calcCntDivisor(intSecondNum) == 1 )
          {
              bFlag = false;
          }else
          {
              intVariable = intVariable+1;
              intFirstNum= intFirstNum - intVariable;
              intSecondNum = intSecondNum + intVariable;
          }
      }
      
      System.out.println(intFirstNum+ " "+intSecondNum );
       
    }
    
    public static int calcCntDivisor(int intInputNum)
    {
        int intCnt = 0;
        
        for(int inx =1; inx<intInputNum ; ++inx)
        {
            if(intInputNum%inx == 0)
            {
                ++intCnt;
            }
        }
        return intCnt;
    }
}
