package com.lgcns.lkk;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Word {
	String word;
	int length;
	public  Word(String word, int length) {
		this.word = word;
		this.length = length;
	}
}

public class   TCT_20190131_LEEKANGKIL{

	public static void main(String args[])  {
		TCT_20190131_LEEKANGKIL obj = new TCT_20190131_LEEKANGKIL();
		Scanner sc = new  Scanner(System.in);
		int cnt = Integer.valueOf(sc.nextLine());
		Word []inputWords = new Word[cnt];
		
		for(int i=0;i<cnt; i++){
			String inStr = sc.nextLine();
			inputWords[i] = new Word(inStr,inStr.length()) ;
		}
		
		obj.executeWordSort(inputWords);
		obj.printWords(inputWords);
	
	}
	
	public void executeWordSort(Word []inputWords){
		Arrays.sort(inputWords, new Comparator<Word>(){
			@Override
			public int compare(Word a, Word b) {
				 int len_a = a.length;
				 int len_b = b.length;
				 
				 if(len_a != len_b){
					 if(a.length>b.length) return 1;
					 else if(a.length<b.length) return -1;
					 else return 0;
				 }
				 return a.word.compareTo(b.word);
			}
		});
	}
	
	public void printWords(Word []inputWords){
		String prevWord="";
		for(int i=0; i< inputWords.length;i++){
			String currWord = inputWords[i].word;
			if(!currWord.equals(prevWord)){
				System.out.println(currWord);
			}
			prevWord = currWord;
		}
	}
}


