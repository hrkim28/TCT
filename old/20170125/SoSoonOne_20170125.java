package com.test02;

import java.util.Arrays;

public class SoSoonOne_20170125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input[] = {"apple", "peach", "fly", "money", "room", "cow", "test", "air", "dog", "spider"};
		int length = input.length;
		
		Arrays.sort(input);
		
		for (int i = 0 ; i < length-1 ; i++){
	
			System.out.println(input[i]);
		}
		
		System.out.println("°á°ú´Â : " + input[(int)((length)/2)-1]);
	}

}
