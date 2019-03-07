package teamExcercise;

import java.util.ArrayList;
import java.util.Collections;

public class TCT_20190307_NaHyejeong {

	public static void main(String[] args) {
		
		int [] testData = {4,7};
		int [] trees    = {20, 15, 10 ,17};
		
		ArrayList<Integer> treeArrayList = new ArrayList<>();
		for (int tree : trees) treeArrayList.add(tree);
		Collections.sort(treeArrayList);
		Collections.reverse(treeArrayList);
		
		int collectTree = 0; 
		int cutterHeight = treeArrayList.get(0);
		
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
