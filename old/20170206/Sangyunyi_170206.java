import java.util.Random;
import java.util.Scanner;

/*
문제: 로또!!! 맞춰봅시다~
1) 1~45 사이의 중복되지 않는 임의의 정수 6개를 선정하여 출력
2) 선정된 6개의 정수를 오름차순 Sorting하여 출력
[조건]
단, 정수 6개는 난수 생성할 것.
[출력 예시]
생성된 숫자 : 23 45 7 12 38 9
정렬 결과 : 7 9 12 23 38 45
이번주 결과를 출력해 주시는 분께는 상품을.... ^^
오늘은... 문제가 간단합니다.  그리고, 내일 출제는 강진곤 부장님이 해 주시겠습니다.
 */


public class Sangyunyi_170206 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iRandom = Random();
		System.out.println("생성된 숫자 : "+iRandom[0]+" "+iRandom[1]+" "+iRandom[2]+
				           " "+iRandom[4]+" "+iRandom[5]);
		Sorting(iRandom);
		System.out.println("정렬 결과 : "+iRandom[0]+" "+iRandom[1]+" "+iRandom[2]+
		           " "+iRandom[4]+" "+iRandom[5]);
	}
	public static int[] Sorting(int[] input){
		int a=0;
		while(1==1){
			a++;
			if(a<6){
				for(int i=0;i<5;i++){//0,1,2,3,4,5
					if(input[i]>input[i+1]){
						int iTemp = 0;
						iTemp = input[i];
						input[i] = input[i+1];
						input[i+1] = iTemp;
					}
				}
			}else{break;}
		}
		return input;
	}

	
	
	public static int[] Random(){
		Random random = new Random();
		int[] iRandom = new int[6];
		iRandom[0] = random.nextInt(45)+1;
		iRandom[1] = random.nextInt(45)+1;
		iRandom[2] = random.nextInt(45)+1;
		iRandom[3] = random.nextInt(45)+1;
		iRandom[4] = random.nextInt(45)+1;
		iRandom[5] = random.nextInt(45)+1;
		for(int i=0;i<6;i++){
			for(int j=0;j<6;j++){
				if(i!=j && iRandom[i]==iRandom[j]){
					Random();
				}
			}
		}
		return iRandom;
	}
}


