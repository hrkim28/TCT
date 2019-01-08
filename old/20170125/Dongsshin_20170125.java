package com.lgcns.team.lcp;

import java.util.List;

public class Dongsshin_20170125 {
	public static void main(String[] args) {
		String input[] = {"apple", "peach", "fly", "money", "room", "cow", "test", "air", "dog", "spider"};
		bubble(input);
		System.out.println("median : " + input[input.length/2-(input.length+1)%2]);
	}
	private static void bubble(String input[]) 
	{
        boolean chk = true;
        while(chk)
        {
        	chk = false;
        	for(int i = 0; i < input.length-1; i++)
        	{
        		if(input[i].compareTo(input[i+1]) > 0)
        		{
        			swap(input,i,i+1);
        			chk = true;
        		}
        	}
        }
	}
	private static void swap(String input[], int from, int to)
	{
		String f = input[from];
		input[from] = input[to];
		input[to] = f;
	}
}
