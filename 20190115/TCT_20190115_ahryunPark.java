public class Test_20190115{

	int input = 3;
	int sum = 0;
	List<int> result = new List<int>
	for(int i=0; i<input; i++){
		
		
		if(i == 0){
			sum = i;
		}else{
			sum = sum + i;
		
		}
		
		result.put(sum);
	}
	
	
	//값 출력
	for(int i=0; i<sum.size; i++){
	System.out.println( i+"번째 값 : "+ sum.get(i);
	}

}

