package teamExcercise;

public class TCT_20190130_NaHyejeong {
	
	public static void main(String[] args) {
	
		// 코드몬스터 상금 
		int[][] pestival_18  = {{500,1},{300,2},{200,3},{50,4},{30,5},{10,6}} ;
		int[][] pestival_19  = {{512,1},{256,2},{128,4},{64,8},{32,16}} ;
		
		// 승우 예상등수
		int n  = 6;
		int [][] ab = {{8,4} ,{13,19},{8,10},{18,18},{8,25},{13,16}};
	
		for (int i = 0; i < n ; i++) {
			int price = calculatePrize(ab[i],pestival_18,pestival_19);
			System.out.println("case"+(i+1) +" : " + price*10000);
		}
	}

	private static int calculatePrize(int[] is, int[][] pestival_18, int[][] pestival_19) {
		
		int prize = 0;
		
		//2018 년도 상금
		int tmp = 0;
		for (int i = 0; i < pestival_18.length; i++) {
			tmp += pestival_18[i][1];
			if( is[0] <= tmp ) {
				prize += pestival_18[i][0];
				break;
			}
		}
		//2019 년도 상금
		tmp = 0;
		for (int i = 0; i < pestival_19.length; i++) {
			tmp += pestival_19[i][1];
			if( is[1] <= tmp ) {
				prize += pestival_19[i][0];
				break;
			}
		}
		return prize;
	} 
	
}
