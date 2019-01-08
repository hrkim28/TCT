import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class AhryunPark_20170216 {

	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws  
	 */
	
	static String[] inputList = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		/**
		주희는 심심해서 다음과 같이 수를 쓰기 시작 했다.
		[그림은 파일 참조]
		
		이렇게 수를 쓰는 경우 어떤 수가 몇 층에 있는지가 궁금해 졌다.
		참고로 100 은 7 층에 존재 한다.
		입력
		32 비트 정수 범위내의 값이 입력으로 주어진다.
		출력
		
		층 수를 출력한다.
		입출력 예
		
		입력
		100
		
		출력
		7
		*/
		
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		System.out.println("입력 :" );
		String intpuNum = br.readLine();
		
		int total = 0;
		int floor = 0;
		while( total < Integer.parseInt(intpuNum)){
			
			total +=Math.pow(2, floor);
			floor++;
		}
		System.out.println("출력" + floor + "층");
		
	}
	
	
	
	
}

