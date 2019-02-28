import java.util.Arrays;

public class TCT_20190228_HyeryoungKim {

    public static void main(String[] args) {
        int memory1 = 3;
        String[] girls1 = {"전지현", "손예진", "송혜교", "수지", "설현", "전지현", "손예진", "송혜교", "수진", "설현"};
        printRiskByMemory(memory1, girls1);

        int memory2 = 3;
        String[] girls2 = {"전지현", "손예진", "송혜교", "전지현", "손예진", "송혜교", "전지현", "손예진", "송혜교"};
        printRiskByMemory(memory2, girls2);

        int memory3 = 2;
        String[] girls3 = {"전지현", "손예진", "송혜교", "수지", "설현", "김하늘", "송혜교", "이나영", "한가인", "전지현", "수지", "이나영"};
        printRiskByMemory(memory3, girls3);

        int memory4 = 5;
        String[] girls4 = {"전지현", "손예진", "송혜교", "수지", "설현", "김하늘", "송혜교", "이나영", "한가인", "전지현", "수지", "이나영"};
        printRiskByMemory(memory4, girls4);
    }

    private static void printRiskByMemory(int memory, String[] girls) {
        int risk = 0;
        if ( memory <= 10 && memory >= 0 ) {
            String[] memorized = new String[memory];
            Arrays.fill(memorized, "");
            memorized[0] = girls[0];
            risk += 5;
            
            for ( int idx = 1 ; idx < girls.length ; idx++ ) {
                int flag = Arrays.binarySearch(memorized, girls[idx]);
                if ( flag > 0 ) {
                	risk += 1;
                } else {
                	risk += 5;
                }
                
                memorized[idx%memory] = girls[idx];
            }
            System.out.println(risk);
        } else {
            System.out.println("기억력은 0이상 10이하의 정수만 가능합니다.");
        }
    }
}