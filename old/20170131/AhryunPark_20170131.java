import java.util.ArrayList;
import java.util.Arrays;

import antlr.collections.List;



public class AhryunPark_20170131 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/**
		문제: 마지막에 남은 1명의 소개팅녀 출력하기

		•소개팅 Rule
		 1) 101명의 소개팅녀들이 O 모양으로 둥글게 앉는다. 
		 2) 첫번째 소개팅녀부터 시계방향으로 대화를 한다.
		 3) 대화를 나눈 소개팅녀는 Yes 또는 No 를 할 수 있다. 
		 4) NO 를 선택한 소개팅녀는 자리를 떠나 집으로 가고, Yes 라고 한 소개팅녀는 자리에 남는다.
		 5) 최종 1명의 소개팅녀만 남을 때까지 계속 시계방향으로 돌며 대화를 한다.
		
		
		•제약조건 
		  1) 홀수번째 대화를 나눈 소개팅녀는 Yes를 하고, 짝수번째 대화를 나눈 소개팅녀는 No를 한다.
		
		◦첫번째 소개팅녀는 Yes, 두번째 소개팅녀는 No , 세번째 소개팅녀는 Yes



		 */
		
		
		int totalNum = 101;
		int[] totlaList =  new int[totalNum];
		int[] temp = totlaList;
		for(int i = 0; i < totalNum ; i++){
			totlaList[i] = i+1;
		}

		while(totalNum > 1){
				
				
			for(int inx = 0 ; inx <totalNum ; inx++){
			
				if( (inx+1)%2 == 1){
					temp[inx/2]=totlaList[inx];
				}
				
			}
			
			if(totalNum%2 == 1){
				totalNum = totalNum/2 + 1;
				
			}
			else{
				totalNum = totalNum/2;
			}
				
			totlaList = 	temp;
				
		}
		
		System.out.println(" 소개팅녀  " + totlaList[0] );
	}
	

}

