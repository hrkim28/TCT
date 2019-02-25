package com.lgcns.lkk;

import java.util.ArrayList;
import java.util.Collections;

public class   TCT_20190225_LeeKangKil{

	public static void main(String args[])  {
		TCT_20190225_LeeKangKil TCT = new TCT_20190225_LeeKangKil();
		TCT.getMaxSum(new int[]{ 2000, 3000});
		TCT.getMaxSum(new int[]{ 1000, 3000, 1000});
		TCT.getMaxSum(new int[]{ 2000, 2000, 2000, 2000});
		TCT.getMaxSum(new int[]{ 1000, 10000, 8000, 5000, 7000, 3000, 9000});
	}
	
   public void getMaxSum(int[] array){
	   if(array.length == 1 ) { System.out.println(array[0]); return;} 
	   if(array.length == 2 ) { System.out.println( Math.max(array[0],array[1])); return; }
	   if(array.length == 3 ) {System.out.println( Math.max(Math.max(array[0],array[1]) , array[2]) ); return;}
	   
	   ArrayList <Integer> resultSet = new ArrayList<Integer>();
 
	   for (int i=0; i<3; i++) getTreePathSum(i,array,resultSet); 
	   Collections.sort(resultSet);
	   
	   System.out.println(resultSet.get(resultSet.size()-1));
   }
	
	public void getTreePathSum(int startIdx,  int currentIdx ,  int sum, int depth, int[]input,  ArrayList <Integer> resultSet){
		int len = input.length;
		if( depth !=0 && (currentIdx%len == startIdx + 1 || currentIdx%len == ((startIdx - 1)<0 ? len-1 : startIdx - 1)) ) return;  
		
		sum += input[currentIdx%len];
				
		if( currentIdx ==  len -  2 + startIdx || currentIdx ==   len - 3 + startIdx ){
			resultSet.add(sum);
			return;
		}
		depth++;
		
		getTreePathSum (startIdx , currentIdx +2, sum, depth,input,resultSet);
		getTreePathSum (startIdx , currentIdx +3, sum, depth,input,resultSet);
	}
	
	public void getTreePathSum(int startIdx, int[]input,  ArrayList <Integer> resultSet){
		getTreePathSum(startIdx,startIdx,0,0,input,resultSet);
	}
	
}
	


