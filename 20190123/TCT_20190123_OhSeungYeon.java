import java.util.ArrayList;

public class TCT_20190123_OhSeungYeon {

	public static void main(String[] args) {

		int cnt = Integer.parseInt(args[0]);
		
		int[] intArr = new int[cnt];
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		for(int i=0 ; i < cnt ; i++) {
			intArr[i] = Integer.parseInt(args[i+1]);
		}
		
		int numCnt = 0;
		for(int j=0; j < intArr.length; j++) {
			for(int x = 0; x < intArr.length; x++) {
				if(intArr[x] == intArr[x]) {
					numCnt++;
				}
			}
			
			if(numCnt %2 ==0) {
				numList.add(intArr[j]);
			}
			
			numCnt = 0;
		}
		
		int temp = 0;
		
		
		for(int k=0; k < numList.size();k++) {
			System.out.println(numList.get(k));
			if(k==0) { 
				temp = numList.get(0);
			}
			else {
				temp = temp ^ numList.get(k);
			}

		}
		
		System.out.println("result ->" + temp);

	}

}
