public class TCT_20190213_SoSoonOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println(checkInt(10));
		
	}
	
	private static int checkInt ( int income ){
		
		int count = 0;
		
		while(income > 1){
			if( income % 3 > 0){
				income = income -1;
				count ++;
			}else if( income % 3 == 0){
				income = income/3;
				count ++;
			}else if( income % 2 == 0){
				income = income/2;
				count ++;
			}
			
			if( income == 1) break;
				
		}

	return count;
	}
}
