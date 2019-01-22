package com.spring.login;

import java.util.ArrayList;

public class TCT_20191122_LeeJinKyoung {

    int maxScore = 0;
    
   public int maxScore(int[] steps){
        getCase(1,steps.length-1,new int[steps.length],steps);
        
        return maxScore;
    }

    public void  getCase(int n, int index, int[] result,int[] steps) {
        result[index] = n;
        
        if(index == 1){
            //print(result);
            
            int score = 0;
            
            /*Score 계산 하기*/
            for(int jnx = 0 ; jnx < result.length; jnx++){
                if(result[jnx] == 1){
                    score += steps[jnx];
                }
            }
            
            if(maxScore < score){
                maxScore = score;
            }
            
            //System.out.println(score);
        } else {
            if(n == 1){
                getCase(0,index-1,result,steps);
    
                if( result.length -1 == index || result[index + 1] != 1){
                    getCase(1,index-1,result,steps);
                }
            } else if(n == 0) {
                getCase(1,index-1,result,steps);
            }
        }
    }
    
    public void print(int [] r){
        for(int inx = 0 ; inx < r.length; inx++){
            System.out.print(r[inx]+" ");
        }
        
        System.out.println("");
    }

    public static void main(String[] args){
        
        TCT_20191122_LeeJinKyoung test = new TCT_20191122_LeeJinKyoung();
        int[] steps = {6,10,20,15,25,10,20};
        test.print(steps);
        System.out.println("Result : " + test.maxScore(steps));

    }

}
