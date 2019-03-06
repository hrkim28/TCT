package teamExcercise;

public class TCT_20190306_NaHyejeong {

	/**
	 * [문제]
		Java에서는 변수의 이름이 여러 단어로 이루어져있을 때, 다음과 같은 방법으로 변수명을 짓는다.
		첫 단어는 소문자로 쓰고, 다음 단어부터는 첫 문자만 대문자로 쓴다. 또, 모든 단어는 붙여쓴다. 
		따라서 Java의 변수명은 javaIdentifier, longAndMnemonicIdentifier, name과 같은 형태이다.
		반면에 C++에서는 변수명에 소문자만 사용한다.
		단어와 단어를 구분하기 위해서 밑줄('_')을 이용한다. 
		C++ 변수명은 c_identifier, long_and_mnemonic_identifier, name 과 같은 형태이다.
		
		C++형식의 변수명을 Java형식의 변수명으로, 또는 그 반대로 바꿔주는 프로그램을 만들려고 한다.
		각 언어의 변수명 형식의 위의 설명을 따라야 한다.
		만약 C++형식과 Java형식 둘 다 아니라면, 에러를 발생시킨다. 변수명을 변환할 때, 단어의 순서는 유지되어야 한다.
		
		[입력 예1]
		 long_and_mnemonic_identifier
		
		[출력 예1]
		 longAndMnemonicIdentifier
		
		[입력 예2]
		 jobLog
		
		[출력 예2]
		 job_log

	 * @param args
	 */
	public static void main(String[] args) {
		
		String intputVal  = "long_and_mnemonic_identifier";
		String changedVal = "";
		
		switch (checkValType(intputVal)) {
		case "JAVA":
			changedVal = changeCType(intputVal);
			break;
		case "C++":
			changedVal = changeJavaType(intputVal);
			break;
		default:
			 try {
				throw new Exception("변수명 에러");
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
		
		//출력
		System.out.println(changedVal);
	}

	private static String changeJavaType(String intputVal) {
		String changedVal = "";
		
		int i = 0;
		while(i < intputVal.length()) {
			if(intputVal.charAt(i) == '_') {
				i++;
				changedVal += String.valueOf(intputVal.charAt(i)).toUpperCase();
			}else {
				changedVal += intputVal.charAt(i);
			}
			i++;
		}
		return changedVal;
	}

	private static String changeCType(String intputVal) {
		String changedVal = "";

		int i = 0;
		while(i < intputVal.length()) {
			if(intputVal.charAt(i) >= 'A' && intputVal.charAt(i) <= 'Z') {
				changedVal += "_"+ String.valueOf(intputVal.charAt(i)).toLowerCase();
			}else {
				changedVal += intputVal.charAt(i);
			}
			i++;
		}
		return changedVal;
	}

	private static String checkValType(String inputVal) {
		if(!inputVal.contains(" ")) {
			if(inputVal.contains("_") && inputVal.toLowerCase().equals(inputVal)) {
				return "C++";
			}else{
				return "JAVA";
			}
		}else{
			return "ERROR";
		}
	}
	
	
}
