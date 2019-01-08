package lge.prm.rest.spec.controller;
public class KimSeongMO_20170228 {

    public static void main(String[] args){
        String first = "1001101";
        String second = "10010";
        System.out.println(first + " + " + second + " = " + calBinarySum(first, second));

    }

    public static String calBinarySum(String first, String second){
        String result = "";
        String big = "";
        String small = "";
        if(first.length() >= second.length()){
            big = first;
            small = second;
        }else{
            big = second;
            small = first;
        }

        int bigNum = 0;
        int smallNum = 0;
        int isUp = 0;

        for(int inx = 0; inx < big.length(); inx++){
            if(inx < small.length()){
                bigNum = Integer.parseInt(big.charAt(big.length()-(inx+1))+"");
                smallNum = Integer.parseInt(small.charAt(small.length()-(inx+1))+"");
                if(bigNum+smallNum+isUp == 3){
                    result = 1+result;
                    isUp = 1;
                }else if(bigNum+smallNum+isUp == 2){
                    result = 0+result;
                    isUp = 1;
                }else{
                    isUp = 0;
                    result = (bigNum+smallNum+isUp)+result;
                }
            }else{
                bigNum = Integer.parseInt(big.charAt(big.length()-(inx+1))+"");
                if(bigNum+isUp == 2){
                    result = 0+result;
                    isUp = 1;
                }else{
                    result = (bigNum+isUp)+result;
                    isUp = 0;
                }
            }
        }

        if(isUp == 1){
            result = 1+result;
        }

        return result;
    }

}
