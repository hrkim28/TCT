
public class KimHyeRyoung_20170214 {
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
	public static void main(String[] args) {
		String numStr = "0a23165789";
		System.out.println(checkUseOnce(numStr));
	}
	
	public static String checkUseOnce( String input ) {
		StringBuffer sb = new StringBuffer();
		String result = "";
		if ( !isNumber( input ) ) { // 숫자인지 체크
			result = "false";
		} else if ( input.length() != 10 ) { // 0~9 10자리 포함 여부 체크
			result = "false";
		} else {
			for ( int idx = 0 ; idx < input.length() ; idx++ ) {
				String chr = input.substring(idx,idx+1);
				if ( sb.indexOf(chr) > 0 ) {
					result = "false";
					break;
				} else {
					sb.append(chr);
					result = "true";
				}
			}
		}
		
		return result;
	}
	
	public static boolean isNumber( String input ) {
		try {
			Double num = Double.parseDouble(input);
			return true;
		} catch ( NumberFormatException ne ) {
			ne.getMessage();
			return false;
		}
	}

}
