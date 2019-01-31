import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


/*
문제
알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

길이가 짧은 것부터
길이가 같으면 사전 순으로

입력
첫째 줄에 단어의 개수 N이 주어진다. (1≤N≤20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 주어지는 문자열의 길이는 50을 넘지 않는다.

출력
조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.

13
but
i
wont
hesitate
no
more
no
more
it
cannot
wait
im
yours

예제 출력
i
im
it
no
but
more
wait
wont
yours
cannot
hesitate
*/

public class TCT_20190131_YOUNGWONLIM {
    
    public static void main(String[] args){     
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arWords = new ArrayList<String>();
        Set<String> setWords = new TreeSet<String>();
        Map<String,Integer> mapSortWords = new HashMap<String,Integer>();
        String strTemp ="";
        int intMin =0;
        
        
        int intWordCnt = sc.nextInt();
        
        for(int inx =0; inx < intWordCnt ; inx++)
        {
            strTemp = sc.next();
            if(strTemp.matches("[a-z]+")){
                setWords.add(strTemp);
            }
         }
        arWords.addAll(setWords);
        
        for(int jdx=0; jdx < arWords.size()-1; jdx ++)
        {
            intMin = jdx;
            for(int kdx=jdx+1; kdx < arWords.size(); kdx++)
            {
                
                if(arWords.get(intMin).length() > arWords.get(kdx).length())
                {
                    intMin = kdx;
                }
            }
            strTemp = arWords.get(jdx);
            arWords.set(jdx, arWords.get(intMin));
            arWords.set(intMin, strTemp);
         }
        
         for(int ldx =0; ldx< arWords.size(); ldx++)
         {
             System.out.println(arWords.get(ldx));
         }
    }
}
