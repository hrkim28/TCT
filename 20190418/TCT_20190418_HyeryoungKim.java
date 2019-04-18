import java.util.HashMap;
import java.util.Map;

public class TCT_20190418_HyeryoungKim {

    public static void main(String[] args) {
        TCT_20190418_HyeryoungKim tct = new TCT_20190418_HyeryoungKim();
        int[][] positions = { {0,0}, {0,1}, {1,1}, {3,-3}, {2,2} };
        Map<String, Integer> result = tct.getQuarterPosition(positions);
        for ( Map.Entry<String, Integer> iterator : result.entrySet() ) {
            System.out.println(iterator.getKey() + " : " + iterator.getValue());
        }
    }

    private Map<String, Integer> getQuarterPosition(int[][] positions) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Q1", 0);
        map.put("Q2", 0);
        map.put("Q3", 0);
        map.put("Q4", 0);
        map.put("AXIS", 0);
        
        for ( int idx = 0 ; idx < positions.length ; idx++ ) {
            if ( positions[idx][0] > 0 && positions[idx][1] > 0 ) {
                map.put("Q1", map.get("Q1") + 1);
            } else if ( positions[idx][0] < 0 && positions[idx][1] > 0 ) {
                map.put("Q2", map.get("Q2") + 1);
            } else if ( positions[idx][0] < 0 && positions[idx][1] < 0 ) {
                map.put("Q3", map.get("Q3") + 1);
            } else if ( positions[idx][0] > 0 && positions[idx][1] < 0 ) {
                map.put("Q4", map.get("Q4") + 1);
            } else {
                map.put("AXIS", map.get("AXIS") + 1);
            }
        }
        return map;
    }
}