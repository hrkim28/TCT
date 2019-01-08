package lge.prm.spec.controller;

import java.util.Arrays;
import java.util.HashSet;

public class valid {

    public static void main(String[] args){
        // TODO Auto-generated method stub

        int[] list1 = {0,1,2,3,4,5,6,7,8,9};
        int[] list2 = {0,1,2,3,4};
        int[] list3 = {6,7,8,9,0,1,2,3,4,5};
        int[] list4 = {0,1,2,3,4,5,6,7,8,9,0};
        int[] list5= {0,1,2,3,2,2,4,5,6,7,8,9};
        int[] list6= {0,0,0,0,0,9,9,9,9,9};

        Arrays arrays = null;
        System.out.println("Input : "+arrays.toString(list1)+" : "+isValid(list1));
        System.out.println("Input : "+arrays.toString(list2)+" : "+isValid(list2));
        System.out.println("Input : "+arrays.toString(list3)+" : "+isValid(list3));
        System.out.println("Input : "+arrays.toString(list4)+" : "+isValid(list4));
        System.out.println("Input : "+arrays.toString(list5)+" : "+isValid(list5));
        System.out.println("Input : "+arrays.toString(list6)+" : "+isValid(list6));
    }

    public static boolean isValid(int[] input){
        int sum = 0;
        HashSet<Integer> hash = new HashSet<Integer>();
        for(int inx=0; inx < input.length; inx++){
            sum += input[inx];
            hash.add(input[inx]);
        }

        if(input.length == 10 && sum == 45 && hash.size() == 10){
            return true;
        }else{
            return false;
        }
    }

}
