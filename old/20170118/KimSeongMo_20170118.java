package build.classes;

import java.util.ArrayList;


/**
 * <pre>
 * Class : test22222
 * Description : TODO
 * </pre>
 * 
 * @author seongmo1.kim
 */

public class test22222 {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        // TODO Auto-generated method stub
        int col = 3;
        int row = 4;
        int maxCnt = 5;
        ArrayList<String> list = new ArrayList<String>();
        String tempStr = "A";
        int asch = (int) tempStr.charAt(0);
        
        //Matrix 구성할 String List 구하기
        for(int inx = 0; inx < col*row; inx++){
            tempStr = Character.toString((char)asch);
            if( inx < maxCnt-1 ){ //알파벳 증가
                list.add(tempStr);
                asch++;
            }
            else if( inx < maxCnt*2-1 && inx >= maxCnt-1 ){ //알파벳 감소
                list.add(tempStr);
                asch--;
            }
            else{ //All A
                list.add("A");
            }
        }
        System.out.println(list.toString());
        
      //String List로 Matrix 구성하기
        for(int j=1; j <= list.size(); j++){
            System.out.print(list.get(j-1));
            if(j%3 == 0){
                System.out.println();
            }
        }
        
        
    }
}
