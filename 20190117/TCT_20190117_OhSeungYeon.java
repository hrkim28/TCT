public class TCT_20190117_OhSeungYeon {

	public static void main(String[] args) {
		int n= 30;		
		int temp = 0;
		
		int num1=0;
		int num2=0;
		int num3=0;
		
		System.out.println("input ->" + n);

		if(n %3 == 0) {
			num1= 3;
			
			temp = n-3;
			int cnt = 0;
			while(temp %3 == 0) {
				temp /= 3;
				cnt++;
			}
			
			num2= cnt*3;
			num3 = (n-3)-(cnt*3);
		}
	
		
		if(num1 == num2 && num1 == num3) {
			System.out.println("output ->" +1);
		}
		else if(num1 == num2 || num1 == num2 || num2 == num3){
			System.out.println("output ->" +3);
		}
		else {
			System.out.println("output ->" +6);
		}
	}

}
