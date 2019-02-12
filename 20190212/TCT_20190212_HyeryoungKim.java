import java.util.Scanner;

public class TCT_20190212_HyeryoungKim {

	public static void main(String[] args) {
        TCT_20190212_HyeryoungKim tct = new TCT_20190212_HyeryoungKim();

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int input = sc.nextInt();

        System.out.println(tct.getMinDiffNumber(input));
    }

    private int getMinDiffNumber(int input) {
        int result = 0;
    	if ( isNumberForUnique(input) ) {
            result = input;
        } else {
            boolean flag = false;
            int minus = input;
            int plus = input;
            while ( !flag ) {
            	minus--;
            	plus++;
            	if ( isNumberForUnique(minus) ) {
            		flag = true;
            		result = minus;
            	} else if ( isNumberForUnique(plus) ) {
            		flag = true;
            		result = plus;
            	} else {
            		flag = false;
            	}
            }
        }
        
        return result;
    }

    private boolean isNumberForUnique(int number) {
        String strNumber = String.valueOf(number);
        boolean isUnique = false;
        boolean[] usedCheck = new boolean[10];
        for ( int idx = 0 ; idx < strNumber.length() ; idx++ ) {
            if ( usedCheck[Integer.valueOf(strNumber.substring(idx, idx+1))] ) {
                return false;
            } else {
                usedCheck[Integer.valueOf(strNumber.substring(idx, idx+1))] = true;
            }
        }
        
        isUnique = true;
        return isUnique;
    }
}	
