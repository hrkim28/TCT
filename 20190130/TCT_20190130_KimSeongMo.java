import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TCT_20190130_KimSeongMo {
    public static void main(String[] args){
        TCT_20190130_KimSeongMo obj = new TCT_20190130_KimSeongMo();
        int[][] reward18 = { {500,1}, {300,2}, {200,3}, {50,4}, {30,5}, {10,6} };
        int[][] reward19 = { {512,1}, {256,2}, {128,4}, {64,8}, {32,16} };
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Integer[]> inputList = new ArrayList<Integer[]>();
        for( int inx = 0; inx < n; inx++ ){
            String input = sc.nextLine();
            Integer[] intArr = new Integer[2];
            String[] arr = input.split(" ");
            intArr[0] = Integer.parseInt(arr[0]);
            intArr[1] = Integer.parseInt(arr[1]);
            inputList.add(intArr);
        }
        
        for( Integer[] arr : inputList ){
        System.out.println( obj.getReward(reward18, arr[0]) + obj.getReward(reward19, arr[1]) );
        }
    }
    
    private  int getReward( int[][] reward, int rank ){
        int cnt = 0;
        int result = 0;
        if(rank > 0){
            for( int inx = 0; inx < reward.length; inx++ ){
                cnt += reward[inx][1];
                if( cnt >= rank ) {
                    result = reward[inx][0] * 10000; break;
                }
            }
        }
        return result;
    }
}
