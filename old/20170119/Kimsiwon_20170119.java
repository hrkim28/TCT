/*
 100부터 1000 사이의 숫자 중 각 자릿수에 해당하는 세제곱 값의 합이 해당 숫자와 동일한 숫자를 출력한다.
  ex) 153 = 1x1x1 + 5x5x5 + 3x3x3
= 1 + 125 + 27
[조건]
1) Armstrong Number 출력한다.
[예상결과]
153
370
371
407
 */
public class Kimsiwon_20170119 {
	public static void main( String[] args ) {
		
		String tmpStr = "";
		int tmpLen = 0;
		int tmpSum = 0;
		int tmpNum = 0;
		
		for (int i = 100; i < 1000; i++){
			tmpStr = Integer.toString(i);
			tmpLen = tmpStr.length();
			tmpSum = 0;
					
			for (int j = 0; j < tmpLen; j++){
				tmpNum = Integer.parseInt(tmpStr.substring(j,j+1)); 
				tmpSum = tmpSum + tmpNum*tmpNum*tmpNum;				
			}
			
			if(i == tmpSum){
				System.out.println("Result: " + i);
			}
			
		}
		
    }

}
