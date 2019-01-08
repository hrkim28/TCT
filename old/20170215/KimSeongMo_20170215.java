package lge.prm.rest.global.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class combi {

    public static void main(String[] args){

        HashMap<Integer, Character> charSet = new HashMap<Integer, Character>();
        char ch = 'a';
        for(int inx = 0; inx < 26; inx++){
            charSet.put(inx+1,(char)((int)ch+inx));
        }

        int[] input = {1,3,4,2,6,8};
        HashSet<ArrayList<Integer>> finalCombi = new HashSet<ArrayList<Integer>>();
        finalCombi = getCombinationList(input);

        //모두 찍는경우
        for(int inx = 0; inx < input.length; inx++){
            System.out.print(charSet.get(input[inx]));
        }
        System.out.println();


        for(ArrayList<Integer> list : finalCombi){
            String output = "";
            boolean breakFalg = false;
            for(int inx = 0; inx < list.size(); inx++){
                if(list.get(inx) == 1 && list.get(inx+1) == 1){
                    if(Integer.parseInt(input[inx]+""+input[inx+1]) <= 26){ //a~z로 나타낼수 없을 경우는 Skip
                        output += charSet.get(Integer.parseInt(input[inx]+""+input[inx+1]));
                    }else{
                        breakFalg = true;
                        break;
                    }
                    inx++;
                }else{
                    output += charSet.get(input[inx]);
                }
            }
            if(!breakFalg){
                System.out.println(output);
            }
        }
    }

    public static  HashSet<ArrayList<Integer>> getCombinationList (int[] input){
        int depth = 0;
        Map<Integer,ArrayList<ArrayList<Integer>>> result = new HashMap<Integer, ArrayList<ArrayList<Integer>>>();
        HashSet<ArrayList<Integer>> finalCombi = new HashSet<ArrayList<Integer>>();
        while(true){
            ArrayList<ArrayList<Integer>> semi =  new ArrayList<ArrayList<Integer>>();
            ArrayList<Integer> flag = new ArrayList<Integer>();
            if(depth == 0){
                for(int inx = 0; inx < input.length; inx++){
                    flag.add(0);
                }
                combi(semi,flag);
            }else{
                ArrayList<ArrayList<Integer>> origin = new ArrayList<ArrayList<Integer>>();
                origin.addAll(result.get(depth-1));
                for(int inx = 0; inx < origin.size(); inx++){
                    combi(semi,origin.get(inx));//이전 flag
                }
            }
            result.put(depth, semi);
            depth++;
            if(depth == input.length/2){
                break;
            }
        }

        for(int inx = 0; inx < result.size(); inx++){
            for(int jnx = 0; jnx < result.get(inx).size(); jnx++){
                finalCombi.add(result.get(inx).get(jnx));
            }
        }
        return finalCombi;
    }
    //인접한 것들은 2개씩 조합하는 method
    public static void combi(ArrayList<ArrayList<Integer>> semi, ArrayList<Integer> flag ){

        for(int inx = 0; inx < flag.size()-1; inx++){
            ArrayList<Integer> newflag =  new ArrayList<Integer>();
            newflag.addAll(flag);
            if(newflag.get(inx) == 0 && newflag.get(inx+1) == 0){
                newflag.set(inx, 1);
                newflag.set(inx+1, 1);
                semi.add(newflag);
            }
        }
    }

}
