import java.util.Arrays;

public class TCT_20190307_KimSeongMo {
        public static void main(String[] args){
            TCT_20190307_KimSeongMo obj = new TCT_20190307_KimSeongMo();
            
            int[] input1 = {5,8,7,6};
            int targetLength1 = 5;
            int[] input2 = {20,15,10,17};
            int targetLength2 = 7;
            
            System.out.println(obj.getMaxHegith(input1, targetLength1));
            System.out.println(obj.getMaxHegith(input2, targetLength2));
            
        }
        
        private int getMaxHegith(int[] trees, int targetLength){
            Arrays.sort (trees);
            int max = trees[trees.length-1]-1;
            for( int inx = max; inx >= 0; inx-- ){
                int sum = 0;
                for( int jnx = trees.length-1; jnx >= 0; jnx-- ){
                    if( trees[jnx] > inx ) sum += (trees[jnx] - inx);
                    if( sum >=  targetLength) return inx;
                }
            }
            return 0;
        }

}
