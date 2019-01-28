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
문제
영어로 된 문장이 주어졌을 때, 대소문자 구분없이 가장 많이 사용된 알파벳을 출력하는 프로그램을 작성하시오.

입력
첫째 줄부터 글의 문장이 주어진다.
글은 최대 5000글자로 구성되어 있고, 공백, 알파벳, 특수문자, 엔터로만 이루어져 있다.
그리고 적어도 하나의 알파벳이 있다.

[case1]
I think I'm lost.
[case2]
I think I'm lost.I can't tell.
[case3]
I think I'm lost. I can't tell what's where.

출력
가장 많이 사용된 알파벳과 그 횟수를 출력한다.
가장 많이 쓰인 알파벳이 여러개인 경우 알파벳순서대로 모두 출력한다.

[case1]
가장많이 쓰인 알파벳 : i = 3회
[case2]
가장많이 쓰인 알파벳 : i, t = 4 회
[case3]
가장많이 쓰인 알파벳 : t = 5 회

 */
public class TCT_20190128_YOUNGWONLIM {
    public static void main(String[] args){
        String strTest01 = "I think I'm lost.";
        String strTest02 = "I think I'm lost.I can't tell.";
        String strTest03 = "I think I'm lost. I can't tell what's where.";
        
        Boolean bContiunue = true;
        int intTotalCnt = 0;
        int intMaxCnt = 0;
        int intPrevMaxCnt = 0;
        String strMaxAlphabet = "";
        String strInput = "";
        ArrayList<String> alAlphabet = new ArrayList<String>(); 
        
        
        strInput = strTest03;
        strInput = strInput.trim().toLowerCase().replaceAll("[^a-z]|\r|\n", "");
        String[] arInput = strInput.split("");
        intTotalCnt = arInput.length;
        Arrays.sort(arInput);
        
        for(int inx=0; inx < intTotalCnt ; ++inx)
        {   
            strMaxAlphabet =  arInput[inx];
            intMaxCnt = 0;
            
            for(int jdx=inx; jdx < intTotalCnt ; ++jdx)
            {   
                if(strMaxAlphabet.equals(arInput[jdx]))
                {
                    intMaxCnt = intMaxCnt +1;
                }else{
                    break;
                }
            }
            
            
            if(intPrevMaxCnt < intMaxCnt)
            {
                intPrevMaxCnt = intMaxCnt;
                alAlphabet.clear();
                alAlphabet.add(strMaxAlphabet);
                
            }else if(intPrevMaxCnt == intMaxCnt)
            {
                alAlphabet.add(arInput[inx]);
            }
        }
        
        System.out.print("가장많이 쓰인 알파벳 : ");
        for(int jdx =0; jdx < alAlphabet.size(); ++jdx)
        {
            System.out.print(alAlphabet.get(jdx));
            if(jdx != alAlphabet.size()-1)
            {
                System.out.print(" ,");
            }
        }
        System.out.print(" = "+intPrevMaxCnt+" 회");
        
    }


    
}
