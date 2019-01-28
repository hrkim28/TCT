package tct;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
public class TCT_20190128_LeeJoonWoo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("문장을 입력하세요.");
        
        String input = sc.next();
        
        input = input.toUpperCase();
        
        StringTokenizer tokenInput = new StringTokenizer(input);
        String token ="";
        //선택된 각 숫자가 몇번 나왔는지 저장하는  Map
        HashMap<String, Integer> countedMapList = new HashMap<String, Integer>();
        
        while(tokenInput.hasMoreTokens()){
        	token = tokenInput.nextToken();
        	if(countedMapList.get(token) != null){
            	countedMapList.put(token, countedMapList.get(token)+1);
        	}else{
        		countedMapList.put(token, 1);
        	}
        }
        
        Set<String> keySet = countedMapList.keySet();
        Object keySetArray[] = keySet.toArray();
        int maxNum = 0;
        char alphabet;
        String maxAlphabet ="";
        //짝수번 나온 값을  Map에서 삭제
        for(int i=0; i< keySetArray.length; i++ ){
           alphabet = String.valueOf(keySetArray[i]).charAt(0);
           if (alphabet >='A' && alphabet <= 'Z'){
               if(countedMapList.get(keySetArray[i]) > maxNum){
                    maxNum = countedMapList.get(keySetArray[i]);
                    maxAlphabet = String.valueOf(keySetArray[i]);
               }
           }
        }
    
        System.out.println("===================================="); 
        System.out.println("가장많이 쓰인 알파벳 :"+maxAlphabet+ " "+maxNum+"회");
        System.out.println("====================================");
    }
    
}
