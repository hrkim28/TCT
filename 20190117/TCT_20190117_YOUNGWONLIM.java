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
윤영이는 3의 배수 마니아이다. 그는 모든 자연수를 3개의 3의 배수의 자연수로 분해하는 것을 취미로 가지고 있다. 문득 그는 자신에게 주어진 수를 3개의 3의 배수로 분리하는 경우의 수가 몇 개인지 궁금해졌다.
하지만 윤영이는 마지막 학기이기 때문에 이런 계산을 하기에는 너무 게을러졌다.
그래서 당신에게 이 계산을 부탁했다.

즉, 임의의 3의 배수 자연수 n이 주어졌을 때, 해당 수를 3의 배수의 자연수 3개로 분리하는 방법의 개수를 출력해라.
단 분해한 수의 순서가 다르면 다른 방법으로 간주한다.
예를 들어 12 = 3 + 6 + 3 과 12 = 3 + 3 + 6 은 다른 방법이다.

입력
임의의 3의 배수 자연수 n이 주어진다. (3 ≤ n ≤ 3000)

출력
자연수 n을 분해하는 방법의 개수를 출력하라

예제1
입력: 9
출력: 1

9 = 3+3+3 외 다른 방법이 없기에 1

예제2
입력: 12
출력: 3

12 = 3 + 3 + 6,
12 = 3 + 6 + 3,
12 = 6 + 3 + 3
총 3개

 */
public class TCT_20190117_YOUNGWONLIM {
    public static void main(String[] args){

        boolean flagTest = false;
        int[] testInput = new int[1];
        
        //testCase01(testInput);
        //testCase02(testInput);
                
        int intInputNum = 0;
        int intResultCnt = 0;
        int[] arInt = new int[3];
        int intMaxCnt = 0;
        
        if(!flagTest)
        {
            Scanner sc = new Scanner(System.in);
            intInputNum = sc.nextInt();
            sc.close();
        }else
        {
            intInputNum = testInput[0];
        }
        
        if(intInputNum < 9)
        {
            intResultCnt =0;
        }else if(intInputNum%3 > 0)
        {
            intResultCnt =0;
        }
        
        intMaxCnt = (intInputNum -6)/3;
        
        for(int inx =1 ; inx <= intMaxCnt  ; inx++)
        {
           for(int jdx =1; jdx <= intMaxCnt ; jdx++)
           {
               for(int kdx =1; kdx <= intMaxCnt ;kdx++)
               {
                   if(inx*3 + jdx*3 + kdx*3 == intInputNum)
                   {
                       intResultCnt ++;
                   }
               }
           }
               
        }
        
        System.out.println("입력 : " + intInputNum);
        System.out.println("출력 : " + intResultCnt);
        
        
        //*/
    }
    
    public static void testCase01(int[] testInput)
    {
        testInput[0] = 9;
    }
    public static void testCase02(int[] testInput)
    {
        testInput[0] = 12;
    }

}
