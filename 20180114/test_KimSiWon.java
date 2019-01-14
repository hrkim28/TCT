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
public class Kimsiwon_20170117 {

	public static void main( String[] args ){
		
		String input = "abbcccccca"; //aaabbcccccca    abbcccccca    apple
		
		String output = "";
		
		output = run(input);
		
		System.out.println("input: " + input + " / output: " + output);
		
	}
	
	public static String run(String input){
		String result = "";
		String tmpString = input.substring(0, 1);
		int tmpCount = 0;
		
		for (int idx = 0; idx < input.length(); idx++){
			if(tmpString.equals(input.substring(idx, idx+1))){
				tmpCount = tmpCount + 1;
			}
			else{
				if(tmpCount > 1){
					result = result.concat(tmpString.concat(String.valueOf(tmpCount)));
				}else{
					result = result.concat(tmpString);
				}
				tmpCount = 1;
				tmpString = input.substring(idx, idx+1);
			}
			
		}
		
		if(tmpCount>1){
			result = result.concat(tmpString.concat(String.valueOf(tmpCount)));
		}else{
			result = result.concat(tmpString);
		}
		
		
		return result;
	}
	
}