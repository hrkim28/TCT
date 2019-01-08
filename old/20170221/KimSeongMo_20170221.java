/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : square.java
 * ===========================================
 * Modify Date    Modifier    Description
 * -------------------------------------------
 * 2017. 2. 21.  seongmo1.kim   Initial
 * ===========================================
 */
package lge.prm.rest.global.controller;

public class square {

    public static void main(String[] args){
        // TODO Auto-generated method stub
        isSquareNum(25);
        isSquareNum(44);
        isSquareNum(1048576);
    }

    public static void isSquareNum(int input){
        int n = 1;
        while(true){
            int temp = 0;
            for(int inx = 0; inx < n; inx++){
                temp+=n;
            }
            if(temp == input){
                System.out.println("true");
                break;
            }
            if(temp > input){
                System.out.println("false");
                break;
            }
            n++;
        }
    }
}
