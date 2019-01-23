

import java.util.HashMap;
import java.util.Scanner;

public class   TCT_20190123_LEEKANGKIL{

	public static void main(String args[])  {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []array =new int[n];
		int result =0 ;
		
		for(int i=0;i<n;i++){
			array[i] = sc.nextInt(); 
		}
		
		HashMap <Integer,Integer> numCntMap = new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++){
			int num = array[i];
			if(numCntMap.containsKey(num)) numCntMap.put(num, numCntMap.get(num)+1);
			else numCntMap.put(num, 1);
		}
		
		for(int key : numCntMap.keySet()){
			if(numCntMap.get(key)%2!=0) result ^= key;  
		}
		
		System.out.println(result);
		
	}

}