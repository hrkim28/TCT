import java.util.ArrayList;

/*
[2017.02.14 오늘의 문제]
0~9까지의 문자로 된 숫자를 입력 받았을 때, 
이 입력 값이 0~9까지의 숫자가 각각 한 번 씩만 사용된 것인지 확인하는 함수를 구하시오.
[조건]
숫자의 순서는 바뀔 수 있음.
단, 0~9까지의 숫자가 모두 포함되어야 함.
[출력 예시]
입력 : 0123456789 01234 01234567890 6789012345 012322456789
결과 : true false false true false
*/

public class Kimsiwon_20170214 {
	public static void main( String[] args ) {
		
		String input = "0123224567895"; //0123456789 01234 01234567890 6789012345 0123224567895;
		
		if(run(input)){
			System.out.println("Input: " + input + "/ Result: True");		
		}else{
			System.out.println("Input: " + input + "/ Result: False");
		}
    }
	
	public static boolean run(String Input){
		boolean result = false;
		boolean checkNotExist = true;
		ArrayList<String> inputSplit = new ArrayList<String>();
		int i = 0;
		String splitString = "";
		
		if(Input.length() == 10){
			result = true;
			
			while(checkNotExist && i < 9){
				splitString = Input.substring(i,i+1);
				
				if(inputSplit.contains(splitString)){
					result = false;
					checkNotExist = false;					
				}else{
					inputSplit.add(splitString);
					i = i + 1;
				}				
				
			}
			
		}
		
		return result;
	}
}
