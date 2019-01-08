/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : LimYoungwon_20170201.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 2017. 2. 1.  youngwon.lim   Initial
 * ===========================================
 * 
 * 두개의 주사위를 던저 값을 합산 출력
 * - 주사위 값이 동일한 경우 한번더 던진다
 * - 주사위 값은 1~6난수
 * 
 * 예시
 * 3 3
 * 6 6
 * 5 4
 * 17 만큼 전진
 */
package daily;

import java.util.Random;


/**
 * <pre>
 * Class : LimYoungwon_20170201
 * Description : TODO
 * </pre>
 * 
 * @author youngwon.lim
 */
public class LimYoungwon_20170201 {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
     System.out.print(DiceGame());   

    }
    
    static int DiceGame()
    {

        Random rd = new Random();
        int sum =0;
        int intFirstDice = rd.nextInt(6) +1;
        int intSecondDice = rd.nextInt(6) +1;
        
        sum = intFirstDice + intSecondDice;
        System.out.print(intFirstDice);
        System.out.print(" ");
        System.out.println(intSecondDice);
        
        if(intFirstDice == intSecondDice)
        {
            sum = sum + DiceGame();
        }
        
        return sum;
    }
    

}
