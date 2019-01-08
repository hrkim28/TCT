package lge.prm.spec.controller;

public class reverse {

    //형변환 없이!

    public static void main(String[] args){

        int[] numArr = {101, 195, 265, 750};

        for(int inx = 0; inx < numArr.length; inx++){
            reverseCal(numArr[inx]);
        }

    }

    public static void reverseCal(int num){
        int cnt = 0;
        int tempOrigin = 0;
        int tempReverse = 0;
        while(true){
            if(cnt == 0){
                tempOrigin = num;
                tempReverse = reverseNum(tempOrigin);
            }else{
                tempReverse = reverseNum(tempOrigin);
            }

            if(tempOrigin == tempReverse){
                System.out.println("Input : "+num+", 반복횟수 : "+cnt + ", 최종반전수 : "+ tempReverse);
                break;
            }else{
                tempOrigin += tempReverse;
                if(cnt >= 100){
                    System.out.println("Input : "+num+", 반복횟수 : Over 100, 최종반전수 : "+ tempReverse);
                    break;
                }else{
                    cnt++;
                }
            }
        }
    }

    public static int reverseNum(int num){
        int logValue = 0;
        for(int inx = 1; inx <= Math.log10(num); inx++){
            logValue++;
        }
        int reverse = 0;
        for(int inx = logValue; inx >= 0; inx--){
            int jetsu = 1;
            int tempChar;
            for(int jnx = 0; jnx < inx; jnx++){
                jetsu *= 10;
            }
            tempChar = ( num%(jetsu*10) )/jetsu;
            for(int knx = 0; knx < logValue-inx; knx++){
                tempChar *= 10;
            }
            reverse+=tempChar;
        }
        return reverse;
    }


}
