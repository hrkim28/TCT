package test;

public class TestLCP_20170117 {

	/**
	 * @param args
	 * 
	 * 문자열을 입력받아서 같은 문자가 연속적으로 반복되는 경우, 반복횟수를 표시하여 압축하기
	 * 
	 */
    public static void main(String[] args) {
    	// TODO Auto-generated method stub  
    	String input = "abcccddeeeee";
    	char before_string = ' ';
    	int cnt=0; 
    	int i;
    	
    	for(i=0;i<input.length();i++){ 
    		// 이전글자랑 다른 글자가 나오면 글자 출력
    		if( ! (before_string == input.charAt( i )) ){ 
    			// cnt가 2이상일때 출력
    			if(cnt>1) {
    				System.out.print(cnt);
    				cnt ++;
    			}
    			System.out.print(input.charAt( i ));
    			before_string = input.charAt( i );
    			cnt=0;
    		}
    		// 이전글자랑 같은 글자가 나오면 글자 수 count
    		if ( (before_string == input.charAt( i )) )
    			cnt ++;    		
    	}
    	// 마지막 글자가 연속 숫자일 경우 출력
    	if(cnt>1) {
    	  	System.out.print(cnt);
    	  	cnt ++;
    	  }
    }    
}
