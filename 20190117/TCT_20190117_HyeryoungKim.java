import java.util.ArrayList;
import java.util.Scanner;

public class TCT_20190117_HyeryoungKim {

    
    public static void main(String[] args){
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("3의 배수를 입력하시오.");
        int input = sc.nextInt();
        
        if ( input < 3 || input > 3000 ) {
            System.err.println("입력값은 3이상 3000이하 숫자여야 합니다.");
        } else if ( input%3 != 0 ) {
            System.err.println("입력값은 3의 배수여야 합니다.");
        } else {
            System.out.println("입력값 " + input + "인 경우, 경우의 수는 " + getCaseCount(input/3) + "입니다.");
        }
    }
    
    public static int getCaseCount(int input) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        int[] arr = null;
        
        for ( int idx = 1 ; idx <= input-2 ; idx++ ) {
            arr = new int[3];
            for ( int jdx = 1 ; jdx < input-idx ; jdx++ ) {
                arr[0] = idx;
                arr[1] = jdx;
                arr[2] = input - idx - jdx;
                
                list.add(arr);
            }
        }
        
        return list.size();
    }
}
