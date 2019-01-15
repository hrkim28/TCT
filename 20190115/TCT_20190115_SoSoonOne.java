import java.util.Scanner;

public class TCT_20190115_SoSoonOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in); 
		System.out.println("Enter a number: ");
		int n = reader.nextInt(); 
		reader.close();
		checkFibo(n);
		
	}
	
	public static void checkFibo(int number){
		
		
		int resultPre = 0;
		int resultNex = 1;
		int result = 0;
		System.out.print(result);
		
		if(number == 1){
			System.out.print(","+number);
		}
		
		while( number > result ){
			result = resultPre + resultNex;
			resultPre = resultNex;
			resultNex = result;
			if(result <= number){
				System.out.print(","+result);
			}
		}
		
		/*if(number <= 1){
			return number;
		}
		else{
			return checkSqaure(number-1)+checkSqaure(number-2) ;
		}*/
	}
	
	
}
