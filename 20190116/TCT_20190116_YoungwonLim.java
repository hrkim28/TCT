import java.util.Arrays;
import java.util.Scanner;


public class TCT_20190116_YoungwonLim {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
        
        String[] splitInput = input.split(",");
        int workNumber = splitInput.length-1;
        int workTime = Integer.parseInt(splitInput[splitInput.length -1]);
        int workTimeSum = 0;
        
        int[] intTowork = new int[workNumber] ;
        for(int inx =0 ; inx < workNumber ; ++inx)
        {
            intTowork[inx] = Integer.parseInt(splitInput[inx]);
        }

        for(int inx=0; inx < workTime; ++inx)
        {
            Arrays.sort(intTowork);
            if(intTowork[workNumber-1] != 0 ){
                intTowork[workNumber-1] = intTowork[workNumber-1] -1 ;
            }
        }
    
        for(int inx=0; inx< workNumber; ++inx)
        {
            workTimeSum = workTimeSum + intTowork[inx] * intTowork[inx];
        }
        
        System.out.print("[" + input.substring(0, input.length() -(splitInput[splitInput.length-1].length()+1)) +"]");
        System.out.print("," + workTime);
        System.out.print("," + workTimeSum);


    }

}
