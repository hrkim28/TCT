package teamExcercise;

public class TCT_20190213_NaHyejeong {

	public static void main(String[] args) {
		System.out.println(getOperationMinCnt(10)); //testcase1
		System.out.println(getOperationMinCnt(30)); //testcase2
	}

	private static int getOperationMinCnt(int inputNum) {
		int operationCnt = 0;
		
		while(inputNum > 1) {
			if( inputNum%3 == 0 ) {
				inputNum = inputNum/3;
			}else if( inputNum%3 == 1) {
				inputNum--;
			}else{
				inputNum = inputNum/2;
			}
			operationCnt++;
		}
		
		return operationCnt;
	}
	
	
	
}
