import java.util.Scanner;

/**
 * TCT_20190220_HyeryoungKim
 */
public class TCT_20190220_HyeryoungKim {

    /*
    10
    10 -4 3 1 5 6 -35 12 21 -1
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 숫자의 개수를 입력하세요.");

        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("2. 입력한 개수만큼 숫자를 입력하세요.");
        for ( int idx = 0 ; idx < n ; idx++ ) {
            numbers[idx] = sc.nextInt();
        }
        
        System.out.println(getMaxSum(numbers));
        sc.close();
    }

    private static int getMaxSum(int[] numbers) {
        int tmp = 0;
        int sum = 0;
        for ( int num : numbers ) {
            if ( num < 0 ) {
                tmp = 0;
            } else {
                tmp += num;
            }
            
            if ( sum < tmp ) {
                sum = tmp;
            }
        }
        return sum;
    }
}