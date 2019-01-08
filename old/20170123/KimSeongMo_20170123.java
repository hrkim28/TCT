package build.classes;

public class test4 {
    /*양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
        예를들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
        입력받은 양의 정수 n이 하샤드수인지 아닌지 판단하는 함수를 완성하세요.
        예를들어 n이 10, 12, 18, 153, 142857.. 이면 True를 리턴 11, 13..이면 False를 리턴하면 됩니다.*/
    
    public static void main(String[] args){
        // TODO Auto-generated method stub
        
        int[] inputList = {10,12,18,153,142857,11,13};
        for(int inx = 0; inx < inputList.length; inx++){
            System.out.println("Is 하샤드? "+isHashad(inputList[inx])+"\n");
        }
    }
    
    public static boolean isHashad(int inputNum){
        int input = inputNum;
        
        //자릿수 구하기
        int powNum = (int)Math.floor(Math.log10(input));
        int temp = (int)Math.pow(10, powNum);
        int sum = 0;
        
        //각 자리 숫자 합 구하기
        for(int inx = 0; inx < (powNum+1); inx++){
            if(inx == 0){
                sum += input/temp;
            }else{
                sum += (input%(temp*10))/temp;
            }
            temp = (int)Math.pow(10, powNum-(inx+1));
        }
        
        System.out.println("Input : "+input);
        System.out.println("Sum : "+sum);
        
        if((input%sum) == 0){
            return true;
        }else{
            return false;
        }
    }

}
