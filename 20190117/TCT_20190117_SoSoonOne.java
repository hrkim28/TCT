import java.util.Scanner;

public class TCT_20190117_SoSoonOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in); 
		System.out.println("Enter a number: ");
		int n = reader.nextInt(); 
		if(checkThree(n) == 0 ){
			System.out.println("is not match with condition.");
		}
		else{
			System.out.println("출력 : "+ checkThree(n));
		}
		reader.close();
		
	}
	
	public static int checkThree(int number){
		
		int result = 0;
		int pool = 0;
				
		if(number<9 || number%3 !=0 ){
			return 0;
		}else if(number == 9){
			return 1;
		}
		else {
			while(number>=9)
			{
				pool++;
				number = number-9;
			}
			result = (pool-1)*9+number;
			return result;
		}
	}
	
	
}
