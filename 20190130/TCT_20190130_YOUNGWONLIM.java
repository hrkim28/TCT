import java.util.Scanner;


/*
2018년에 이어, 2019년에도 코드 몬스터가 개최된다!
코드 몬스터에서 빠질 수 없는 것은 바로 상금이다. 2018년에 개최된 제1회 코드 몬스터에서는, 본선 진출자 100명 중 21명에게 아래와 같은 기준으로 상금을 부여하였다.

순위  상금  인원
1등  500만원   1명
2등  300만원   2명
3등  200만원   3명
4등  50만원    4명
5등  30만원    5명
6등  10만원    6명

2019년에 개최될 제2회 코드 몬스터에서는 상금의 규모가 확대되어, 본선 진출자 64명 중 31명에게 아래와 같은 기준으로 상금을 부여할 예정이다.

순위  상금  인원
1등  512만원   1명
2등  256만원   2명
3등  128만원   4명
4등  64만원    8명
5등  32만원    16명

승우는 자신이 코드 몬스터에 출전하여 받을 수 있을 상금이 얼마인지 궁금해졌다. 그는 자신이 두 번의 코드 몬스터 본선 대회에서 얻을 수 있을 총 상금이 얼마인지 알아보기 위해, 상상력을 발휘하여 아래와 같은 가정을 하였다.
제1회 코드 몬스터 본선에 진출하여 a등(1 ≤ a ≤ 100)등을 하였다. 단, 진출하지 못했다면 a = 0으로 둔다.
제2회 코드 몬스터 본선에 진출하여 b등(1 ≤ b ≤ 64)등을 할 것이다. 단, 진출하지 못했다면 b = 0으로 둔다.
승우는 이러한 가정에 따라, 자신이 받을 수 있는 총 상금이 얼마인지를 알고 싶어한다.

2. 입력
첫 번째 줄에 승우가 상상력을 발휘하여 가정한 횟수 T(1 ≤ T ≤ 1,000)가 주어진다.
다음 T개 줄에는 한 줄에 하나씩 승우가 해본 가정에 대한 정보가 주어진다. 각 줄에는 두 개의 음이 아닌 정수 a(0 ≤ a ≤ 100)와 b(0 ≤ b ≤ 64)가 공백 하나를 사이로 두고 주어진다.

3. 출력
각 가정이 성립할 때 승우가 받을 상금을 원 단위의 정수로 한 줄에 하나씩 출력한다. 입력이 들어오는 순서대로 출력해야 한다.

4. 예제 입력
6
8 4
13 19
8 10
18 18
8 25
13 16

5. 예제 출력
1780000
620000
1140000
420000
820000
620000
*/
public class TCT_20190130_YOUNGWONLIM {
    public static void main(String[] args){     
        Scanner sc = new Scanner(System.in);
        int intCnt = Integer.parseInt(sc.nextLine());
        int intResult = 0;
        String[][] strInputScore = new String[intCnt][2];
        for(int inx =0; inx<intCnt ; inx++)
        {
            strInputScore[inx] = sc.nextLine().split(" ");
        }   
        
        for(int jdx =0; jdx< intCnt; jdx ++)
        {
            intResult = getMoney(1,Integer.parseInt(strInputScore[jdx][0]));
            intResult = intResult +    getMoney(2,Integer.parseInt(strInputScore[jdx][1]));  
            System.out.println(intResult * 10000);
        }
    }
    
    public static int getMoney(int intTestnum, int intScore)
    {
        boolean bFlagContinue = true;
        int intResult =0;
        int intInx =0;
        int intPosition =0;
        int intMoney[][] = new int[7][2]; 
        
        if(intTestnum == 1)
        {
            intMoney[0][0] = 1;
            intMoney[0][1] = 500;
            intMoney[1][0] = 2;
            intMoney[1][1] = 300;
            intMoney[2][0] = 3;
            intMoney[2][1] = 200;
            intMoney[3][0] = 4;
            intMoney[3][1] = 50;
            intMoney[4][0] = 5;
            intMoney[4][1] = 30;
            intMoney[5][0] = 6;
            intMoney[5][1] = 10;     
            intMoney[6][0] = 10000;
            intMoney[6][1] = 0;  
            
        }else
        {
            intMoney[0][0] = 1;
            intMoney[0][1] = 512;
            intMoney[1][0] = 2;
            intMoney[1][1] = 256;
            intMoney[2][0] = 4;
            intMoney[2][1] = 128;
            intMoney[3][0] = 8;
            intMoney[3][1] = 64;
            intMoney[4][0] = 16;
            intMoney[4][1] = 32;
            intMoney[5][0] = 10000;
            intMoney[5][1] = 0;
        }
        
        while(bFlagContinue)
        {
            intPosition = intMoney[intInx][0] + intPosition;
            
            if(intPosition >= intScore)
            {
                intResult = intMoney[intInx][1];
                bFlagContinue = false;
            }
            if(intPosition < intScore)
            {
                intInx = intInx +1;
            }    
        }
        return intResult;
    }
}
