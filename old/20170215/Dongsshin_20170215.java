package com.lgcns.team.lcp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class Dongsshin_20170215 {
	/*
           알파벳 a=1, b=2....z=26으로 할당할때 주어진 숫자를 가지고 만들수 있는 모든 가능한 문자열을 출력하세요...
           예를 들면 입력된 숫자가 113이면 출력해야 할 문자열은 aabc, kbc, alc, aaw, kw 입니다.
	 */
	public static void main(String[] args) {
		char[] chrArry = "11111111".toCharArray();
		List<Str> rslt = makr(null,chrArry,0);
		for(Str str : rslt){
			String[] strAry = str.getStr().split(Pattern.quote("."));
			StringBuffer b = new StringBuffer();
			for(int i = 0 ; i < strAry.length; i++){
				int n = Integer.parseInt(strAry[i]) + 96;
				b.append(String.valueOf((char)(n)));
			}
			System.out.println(b);
		}
	}
	private static List<Str> makr(List<Str> in, char[] chrArry, int pos){
		List<Str> rslt = new ArrayList<Str>();
		if(pos > chrArry.length - 1) return in;
		if(in == null){
			rslt.add(new Str(String.valueOf(chrArry[pos]),0));
			rslt.add(new Str(String.valueOf(chrArry[pos]) + String.valueOf(chrArry[pos+1]),1));
		}else{
			for(Str str : in){
			    if(str.getIndex()+2 < chrArry.length){
				     rslt.add(new Str((str.getStr() + "." + chrArry[str.getIndex()+1]),str.getIndex()+1));
				     rslt.add(new Str((str.getStr() + "." + chrArry[str.getIndex()+1] + chrArry[str.getIndex()+2]),str.getIndex()+2));
			    }else if(str.getIndex()+1 < chrArry.length){
			    	rslt.add(new Str((str.getStr() + "." + chrArry[str.getIndex()+1]),str.getIndex()+1));
			    }else{
			    	rslt.add(str);
			    }
			}			
		}
		return(makr(rslt,chrArry,pos+1));
	}
    private static class Str{
    	String str;
    	int  index;
		public Str(String str, int index) {
			super();
			this.str = str;
			this.index = index;
		}
		public String getStr() {
			return str;
		}
		public int getIndex() {
			return index;
		}
    }
}
