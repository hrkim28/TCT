import java.util.Scanner;

public class TCT_20190213_HyeryoungKim {
	
	private int min = 0;
	public static void main(String[] args) {
        TCT_20190213_HyeryoungKim tct = new TCT_20190213_HyeryoungKim();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int input = sc.nextInt();
        
        tct.getMinCount(input, 0);
        sc.close();
    }

    private void getMinCount(int input, int cnt) {
    	int answer = input;
    	if ( answer == 1 ) {
    		min = cnt;
    		System.out.println(min);
    	} else {
    		cnt++;
    		
    		if ( answer%2 != 0 && answer%3 != 0 ) {
    			answer = answer - 1;
    		} else if ( answer%3 == 0 ) {
    			answer = answer/3;
    		} else if ( answer%3 != 0 && answer%2 == 0 ) {
    			if ( (answer-1)%3 == 0 ) {
    				answer = answer - 1;
    			} else {
    				answer = answer/2;
    			}
    		}
    		
    		getMinCount(answer, cnt);
    	}
    }
}	
