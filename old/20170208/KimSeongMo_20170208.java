
package lge.prm.spec.controller;

import java.util.ArrayList;


public class new22 {

    public static void main(String[] args){
        int[] arr1 = {4,10,15,24,26};
        int[] arr2 = {0,9,12,20};
        int[] arr3 = {5,18,22,30};
        int maxValue = Math.max(Math.max(getMax(arr1), getMax(arr2)),getMax(arr3));

        //Array 합치기
        int[] sumArr = new int[maxValue+1];
        setArray(arr1,sumArr,1);
        setArray(arr2,sumArr,2);
        setArray(arr3,sumArr,3);

        int interval = 3;
        boolean breakFlag = false;

        //탐색 간격을 증가시키면서 list flag를 모두 가지는 최초의 sub List 탐색
        while(true){
            for(int inx = 0; inx <= sumArr.length-interval; inx++){
                ArrayList<Integer> tempList = new ArrayList<Integer>();
                for(int jnx = 0; jnx < interval; jnx++){
                    tempList.add(sumArr[inx+jnx]);
                }
                if(tempList.contains(1) && tempList.contains(2) && tempList.contains(3)){
                    System.out.println("Minimum Interval : "+(interval-1));
                    System.out.println(inx+", "+(inx+interval-1));
                    System.out.println(tempList.toString());
                    breakFlag = true;
                    break;
                }
            }
            if(breakFlag){
                break;
            }else{
                interval++;
            }
        }

    }

    public static Integer getMax(int[] arr){
        int tempMax = 0;
        for(int inx = 0; inx < arr.length; inx++){
            if(tempMax < arr[inx]){
                tempMax = arr[inx];
            }
        }
        return tempMax;
    }

    public static void setArray(int[] input, int[] sumArr, int flag){
        for(int inx = 0; inx < input.length; inx++){
            sumArr[input[inx]] = flag;
        }
    }
}
