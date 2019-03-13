
public class TCT_20190313_LeeJinKyoung {
    public static void main(String[] args) {
        //int N = 3;
        //int K = 3;
        //int[] input = {601,100,100};
        //int[] input = {401,100,100};
        
        int N = 4;
        int K = 11;        
        int[] input = {427, 541, 774, 822};
        
        int inputSum = 0; 
                
        for(int inx = 0 ; inx < input.length; inx++){
            inputSum = inputSum + input[inx];
               
        }
        
        int avg = inputSum/K;
        int remain = 0;
        int copyK = 0;
        
        for(int inx = avg ; inx > 0; inx--){
            copyK = K;
            
            for(int jnx = 0 ; jnx < input.length; jnx++){
                remain = input[jnx];
                while(remain >= inx && copyK != 0){
                    remain -= inx;
                    copyK--;
                }
            }

            if(copyK == 0){
                System.out.println(inx);
                break;
            }
            
        }
    }
}
