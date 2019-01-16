


public class kjyim_20190115 {

	public static void main(String[] args) {
		
		System.out.print(getFibo(100));
	}

	public static StringBuffer getFibo(int maxNo) {
		StringBuffer result = new StringBuffer();
		int firstNo = 0;
		int secondNo = 1;
		int temp = 0;
		
		result.append(firstNo + "," + secondNo);
 
		while(firstNo + secondNo <= maxNo ) {
			temp = firstNo + secondNo;
			result.append("," + temp);
			
			firstNo = secondNo;
			secondNo = temp;
		}
		return result;
	}
}
