/*
문제: 마지막에 남은 1명의 소개팅녀 출력하기
소개팅 Rule
 1) 101명의 소개팅녀들이 O 모양으로 둥글게 앉는다. 
 2) 첫번째 소개팅녀부터 시계방향으로 대화를 한다.
 3) 대화를 나눈 소개팅녀는 Yes 또는 No 를 할 수 있다. 
 4) NO 를 선택한 소개팅녀는 자리를 떠나 집으로 가고, Yes 라고 한 소개팅녀는 자리에 남는다.
 5) 최종 1명의 소개팅녀만 남을 때까지 계속 시계방향으로 돌며 대화를 한다.
제약조건 
  1) 홀수번째 대화를 나눈 소개팅녀는 Yes를 하고, 짝수번째 대화를 나눈 소개팅녀는 No를 한다.
첫번째 소개팅녀는 Yes, 두번째 소개팅녀는 No , 세번째 소개팅녀는 Yes
 */
import java.util.ArrayList;
import java.util.HashMap;
public class Sangyunyi_170131 {

	public static void main(String[] args) {

		ArrayList<String> sGirls= new ArrayList<String>();
		for(int i=0; i<101; i++)	
			sGirls.add(i, Integer.toString(i+1) );

		int iConversationCount=1;
		int iFlag=0;

		while(1==1){
			if(iConversationCount%2!=0){//홀수번
				iConversationCount++;
				iFlag++;
			}else{
				sGirls.remove(iFlag);
				iConversationCount++;
			}
			if( sGirls.size()==1){
				System.out.println(sGirls.get(0)+"번째 너로 택했다.");
				break;
			}else if(sGirls.size()==iFlag){
				iFlag=0;
			}
		}

	}

}
