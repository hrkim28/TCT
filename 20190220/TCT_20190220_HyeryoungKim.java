import java.util.Scanner;

public class TCT_20190220_HyeryoungKim {

    
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
    
    // 가장 작은 수를 기준으로 leftMaxSum, rightMaxSum을 구한 후 비교
    private static int getMaxSum(int[] numbers) {
        int tmp = 0;
        int minNumber = 0;
        int minIndex = 0;
        for ( int idx = 0 ; idx < numbers.length ; idx++ ) {
            if ( idx == 0 ) minNumber = numbers[idx]; 
            tmp = numbers[idx];
            if ( minNumber > tmp ) {
                minNumber = tmp;
                minIndex = idx;
            }
        }
        
        int leftMaxSum = getLeftMaxSum(numbers, minIndex);
        int rightMaxSum = getRightMaxSum(numbers, minIndex);
        int totalSum = leftMaxSum + minNumber + rightMaxSum;
        
        int result = ( leftMaxSum > totalSum ) ? leftMaxSum : totalSum;
        result = ( result > rightMaxSum ) ? result : rightMaxSum;
        
        return result;
    }
    
    private static int getLeftMaxSum(int[] numbers, int minIndex) {
        int tmp = 0;
        int max = 0;
        for ( int idx = minIndex - 1 ; idx >= 0 ; idx-- ) {
            tmp += numbers[idx];
            if ( max < tmp ) {
                max = tmp;
            }
        }
        return max;
    }
    
    private static int getRightMaxSum(int[] numbers, int minIndex) {
        int tmp = 0;
        int max = 0;
        for ( int idx = minIndex + 1 ; idx < numbers.length ; idx++ ) {
            tmp += numbers[idx];
            if ( max < tmp ) {
                max = tmp;
            }
        }
        return max;
    }
}