import java.util.HashSet;
import java.util.Scanner;

public class TCT_20190131_HyeryoungKim {
	/*
	 * 1. 중복 제거
	 * 2. 단어 길이별 오름차순 정렬
	 * 3. 동일 길이일 때, 사전 순서 정렬
	 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 단어의 개수를 입력하시오.");
        int len = sc.nextInt();
        
        System.out.println("개수만큼 단어를 입력하시오.");
        HashSet<String> set = new HashSet<String>();
        for ( int idx = 0 ; idx < len ; idx++ ) {
            set.add(sc.next());
        }
        
        String[] words = new String[set.size()];
        set.toArray(words);
        
        printWords(words);
    }
    
    
    private static void printWords(String[] words) {
    	repositionByLength(words);
    	reorderByAlphabet(words);
    	for ( int idx = 0 ; idx < words.length ; idx++ ) {
            System.out.println(words[idx]);
        }
    }
    
    private static void repositionByLength(String[] words) {
    	String tmp = "";
    	for ( int idx = 0; idx < words.length -1 ; idx++ ) {
    		for ( int jdx = idx ; jdx < words.length ; jdx++ ) {
    			if ( words[idx].length() > words[jdx].length() ) {
    				tmp = words[idx];
    				words[idx] = words[jdx];
    				words[jdx] = tmp;
    			}
    		}
    	}
    }
    
    private static void reorderByAlphabet(String[] words) {
    	String tmp = "";
    	for ( int idx = 0 ; idx < words.length - 1 ; idx++ ) {
    		for ( int jdx = idx ; jdx < words.length ; jdx++ ) {
    			if ( words[idx].length() == words[jdx].length() ) {
    				if ( words[idx].compareTo(words[jdx]) > 0 ) {
    					tmp = words[idx];
    					words[idx] = words[jdx];
        				words[jdx] = tmp;
    				}
    			}
    		}
    	}
    }
}