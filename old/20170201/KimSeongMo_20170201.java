import java.util.Random;

/**
 *
 * [2017.02.01 오늘의 문제]
문제: 주사위 게임
두 개의 주사위를 던저 값을 합산, 출력합니다.
[조건]
재귀 함수를 이용해 구현해주세요.
단, 두 주사위의 값이 같을 경우 한번 더 던집니다.
주사위 값은 1~6 사이 난수
[출력 예시]
3 3
6 6
5 4
27 만큼 전진!

public static void main(String[] args) {
         System.out.println(DiceGame());
}
 * */
public class dice {

    public static void main(String[] args){
        // TODO Auto-generated method stub
       System.out.println(DiceGame(0) + " 만큼 전진!");

    }

    public static int DiceGame(int sum) {
        int finalSum = sum;
        Random rand = new Random();
        int randNum1 = rand.nextInt(6)+1;
        int randNum2 = rand.nextInt(6)+1;
        finalSum += randNum1 + randNum2;
        System.out.println(randNum1+" "+randNum2);

        if(randNum1 == randNum2){
            return DiceGame(finalSum); //재귀
        }else{
            return finalSum;
        }
    }

}
