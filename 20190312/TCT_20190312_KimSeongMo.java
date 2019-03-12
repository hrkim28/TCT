public class TCT_20190312_KimSeongMo {
    public static void main(String[] args) {
        int[][] result = makeCombination(4, 5);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println("");
        }
    }

    private static int[][] makeCombination(int N, int K) {
        // n진수 k번째 자리 까지
        int max = (int)Math.pow(N, K);
        int[][] result = new int[max][K];
        for( int inx = 0; inx < max; inx++ ){
            if( inx < N ){ result[inx][K-1] = inx; continue; }
            int tempBase = inx;
            int blank = K;
            while( tempBase > 0 ){
                result[inx][--blank] = tempBase%N;
                tempBase = tempBase/N;
            }
        }
        return result;
    }
}
