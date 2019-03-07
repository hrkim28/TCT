import java.util.Arrays;

public class TCT_20190307_LeeJinKyoung {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        //int[] input = {4,30};
        int[] input = {4,7};
        int[] tree = {20, 15, 10, 17};
                
        int sum = 0;
        int result = 0;        
        Arrays.sort(tree);
        
        for(int inx = input[0]-1; inx >= 0; inx--){
            
            if(inx == 0) {
                int cut =  tree[inx] * (input[0] - inx);
                result =  (sum + cut - input[1]) / (input[0] - inx);
            } else {
                int cut =  (tree[inx] - tree[inx-1]) * (input[0] - inx);
    
                if(input[1] < sum + cut ){               
                    result =  tree[inx-1] + (sum + cut - input[1]) / (input[0] - inx);
                    break;
                } else {
                    sum += cut;
                }
            }
        }

        System.out.println(result);
    }

}
