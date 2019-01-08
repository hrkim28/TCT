package com.lgcns.team.lcp;

import java.util.ArrayList;
import java.util.List;

public class Dongsshin_20170216 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wantedCnt = 100;
		List<List<String>> rslt  = new ArrayList<List<String>>();
		List<String> strList = new ArrayList<String>();
		strList.add("1");rslt.add(strList);
		expl(1,0,rslt,wantedCnt);
    	System.out.println("Floor is:" + rslt.size());
	}
	private static void expl(int current,int curIdx, List<List<String>> rslt, int max){
		if(current >= max) return;
		List<String> strList = new ArrayList<String>(); 
		for(String str : rslt.get(curIdx)){
			if(current >= max) {rslt.add(strList);return;}
			strList.add(String.valueOf(++current));
			strList.add(String.valueOf(++current));
		}
		rslt.add(strList);
		expl(current+1,curIdx+1,rslt,max);
	}
}
