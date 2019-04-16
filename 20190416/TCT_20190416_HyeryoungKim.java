import java.util.Map;
import java.util.TreeMap;

public class TCT_20190416_HyeryoungKim {

    public static void main(String[] args) {
        TCT_20190416_HyeryoungKim tct = new TCT_20190416_HyeryoungKim();
        String[] strs = {"aaaaabbbccccccddddddddd", "blahblah"};
        for ( String str : strs ) {
            System.out.println(tct.getCompressionString(str));
        }
    }

    private String getCompressionString(String originStr) {
        String compressedStr = "";
        Map<String, Integer> map = new TreeMap<String, Integer>();
        for ( int idx = 0 ; idx < originStr.length() ; idx++ ) {
            String c = originStr.substring(idx, idx+1);
            if ( map.containsKey(c) ) {
                map.put(c, (int)map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for ( Map.Entry<String, Integer> iterator : map.entrySet() ) {
            compressedStr += iterator.getKey() + iterator.getValue();
        }
        return compressedStr;
    }
}