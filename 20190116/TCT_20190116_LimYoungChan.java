public class TCT_20190116_LimYoungChan {

	public static void main(String[] args) {
		int[] works = {1,1};
		int hour    = 3;
		int result  = 0;
		
		int arrSum = 0;
		int minusArr = works.length;
		
		for(int idx = 0; idx < works.length; idx++) {
			arrSum += works[idx];
		}
		
		while(hour > 0 && arrSum > 0) {
			int idx = (works.length - minusArr) % works.length;

			if(works[idx] > 0) {
				works[idx] = works[idx] - 1;
				hour--;
			}
			
			arrSum--;
			minusArr--;
		}
		
		for(int i = 0; i < works.length; i++) {
			result += works[i] * works[i];
		}
		
		System.out.println("result: " + result);
		
	}

}