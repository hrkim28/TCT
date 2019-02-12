
/*
* 문제
[문제]
0부터 9까지의 숫자를 한 번만 사용하여 만든 숫자 중에 입력숫자(1≤ N ≤10,000,000,000)와 가장 차이가 적은 숫자를 출력한다.
답이 여러 개일 경우, 더 작은 숫자를 출력한다.

---------- 예 시 ----------
[입력1]
222
[출력1]
219

[입력2]
5000
[출력2]
5012

*/

public class TCT_20190212_YOUNGWONLIM {
     
    public static void main(String[] args){     
        TCT_20190212_YOUNGWONLIM obj = new TCT_20190212_YOUNGWONLIM();
        int intTestCase01 = 222;
        int intTestCase02 = 5000;

        int intMinValue =0;
        int intMaxValue =0;
        Boolean bSearching = true;

        int intInputNum = intTestCase02;
        intMinValue = intInputNum;
        intMaxValue = intInputNum;
        
        while(bSearching)
        {
            if(obj.CheckDupNum(intMinValue))
            {
                intMinValue = intMinValue -1;
            }else{
                bSearching = false;
            }
        }
        
        bSearching = true;
        while(bSearching)
        {
            if(obj.CheckDupNum(intMaxValue))
            {
                intMaxValue = intMaxValue +1;
            }else{
                bSearching = false;
            }
        }
        
        if(intMaxValue - intInputNum > intInputNum- intMinValue)
        {
            System.out.print(intMinValue);
        }else
        {
            System.out.print(intMaxValue);
        }
        
        
   
        
        
    }    
    private boolean CheckDupNum(int intInputNum)
    {
        boolean bisDup = false;
        String[] strNum = Integer.toString(intInputNum).split("");
        for(int inx =0; inx < strNum.length-1; inx++)
        {
            for(int jdx =inx+1; jdx < strNum.length; jdx++)
            {
                if(!strNum[jdx].equals("") && strNum[inx].equals(strNum[jdx]))
                {
                    bisDup = true;
                } 
            }
        }
        return bisDup;
    }

}
