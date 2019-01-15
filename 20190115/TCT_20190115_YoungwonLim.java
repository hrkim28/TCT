import java.util.ArrayList;
import java.util.Scanner;


/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : TEST20190115.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 2019. 1. 15.  75615   Initial
 * ===========================================
 */

/**
 * <pre>
 * Class : TEST20190115
 * Description : TODO
 * </pre>
 */
public class TEST20190115 {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        // TODO Auto-generated method stub
        
       Scanner sc = new Scanner(System.in);
       int maxInt = sc.nextInt();
        
       Boolean bRun = true;
       int inx = 0;
       ArrayList<Integer> arrAll = new ArrayList<Integer>();
       arrAll.add(0);
       arrAll.add(1);
       
       while(bRun)
       {
           ++inx;
           arrAll.add(arrAll.get(inx)+ arrAll.get(inx-1));
           
           if(inx ==1 )
           {
               System.out.print(0);
           }
           if(maxInt ==0)
           {
               bRun = false;
               continue;
           }else if(maxInt >= arrAll.get(inx))
           {
               System.out.print(",");
               System.out.print(arrAll.get(inx));
           }else if(maxInt < arrAll.get(inx))
           {
               bRun = false;
               break;
           }
       }

    }

}
