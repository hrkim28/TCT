import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;


/**
 * ===========================================
 * System Name : LGE PLM Project
 * Program ID : TCT_20190131_LeeJinkyoung.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 2019. 1. 31.  70705   Initial
 * ===========================================
 */

/**
 * <pre>
 * Class : TCT_20190131_LeeJinkyoung
 * Description : TODO
 * </pre>
 * 
 * @author 70705
 */
public class TCT_20190131_LeeJinkyoung {
    public static void main(String[] args){
        String tempArray[] = {
                "but",
                "i",
                "wont",
                "hesitate",
                "no",
                "more",
                "no",
                "more",
                "it",
                "cannot",
                "wait",
                "im",
                "yours"
        };
        
        // Sort, ignoring case during sorting 
        Arrays.sort(tempArray, new Comparator<String>(){ 
  
            @Override
            public int compare(String c1, String c2) 
            { 
                int compareResult = 0;
                if( Integer.compare(c1.length(),c2.length()) == 0){
                    compareResult =   c1.toLowerCase().compareTo(c2.toLowerCase());
                } else {
                    compareResult = Integer.compare(c1.length(),c2.length());
                }
                // ignoring case 
                return compareResult; 
            } 
        }); 
      
        System.out.println(tempArray[0]);
        for(int inx = 1 ; inx < tempArray.length; inx++){
            if(!tempArray[inx].equals(tempArray[inx-1])){
                System.out.println(tempArray[inx]);
            }
        }
    }
}
