
public class TCT_20190312_LeeJinKyoung {

    public static void main(String[] args) {
        //int[][] result = makeCombination(4, 5);
        int[][] result = makeCombination(4, 4);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println("");
        }
    }

    private static int[][] makeCombination(int N, int K) {
        int arraySize = (int)Math.pow(N,K);
        int[][] result = new int[arraySize][K];        
        int num = 0;

        for(int i = 0 ; i < arraySize;i++){
            num = i;
            for(int j = K-1 ; j > 0; j--){                
                result[i][(K-1) - j] = num / (int)Math.pow(N,j);
                num -= result[i][(K-1) - j] * (int)Math.pow(N,j);
            }
            result[i][K-1] = num;
        }

        return result;
    }
}
