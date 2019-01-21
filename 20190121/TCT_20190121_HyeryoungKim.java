public class TCT_20190121_HyeryoungKim {

    public static void main(String[] args){
        TCT_20190121_HyeryoungKim tct = new TCT_20190121_HyeryoungKim();
        
        int n1 = 4;
        int[] r1 = new int[]{4,6,2,4};
        int[] p1 = new int[]{6,4,2,4};
        tct.getResult(n1, r1, p1);
        
        int n2 = 4;
        int[] r2 = new int[]{4,6,2,4};
        int[] p2 = new int[]{7,4,2,4};
        tct.getResult(n2, r2, p2);
        
        int n3 = 3;
        int[] r3 = new int[]{4,5,6};
        int[] p3 = new int[]{1,2,3};
        tct.getResult(n3, r3, p3);
        
        int n4 = 3;
        int[] r4 = new int[]{3,6,9};
        int[] p4 = new int[]{7,17,37};
        tct.getResult(n4, r4, p4);
    }
    
    public void getResult(int n, int[] r, int[] p) {
        StringBuffer sb = new StringBuffer();
        int gcd = getMaxGcd(r);
        long max = getDiffMaxInfo(n, r, p);
        
        if ( max > 0 ) {
            int[] cloneR = r.clone();
            for ( int idx = 0 ; idx < cloneR.length ; idx++ ) {
                cloneR[idx] = cloneR[idx]/gcd;
            }
            
            int maxShare = 0;
            int tmpShare = 0;
            for ( int jdx = 0 ; jdx < cloneR.length ; jdx++ ) {
                if ( jdx == 0 ) maxShare = (int)Math.ceil((double)p[jdx]/cloneR[jdx]);
                tmpShare = (int)Math.ceil((double)p[jdx]/cloneR[jdx]);
                if ( maxShare < tmpShare ) {
                    maxShare = tmpShare;
                }
            }
            
            for ( int kdx = 0 ; kdx < cloneR.length ; kdx++ ) {
                cloneR[kdx] = cloneR[kdx]*maxShare;
            }
            
            for ( int ldx = 0 ; ldx < n ; ldx++ ) {
                sb.append(cloneR[ldx]-p[ldx] + " ");
            }
        } else {
            for ( int idx = 0 ; idx < n ; idx++ ) {
                sb.append(r[idx]-p[idx] + " ");
            }
        }
        
        System.out.println(sb.toString());
    }
    
    public long getDiffMaxInfo(int n, int[] r, int[] p) {
        long max = 0;
        long tmp = 0;
        for ( int idx = 0 ; idx < n ; idx++ ) {
            if ( idx == 0 ) max = p[idx] - r[idx];
            
            tmp = 0;
            tmp = p[idx] - r[idx];
            if ( max < tmp ) {
                max = tmp;
            }
        }
        
        return max;
    }
    
    public int getMaxGcd(int[] r) {
        int gcd = 0;
        int tmp = r[0];
    
        for ( int idx = 0 ; idx < r.length - 1 ; idx++ ) {
            tmp = getGcd(tmp, r[idx+1]);
        }
        gcd = tmp;
    
        return gcd;
    }
    
    public int getGcd(int a, int b) {
        while ( b > 0 ) {
            int share = a%b;
            a = b;
            b = share;
        }
        return a;
    }
}