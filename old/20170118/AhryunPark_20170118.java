import com.lge.advs.common.util.StringUtil;


public class AhryunPark_20170119 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a  = Integer.parseInt(args[0].substring(0,1)); // 가로 배열
		int b =  Integer.parseInt(args[0].substring(1,2)); // 세로 배열
		int c =  Integer.parseInt(args[0].substring(2)); // maxCnt
		
		String ap = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		if(a > 0 && b > 0 && c > 0) {
			
			
			//1. 알파벳 만들기
			ap = ap.substring(0, c);
			
			//가로배열
			String[][] strl = new String[a][b];
			//세로배열 
			String[][] strh = new String[a][b];
			if( c >= a*b ){
				String ap1 = ap;
				for(int i = 0 ; i < a ; i++ ){
					
					
					for(int j = 0; j < b ; j++){
						
						strl[i][j] = ap1.substring(0, 1);
						ap1 = ap1.substring(1);
					}
					
				}
				
				String ap2 = ap;
				for(int i = 0; i < b ; i ++){
					
					for(int j = 0 ; j < a ; j++ ){
						strh[j][i] = ap2.substring(0, 1);
						ap2 = ap2.substring(1);
					}
					
				}
			}
			else{
				
				String ap1 = ap;
				int isRevers = 0;
				for(int i = 0 ; i < a ; i++ ){
					
					for(int j = 0; j < b ; j++){
						
						if(ap1.length() == 0){
							if(isRevers == 0){
								String temp = "";
								for(int z = c-1 ; z > 0  ; z--){
									temp = temp + ap.charAt(z-1);
								}
								ap1 = temp;
							}
							isRevers = isRevers + 1;
						}
							
						if(isRevers > 1){
							strl[i][j] = "A";
						}
						else{
							strl[i][j] = ap1.substring(0, 1);
							ap1 = ap1.substring(1);
						}
					}
				}
				
				
				String ap2 = ap;
				int isRevers2 = 0;
				for(int i = 0; i < b ; i ++){
					for(int j = 0 ; j < a ; j++ ){
						
						if(ap2.length() == 0){
							if(isRevers2 == 0){
								String temp = "";
								for(int z = c-1 ; z > 0  ; z--){
									temp = temp + ap.charAt(z-1);
								}
								ap2 = temp;
							}
							
							isRevers2 = isRevers2 + 1;
						}
							
						if(isRevers2 > 1){
							strh[j][i] = "A";
						}
						else{
							strh[j][i] = ap2.substring(0, 1);
							ap2 = ap2.substring(1);
						}
					}
				}
			}
			
			
			//System 출력
			//가로출력
			for(int i = 0 ; i < a ; i++ ){		
				String printStr = "";
				for(int j = 0; j < b ; j++){
					printStr = printStr +strl[i][j];
				}
				System.out.println("가로배열" + printStr);
			}
		
			for(int i = 0 ; i < a ; i++ ){		
				String printStr = "";
				for(int j = 0; j < b ; j++){
					printStr = printStr +strh[i][j];
				}
				System.out.println("세로배열" + printStr);
			}
			
		}
	}

}

