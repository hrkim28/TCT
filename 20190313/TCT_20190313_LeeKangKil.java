package com.lgcns.lkk;

import java.util.Arrays;
public class   TCT_20190313_LeeKangKil{

	public static void main(String args[])  {
	        
		System.out.println(getResult( new int[]{702,429}, 3));
		System.out.println(getResult( new int[]{427,541,774,822}, 11));
	    }
	
	public static int getResult( int[] array, int manCnt ){

		return binarySearch(0, getMaxVal(array), manCnt, array);

	}
	
	public static int getMaxVal(int []array){
		Arrays.sort(array);
		return array[array.length-1];
	}

	public static int binarySearch(int st, int ed, int target, int []array) {
		
		if(st>ed) return -1;
		
		int val = (st+ed)/2;
		int cnt=0;
		
		for(int i=0;i<array.length;i++) cnt += array[i]/val;
		
		if(cnt > target) return binarySearch(val + 1 , ed, target, array);
		if(cnt < target) 	return binarySearch(st , val - 1, target, array);
		
		return val;
		 
	}
	
}
