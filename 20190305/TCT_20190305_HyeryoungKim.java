import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TCT_20190305_HyeryoungKim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("진수를 입력하세요");
        int base = sc.nextInt();
        if ( base >= 3 && base <= 30 ) {
            TCT_20190305_HyeryoungKim tct = new TCT_20190305_HyeryoungKim();
            tct.printNumber(base);
        } else {
            System.err.println("진수는 3~30까지의 정수만 가능합니다.");
        }
        sc.close();
    }

    private void printNumber(int base) {
        int base10 = 0;
        int sum = 0;
        List<Integer> result = new ArrayList<Integer>();
        for ( int idx = 2 ; idx <= base ; idx++ ) {
            base10 = getBiggerNumber(base, idx);
            sum = getSumByConvertion(base, base10);
            if ( sum%idx == 0 ) {
                result.add(idx);
                break;
            }
        }
        
        if ( !result.isEmpty() ) {
        	int cnt = 2;
            while ( true ) {
                if ( Math.pow(result.get(0), cnt) < base ) {
                    result.add((int)Math.pow(result.get(0), cnt));
                    cnt++;
                } else {
                    break;
                }
            }
            
            System.out.println(result.toString());
        }
        
    }

    private int getBiggerNumber(int base, int n) {
        int tmp = base;
        while ( true ) {
            if ( tmp%n == 0 ) break;
            else tmp++;
        }
        return tmp;
    }

    private int getSumByConvertion(int base, int base10) {
        int sum = 0;
        int n = base10;
        int q = 0;
        int r = 0;
        
        while ( n >= 1 ) {
            q = n/base;
            r = n%base;
            n = q;
            sum += q;
            if ( n == 1 ) {
                sum += r;
            }
        }
        return sum;
    }
}