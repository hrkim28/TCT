public class TCT_20190131_SoSoonOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int n = 13;
		String income[] = {"but","i","wont","hesitate","no","more","no","more","it","cannot","wait","im","yours"};
		//int[] r={2,5,3,3};
		
		income = sortWords(n, income);
		for(int i = 0 ; i < income.length ; i ++){
			if("".equals(income[i])) continue;
			System.out.println(income[i]);
		}
		
	}
	
	private static String[] sortWords ( int n, String[] income ){
		
		//String result[] =  new String[n];
		String tmp = "";
		
		
		for(int i = 0 ; i < income.length-1 ; i ++){
			for(int j = i+1 ; j < income.length ; j++){
				if( income[i].length() > income[j].length() ){
					tmp = income[i];
					income[i] = income[j];
					income[j] = tmp;
				}
				if( income[i].length() == income[j].length() ){
					if(income[i].equals(income[j])){
						income[j] ="";
						continue;
					}
					tmp = lowerReturn(income[i],income[j]);
					income[j] = higherReturn(income[i], income[j]);
					income[i] = tmp;
				}
			}
		}
		return income;
	}
	
	private static String lowerReturn (String a, String b){
		
		String result = "";
		char[] cA = a.toCharArray();
		char[] cB = b.toCharArray();
		
		for(int i = 0 ; i < cA.length ; i ++){
			if((int)cA[i] - (int)cB[i] > 0 ){
				return b;
			}else if((int)cA[i] - (int)cB[i] < 0){
				return a;
			}
		}
		
		return result;
	}
	
	private static String higherReturn (String a, String b){
		
		String result = "";
		char[] cA = a.toCharArray();
		char[] cB = b.toCharArray();
		
		for(int i = 0 ; i < cA.length ; i ++){
			if((int)cA[i] - (int)cB[i] > 0 ){
				return a;
			}else if((int)cA[i] - (int)cB[i] < 0 ){
				return b;
			}
		}
		
		return result;
	}
	
}
