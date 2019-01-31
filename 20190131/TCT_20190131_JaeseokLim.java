import java.util.ArrayList;
import java.util.Scanner;

public class TCT_20190131_JaeseokLim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int loopCnt = sc.nextInt();
		
		ArrayList<String> testCase = new ArrayList<String>();
		//�ߺ� ����
		for ( int idx = 0 ; idx< loopCnt ; idx++ ) {
			String temp = sc.next();
			if ( !testCase.contains(temp) ){
				testCase.add(temp);
			}
		}
		//bubbleSort  + Swap
		for ( int idx = 0 ; idx < testCase.size()-1 ; idx++ ) {
			for ( int jdx = idx+1; jdx < testCase.size(); jdx++) {
				// �տ� �ִ� ���� ���̰� ũ�ų� ���� ������ �ڿ� ������ �ٲ۴�.
				if ( testCase.get(idx).length() > testCase.get(jdx).length() ) {
					swap(testCase,idx,jdx);
				} else if (testCase.get(idx).length() == testCase.get(jdx).length()){ 
					if ( testCase.get(idx).compareTo(testCase.get(jdx))>0) {
						swap(testCase,idx,jdx);
					}
				}
			}
			//���
			System.out.println(testCase.get(idx));
		}
		System.out.println(testCase.get(testCase.size()-1));
		
    }
	
	private static void swap (ArrayList<String> caseResult,int idx,int jdx){
		String temp = "";
		
		temp = caseResult.get(idx);
		caseResult.set(idx, caseResult.get(jdx));
		caseResult.set(jdx, temp);
		
	}
	
}
