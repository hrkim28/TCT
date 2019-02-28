package teamExcercise;

import java.util.LinkedList;

public class TCT_20190228_NaHyejeong {

	public static void main(String[] args) {
		int memorySize = 3;
		String[] blindDates = { "전지현", "손예진", "송혜교", "전지현", "손예진", "송혜교", "전지현", "손예진", "송혜교" };
		
		printMemoryRisk(memorySize, blindDates);
	}

	private static void printMemoryRisk(int memorySize, String[] blindDates) {
	
		LinkedList<String> memoryList = new LinkedList<>();
		int memoryRisk = 0;
		int riskType1  = 1;
		int riskType2  = 5;
		
		for (int i = 0; i < blindDates.length; i++) {
			
			if( i < memorySize ) {
				memoryList.add(blindDates[i]);
				memoryRisk += riskType1;
			}else {
				if(memoryList.contains(blindDates[i])) {
					memoryRisk += riskType1;
				}else {
					memoryRisk += riskType2;
				}
				memoryList.add(blindDates[i]);
				memoryList.removeFirst();
			}
		}
		// 위험도 출력
		System.out.println(memoryRisk);
		
	}

	
}
