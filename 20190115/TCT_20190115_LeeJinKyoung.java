import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <pre>
 * Class : LCPJinklee0115
 * Description : TODO
 * </pre>
 * 
 * @author jinklee
 */
public class TCT_20190115_LeeJinKyoung {

    /**
    *
    * @param args
    */
   public static void main(String[] args){
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter Integer:");
       try{
           int i = Integer.parseInt(br.readLine());
           int x = 0;
           int y = 1;
           int newy = 0;

           System.out.print("Result:" + x + " ");
           while(y <= i){
               System.out.print(y + " ");
               newy = x + y;
               x = y;
               y = newy;
           };  
       }catch(NumberFormatException nfe){
           System.err.println("Invalid Format!");
       }catch(IOException nfe){
           System.err.println("IOException!");
       }
       
   }
    
}
