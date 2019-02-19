import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TCT_20190219_HyeryoungKim {
	
	/*
	 * 1. 영문자 - 대소문자 구분 없음
	 * 2. 숫자 - 단순 숫자로 인식
	 * 3. 입력된 순서대로 출력
	 */
	public static void main(String[] args) {
		String[] files1 = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
		printReorderFiles(files1);
		
		String[] files2 = {"F-5 Freedom Fighter" , "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
		printReorderFiles(files2);
	}
	
	private static void printReorderFiles(String[] files) {
		List<TFile> fileList = new ArrayList<TFile>();
		for ( String fileName : files ) {
			TFile newFile = new TFile();
			String[] fileArr = getHeadNumberTail(fileName);
			newFile.setOriginName(fileArr[0]);
			newFile.setHeader(fileArr[1]);
			newFile.setNumber(Integer.valueOf(fileArr[2]));
			newFile.setTail(fileArr[3]);
			
			fileList.add(newFile);
		}
		
		fileList.stream()
		.sorted(Comparator.comparing(TFile::getHeader).thenComparing(TFile::getNumber))
		.forEach(file -> System.out.println(file.getOriginName()));
	}
	
	private static String[] getHeadNumberTail(String fileName) {
		String[] hnt = new String[4];
		hnt[0] = fileName;
		
		String tmpFileName = fileName.toLowerCase();
		int numStartIdx = 0;
		int numEndIdx = 0;
		String number = "";
		for ( int idx = 0 ; idx < tmpFileName.length() ; idx++ ) {
			if ( tmpFileName.charAt(idx) >= 48 && tmpFileName.charAt(idx) <= 57 ) {
				if ( numStartIdx == 0 || numStartIdx > idx ) {
					hnt[1] = fileName.substring(0, idx).toLowerCase().trim();
					numStartIdx = idx;
				}
				number += fileName.charAt(idx);
				numEndIdx = idx;
				
				if ( tmpFileName.charAt(idx+1) >= 'a' && tmpFileName.charAt(idx+1) <= 'z' ) {
					break;
				}
			}
		}
		
		hnt[2] = number;
		hnt[3] = fileName.substring(numEndIdx + 1).trim();
		
		return hnt;
	}
}

class TFile {
	private String originName;
	private String header;
	private Integer number;
	private String tail;
	
	public String getOriginName() {
		return originName;
	}
	public void setOriginName(String originName) {
		this.originName = originName;
	}
	
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getTail() {
		return tail;
	}
	public void setTail(String tail) {
		this.tail = tail;
	}
}
