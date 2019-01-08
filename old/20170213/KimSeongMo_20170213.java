
package lge.prm.spec.controller;

import java.util.ArrayList;

public class findSelf {

    public static void main(String[] args){
        int k = 1;
        int size = 5000;
        ArrayList<String> list = new ArrayList<String>();
        for(int inx = 1; inx <= size; inx++){
            list.add(inx+"");
        }

        int index = 0;
        while(true){
            k = getNextNonSelf(k);
            list.remove(k+"");

            if(k >= size){ // 1cycle
                index++;
                if(index == list.size()){
                    break;
                }
                int startNum = Integer.parseInt(list.get(index));
                k=startNum;
            }
        }

        int sum = 0;
        for(int inx = 0; inx < list.size(); inx++){
            sum += Integer.parseInt(list.get(inx));
        }
        System.out.println("Self Number List : " + list);
        System.out.println("Sum : "+sum);
    }

    public static Integer getNextNonSelf(Integer input){
        String inputNum = Integer.toString(input);
        int sum = 0;
        for(int inx = 0; inx < inputNum.length(); inx++){
            sum += Integer.parseInt((inputNum.charAt(inx)+""));
        }
        sum+=input;
        return sum;
    }
}

