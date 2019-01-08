package lge.prm.rest.global.controller;

import java.util.Scanner;

public class test {

    public static void main(String[] args){
        // TODO Auto-generated method stub

        while(true){
            System.out.print("Input Num : ");
            Scanner s = new Scanner(System.in);
            try{
                int input = Integer.parseInt(s.nextLine());
                if(input == 0){
                    break;
                }else{
                    findStep(input);
                }
            }catch(NumberFormatException e){
                System.out.println(e.toString());
            }
            System.out.println();
        }

    }

    public static void findStep(int input){
        int index = 0;
        while(true){
            if(input < Math.pow(2, index)){
                break;
            }else{
                index++;
            }
        }
        System.out.println(input+ " : "+index+ "층");
    }
}
