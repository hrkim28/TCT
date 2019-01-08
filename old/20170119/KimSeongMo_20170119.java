/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : test33.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 2017. 1. 19.  seongmo1.kim   Initial
 * ===========================================
 */
package build.classes;


/**
 * <pre>
 * Class : test33
 * Description : TODO
 * </pre>
 * 
 * @author seongmo1.kim
 */
public class test33 {

    /**
     *
     * @param args
     */
    /*Armstrong Number*/
    
    public static void main(String[] args){
        // TODO Auto-generated method stub
        int start = 100;
        int end = 1000;
        int firstNum,SecondNum,thirdNum,sum;
        
        for(int inx = start; inx < end; inx++){
            
            firstNum = inx/100;
            SecondNum = (inx%100)/10;
            thirdNum = (inx%100)%10;
            sum = (int)(Math.pow(firstNum, 3)+Math.pow(SecondNum, 3)+Math.pow(thirdNum, 3));
            
            if(sum == inx){
                System.out.println(inx);
            }
        }
    }

}
