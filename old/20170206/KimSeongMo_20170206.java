package lge.prm.spec.controller;

import java.util.ArrayList;
import java.util.Random;

public class lotto {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        // TODO Auto-generated method stub
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int inx = 0; inx < 6; inx++){
            int temp = rand.nextInt(45)+1;
            if(list.contains(temp)){
                inx--;
                continue;
            }else{
                list.add(temp);
            }
        }
        System.out.println(list);
        int[] sortList = new int[6];
        for(int inx = 0; inx<list.size(); inx++){
            sortList[inx] = list.get(inx);
        }

        int temp;
        for(int inx = 0; inx < sortList.length; inx++){
            for(int jnx = inx+1; jnx < sortList.length;jnx++){
                if(sortList[inx] > sortList[jnx]){
                    temp = sortList[inx];
                    sortList[inx] = sortList[jnx];
                    sortList[jnx] = temp;
                }
            }
        }

        System.out.println("["+sortList[0]+", "+sortList[1]+", "+sortList[2]+", "+sortList[3]+", "+sortList[4]+", "+sortList[5]+"]");
    }

}
