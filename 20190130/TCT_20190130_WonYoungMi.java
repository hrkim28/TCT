import java.util.HashMap;


/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : TCT_20190130_WonYoungMi.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 2019. 1. 30.  youngmi.won   Initial
 * ===========================================
 */

/**
 * <pre>
 * Class : TCT_20190130_WonYoungMi
 * Description : TODO
 * </pre>
 * 
 * @author youngmi.won
 */
public class TCT_20190130_WonYoungMi {
    public static void main(String[] args){
        int[][] inputArr = new int[][]{
                {8, 4}, {13, 19}, {8, 10}, {18, 18}, {8, 25}, {13, 16}
        };
        genPrizeMoney( inputArr );
    }
    
    private static void genPrizeMoney( int[][] inputArr ){
        HashMap<Integer,Integer> firstMoneyList = new HashMap<Integer, Integer>();
        firstMoneyList.put( 1, 5000000 );
        firstMoneyList.put( 2, 3000000 );
        firstMoneyList.put( 3, 2000000 );
        firstMoneyList.put( 4, 500000 );
        firstMoneyList.put( 5, 300000 );
        firstMoneyList.put( 6, 100000 );
        HashMap<Integer,Integer> secondMoneyList = new HashMap<Integer, Integer>();
        secondMoneyList.put( 1, 5120000 );
        secondMoneyList.put( 2, 2560000 );
        secondMoneyList.put( 4, 1280000 );
        secondMoneyList.put( 8, 640000 );
        secondMoneyList.put( 16, 320000 );
        
        int prizeMoney = 0;
        for( int inx = 0; inx < inputArr.length; inx++ ){
            prizeMoney = getMoney( 1, firstMoneyList, inputArr[inx][0] );
            prizeMoney += getMoney( 2, secondMoneyList, inputArr[inx][1] );
            System.out.println( prizeMoney );
        }
    }
    
    private static int getMoney( int type, HashMap<Integer,Integer> moneyList, int rank ){
        int money = 0;
        int rankSum = 0;
        int index = 1;
        for( int inx = 0; inx < moneyList.size(); inx++ ){
            rankSum += index;
            if( rankSum >= rank ){
                money = moneyList.get( index );
                break;
            }
            if( type == 1 ){
                index++;
            }
            else{
                index = index * 2;
            }
        }
        
        return money;
    }
}
