public class   TCT_20190220_LeeKangKil{
	
	public static void main(String args[])  {
		
		int []inputNums = {10, -4, 3, 1, 5, 6, -35, 12, 21, -1};
		int sum = 0;
		int result = 0;
		
		for(int i=0;i<inputNums.length;i++){
			for(int j=i;j<inputNums.length;j++){
				sum+= inputNums[j];
				if(sum > result ) result = sum;
			}
			sum =0;
		}
		System.out.println(result);
	}

}
