package test;

public class TestLCP_20170118 {

	/**
	 * @param args
	 * 
	 * n X m 행렬에 maxCnt 의 알파벳 넣기
	 * maxCnt 가 nXm 보다 작으면 증가 -> 감소 배열 (가로방향 배열, 세로방향 배열)
	 * 그러고도 남으면 'A' 로 채우기
	 * 
	 */

    public static void main(String[] args) throws Exception{
    	// TODO Auto-generated method stub

    	int n = 3;
    	int m = 5;
    	int maxCnt = 10;
    	int out = 0; 

    	// 가로출력
    	/* ABCD 1 2 3 4 
    	 * EFGH 5 6 7 8
    	 * IJIH 9 10 9  8
    	 */
    	System.out.println("(가로)");
    	
    	for(int i=0; i<n; i++){
    		for (int j=0; j<m; j++){
    			
				if ( (i*m) + j < maxCnt ){
					out++; // maxCnt 될때까지 알파벳 증가
				}else{ 
					out--;  // maxCnt 이후부터는 알파벳 감소	
				}
				if( out < 1 ) { out = 1; }// A 이하로 갈경우 A로 고정 
				System.out.print((char)(out+64));  
    		}    		 
    		System.out.println(); 
    	} 

		System.out.println(); 
    	// 세로출력
    	/* ADGJ 1 4 7 10 
    	 * BEHI 2 5 8  9
    	 * CFIH 3 6 9  8
    	 */
    	System.out.println("(세로)");

    	for(int i=0; i<n; i++){
    		for (int j=0; j<m; j++){
    			
				if ( (i+1) + (j*n) <= maxCnt ){
					out = (i+1) + (j*n) ;  
				}else{ 
					out =  maxCnt - ((i+1) + (j*n) - maxCnt); 	
				}
				if( out < 1 ) { out = 1; } 
				System.out.print((char)(out+64));  
    		}    		 
    		System.out.println(); 
    	} 
    } 
}



 
