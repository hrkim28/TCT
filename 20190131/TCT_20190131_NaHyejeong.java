package teamExcercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TCT_20190131_NaHyejeong {
	
	public static void main(String[] args) {
	
		int testCnt = 13;
		String [] words = {"but", "i", "wont", "hesitate", "no", "more", "no", "more" ,"it", "cannot" ,"wait", "im", "yours"};
		// 단어 정렬
		ArrayList <String> wordsArray = sortWords( testCnt, words );
		// 출력
		System.out.println(wordsArray.toString());
	}

	private static ArrayList <String> sortWords(int testCnt, String[] words) {
		
		ArrayList <String> wordArray = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			if( !wordArray.contains(words[i])) { //중복제거
				wordArray.add(words[i]);
			}
		}
		
		// * 길이가 짧은 것부터 
		// * 길이가 같으면 사전 순으로
		Collections.sort(wordArray, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				
				int o1_lenght = o1.toString().length();
				int o2_lenght = o2.toString().length();
				
				if(o1_lenght ==  o2_lenght) {
					return ((String) o1).compareTo((String)o2);
				}else if (o1_lenght > o2_lenght) {
					return 1;
				}else {
					return -1;
				}
			}
		});
		
		return wordArray;
	}

	
	
}
