import com.lge.advs.common.util.StringUtil;


public class AhryunPark_20170118 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//	int inputNum = Integer.parseInt(args[0]);
		
		
			
		for(int i = 100 ; i < 1000; i++){
			
			String str = String.valueOf(i);
			
			int a = Integer.parseInt(str.substring(0, 1));
			int b = Integer.parseInt(str.substring(1, 2));
			int c = Integer.parseInt(str.substring(2, 3));
			
			
			int amtNum = (a*a*a) + (b*b*b) + (c*c*c);
			
			if(amtNum == i){
				System.out.println("Armstrong Number  : " +  amtNum);
			}
			
		}

	}

}

