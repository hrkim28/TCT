package com.lgcns.lkk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class Test {

	public static void main (String arg[]) throws IOException  {
		run();
	}

	public  static void run(){
		/*
		문자열 중앙값 구하기
		입력한 문자열 리스트를 오름차순으로 정렬했을 때 중앙에 해당하는 문자열을 출력하시오.
		(단, 문자열 리스트의 갯수가 짝수일 경우, 중앙에 해당하는 두 문자열 중 앞에 있는 문자열을 출력한다.)
		출력예시
		input : test, war, holiday, window, project
		median : test
		input : apple, peach, fly, money, room, cow, test, air, dog, spider
		median : fly
		 */
		
		//String input[] = {"test","war","holiday","window","project"};
		String input[] = {"apple", "peach", "fly", "money", "room", "cow", "test", "air", "dog", "spider"};
		for(int i=0; i<input.length;i++)
		{
			for(int j=i;j<input.length;j++)
			{
				if(input[i].compareTo(input[j])>0){
					String temp = input[i];
					input[i] =input[j];
					input[j] = temp;
				}
				
			}
		}
		System.out.println("median : " + input[input.length/2-(input.length+1)%2]);
		
	}

}
