import java.io.IOException;
import java.util.ArrayList;



public class AhryunPark_20170208 {

	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws  
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		/**
		정렬된 정수를 가지고 있는 K 개의 List가 있습니다.
		각 List에서 1개씩의 숫자를 추출하여 가장 작은 범위를 출력하세요.
		
		예를 들면 
		
		List 1: [4, 10, 15, 24, 26] 
		List 2: [0, 9, 12, 20] 
		List 3: [5, 18, 22, 30] 
		
		위의 예에서 출력값은 [20,24] 입니다.
		
		List 1에서 24, List 2에서 20, List 3에서 22를 가져오는 경우입니다.


		*/
		
		
		int[] inputList1 = {4, 10, 15, 24, 26} ;
		int[] inputList2 = {0, 9, 12, 20} ;
		int[] inputList3 = {5, 18, 22, 30} ;
		
		ArrayList<Integer> result = getMinimum(inputList1, inputList2, inputList3);
		System.out.println(" List1에서" +result.get(0)  + ", List 2에서" + result.get(1) + ", List 3에서" + result.get(2));
		
	
	}
	
	public static ArrayList<Integer> getMinimum (int[] inputList1,  int[] inputList2,  int[] inputList3){
		
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		
		int minimum = 0;
		
		for(int i = 0 ; i < inputList1.length; i++){
			for(int j= 0 ; j < inputList2.length; j++){
				for(int z = 0; z < inputList3.length ; z++){
					int a = inputList1[i];
					int b = inputList2[j];
					int c = inputList3[z];
					
					int total = 0;
					
					if(a > b){
						total = a-b;
						
					}
					else{
						total = b-a;
					}
					
					
					if(b > c){
						total += b-c;
						
					}
					else{
						total += c-b;
					}
					
					
					if(i ==0 && j ==0 && z ==0){
						minimum = total;
						resultList.add(a);
						resultList.add(b);
						resultList.add(total);
						
					}
					else{
						if(minimum > total){
							minimum = total;
							resultList.clear();
							resultList.add(a);
							resultList.add(b);
							resultList.add(total);
						}
					}
					
				}
			}
		}
		
		
		return resultList;
	}

	
}

