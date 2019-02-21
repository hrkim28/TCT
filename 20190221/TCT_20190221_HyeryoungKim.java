public class TCT_20190221_HyeryoungKim {

    public static void main(String[] args) {
    	TCT_20190221_HyeryoungKim tct = new TCT_20190221_HyeryoungKim();
    	int[][] subway = {{0,32,0,3},{3,13,1,0},{28,25,1,5},{39,0,6,0}};
    	System.out.println(tct.getMaxFareByInteval(subway));
    }
    
    private int getMaxFareByInteval(int[][] subway) {
    	int tmp = 0;
    	int max = 0;
    	
    	int onePass = 0;
    	int twoPass = 0;
    	for ( int idx = 0 ; idx < subway.length ; idx++ ) {
    		onePass = 0;
    		for ( int jdx = 0 ; jdx < idx ; jdx++ ) {
    			onePass += subway[jdx][1];
    			if ( jdx != 0 ) {
    				onePass -= subway[jdx][0];
    			}
    		}
    		
    		twoPass = 0;
    		for ( int jdx = 0 ; jdx < idx ; jdx++ ) {
    			twoPass += subway[jdx][3];
    			if ( jdx != 0 ) {
    				twoPass -= subway[jdx][2];
    			}
    		}
    		
    		tmp = 0;
    		tmp = onePass*1000 + twoPass*200;
    		if ( max < tmp ) {
    			max = tmp;
    		}
    	}
    	
    	
    	return max;
    }
}