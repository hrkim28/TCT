import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * TCT_20190123_HyeryoungKim
 */
public class TCT_20190123_HyeryoungKim {

    public static void main(String[] args) {
        TCT_20190123_HyeryoungKim tct = new TCT_20190123_HyeryoungKim();

        Scanner sc = new Scanner(System.in);
    	System.out.println("1. 주어질 10진수의 개수(n)를 입력하시오.");
        int n = sc.nextInt();
        if ( n > 3000000 ) {
            System.err.println("n은 3,000,000이하의 자연수만 가능합니다.");
        } else {
            System.out.println("2. 10진수를 입력하시오.(,로 구분하세요)");
            String sInput = sc.next();
            String[] strArr = sInput.split(",");
            if ( strArr.length != n ) {
                System.err.println("수가 일치하지 않습니다.");
            } else {
                int[] numArr = new int[n];
                for ( int idx = 0 ; idx < strArr.length ; idx++ ) {
                    numArr[idx] = Integer.valueOf(strArr[idx]);
                }
                
                tct.getResult(numArr);
            }
        }
    }

    public void getResult(int[] numArr) {
        int result = 0;
        List<Integer> numList = new ArrayList<Integer>();
        for ( int idx = 0 ; idx < numArr.length-1 ; idx++ ) {
        	if ( !numList.contains(numArr[idx]) ) {
        		numList.add(numArr[idx]);
        	}
        }

        Set<Integer> oddSet = getOddCase(numList, numArr);
        for ( int jdx : oddSet ) {
            result = result^jdx;
        }
        
        System.out.println("결과 : " + result);
    }

    public Set<Integer> getOddCase(List<Integer> numList, int[] numArr) {
        Set<Integer> oddSet = new HashSet<Integer>();
        int[] countArr = new int[numList.size()];
        
        for ( int idx = 0 ; idx < numList.size() ; idx++ ) {
        	int cnt = 0;
        	for ( int jdx = 0 ; jdx < numArr.length ; jdx++ ) {
        		if ( numList.get(idx) == numArr[jdx] ) {
        			cnt++;
        		}
        	}
        	countArr[idx] = cnt;
        }

        for ( int kdx = 0 ; kdx < countArr.length ; kdx++ ) {
            if ( countArr[kdx]%2 != 0 ) oddSet.add(numList.get(kdx));
        }
        return oddSet;
    }
}
