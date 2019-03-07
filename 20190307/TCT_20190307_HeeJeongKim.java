package com.tctstudy;

import java.util.ArrayDeque;
import java.util.Arrays;

public class TCT_20190307_HeeJeongKim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 4; //나무 수
		int M = 7; //나무 길이
		
		int trees[] = {20, 15, 10, 17};
		int treesCut[] = new int[N]; //설정높이값에 따른, 나무 누적길이
		
		Arrays.sort(trees);
		
		int maxHeight = 0;
		for (int i=0; i<trees.length; i++) {
			maxHeight = trees[i];  //최대높이값
			
			int tmpHeight = 0;
			for (int j=i+1; j<trees.length; j++) {
			     tmpHeight = tmpHeight+ (trees[j]-maxHeight); //설정된 최대높이값에 따른, 누적 나무 길이
			}
			treesCut[i] = tmpHeight;
		}
		
		int index =0;
		int curHeight = treesCut[0]-M;
		for (int k=1; k<treesCut.length; k++) {
			if (treesCut[k]-M==0) {
				 index =k;
				 break;
			} else if (treesCut[k]-M>0 && curHeight>treesCut[k]-M) {
				 index =k;
				 curHeight = treesCut[k]-M;
			}
		}
		System.out.println(trees[index]);
		
	}

}
