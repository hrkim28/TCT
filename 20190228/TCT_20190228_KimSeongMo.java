import java.util.LinkedList;
import java.util.Queue;

public class TCT_20190228_KimSeongMo {
        public static void main(String[] args){
            TCT_20190228_KimSeongMo obj = new TCT_20190228_KimSeongMo();
            
            int size1 = 3;
            String[] input1 = {"전지현", "손예진", "송혜교", "수지", "설현", "전지현", "손예진", "송혜교", "수진", "설현"};
            int size2 = 3;
            String[] input2 = {"전지현", "손예진", "송혜교", "전지현", "손예진", "송혜교", "전지현", "손예진", "송혜교"};
            int size3 = 2;
            String[] input3 = {"전지현", "손예진", "송혜교", "수지", "설현", "김하늘", "송혜교", "이나영", "한가인", "전지현", "수지", "이나영"};
            int size4 = 5;
            String[] input4 = {"전지현", "손예진", "송혜교", "수지", "설현", "김하늘", "송혜교", "이나영", "한가인", "전지현", "수지", "이나영"};
            
            System.out.println( obj.getRiskScore( size1, input1 ) );
            System.out.println( obj.getRiskScore( size2, input2 ) );
            System.out.println( obj.getRiskScore( size3, input3 ) );
            System.out.println( obj.getRiskScore( size4, input4 ) );

        }
        
        private int getRiskScore(int memorySize, String[] nameArr){
            int score = 0;
            Queue<String> memory = new LinkedList<String>();
            for( int inx = 0; inx < nameArr.length; inx++ ){
                if( memory.contains(nameArr[inx]) ) score++;
                else score += 5;
                if( memory.size() >= memorySize ) memory.poll();
                memory.offer(nameArr[inx]);
            }
            return score;
        }
}
