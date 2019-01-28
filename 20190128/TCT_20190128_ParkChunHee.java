package com.lgcns.m3.exercise16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

/*
	문제
영어로 된 문장이 주어졌을 때, 대소문자 구분없이 가장 많이 사용된 알파벳을 출력하는 프로그램을 작성하시오.

입력
첫째 줄부터 글의 문장이 주어진다.
글은 최대 5000글자로 구성되어 있고, 공백, 알파벳, 특수문자, 엔터로만 이루어져 있다.
그리고 적어도 하나의 알파벳이 있다.

[case1]
I think I'm lost.
[case2]
I think I'm lost.I can't tell.
[case3]
I think I'm lost. I can't tell what's where.

출력
가장 많이 사용된 알파벳과 그 횟수를 출력한다.
가장 많이 쓰인 알파벳이 여러개인 경우 알파벳순서대로 모두 출력한다.

[case1]
가장많이 쓰인 알파벳 : i = 3회
[case2]
가장많이 쓰인 알파벳 : i, t = 4 회
[case3]
가장많이 쓰인 알파벳 : t = 5 회
 */
public class TCT_20190128_ParkChunHee {

    public static void main( String[] args ) {
    	
    	String input = "I think I'm lost.I can't tell.";
        HashMap<String, Integer> targetMap = countAlphabetTimes(input);
        int maxNum = 0;
        
        
        Set<String> keySet = targetMap.keySet();
    	Set keyset = targetMap.keySet();
    	Iterator iter = keyset.iterator();
    	
    	// 가장 많은 회수 확인
    	while(iter.hasNext()){
    		String key = iter.next().toString();
    		if(targetMap.get(key) > maxNum){
    			maxNum = targetMap.get(key);
    		}
    	}
    	
    	List maxCharList = new ArrayList();
    	iter = keyset.iterator();
    	
    	// 가장 많은 회수의 알파벳 List에 저장
    	while(iter.hasNext()){
    		String key = iter.next().toString();
    		if(targetMap.get(key) == maxNum){
    			maxCharList.add(key);
    		}
    	}
    	
    	// 정렬
    	Collections.sort(maxCharList);
    	
    	System.out.print("가장많이 쓰인 알파벳 : "); 
    	
    	for (int i = 0; i < maxCharList.size(); i++) { 
    		if(i != maxCharList.size()-1){
    			System.out.print(maxCharList.get(i) + ", ");
    		}else{
    			System.out.print(maxCharList.get(i) + " = ");
    		}
    	}
    	System.out.print(maxNum);

    }
    
    // 대소문자 무시하고 알파벳인 문자의 횟수 계산
    public static HashMap countAlphabetTimes(String input){
    	
    	HashMap<String, Integer> tmpMap = new HashMap<String, Integer>();
    	
    	for(int i=0; i < input.length() ; i++){
    		
    		String tmpString = Character.toString(input.charAt(i)).toLowerCase();
    		
    		if(getStringType(tmpString)){
    			if(tmpMap.containsKey(tmpString)){
    				tmpMap.put(tmpString, tmpMap.get(tmpString)+1);
    			}
    			else{
    				tmpMap.put(tmpString, 1);
    			}
    		}
    	}
    	
    	return tmpMap;
    }
    
    public static boolean getStringType(String str) {
        return Pattern.matches("[a-z]", str);
    }

}




