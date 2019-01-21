package com.lgcns.m1.example;

public class TCT_20190121_JunWooChae {	
	
	public static void main(String[] args) {
		int[] n = {4, 6, 2, 4};
		int[] r = {7, 4, 2, 4};
		int[] tempN = new int[n.length];
		
		int minValue = minValue(n);
		int maxTimes = 0;

		boolean isDevide = true;
		int devisor = 0;
		for(int jnx = 2;jnx <= minValue; jnx ++){
			for (int inx = 0; inx < n.length; inx ++){
				if(n[inx]%jnx != 0){
					isDevide = false;
					break;
				}
			}
			
			if(isDevide){
				devisor = jnx;
			}
		}
		if(devisor != 0){
			for(int inx = 0; inx < n.length; inx ++){
				n[inx] = n[inx]/devisor;
			}
		}
		
		for(int inx = 0; inx < n.length; inx ++){
			tempN[inx] = (int)Math.ceil((double)r[inx]/n[inx]);
		}
		
		maxTimes = maxValue(tempN);

		for(int inx = 0; inx < n.length; inx ++){
			n[inx] = n[inx] * maxTimes;
			System.out.print(n[inx] - r[inx]+ " ");
		}
	}
	
	public static int minValue(int[] arr) { 
		int min = arr[0];  

		for(int e : arr) { 
		    if(min > arr[0]){ 
		    	min = arr[e];
		    }
		}
		return min;
	}

	public static int maxValue(int[] arr) { 
		int max = arr[0]; 
		
		for(int e : arr) { 
		    if(arr[0] < max){ 
		    	max = arr[e];
		    }
		} 
        return max; 
    } 
}
