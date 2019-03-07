import java.util.Arrays;

public class TCT_20190307_HyeryoungKim {

    /**
     * 나무의 수 N, 1 ≤ N ≤ 1,000,000
     * 집으로 가져가려고 하는 나무의 길이 M, 1 ≤ M ≤ 2,000,000,000
     */
    public static void main(String[] args) {
        TCT_20190307_HyeryoungKim tct = new TCT_20190307_HyeryoungKim();
        int tree = 4;
        int need = 7;
        int[] treeHeight = {20,15,10,17};
        System.out.println(tct.getMaxHeightForMinTree(tree, need, treeHeight));
    }

    private int getMaxHeightForMinTree(int tree, int need, int[] treeHeight) {
        Arrays.sort(treeHeight);
        
        int diff = (treeHeight[tree-1]- treeHeight[tree-2]);
        int sum = 0;
        int result = 0;
        if ( need > diff ) {
            int startHeight = treeHeight[tree-2];
            treeHeight[tree-1] = startHeight;
            while ( true ) {
                sum = diff;
                for ( int idx = 0 ; idx < treeHeight.length ; idx++ ) {
                    if ( treeHeight[idx] > startHeight ) {
                        sum += treeHeight[idx] - startHeight;
                    }
                }
                if ( sum == need ) {
                    break;
                }
                startHeight--;
            }
            result = startHeight;
        } else {
            result = treeHeight[tree-1]-need;
        }
        return result;
    }
}