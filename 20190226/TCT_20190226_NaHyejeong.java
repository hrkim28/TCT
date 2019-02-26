package teamExcercise;

import java.util.HashMap;

/*
	[문제]
메뚜기 재석이는 간만에 목초지에서 신났당. 무지무지 신났당. 너무너무 신나서 뛰어놀다가 그만!! 핸드폰을 물웅덩이에 빠뜨리고 말았다. 
그 덕에 핸드폰은 젖어버렸고, 자판은 요상하게 작동한다.
메뚜기 재석이는 고장난 자판이 뭐가 눌리는 건지 알아야 문자라도 보낼테니 재석이는 이것저것 눌러보기 시작했다.
메뚜기인 것도 서러운데 핸드폰까지 고장났으니 누군가의 도움이 필요할 것 같다.
이 그림은 핸드폰의 자판이다(안타깝게도 재석이는 메뚜기라 스마트폰을 사지 못 했다.). 
예를 들어, a를 입력하고 싶으면 2를 한 번 누르면 되고, 
		   b를 입력하고 싶으면 2를 두 번 누르면 된다. 
		   만약 똑같은 키를 연속해서 눌러 다른 문자를 입력하고 싶으면 #을 누르면 된다. 
예를 들어, klor을 입력하고 싶으면 55#555666777을 눌러 입력하면 된다.
keyboard

[입력]
첫째 줄엔 9개의 정수가 주어진다. 
첫 번째 정수는 원래 자판에서 1을 눌렀을 때 나오는 문자가 어느 자판을 눌렀을 때 나오는지, 
두 번째 정수는 원래 자판에서 2를 눌렀을 때 나오는 문자가 어느 자판을 눌러야 나오게 되었는지...이런 식이다.
재석이는 *이랑 0은 쓸 수가 없다. #키는 망가지지 않았다.
두 번째 줄엔 소문자로 된 문자열이 주어진다. 길이는 100 문자를 넘지 않는다.
[출력]
재석이의 메세지를 쓰기 위해 눌러야 하는 키를 출력한다.

[예제입력1]
 2 3 4 5 6 7 8 9 1
 klor
 [예제입력2]
 7 8 9 1 2 3 6 5 4
 djevojka
 [예제입력3]
 9 8 7 6 5 4 3 2 1
 skakavac

[예제출력1]
 44#444555666
 [예제출력2]
 68662227778#885
 [예제출력3]
 33335585582228#888

 * */
public class TCT_20190226_NaHyejeong {

	public static void main(String[] args) {
		// 1: null 
		// 2: 97~ 99
		// 3: 100 ~ 102
		// 4: 103 ~ 105
		// 5: 106 ~ 108
		// 6: 109 ~ 111
		// 7: 112 ~ 115
		// 8: 116 ~ 118
		// 9: 119 ~ 122
		
		int[][] normalKeyboard = {
				{1,	0,   0},
				{2,	97,  99},
				{3,	100, 102},
				{4,	103, 105},
				{5,	106, 108},
				{6,	109, 111},
				{7,	112, 115},
				{8,	116, 118},
				{9,	119, 122}
		};
		
		// test case 입력
		int[] changedKeyboard =  { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		String message = "skakavac";
		
		HashMap <Integer, Integer> changeKeyMap = new HashMap<>();
		for (int i = 0; i < changedKeyboard.length; i++) {
			changeKeyMap.put(changedKeyboard[i], i+1);
		}
		
		// 출력
		printInputKeyboard(normalKeyboard, changeKeyMap, message);
	}

	private static void printInputKeyboard(int[][] normalKeyboard, HashMap<Integer, Integer> changeKeyMap, String message) {
		String inputKey = "";
		int keyNum = 0;
		int touchCnt = 0;
		
		for (char c : message.toCharArray()) {
			for (int i = 0; i < normalKeyboard.length; i++) {
				if( normalKeyboard[i][1] <= (int)c && normalKeyboard[i][2] >= (int)c ) {

					// 만약 똑같은 키를 연속해서 눌러 다른 문자를 입력하고 싶으면 #을 누른다.
					if( keyNum == changeKeyMap.get(normalKeyboard[i][0])) inputKey += "#";
					
					keyNum = changeKeyMap.get(normalKeyboard[i][0]);
					touchCnt = (int)c - normalKeyboard[i][1]+1;
					
					for (int j = 0; j < touchCnt ; j++) {
						inputKey += keyNum;
					}
					break;
				}
			}
		}
		System.out.println( inputKey );
	}

}
