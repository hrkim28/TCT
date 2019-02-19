package teamExcercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TCT_20190219_NaHyejeong {
	
	public static void main(String[] args) {

		// 입력
		String [] inputFiles = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"}; 
		// sort
		ArrayList<String> sortFileArray  = sortFileArray(inputFiles);
		// 출력
		System.out.println(sortFileArray.toString());
		
	}

	@SuppressWarnings("unchecked")
	private static ArrayList<String> sortFileArray(String[] inputFiles) {

		ArrayList<String> sortFileArray = new ArrayList<>();
		for (int i = 0; i < inputFiles.length; i++) {
			sortFileArray.add(inputFiles[i]);
		}
		
		Collections.sort(sortFileArray, new Comparator() {
			
			@Override
			public int compare( Object o1, Object  o2) {
				
				String s1 = String.valueOf(o1);
				String s2 = String.valueOf(o2);
				
				String[] seperatedFile1 =  seperateFileName(s1);
				String[] seperatedFile2 =  seperateFileName(s2);
				
				if( seperatedFile1[0].toLowerCase().compareTo(seperatedFile2[0].toLowerCase())  == 0 ) {
					int n1 =  Integer.parseInt(seperatedFile1[1]);
					int n2 =  Integer.parseInt(seperatedFile2[1]);
					if( n1 > n2 ) {
						return 1;
					}else {
						return -1;
					}
				}else{
					return seperatedFile1[0].toLowerCase().compareTo(seperatedFile2[0].toLowerCase());
				}
				
			}

			private String[] seperateFileName(String s1) {
				
				String [] seperatedFm =  new String[2];
				for (int i = 0; i < s1.length(); i++) {
					//숫자 시작지점
					if( s1.charAt(i) >= '0' &&  s1.charAt(i) <= '9') {
						seperatedFm[0] = s1.substring(0,i); // head 
						seperatedFm[1] = s1.substring(i); 
						break;
					}
				}
				
				String temp = seperatedFm[1];
				for (int j = 0; j < temp.length(); j++) {
					//숫자가 끝나는 지점 
					if( !(temp.charAt(j) >= '0' &&  temp.charAt(j) <= '9') ) {
						seperatedFm[1] = temp.substring(0,j); //number
						break;
					}
				}
				return seperatedFm;
			}
		});
		
		return sortFileArray;
		
	}

}
