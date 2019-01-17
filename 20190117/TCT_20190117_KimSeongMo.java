public class TCT_20190117_KimSeongMo {
    public static void main(String[] args){
        TCT_20190117_KimSeongMo obj = new TCT_20190117_KimSeongMo();
        System.out.println(obj.getNumberOfCase(9));
        System.out.println(obj.getNumberOfCase(12));
        System.out.println(obj.getNumberOfCase(15));
        System.out.println(obj.getNumberOfCase(18));
    }
    
    private int getNumberOfCase  ( int inputNum ){
        int result = 0;
        int splitableNum = 0;
        if( inputNum >= 9 && inputNum%3 == 0 ){
            splitableNum = inputNum/3;
            result = (splitableNum-2)*(splitableNum-1)/2;
        }
        return result;
    }
}
