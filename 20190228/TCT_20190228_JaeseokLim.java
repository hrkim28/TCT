import java.util.LinkedList;


public class TCT_20190228_JaeseokLim {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		//Scanner sc = new Scanner(System.in);
		//int number = sc.nextInt();
		
		int[] testCount = {3,3,2,5};
		String[][] testSet = {{"전지현","손예진","송혜교","수지","설현","전지현","손예진","송혜교","수진","설현"}
		                       ,{"전지현","손예진","송혜교","전지현","손예진","송혜교","전지현","손예진","송혜교"}
		                       ,{"전지현","손예진","송혜교","수지","설현","김하늘","송혜교","이나영","한가인","전지현","수지","이나영"}
		                       ,{"전지현","손예진","송혜교","수지","설현","김하늘","송혜교","이나영","한가인","전지현","수지","이나영"}};
		
		
		for( int i = 0 ; i < testCount.length;i++ ) {
			System.out.println(fnDanger(testCount[i],testSet[i]));
		}

		
		
    }
	
	private static int fnDanger(int number, String[] test) {
		int dangerCount = 0;
		LinkedList<String> haema = new LinkedList<String>();
		for ( int i = 0 ; i < test.length; i++) {
			if ( haema.contains(test[i]) ) {
				dangerCount += 1;
			} else {
				dangerCount += 5;
			}
			
			if (haema.isEmpty() ) {
				haema.add(test[i]);
			} else {
				haema.add(test[i]);
				if ( haema.size() > number) {
					haema.pop();
				}
				
			}
		}
		
		return dangerCount;
		
	}

}
	