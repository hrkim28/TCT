
public class TCT_20190225_LeeJinKyoung {
	public static void main(String[] args) {
		int[] input1 = {2000, 3000};
		TCT_20190225_LeeJinKyoung.caculator(input1,null);
		
		int[] input2 = {1000, 3000, 1000};
		TCT_20190225_LeeJinKyoung.caculator(input2,null);		

		int[] input3 = {2000, 2000, 2000, 2000};
		
		int[] input4 = {1000, 10000, 8000, 5000, 7000, 3000, 9000};
		
	}
	
	public static void caculator(int[] input, String result) {
		if(input.length == 2) {
			System.out.println(result + " " + Math.max(input[0], input[1]));
		} else if(input.length == 3) {
			if(input[0] + input[2] > input[1]) {
				System.out.println(result + " " +  input[0] + " " + input[2]);
			} else {
				System.out.println(result + " " + input[1]);
			}
		} else {
			//TODO
		}
		
	}
}