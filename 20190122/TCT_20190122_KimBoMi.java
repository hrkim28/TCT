/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : TCT_20190122_KimBoMi.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 
 * ===========================================
 */


public class TCT_20190122_KimBoMi {
    public static void main(){
        int[] inputValue = new int[]{6,10,20,15,25,10,20};

        int row = inputValue[0];
        int i = row;
        int sum = 0;
        int limit = 2;
        
        while(i > 1) {        
            sum += inputValue[i];
            
            if( limit > 0){
                limit --;
                i--;
            }else{
                limit = 2;
                i=i-2;
            }
            
        }
        System.out.println(sum);
    }
}
