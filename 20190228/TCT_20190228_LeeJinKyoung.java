import java.util.LinkedList;
import java.util.Queue;

public class TCT_20190228_LeeJinKyoung {
	public static void main(String[] args) {
		//int memory = 3;
		//String[] meeting = {"전지현", "손예진", "송혜교", "수지", "설현", "전지현", "손예진", "송혜교", "수진", "설현"};
		//String[] meeting = {"전지현", "손예진", "송혜교", "전지현", "손예진", "송혜교", "전지현", "손예진", "송혜교"};
		//int memory = 2;
		//String[] meeting = {"전지현", "손예진", "송혜교", "수지", "설현", "김하늘", "송혜교", "이나영", "한가인", "전지현", "수지", "이나영"};
		int memory = 5;
		String[] meeting = {"전지현", "손예진", "송혜교", "수지", "설현", "김하늘", "송혜교", "이나영", "한가인", "전지현", "수지", "이나영"};
		
		Queue memoryQ = new LinkedList<String>();		
		int riskValue = 0;
		
		for(int inx = 0 ; inx < meeting.length ; inx++) {
			if(memoryQ.contains(meeting[inx])) {
				riskValue += 1;
			} else {
				riskValue += 5;
			}
			
			if(memoryQ.size() < memory) {
				memoryQ.offer(meeting[inx]);
			} else {
				memoryQ.poll();
				memoryQ.offer(meeting[inx]);
			}
		}
		
		System.out.println(riskValue);
		
	}	
}
