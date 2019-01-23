import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TCT_20190122_HyeryoungKim {

    public static void main(String[] args) {
    	TCT_20190122_HyeryoungKim tct = new TCT_20190122_HyeryoungKim();
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("총 계단의 수를 입력하세요.");
    	int sStairsCount = sc.nextInt();
    	
        System.out.println("각 계단의 숫자를 입력하세요(,로 구분하세요)");
        String sInput = sc.next();
        String[] sStairs = sInput.split(",");
        if ( sStairs.length != sStairsCount ) {
        	System.err.println("총 계단의 수와 입력한 각 계단의 숫자의 개수가 일치하지 않습니다.");
        } else {
        	tct.getSteppedStairs(sStairsCount, sStairs);
        }
    }
    
    public void getSteppedStairs(int n, String[] sStairs) {
    	int[] stairs = new int[n];
    	for ( int idx = 0 ; idx < n ; idx++ ) {
    		stairs[idx] = Integer.valueOf(sStairs[idx]);
    	}
    	
    	int maxSum = stairs[n-1];
    	int prepreIndex = 0;
    	int preIndex = n-1;
    	for ( int idx = n-2 ; idx > 0 ; idx--) {
    		Map<String, Integer> map = getBiggerNumber(stairs, idx);
    		if ( idx == (prepreIndex-2) && idx == (preIndex-1) ) {
    			prepreIndex = preIndex;
    			preIndex = idx - 1;
    			maxSum += stairs[idx-1];
    		} else if ( idx == preIndex ) {
    			if ( idx == 1 && prepreIndex != (idx + 1) ) {
    				maxSum += stairs[idx-1];
    			} else {
    				continue;
    			}
    		} else {
    			maxSum += map.get("bigNumber");
    			prepreIndex = preIndex;
        		preIndex = map.get("bigIndex");
    		}
    		
    	}
    	
    	System.out.println("결과 : " + maxSum);
    }
    
    public Map<String, Integer> getBiggerNumber(int[] stairs, int idx) {
    	Map<String, Integer> map = new HashMap<String, Integer>();
    	int bigIndex = idx;
    	int bigNumber = stairs[idx];
    	if ( stairs[idx] < stairs[idx-1] ) {
    		bigNumber = stairs[idx-1];
    		bigIndex = idx-1;
    	}
    	
    	map.put("bigNumber", bigNumber);
    	map.put("bigIndex", bigIndex);
    	return map;
    }
}