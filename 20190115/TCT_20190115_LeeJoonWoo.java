package tct;

import java.util.Scanner;
public class TCT_20190115_LeeJoonWoo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
	    int num = sc.nextInt();
		int temp1 = 0;
		int temp2 = 1;
		int temp3;
		String result="";
		
		
		while(true){
			if(num ==0){
				System.out.println("====================================");
			    System.out.println("result:0"+result);
			    System.out.println("====================================");
				break;
			}
			else if(num ==1){
				System.out.println("====================================");
			    System.out.println("result:0,1,1"+result);
			    System.out.println("====================================");
				break;
			}
			else{
				temp3=temp1+temp2;
				if(temp3 > num){
					System.out.println("====================================");
				    System.out.println("result:0,1"+result);
				    System.out.println("====================================");
					break;
				}
				
				result= result+","+String.valueOf(temp3);
				temp1=temp2;
				temp2=temp3;
				
				
				
			}
		}
		
		

	}

}
