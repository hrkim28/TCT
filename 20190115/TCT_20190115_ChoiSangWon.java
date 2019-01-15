public class TCT_20190115_ChoiSangWon {
	public static void main( String[] args ) {	  

		Scanner sc = new Scanner(System.in); 	
		int max = sc.nextInt();
		int num1 = 0;
		int num2 = 1;
		int temp;
		
		System.out.print(num1 + ", " + num2);
		
		while(num1 + num2 <= max){
			temp = num1 + num2; 
			System.out.print(", " + temp);
			num1 = num2;
			num2 = temp;
		}

		sc.close();
	}
}
