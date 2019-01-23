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
문제
초등학교교 학생인 정우와 석환이는 최근 학교에서 두 이진수의 XOR 연산에 대해 배웠다.
둘은 매우 영특한 학생이라 새로 배운 연산을 갖고 이리저리 장난치기 시작했다.
다만 석환이는 정우에게 일을 시키는 것을 좋아하는지라 다음과 같은 제안을 했다.
“내가 N 개의 10진수를 주면, 등장하는 숫자들 중 홀수번만 나타나는 숫자들을 모두 XOR 한 결과를 구해줘.”

예를 들어 '2, 5, 3, 3' 이 주어질 경우, '2'와'5'는 1번(홀수 번) 나타나고 '3' 은 2번 (짝수 번) 나타나므로
홀수 번 나타난 '2' 와 '5'를 XOR 한 결과를 구해야 하고,
'2, 5, 3, 3, 2, 4, 5, 3' 이 주어질 경우 '2' 와 '5' 는 2번 나타나고, '3' 은 3번, '4' 는 1번 나타나므로
홀수 번 나타난 '3' 과 '4'를 XOR 한 결과를 구해야 한다.

정우는 제안을 수락했지만, 가면 갈수록 매번 XOR 연산을 수행하는 일에 지치고 있다.
정우를 도와서 주어 진 문제를 해결하는 프로그램을 작성시오.

입력
첫 번째 줄에는 석환이가 말한 숫자 N ( N은 3,000,000 이하의 자연수)이 주어진다.
다음 줄에는 N 개의 숫자들이 주어진다.
각 숫자는 32bit 정수형 변수에 담을 수 있는 음이 아닌 정수이다.

출력
주어진 숫자들 중에서 '홀수' 번만 나타나는 숫자들을 모두 XOR 한 결과를 출력한다.

입출력 예제
예제 입력
N = 4
{2,5,3,3}
예제 출력
7
 */
public class TCT_20190123_YOUNGWONLIM {
    public static void main(String[] args){
        int[] arInputNum = {2,5,3,3};
        ArrayList<Integer> alSelectedNum = new ArrayList<Integer>();
        String strResultXor = "";
        int intResultXor = 0;
        
        alSelectedNum = selectNum(arInputNum);
        
        intResultXor = alSelectedNum.get(0);
        for(int inx=1; inx< alSelectedNum.size(); ++inx)
        {
            intResultXor = calcXor(intResultXor, alSelectedNum.get(inx));
        }
        
        System.out.println("XOR Result : " + intResultXor);
        
    }  
    
    public static ArrayList<Integer> selectNum(int[] arInputNum)
    {
        ArrayList<Integer> alResult = new ArrayList<Integer>();
        int intCheckNum =0 ;
        int cnt =1;
        Arrays.sort(arInputNum);
       
        intCheckNum = arInputNum[0];
        
        for(int inx=1; inx <  arInputNum.length; ++inx)
        {
            if(intCheckNum == arInputNum[inx])
            {
                cnt = cnt +1;
            }else
            {
                
                if(cnt%2 ==1)
                {
                    alResult.add(intCheckNum);
                }
                if(inx == arInputNum.length -1)
                {
                    alResult.add(arInputNum[inx]);
                }
                cnt =1;
                intCheckNum = arInputNum[inx];
                
             }
        }
        return alResult;
    }
    
    public static int calcXor(int a, int b)
    {
        ArrayList<Integer> arA = new ArrayList<Integer>();
        ArrayList<Integer> arB = new ArrayList<Integer>();
        ArrayList<Integer> arC = new ArrayList<Integer>();
        int intIndexLength = 0;
        int intANum = 0;
        int intBNum =0;
        
        arA = transferBit(a);
        arB = transferBit(b);
     
        intIndexLength = arA.size()>= arB.size()?arA.size():arB.size();
        
        for(int inx=0; inx< intIndexLength ; ++inx )
        {
            if(inx >= arA.size() )
            {
                intANum =0;
            }else
            {
                intANum = arA.get(inx);
            }
            
            if(inx >= arB.size() )
            {
                intBNum =0;
            }else
            {
                intBNum = arB.get(inx);
            }
            
            
            if(intANum == intBNum)
            {
               arC.add(0); 
            }else  
            {
               arC.add(1); 
            } 
        }
        
        return transferNum(arC);
        
    }
    public static ArrayList<Integer> transferBit(int a)
    {
        ArrayList<Integer> ar = new ArrayList<Integer>();

        do
        {
            ar.add(a%2);
            a = a/2;  
        }while(a > 0);
        
        return ar;
    }
    public static int transferNum(ArrayList<Integer> a)
    {
        int intResult =0 ;
        double dResult =0;
        
        for(int inx =0; inx < a.size() ; ++inx)
        {
            dResult = dResult + Math.pow(2, inx)*a.get(inx);
        }
        
        intResult= (int)dResult;

        return intResult;
    }
}
