package lge.prm.common.main;

import java.util.ArrayList;

public class sogae {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        // TODO Auto-generated method stub
        ArrayList<Integer> girs = new ArrayList<Integer>();
        for(int inx = 1; inx <= 101; inx++){
            girs.add(inx);
        }

        int cnt = 1;
        int temp = 0;

        while(true){
            if(temp == girs.size()){
                temp = 0;
            }
            if(cnt%2 == 0){
                girs.remove(temp);
            }else{
                temp++;
            }
            if(girs.size() == 1){
                break;
            }
            cnt++;
        }

        System.out.println("총 소개팅 횟수 : "+cnt);
        System.out.println("남은 소개팅 녀 : "+girs.toString()+"번 째");
    }

}
