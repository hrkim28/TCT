import java.util.Scanner;

public class TCT_20190213_HyeryoungKim {
	
	private int min = 0;
	public static void main(String[] args) {
        TCT_20190213_HyeryoungKim tct = new TCT_20190213_HyeryoungKim();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int input = sc.nextInt();
        
        // 10 -> 3
        // 30 -> 4
        // 17 -> 5
        tct.getMinCount(input, 0, false);
        sc.close();
    }

    /**
     * -1이 연속으로 나오면 최소값이 될 수 없음
     */
    private void getMinCount(int input, int cnt, boolean prevMinus) {
    	int answer = input;
    	if ( answer == 1 ) {
    		min = cnt;
    		System.out.println(min);
    	} else {
    		cnt++;
    		
    		if ( answer%2 != 0 && answer%3 != 0 ) {
    			answer = answer - 1;
    			prevMinus = true;
    		} else if ( answer%3 == 0 ) {
    			answer = answer/3;
    			prevMinus = false;
    		} else if ( answer%3 != 0 && answer%2 == 0 ) {
    			if ( (answer-1)%3 == 0 && !prevMinus) {
    				answer = answer - 1;
    				prevMinus = true;
    			} else {
    				answer = answer/2;
    				prevMinus = false;
    			}
    		}
    		
    		getMinCount(answer, cnt, prevMinus);
    	}
    }
}	
