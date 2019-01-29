import java.util.ArrayList;




/*
문제)
현우는 초등학생인 여동생의 수학 숙제를 도와주고 있었다.
현우는 동생을 좀 더 잘 가르치고 싶어 답을 구하는 과정을 되도록 자세히 알려주려고 오른쪽에서 왼쪽으로 순차적으로 계산하는 과정을 보여주고자 한다.

단, 일반적인 수식과 같이 곱하기(*)와 나누기(/)는 연산자 우선순위가 높으므로 먼저 계산해야 한다. 현우를 도와 수식을 입력 받으면 계산과정과 결과를 보여주는 코드를 작성하도록 하자.

입력)
한 줄로 숫자와 사칙 연산 기호 +, -, *, /로 이루어진 수식이 입력된다.

출력)
한 줄마다 오른쪽에서 왼쪽으로 한 단계씩 계산된 결과와 나머지 수식을 출력한다.

예시1)

입력
9+5-4+8

출력
14-4+8
10+8
18

예시 2)

입력
5+6*3-6/2+5

출력
5+18-6/2+5
5+18-3+5
23-3+5
20+5
25
*/
public class TCT_20190129_YOUNGWONLIM {
    public static void main(String[] args){     
    
        String strTestInput01 = "9+5-4+8";
        String strTestInput02 = "5+6*3-6/2+5";
        String strTestInput03 = "1219+325-4+1238";
        
        String strTestInput = strTestInput03;
        
        System.out.println(strTestInput);
        
        Calc(strTestInput);

        
        
    }
    public static String Calc(String input)
    {
        String strResult ="";
        int intFirstCalcVar = 0;
        int intSecondCalcVar = 0;
        int intTargetCalcVar =0;
        String[] arNum = input.split("[+]|[*]|[-]|[/]");
        String[] arCalcVar = input.split("[0-9]+");
        //v  0 1 2 3
        //c 0 1 2 3
        
        for(int inx=1; inx< arCalcVar.length; ++inx)
        {
            if(intFirstCalcVar==0 && (arCalcVar[inx].equals("*") || arCalcVar[inx].equals("/")))
            {
                intFirstCalcVar = inx;
            }
            
            if(intSecondCalcVar==0 && (arCalcVar[inx].equals("+") || arCalcVar[inx].equals("-")))
            {
                intSecondCalcVar = inx;
            }
        }

        if(intFirstCalcVar!=0)
        {
            intTargetCalcVar = intFirstCalcVar;
        }else
        {
            intTargetCalcVar = intSecondCalcVar;
        }
        
        
        for(int jdx =0; jdx < arNum.length; jdx++)
        {
            if(jdx != 0)
            {
                strResult = strResult + arCalcVar[jdx];
            }
            
            if(jdx+1  == intTargetCalcVar)
            {
                strResult = strResult + CalcVar(arNum[jdx],arNum[jdx+1],arCalcVar[jdx+1]);
                jdx = jdx +1;
                
            }else if(jdx < arNum.length)
            {
                strResult = strResult + arNum[jdx];
            }
        }

       
        System.out.println(strResult);
        
        String[] arCheckCalcVar = strResult.split("[0-9]+");
        if(arCheckCalcVar.length != 0)
        {
            strResult = Calc(strResult);
        }
        return strResult;
    }

    public static String CalcVar(String a, String b, String calcVar)
    {
       int intA = Integer.parseInt(a);
       int intB = Integer.parseInt(b);
       String strResult = "";
       if(calcVar.endsWith("*"))
       {
           strResult = Integer.toString(intA * intB);
       }else if(calcVar.endsWith("/"))
       {
           strResult = Integer.toString(intA / intB);
       }else if(calcVar.endsWith("+"))
       {
           strResult = Integer.toString(intA + intB);
       }else if(calcVar.endsWith("-"))
       {
           strResult = Integer.toString(intA - intB);
       }
       return strResult;
           
    }
}
