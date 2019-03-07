package teamExcercise;

import java.util.Arrays;

public class TCT_20190307_NaHyejeong {

	public static void main(String[] args) {
		
		int [] testData = {4,7};
		int [] trees    = {20, 15, 10 ,17};

		Arrays.sort(trees);
		int cutterHeight = trees[testData[0]-1];
		int collectTree  = 0; 
		
		while( collectTree < testData[1] ) {
			collectTree = 0;
			cutterHeight--;
			for (int tree : trees) {
				collectTree +=  (tree > cutterHeight) ? (tree - cutterHeight) : 0 ;
			}
		}
		System.out.println("절단기 최대 높이 : " + cutterHeight);
		
	}

	
}
