/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : LimYoungwon_20170207.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 2017. 2. 7.  youngwon.lim   Initial
 * ===========================================
 */
package daily;


/**
 * <pre>
 * Class : LimYoungwon_20170207
 * Description : TODO
 * </pre>
 * 
 * @author youngwon.lim
 */
public class LimYoungwon_20170207 {

    public static void main(String[] args){
        
        double[] inputNum = {101,195,265,750};
        
        
        //double a = 750;
        //System.out.println(reberse(a));
                
        for(int inx =0; inx<inputNum.length; ++inx){
            int repeat =0;
            double originNum = inputNum[inx];
            double reverseNum = 0;
          //System.out.println(originNum);
          //System.out.println(reberse(originNum));
            
            while(true){
                reverseNum = reberse(originNum);
                
                if(repeat >100)
                {
                    System.out.println("over 100");
                    break;
                }
                if(originNum == reverseNum)
                {
                    System.out.print(repeat);
                    System.out.print(" ");
                    System.out.println(originNum);
                    break;
                }else{
                    repeat = repeat +1;
                    originNum = originNum + reverseNum;
                }
            }
        }
    }
    
    public static double reberse(double originNum)
    {
        double inputNum = originNum;
        double returnNum =0;
        double temp =0;
        int intTemp =0;
        double num =0;
        int row =0;
        
        temp = Math.log10(inputNum);
        temp = Math.floor(temp);
        
        while(temp > 0)
        {
            temp = temp -1;
            intTemp = intTemp +1;
        }
        
        for(int inx=intTemp ; inx>=0; --inx)
        {
            
            num = Math.floor(inputNum/ Math.pow(10, inx) );
            inputNum = inputNum - num*  Math.pow(10, inx);
            returnNum = returnNum + num *  Math.pow(10, row);
            row= row+1;
        }
        return returnNum;
        
    }
    
}
