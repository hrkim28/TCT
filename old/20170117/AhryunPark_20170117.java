
public class AhryunPark {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length > 0 && args != null){
			
			String orgStr = args[0].toString();
			String printStr = "";
			
			for(int i = 0; i < orgStr.length() ; i++){
				
				int sameCnt = 0;
				
				for(int j = 1; j < orgStr.length()-1 ; j++){
					
					if( orgStr.charAt(i) ==  orgStr.charAt(j)){
						sameCnt = sameCnt + 1; 
					}
					else{
						i = j +1;
						break;
						
					}
				}
				
				if(sameCnt == 0){
					printStr = printStr + orgStr.charAt(i) + String.valueOf(sameCnt);
				}
				else{
					printStr = printStr + orgStr.charAt(i);
				}
				
			}
			
			System.out.println(" 결과값 === " + printStr );
			
		}
		

	}

}
