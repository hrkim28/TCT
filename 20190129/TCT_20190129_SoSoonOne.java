public class TCT_20190129_SoSoonOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String n = "5+6*3-6/2+5";
		//int[] r={2,5,3,3};
		
		System.out.println(divideNumber(n));
		
	}
	
	private static int divideNumber ( String n ){
		
		String[] arr = n.split("");
		int result =  Integer.parseInt(arr[1]);
		int newV = 0;
		
		for(int i = 2 ; i < arr.length ; i += 2){
			if("*".equals(arr[i])){
				arr[i-1] = Integer.toString (Integer.parseInt(arr[i-1]) *  Integer.parseInt(arr[i+1]));
				arr[i] = "+";
				arr[i+1] = "0";
			}else if("/".equals(arr[i])){
				arr[i-1] = Integer.toString (Integer.parseInt(arr[i-1]) /  Integer.parseInt(arr[i+1]));
				arr[i] = "+";
				arr[i+1] = "0";
			}
		}
		for(int i = 2 ; i < arr.length ; i += 2){
			if("+".equals(arr[i])){
				result += Integer.parseInt(arr[i+1]);
				
			}else if("-".equals(arr[i])){
				result -= Integer.parseInt(arr[i+1]);
			}
		}
		

		return result;
		
	}
	

	
}
