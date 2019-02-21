public class TCT_20190221_LeeJinKyoung {
	public static void main(String[] args) {

		String []subway = new String[] {
			"0 32 0 3",
			"3 13 1 0",
			"28 25 1 5",
			"39 0 6 0"
		};

		int oneWay = 1000;
		int transfer = 200;
		int result = 0;
		int maxResult = 0;

		for(int inx = 0;inx < subway.length;inx++ ) {
			String splitSubway[] = subway[inx].split(" ");
			
			result = result + (Integer.parseInt(splitSubway[1]) - Integer.parseInt(splitSubway[0])) * 1000 + 
					(Integer.parseInt(splitSubway[3]) - Integer.parseInt(splitSubway[2])) * 200;
			
			if( result > maxResult) {
				maxResult = result;
			}
		}
		
		System.out.println(maxResult);
		
	}
}
