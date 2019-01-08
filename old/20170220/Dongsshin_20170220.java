package com.lgcns.team.lcp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Dongsshin_20170220 {
	public static void main(String[] args) {
	    List<List<String>> strListList = new ArrayList<List<String>>();
	    List<String> result  = new ArrayList<String>();
	    	    
	    strListList.add(makeStrList("table01", "table02", "table03"));
	    strListList.add(makeStrList("table11", "table12"));
	    strListList.add(makeStrList("table21", "table22", "table23", "table24"));
	    
	    String[] values = new String[strListList.size()];
	    makeTableJoinCases(strListList, 0, values,result);
	    for(String str:result){
	    	System.out.println(str);
	    }
	}	
    private static List<String> makeStrList(String... values) {
        return(Arrays.asList(values));
    }
	private static void makeTableJoinCases(List<List<String>> strListList, int index, String[] values,List<String> result) {
		List<String> strList = strListList.get(index);
	        for (String v : strList) {
	            values[index] = v;
	            if (index < strListList.size() - 1) {
	            	makeTableJoinCases(strListList, index+1, values,result);
	            } else {
	                StringBuilder sb = new StringBuilder(values[0]);
	                for (int i = 1; i < values.length; ++i) {
	                    sb.append(".").append(values[i]);
	                }
	                result.add(sb.toString());
	            }
	        }
	    }
	    
	}
