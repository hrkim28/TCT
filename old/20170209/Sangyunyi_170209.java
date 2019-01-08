/*
1부터 20까지 숫자가 하나씩 쓰인 20장의 카드가 오름차순으로 한 줄로 놓여있다. 
각 카드의 위치는 카드 위에 적힌 숫자와 같이 1부터 20까지로 나타낸다.
다음과 같은 규칙으로 카드의 위치를 바꾼다
구간 [a,b] (단, 1≤a≤b≤20) 가 주어지면 위치 a부터 위치 b까지의 카드를 현재의 역순으로 놓는다.
예를 들어, 구간이 [5,10]으로 주어진다면, 위치 5부터 위치 10까지의 카드 5,6,7,8,9,10을 역순으 로 하여 10,9,8,7,6,5로 놓는다. 
--> 그림순서 : 1,2,3,4,10,9,8,7,6,5,11,12,13,14,15,16,17,18,19,20.
--> 그림순서.: 1,2,3,4,10,9,8,7,13,12,11,5,6,14,15,16,17,18,19,20
[출력 예시(3개 구간일 경우)]
입력구간 :        
[3,7]
[4,6]
[5,5]
결과 : 최종 카드배치는 [1,2,7,4,5,6,3,8,9,10,11,12,13,14,15,16,17,18,19,20] 입니다.
*/
public class Sangyunyi_170209 {
	
	public static void reverse(int[] param, int startIndex, int endIndex){
		if(startIndex>=endIndex){
		}else{
//[3,7] : 3-7, 4-6, 5... 2개
//[3,6] : 3-6, 4-5, 5... 2개
			int iTemp=0;
			int iIndex = (endIndex-startIndex+1)/2;
			for(int i=0; i<iIndex; i++){
				iTemp = param[startIndex+i];
				param[startIndex+i] = param[endIndex-i];
				param[endIndex-i] = iTemp;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = new int[21];
		for(int i=1; i<=20; i++){	
			inputArray[i] = i;
		}
		reverse(inputArray, 3, 7);
		reverse(inputArray, 4, 6);
		reverse(inputArray, 5, 5);
		System.out.print("결과 : 최종 카드배치는 [");
		for(int j=1; j<=20; j++){
			if(j<20)	System.out.print(inputArray[j]+",");
			if(j==20)	System.out.print(inputArray[j]+"");
		}
		System.out.print("] 입니다.");
		
	}
}
