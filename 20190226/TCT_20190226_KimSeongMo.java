import java.util.HashMap;

public class TCT_20190226_KimSeongMo {
    HashMap<String, Integer> keyNumMap;
    HashMap<String, Integer> keyIdxMap;
    
    public TCT_20190226_KimSeongMo() {
        this.keyNumMap = new HashMap<String,Integer>();
        this.keyIdxMap = new HashMap<String,Integer>();
        keyNumMap.put("a", 2);keyIdxMap.put("a", 1);        keyNumMap.put("b", 2);keyIdxMap.put("b", 2);        keyNumMap.put("c", 2);keyIdxMap.put("c", 3);
        keyNumMap.put("d", 3);keyIdxMap.put("d", 1);        keyNumMap.put("e", 3);keyIdxMap.put("e", 2);        keyNumMap.put("f", 3);keyIdxMap.put("f", 3);
        keyNumMap.put("g", 4);keyIdxMap.put("g", 1);        keyNumMap.put("h", 4);keyIdxMap.put("h", 2);        keyNumMap.put("i", 4);keyIdxMap.put("i", 3);
        keyNumMap.put("j", 5);keyIdxMap.put("j", 1);        keyNumMap.put("k", 5);keyIdxMap.put("k", 2);        keyNumMap.put("l", 5);keyIdxMap.put("l", 3);
        keyNumMap.put("m", 6);keyIdxMap.put("m", 1);        keyNumMap.put("n", 6);keyIdxMap.put("n", 2);        keyNumMap.put("o", 6);keyIdxMap.put("o", 3);
        keyNumMap.put("p", 7);keyIdxMap.put("p", 1);        keyNumMap.put("q", 7);keyIdxMap.put("q", 2);        keyNumMap.put("r", 7);keyIdxMap.put("r", 3);
        keyNumMap.put("s", 7);keyIdxMap.put("s", 4);        keyNumMap.put("t", 8 );keyIdxMap.put("t", 1);        keyNumMap.put("u", 8);keyIdxMap.put("u", 2);
        keyNumMap.put("v", 8);keyIdxMap.put("v", 3);        keyNumMap.put("w", 9);keyIdxMap.put("w", 1);        keyNumMap.put("x", 9);keyIdxMap.put("x", 2);
        keyNumMap.put("y", 9);keyIdxMap.put("y", 3);        keyNumMap.put("z", 9);keyIdxMap.put("z", 4);
    }
    
    public static void main(String[] args){
        TCT_20190226_KimSeongMo obj = new TCT_20190226_KimSeongMo();
        int[] inputArr1 = {2,3,4,5,6,7,8,9,1};
        String inputStr1 = "klor";
        int[] inputArr2 = {7,8,9,1,2,3,6,5,4};
        String inputStr2 = "djevojka";
        int[] inputArr3 = {9,8,7,6,5,4,3,2,1};
        String inputStr3 = "skakavac";
        System.out.println( obj.getInputKey( inputArr1, inputStr1 ) );
        System.out.println( obj.getInputKey( inputArr2, inputStr2 ) );
        System.out.println( obj.getInputKey( inputArr3, inputStr3 ) );
    }
    
    private String getInputKey(int[] input, String inputStr){
        String result = "";
        HashMap<String, Integer> transNumMap = this.getTransNumMap(input);
        for( int inx = 0; inx < inputStr.length(); inx++ ){
            if( result.endsWith( transNumMap.get( inputStr.charAt(inx)+"" ) + "" ) ) result += "#";
            for( int jnx = 0; jnx < this.keyIdxMap.get( inputStr.charAt(inx)+"" ); jnx++ ){
                result += transNumMap.get( inputStr.charAt(inx)+"" );
            }
        }
        return result;
    }
    
    private HashMap<String, Integer> getTransNumMap(int[] input){
        HashMap<String, Integer> newNumMap = new HashMap<String,Integer>();
        HashMap<Integer, Integer> numKeyPair = new HashMap<Integer,Integer>(); // key : originNum / value : changedNum
        for( int inx = 0; inx < input.length; inx++ ){
            numKeyPair.put(input[inx], inx+1);
        }
        for( String key : this.keyNumMap.keySet() ){
            newNumMap.put( key, numKeyPair.get( this.keyNumMap.get(key) ) );
        }
        return newNumMap;
    }

}
