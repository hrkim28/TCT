package tct;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
public class TCT_20190123_LeeJoonWoo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("전체 수 갯수를 입력하세요.");
        System.out.println("예시:4");
        
        int input = sc.nextInt();
        int  numCount = input;
        
        System.out.println("숫자를 입력하세요.");
        int inputValue[] = new int[numCount];
        for(int i=0; i<numCount; i++){
        	input = sc.nextInt();
        	inputValue[i] = input;
        }
        
        
        //선택된 각 숫자가 몇번 나왔는지 저장하는  Map
        HashMap<Integer, Integer> countedMapList = new HashMap<Integer, Integer>();
        
        
        //특정 숫자가 몇번씩 나왔는지  Map에 담음
        for(int i=0; i< numCount; i++){
            if(countedMapList.get(inputValue[i]) != null){
            	countedMapList.put(inputValue[i], countedMapList.get(inputValue[i])+1);
        	}else{
        		countedMapList.put(inputValue[i], 1);
        	}
        }
        
        Set<Integer> keySet = countedMapList.keySet();
        Object keySetArray[] = keySet.toArray();
        //짝수번 나온 값을  Map에서 삭제
        for(int i=0; i< keySetArray.length; i++ ){
           if(countedMapList.get(keySetArray[i])%2==0){
        	   countedMapList.remove(keySetArray[i]);
           }
        }
        
        keySet = countedMapList.keySet();
        Object oddKeySetArray[] = keySet.toArray();
        
        int result=0;
        //홀수번 나온 값을 XOR 연산함
        for(int i=0; i< oddKeySetArray.length; i++ ){
            
            result = result^(Integer)oddKeySetArray[i];
         }
        
    
        System.out.println("===================================="); 
        System.out.println("result:"+result);
        System.out.println("====================================");

    }

}
