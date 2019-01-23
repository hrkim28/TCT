import java.util.HashMap;

public class TCT_20190123_KimSeongMo {
    public static void main(String[] args){
        TCT_20190123_KimSeongMo obj = new TCT_20190123_KimSeongMo();
        int[] case1 = {2,5,3,3};
        System.out.println(obj.getXORResult(case1));
    }
    
    private Integer getXORResult( int[] input ){
        Integer result = null;
        HashMap<Integer, Integer> numCountMap = new HashMap<Integer, Integer>();
        
        for( int inx = 0; inx < input.length; inx++  ){
            if( !numCountMap.containsKey(input[inx]) ){
                numCountMap.put(input[inx], 0);
            }
            numCountMap.put(input[inx], numCountMap.get(input[inx]) + 1);
        }
        
        for( Integer key : numCountMap.keySet() ){
            if(numCountMap.get(key)%2 == 0) continue;
            if(result == null){
                result = key;
            }else{
                result = result^key;
            }
        }
        
        return result;
    }
}
