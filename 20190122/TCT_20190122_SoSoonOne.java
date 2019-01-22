public class TCT_20190122_SoSoonOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int n = 6;
		int[] r={10,20,15,25,10,20};
		//int result = checkThree(n,r,p);
		
		checkStair(n,r);
		
	}
	
	private static void checkStair( int n,int[] r) {
		
        int[] sumScore = new int[n];
        
        sumScore[0] = r[0];
        sumScore[1] = sumScore[0] + r[1];
        sumScore[2] = Math.max(sumScore[0] + r[2], r[1] + r[2]);
        
        for( int i = 3; i < n-2; i++ ){
            sumScore[i] = Math.max(sumScore[i-3] + r[i-1] + r[i], sumScore[i-2] + r[i]);
        }
        
        System.out.println(sumScore[n-3]+r[n-1]);

	}
	
}
