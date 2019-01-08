package test;

import java.util.Random;
import java.util.Scanner;

public class TestLCP_20170207 {

	/**
	 * @param args
	 * 
	 * [2017.02.07 오늘의 문제]
	 * 임의의 수와 그 수를 뒤집은 수를 더하는 과정을 반복한다.
	 * 합이 뒤집어서 읽어도 동일한 숫자가 되면 반복 횟수와 숫자를 출력한다.
	 *  195      786       1473      5214
	 *  +591    +687    +3741     +4125
	 *   786     1473       5214      9339
	 *   ** 반복횟수는 100번 미만으로 제한함, 형변환 없음
	 *   Input: 숫자 배열 입력
	 *   101
	 *   195
	 *   265
	 *   750
	 *   Sample Output
	 *   0 101
	 *   4 9339
	 *   5 45254
	 *   3 6666
	 * 
	 */ 
	 public static int reverse_integer(int in)
	 {
	     int result = 0;
	     while (in != 0)
	     {
	         result *= 10;
	         result += (in % 10);
	         in /= 10;
	     }
	     return result;
	 }
	 
	 public static void main(String[] args) {
	  int[] inputs =  {112,386,101,195,265,750};
	  
	  System.out.println("Input: ");
	  for(int i=0;i<inputs.length;i++){
	   System.out.println(inputs[i]);
	  }	  
	  
	  System.out.println("Output: ");
	  //입력값 만큼 확인
	  for(int i=0;i<inputs.length;i++){
	   int input = 0;
	   int reverseInput = 0;
	   int cnt = 0;
	   
	   input = inputs[i];
	   reverseInput = reverse_integer(inputs[i]);
	   
	   // 반전 수 합계
	   while(true){	    
	    if( input == reverseInput || cnt > 100) {
	     break;
	    }
	    
	    cnt ++;
	    input = input + reverseInput;
	    reverseInput = reverse_integer(input);	    
	   }
	   
	   System.out.println(  cnt + "  " + input);	   
	  }	  
	 }	
}



