
public class TCT_20190227_LeeJinKyoung {
	public static void main(String[] args) {
		//int[] input = {2,9};
		int[] input = {2,1};
		//int[] input = {3,13};
		
		int n = input[1]/input[0];
		int r = input[1]%input[0];
		
		int[] result = getList(n,r,input[0]);			
		print(result);
	}
	
	public static int[] getList (int n, int r, int input) {
		if(n == 0) {
			return new int[]{-1};
		} else {
			int[] result = new int[input];
			
			for(int inx = 0 ; inx < input ; inx++) {
				if(r <= inx) {
					result[inx] = n + 1;
				} else {
					result[inx] = n;
				}
			}
			
			return result;
			
		}
	}
	
	public static void print(int[] result) {
		for(int inx = 0; inx < result.length; inx++) {
			System.out.print(result[inx] + " ");
		}
	}
	
}