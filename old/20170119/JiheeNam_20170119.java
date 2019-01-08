package test;

public class TestLCP_20170119 {

	/**
	 * @param args
	 * 
	 * 100부터 1000 사이의 숫자 중 각 자릿수에 해당하는 세제곱 값의 합이 해당 숫자와 동일한 숫자를 출력
	 * ex) 153 = 1x1x1 + 5x5x5 + 3x3x3
	 * = 1 + 125 + 27
	 * 
	 */

    public static void main(String[] args) throws Exception{
    	// TODO Auto-generated method stub
    	// TODO Auto-generated method stub 
    	for (int k=100; k<1000; k++){
            String a = String.valueOf(k);
            int a1 = Integer.valueOf( a.substring(0, 1) );
            int a2 = Integer.valueOf( a.substring(1, 2) );
            int a3 = Integer.valueOf( a.substring(2) );
            
            if (k == (a1*a1*a1 + a2*a2*a2 + a3*a3*a3)){
            	System.out.println("Armstrong Number : " + a);
            }
       	}
    } 
}



 
