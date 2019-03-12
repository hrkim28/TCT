public class TCT_20190312_HyeryoungKim {

    public static void main(String[] args) {
        int[][] result = makeCombination(4, 4);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println("");
        }
    }

    private static int[][] makeCombination(int N, int K) {
        int row = (int)Math.pow(N, K);
        int[][] result = new int[row][K];
        
        int number = 0;
        for ( int idx = 0 ; idx < row ; idx++ ) {
            number = idx;
            for ( int jdx = K-1 ; jdx >= 0 ; jdx-- ) {
                result[idx][jdx] = number%N;
                number = number/N;
            }
        }
        return result;
    }
}