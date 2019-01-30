package teamExcercise;

public class TCT_20190129_NaHyejeong {
	

	public static void main(String[] args) {
		 
		 String question = "5+6*3-6/2+5" ;
		 System.out.println("입력 : " + question);
		 
		 System.out.println("========출력============");
		 int [] idx_operation = new int[4];
		 while( true ) {
			 
			 idx_operation[0] = question.indexOf("*");
			 idx_operation[1] = question.indexOf("/");
			 idx_operation[2] = question.indexOf("+");
			 idx_operation[3] = question.indexOf("-");
			 
			 if( idx_operation[0] > 0 || idx_operation[1] > 0 ) {
				// 곱셈 or 나눗셈 
				 if( idx_operation[1] < 0 ) {
					 question = calOperation( "*" , idx_operation[0], question );
				 } else if(idx_operation[0] < 0 ) {
					 question = calOperation( "/" , idx_operation[1], question );
				 } else if( idx_operation[1] > idx_operation[0]) {
					 question = calOperation( "*" , idx_operation[0], question );
				 } else {
					 question = calOperation( "/" , idx_operation[1], question );
				 }
			 }else if( idx_operation[2] > 0 || idx_operation[3] > 0 ) { 
				 // 덧셈 or 뺄셈 
				 if( idx_operation[3] < 0 ) {
					 question = calOperation( "+" , idx_operation[2], question );
				 } else if(idx_operation[2] < 0 ) {
					 question = calOperation( "-" , idx_operation[3], question );
				 } else if( idx_operation[3] > idx_operation[2]) {
					 question = calOperation( "+" , idx_operation[2], question );
				 } else {
					 question = calOperation( "-" , idx_operation[3], question );
				 }
			 }else {
				 break;
			 }
			 //연산결과 출력
			 System.out.println(question);
			
		 }
	}
	
	private static String calOperation(String curOperation, int curIdx, String question) {

		String str1 = question.substring(0,curIdx);
		String str2 = question.substring(curIdx+1);
		
		String strNum1 = str1;
		String strNum2 = str2;
		String operations = new String( "+-*/" ); 
		
		//연산 숫자 찾기1
		boolean onlyNumflag1 = true;
		for (int i = str1.length()-1; i >= 0; i--) {
			if( operations.contains(String.valueOf(str1.charAt(i)))){
				strNum1 = str1.substring(i+1);
				str1 = str1.substring(0, i+1);
				onlyNumflag1 = false;
				break;
			}
		}
		//연산 숫자 찾기2
		boolean onlyNumflag2 = true;
		for (int i = 0; i < str2.length(); i++) {
			if( operations.contains(String.valueOf(str2.charAt(i)))){
				strNum2 = str2.substring(0,i);
				str2 = str2.substring(i);
				onlyNumflag2 = false;
				break;
			}
		}
		
		//사칙연산
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = 0 ; 
		
		switch (curOperation) {
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		default:
			break;
		}
		 

		if( onlyNumflag1 ) {
			str1 ="";
		}
		if( onlyNumflag2 ) {
			str2 ="";
		}
		
		return str1+ String.valueOf(result) + str2 ;
	}
	
	
	
}
