import java.util.Scanner;

public class TCT_20190124_HyeryoungKim {

    public static void main(String[] args) {
        TCT_20190124_HyeryoungKim tct = new TCT_20190124_HyeryoungKim();

        Scanner sc = new Scanner(System.in);
        System.out.println("자연수 짝수를 입력하세요.(단, 4 <= n <= 10,000)");
        int n = sc.nextInt();

        if ( (n < 4 || n > 10000) || n%2 != 0 ) {
            System.err.println("입력할 수는 4보다 크고 10,000보다 작은 짝수여야 합니다.");
        } else {
            tct.getMinCase(n);
        }
    }

    public void getMinCase(int n) {
        int a = 0;
        int b = 0;
        int min = 0;
        int cnt = 0;

        int[] result = new int[3];

        for ( int idx = 2 ; idx <= n/2 ; idx++ ) {
            a = idx;
            b = n - a;
            
            if ( checkPrimeNumber(a) && checkPrimeNumber(b) ) {
                int tmp = 0;
                cnt++;
                if ( cnt == 1 ) {
                	min = Math.abs(a-b);
                	result[0] = a;
                    result[1] = b;
                    result[2] = min;
                } else {
                	tmp = Math.abs(a-b);
                }
                
                if ( cnt > 1 && min >= tmp ) {
                	min = tmp;
                    result[0] = a;
                    result[1] = b;
                    result[2] = min;
                }
            }
        }

        for ( int jdx = 0 ; jdx < 2 ; jdx++ ) {
            System.out.print(result[jdx] + " ");
        }
    }

    public boolean checkPrimeNumber(int number) {
        boolean flag = true;
        for ( int idx = 2 ; idx <= number/2 ; idx++ ) {
            if ( number%idx == 0 ) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}