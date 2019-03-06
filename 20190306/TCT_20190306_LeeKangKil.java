package com.lgcns.lkk;

import com.sun.xml.internal.ws.util.StringUtils;

public class   TCT_20190306_LeeKangKil{

	public static void main(String args[])  {
		TCT_20190306_LeeKangKil tct = new TCT_20190306_LeeKangKil();
		tct.excuteTCT("long_and_mnemonic_identifier");
		tct.excuteTCT("jobLog");
	}
	
	public  void excuteTCT(String inputStr){
		if(inputStr.indexOf("_")>0) System.out.println(makeCamel(inputStr));
		else System.out.println(makeDeCamel(inputStr));	
	}
	
	public  String makeCamel(String inputStr){
		StringBuffer result = new StringBuffer(inputStr) ;
		int  pos;
		
		while((pos = result.indexOf("_")) !=-1)	{
			char nextWord = result.charAt(pos+1);
			if( nextWord >='a' && nextWord <='z'){
				result.deleteCharAt(pos).deleteCharAt(pos);
				result.insert(pos, StringUtils.capitalize(String.valueOf(nextWord)));
			} else return "Error";
			
			pos = result.indexOf("_");
		}
		return result.toString();
	}
	
	public  String makeDeCamel(String inputStr){
		StringBuffer result = new StringBuffer(inputStr) ;
		
		for(int i=0;i<result.length();i++){
			char word = result.charAt(i);
			if(word == ' ') return "Error"; 
			if(word>='A' && word<='Z'){
				if(i==0) return "Error";
				result.deleteCharAt(i);		
				result.insert(i,"_"+StringUtils.decapitalize(String.valueOf(word)));
			}
		}
		return result.toString();
	}

}