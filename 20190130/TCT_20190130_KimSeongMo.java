import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TCT_20190130_KimSeongMo {
    public static void main(String[] args){
        TCT_20190130_KimSeongMo obj = new TCT_20190130_KimSeongMo();
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
        System.out.println( obj.getResult(arr[0], arr[1]) );
        }
    }
    
    private  int getResult( int firstRank, int secondRank ){
        int firstResult = 0;
        int secondResult = 0;
        
        if(firstRank==0){
            firstResult = 0;
        }else if(firstRank == 1){
            firstResult = 5000000;
        }else if(firstRank <= 3){
            firstResult = 3000000;
        }else if(firstRank <= 6){
            firstResult = 2000000;
        }else if(firstRank <= 10){
            firstResult = 500000;
        }else if(firstRank <= 15){
            firstResult = 300000;
        }else if(firstRank <= 21){
            firstResult = 100000;
        }else{
            firstResult = 0;
        }
        
        if(secondRank==0){
            secondResult = 0;
        }else if(secondRank == 1){
            secondResult = 5120000;
        }else if(secondRank <= 3){
            secondResult = 2560000;
        }else if(secondRank <= 7){
            secondResult = 1280000;
        }else if(secondRank <= 15){
            secondResult = 640000;
        }else if(secondRank <= 31){
            secondResult = 320000;
        }else{
            secondResult = 0;
        }
        
        return firstResult + secondResult;
    }
}
