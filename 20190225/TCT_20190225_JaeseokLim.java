
public class TCT_20190225_JaeseokLim {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		//Scanner sc = new Scanner(System.in);
		//int count = sc.nextInt();
		
		int[][] testInputList= {{2000,3000},{1000,3000,1000},{2000,2000,2000,2000},{1000,10000,8000,5000,7000,3000,9000}};
		
		for ( int i = 0 ; i < testInputList.length;i++) {
			System.out.println(fnFindMaxMoney(testInputList[i]));
		}
		
    }
	
	private static int fnFindMaxMoney(int[] testInputList) {
		int maxMoney = 0 ;
		

		int [] test = new int[testInputList.length+1];
		System.arraycopy(testInputList, 0, test, 0, testInputList.length);
		
		for ( int i = 0 ; i < test.length; i++ ) {//0부터 length까지 다돌려본다
			int tempMoney = test[i];
			boolean isFirst = false; //처음이 선택되었는지
			if ( i ==0 ) {
				isFirst = true;
			}
			if ( fnFind(i+2,test,tempMoney,isFirst) > fnFind(i+3,test,tempMoney,isFirst)) {
				tempMoney = fnFind(i+2,test,tempMoney,isFirst);
			} else {
				tempMoney = fnFind(i+3,test,tempMoney,isFirst);
			}
			
			if ( tempMoney > maxMoney ) {
				maxMoney = tempMoney;
			}
		}
		return maxMoney;
	}
	
	private static int fnFind(int strPos,int[] test,int tempMoney,boolean isFirst) {
		if ( (!isFirst && strPos > test.length-1) || (isFirst && strPos >= test.length-1)) {
			return tempMoney;
		} else {
			tempMoney += test[strPos];
			return fnFind(strPos+2,test,tempMoney,isFirst)>fnFind(strPos+3,test,tempMoney,isFirst) ? fnFind(strPos+2,test,tempMoney,isFirst) : fnFind(strPos+3,test,tempMoney,isFirst); 
		}
		
	}
	
	
	

}
		