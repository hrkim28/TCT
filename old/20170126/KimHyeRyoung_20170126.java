import java.util.Arrays;

public class KimHyeRyoung_20170126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		String[] arr = new String[2*n];
		
		if ( n > 0 ) {
			for ( int idx = 0 ; idx < arr.length ; idx++ ) {
				if ( idx < n ) {
					arr[idx] = "a".concat(String.valueOf((idx+1)));
				} else {
					arr[idx] = "b".concat(String.valueOf((idx-n+1)));
				}
			}
		
			String tmpStr = "";
			for ( int j = 0 ; j < arr.length ; j++ ) {
				arr[j] = arr[j].substring(1, 2).concat(arr[j].substring(0, 1));
			}
			
			for ( int k = 0 ; k < arr.length ; k++ ) {
				for ( int l = k ; l < arr.length ; l++ ) {
					if ( arr[k].compareTo(arr[l]) > 0 ) {
						tmpStr = arr[k];
						arr[k] = arr[l];
						arr[l] = tmpStr;
					}
				}
			}
			/*Arrays.sort(arr);*/
			for ( int m = 0 ; m < arr.length ; m++ ) {
				arr[m] = arr[m].substring(1, 2).concat(arr[m].substring(0, 1));
				System.out.println(arr[m]);
			}
		} else {
			System.out.println("잘못된 n의 값을 입력하셨습니다.");
		}
	}

}
