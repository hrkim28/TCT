
package com.lge.laus.test;

public class sddfsffd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = {"apple","peach","fly","money","room","cow","test","air","dog","spider"};
		String[] arr2 = {"test","war","holiday","window","project"};
		findMedian(arr);
		findMedian(arr2);
	}
	  public static void findMedian(String[] inputArr) {
		    String temp;

			for(int inx = 0; inx < inputArr.length; inx++){
		    	System.out.print(inputArr[inx]+", ");
		    }

	        for(int inx = 0; inx < inputArr.length-1; inx++){
	            for(int jnx = inx; jnx < inputArr.length; jnx++){
	                if(inputArr[inx].compareTo(inputArr[jnx]) > 0){
	                    temp = inputArr[inx];
	                    inputArr[inx] = inputArr[jnx];
	                    inputArr[jnx] = temp;
	                }
	            }
	        }
	       System.out.println();
	       if(inputArr.length%2==0){
	    	   System.out.println(inputArr[(inputArr.length/2)-1]);
	       }else{
	    	   System.out.println(inputArr[(inputArr.length/2)]);
	       }
		  }
}
