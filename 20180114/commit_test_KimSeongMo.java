/**
 * commit_test_KimSeongMo
 */
public class commit_test_KimSeongMo {
    public static void main(String[] args) {
        System.out.println("test start");
        System.out.println("result : " + sumMethod(100));
        System.out.println("test end");
    }

    private static int sumMethod(int input){
        int result = 0;
        for( int inx = 0; inx < input+1; inx ++ ){
            result += inx;
        }
        return result;
    }
}
