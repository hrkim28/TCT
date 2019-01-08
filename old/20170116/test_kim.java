import java.util.*;

public class SangyunYi_170117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
문자열 압축 알고리즘 (LCP 기출문제)
문자열을 입력받아서, 같은 문자가 연속적으로 반복되는 경우에 그 반복 횟수를 표시하여 문자열을 압축하기.
단, 한번만 반복되는 문자는 숫자 없이  그대로 표기할것 
입력 예시: aaabbcccccca
출력 예시: a3b2c6a
입력 예시: abbcccccca
출력 예시: ab2c6a
입력 예시: apple
출력 예시: ap2le
		 */
		Scanner in = new Scanner(System.in); 
		System.out.print("입력 예시:  "); 
		String str = in.nextLine();
		char[] cInput = new char[str.length()];
		char kk = 'c';
		int c=0;
		String result = "";
		for(int i=0; i<str.length(); i++){
			cInput[i] = str.charAt(i);
		}
		
		for(int j=0; j<str.length(); j++){
			if(j>0){
				if(cInput[j-1]==cInput[j]){
					kk = cInput[j];
					c++;
				}else{
					result += new Character(kk).toString()+c;
					c=0;
				}
			}else{
				kk = cInput[j];
				c++;
			}
		}
		System.out.println("출력 예시: "+result);
		in.close();
	}

}
