import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TCT_20190211_HyeryoungKim {
    /*
    3
    BAPC
    AABA
    ABCABCBBAAACC

    * 예제 출력
    OK
    FAKE
    OK
    */

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        TCT_20190211_HyeryoungKim tct = new TCT_20190211_HyeryoungKim();

        Scanner sc = new Scanner(System.in);
        System.out.println("테스트 케이스 개수를 입력하세요.");
        int testCount = sc.nextInt();
        if ( testCount > 100 ) {
        	System.err.println("테스트 케이스의 개수는 100이하의 자연수이어야 합니다.");
        } else {
            String testCase1 = "BAPC";
            tct.getResult(testCase1);
            
            String testCase2 = "AABA";
            tct.getResult(testCase2);
            
            String testCase3 = "ABCABCBBAAACC";
            tct.getResult(testCase3);
        }
	}

    private void getResult(String str) {
        boolean flag = true;
    	Map<String, Integer> map = new HashMap<String, Integer>();
        for ( int idx = 0 ; idx < str.length() ; idx++ ) {
            String alpha = str.substring(idx, idx+1);
            if ( map.containsKey(alpha) ) {
            	map.put(alpha, map.get(alpha) + 1);
            	if ( map.get(alpha)%3 == 0 ) {
            		if ( idx == str.length() - 1 ) {
            			flag = false;
            			break;
            		} else {
            			String nextAlpha = str.substring(idx+1, idx+2);
            			if (!alpha.equals(nextAlpha)) {
            				flag = false;
                			break;
            			}
            		}
            	}
            } else {
            	map.put(alpha, 1);
            }
        }
        
        printResult(flag);
    }
    
    private void printResult(boolean flag) {
    	if (flag) {
    		System.out.println("OK");
    	} else {
    		System.out.println("FAKE");
    	}
    }
}
