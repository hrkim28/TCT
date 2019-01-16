import java.util.ArrayList;
import java.util.List;

public class TCT_20190116_KimSeongMo {
    public static void main(String[] args){
        int[] work1 = {4,3,3};
        int time1 = 4;
        System.out.println(calculate(work1, time1));
        
        int[] work2 = {2,1,2};
        int time2 = 1;
        System.out.println(calculate(work2, time2));
        
        int[] work3 = {1,1};
        int time3 = 3;
        System.out.println(calculate(work3, time3));
    }
    
    private static String calculate  ( int[] input, int time ){
        List<int[]> list = new ArrayList<int[]>(); 
        list = getPossibleList( input, list, 0, time );
        return getMaxScore(input, list);
    }

    private static String getMaxScore( int[] input, List<int[]> list){
        String result = "[";
        int minScore = 0;
        for( int inx = 0; inx < input.length; inx++ ){
            minScore +=  Math.pow(input[inx], 2); 
            result += input[inx] + ","; 
        }
        for( int[] arr : list ){
            int sum = 0;
            for( int inx = 0; inx < arr.length; inx++ ){
                sum += Math.pow(arr[inx], 2); 
            }
            if( minScore >= sum ) minScore = sum;
        }
        
        return result + "] / " + minScore;
    }

    private static List<int[]> getPossibleList( int[] input, List<int[]> tempList, int depth, int time ){
        int[] tempArr;
        List<int[]> resultList = new ArrayList<int[]>(); 
        if( depth >= input.length ){
            for( int[] arr : tempList ){
                int sum = 0;
                for( int inx = 0; inx < arr.length; inx++ ){
                    sum += (input[inx] - arr[inx]);
                }
                if( sum <= time ) resultList.add(arr);
            }
            return resultList;
        }else if(depth == 0){
            for( int inx = 0; inx <= input[depth]; inx++ ){
                tempArr = new int[input.length];
                tempArr[0] = inx;
                resultList.add(tempArr);
            }
        }else{
            for( int[] arr : tempList ){
                for( int inx = 0; inx <= input[depth]; inx++ ){
                    tempArr = arr.clone();
                    tempArr[depth] = inx;
                    resultList.add(tempArr);
                }
            }
        }
        return getPossibleList(input, resultList,depth+1,time);
    }
}
