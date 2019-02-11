import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;


/*
* 문제

스파이들은 사령부와 통신하기 위해서 SMTP(비밀 메시지 전송 프로토콜)를 사용해 비밀 회선으로 전자 메시지를 보낸다.
메시지가 적들에 의해 조작되어 보내진 것이 아닌 진짜 메시지라는 것을 표시하기 위해 모든 메시지는 변형되는데, 이 변형 알고리즘은 메시지를 가로채는 자들이 우연히 변형 규칙을 흉내 낼 수 없을 정도로 정교하다.
또한 요원들의 머리에 총구가 겨눠져 강제로 메시지를 말한 경우 간단히 실수를 의도적으로 넣어 이 메시지가 강제로 쓰인 메시지라는 것을 알려줄 수 있다.

알고리즘대로 정확하게 변형된 메시지는 각 문자가 세 번 등장할 때 한 번 더 문자가 삽입된다.
예를 들면 요원이 "HELLOTHEREWELLBEFINE" 라는 메시지를 보내고 싶어 했다면 "HELLOTHEREEWELLLBEFINEE" 는 정확한 변형이다.
몇 년 동안 이 메시지들의 진짜 여부는 고도로 훈련된 원숭이들이 판별해내었다. 그러나 사령부에 도착하는 메시지들의 양이 많이 늘어나면서 이 작업을 자동으로 처리해주는 프로그램을 고안하기로 하였다.

* 입력
첫째 줄에 100 이하의 테스트 케이스의 개수가 주어진다.
그리고 각 테스트 케이스마다 대문자로만 이루어진 10만자 이하의 문자열 M이 한 줄에 주어진다.
이 문자열은 검사해야할 메시지다.

* 출력
테스트 케이스마다 메시지 M이 진짜 메시지면 "OK"를, 가짜 메시지면 "FAKE"를 한 줄에 출력한다.

* 예제 입력
3
BAPC
AABA
ABCABCBBAAACC


* 예제 출력
OK
FAKE
OK
*/

public class TCT_20190211_YOUNGWONLIM {
    
    public static void main(String[] args){     
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arWords = new ArrayList<String>();
        String strTemp ="";
        int intInputCnt = sc.nextInt();
        
        for(int inx =0; inx < intInputCnt ; inx++)
        {
            arWords.add(sc.next());
        }
        
        for(int jdx =0; jdx< arWords.size(); jdx++)
        {
            System.out.println(CheckRealMsg(arWords.get(jdx).toString()));
        }
    }
    
    public static String CheckRealMsg(String strInput)
    {
        String strResult = "OK";
        String strTemp = "";
        int intCnt =0;
        strInput = strInput.trim();
        TreeSet tsWords = new TreeSet<String>();
        String[] arInput = strInput.split("");
        Collections.addAll(tsWords, arInput);
        Object[] arCheckWord = tsWords.toArray();
        
        
        for(int inx =0; inx < arCheckWord.length; inx++)
        {
            intCnt = 0;
            for(int jdx =0; jdx< arInput.length; jdx++)
            {
                strTemp = arCheckWord[inx].toString();
                if(!strTemp.equals(" ") && strTemp.equals(arInput[jdx]))
                {
                    intCnt= intCnt + 1;
                    
                    if(intCnt == 3)
                    {
                        intCnt =0;
                        if(jdx+1 >= arInput.length || !strTemp.equals(arInput[jdx+1]))
                        {
                            strResult = "FAKE";
                            jdx = jdx+1;
                        }
                    }
                }
            }
        }
        
       
        
        
        
        
        
        return strResult;
    }
}
