package com.lgcns.numberSort;

public class QuickSort {

	public static void main(String[] args) {
        int[] intArray = {7,4,3,1,5,6,2,8,9};
        print(intArray);
        quickSort(intArray,intArray.length);
        print(intArray);
	}
	
	public static void quickSort(int[] intArray,int n)
	{
		int pivot = intArray[0];
		int l = 0;
		int r = 0;
		if(n <= 1) return;
		l = 0;
		r = n;
		while(1==1)
		{
			for(l++; l < n && pivot >= intArray[l];l++);
			for(r--; r > 0 && pivot < intArray[r];r--);
			if(l>=r) break;
			swap(intArray,l,r);
		}
		swap(intArray,0,r);
		quickSort(intArray,r);
		quickSort(intArray,n-l);
	}
	
    private static void swap(int[] intArray,int i, int j)
    {
		int ti        = intArray[i];
		intArray[i]   = intArray[j];
		intArray[j] =  ti;
    }
	public static void print(int[] intArray)
	{
        StringBuffer strBuf = new StringBuffer();
	    for(int i = 0;i < intArray.length;i++)
	    {
	    	strBuf.append(intArray[i]);
	    }
	    System.out.println(strBuf.toString());
	}
}
