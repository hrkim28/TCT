import java.util.Scanner;

public class Sangyunyi_170123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
[2017.01.23 오늘의 문제]
양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
예를들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
입력받은 양의 정수 n이 하샤드수인지 아닌지 판단하는 함수를 완성하세요.
예를들어 n이 10, 12, 18, 153, 142857.. 이면 True를 리턴 11, 13..이면 False를 리턴하면 됩니다.
제약조건 : 문자열로 전환하지 말것.
 */
		Scanner scannerInput = new Scanner (System.in);
		System.out.print("숫자입력 : ");
		int iInput = scannerInput.nextInt();
		int iResult = 0;
		
		
		while(1==1){
			int iTemp = iInput/10; 
			//System.out.println("iTemp\t"+iTemp);//System.out.println("iInput%10\t"+iInput%10);
			if(iTemp>0){//나눠지면
				iResult += iInput%10;
				iInput = iTemp;
				//System.out.println("iResult\t"+iResult);
			}else{
				iResult += iInput;
				//System.out.println("iResult\t"+iResult);
				break;
			}
		}
		if(iResult%9==0){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}

}
