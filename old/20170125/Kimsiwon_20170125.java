/*
[2017.01.25 오늘의 문제]
문자열 중앙값 구하기
입력한 문자열 리스트를 오름차순으로 정렬했을 때 중앙에 해당하는 문자열을 출력하시오.
(단, 문자열 리스트의 갯수가 짝수일 경우, 중앙에 해당하는 두 문자열 중 앞에 있는 문자열을 출력한다.)
출력예시
input : test, war, holiday, window, project
median : test
input : apple, peach, fly, money, room, cow, test, air, dog, spider
median : fly
 */
public class Kimsiwon_20170125 {

	public static void main( String[] args ) {
		
		//String input[] = {"test","war","holiday","window","project"};
		String input[] = {"apple", "peach", "fly", "money", "room", "cow", "test", "air", "dog", "spider"};		
		
		test(input);		
    }
	
	public  static void test(String input[]){
		
		String strResult[] = input;
		String tmpStr;
		
		for (int i = 0; i < strResult.length; i++){
			for (int j =i; j < strResult.length; j++){
				if (strResult[i].compareTo(strResult[j]) > 0 ){
					tmpStr = strResult[i];
					strResult[i] = strResult[j];
					strResult[j] = tmpStr;					
				}				
			}			
		}
		
		System.out.println("median: " + strResult[Math.round((strResult.length-1)/2)]);
	}
	

}
