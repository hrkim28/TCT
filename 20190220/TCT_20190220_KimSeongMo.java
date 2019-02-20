import java.util.Arrays;

public class TCT_20190220_KimSeongMo {
    
    public static void main(String[] args){
        TCT_20190220_KimSeongMo obj = new TCT_20190220_KimSeongMo();
        int[] input = {10, -4, 3, 1, 5, 6, -35, 12, 21, -1};
        System.out.println(obj.getMaxSum( input ));
    }

    private int getMaxSum(int[] input){
        int max = Integer.MIN_VALUE;
        for( int length = 1; length <= input.length; length++ ){
            for( int inx = 0; inx <= input.length - length; inx++ ){
                if(Arrays.stream(input, inx, inx+length).sum() > max){
                    max = Arrays.stream(input, inx, inx+length).sum();
                }
            }
        }
        return max;
    }
}
