public class TCT_20190123_SoSoonOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int n = 4;
		int[] r={2,5,3,3};
		
		System.out.println(checkXor(n, r));
		
	}
	
	private static int checkXor( int n,int[] r) {
		
        int[] sumScore = new int[n];
        int result = r[0];
        
        for(int i = 1 ; i < r.length ; i ++){
        	result = result ^ r[i];
        }
        
        
        return result;
	}
	
}
