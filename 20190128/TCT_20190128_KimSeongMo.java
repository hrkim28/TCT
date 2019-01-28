import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TCT_20190128_KimSeongMo {
    public static void main(String[] args){
        TCT_20190128_KimSeongMo obj = new TCT_20190128_KimSeongMo();
        String case1 = "I think I'm lost.";
        String case2 = "I think I'm lost.I can't tell.";
        String case3 = "I think I'm lost. I can't tell what's where.";
        System.out.println(obj.getResultMap(case1).toString());
        System.out.println(obj.getResultMap(case2).toString());
        System.out.println(obj.getResultMap(case3).toString());
    }
    
    private  HashMap<Character, Integer> getResultMap( String input ){
        char start = 'a';
        char end = 'z';
        HashSet<Character> alpahSet = new HashSet<Character>();
        for( char inx = start; inx <= end; inx++ ){
            alpahSet.add(inx);
        }
        
        String lowerString = input.toLowerCase();
        int maxCount = 0;
        char[] charArr = lowerString.toCharArray();
        HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> resultMap = new HashMap<Character, Integer>();
        
        for( int inx = 0; inx < charArr.length; inx++ ){
            if( !alpahSet.contains(charArr[inx]) ) continue;
            if( !countMap.containsKey(charArr[inx]) ){
                countMap.put(charArr[inx], 1);
            }else{
                countMap.put(charArr[inx], countMap.get(charArr[inx])+1 ); 
            }
            if( countMap.get(charArr[inx]) > maxCount ) maxCount = countMap.get(charArr[inx]);
        }
        
        for( char key : countMap.keySet() ){
            if( countMap.get(key) == maxCount ) resultMap.put(key, maxCount);
        }
        
        return resultMap;
    }
}
