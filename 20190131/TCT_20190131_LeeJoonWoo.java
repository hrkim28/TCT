package tct;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
public class TCT_20190131_LeeJoonWoo {

    /**
     * @param args
     */
    public static void main(String[] args) {
    	
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("전체 수 갯수를 입력하세요.");
        System.out.println("예시:4");
        
        String input = sc.next();
        int  numCount = Integer.parseInt(input);
        
        System.out.println("영 단어를 입력한 갯수만큼 입력 하세요.");
        ArrayList<String> inputValue = new ArrayList();
        //중복항 제거하면서 입력
        for(int i=0; i<numCount; i++){
        	input = sc.next();
        	if (!inputValue.contains(input)) {
        		inputValue.add(input);
            }
        }
        
        //알파벳 순서대로 소트
        Collections.sort(inputValue, new Comparator<String>() {
            @Override
            public int compare(String item, String t1) {
                String s1 = item;
                String s2 = t1;
                return s1.compareToIgnoreCase(s2);
            }
        });
        
        //버블소트를 사용해서 문자갯수가 작은 것들을 앞으로 가져온다
        int cnt =0;
        String temp ="";
        for(int i=inputValue.size(); i>0; i--) {
            //
            for (int j=0; j<i-1; j++) {
                cnt++;
                if(inputValue.get(j).length() > inputValue.get(j+1).length()) {
                    temp = inputValue.get(j); 
                    inputValue.set(j,inputValue.get(j+1));
                    inputValue.set(j+1,temp);
                }
            }
        }

        //결과 출력
        for(int i=0; i<inputValue.size(); i++){
        	System.out.println(inputValue.get(i));
        }
    }
}
