import java.util.Scanner;

public class TCT_20190117_JaeseokLim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("입력 : ");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("출력 : " + checkResult(a));
		
		
		
	}
	
	private static int checkResult(int n) {
		int result = 0;
		int chkVal = 0;
		
		//n값 체크 3의 배수인지 확인 
		if ( n%3 != 0) {
			result = -1 ;
			return result;
		} else if ( n > 3000) {
			result = -1 ;
			return result;
		} else {
			 chkVal = n/3;
		}
		
		for ( int firstVal = 1 ; firstVal < chkVal ; firstVal++ ){
			for ( int secondVal = 1 ; firstVal+secondVal < chkVal; secondVal++) {
				if ( chkVal-firstVal+secondVal >=1 ) {
					result++;
				}
			}
		}
		
		return result;
	}

}
