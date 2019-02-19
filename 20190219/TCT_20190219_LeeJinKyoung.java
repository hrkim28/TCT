import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TCT_20190219_LeeJinKyoung {
	/*
	입력: [“img12.png”, “img10.png”, “img02.png”, “img1.png”, “IMG01.GIF”, “img2.JPG”]
	출력: [“img1.png”, “IMG01.GIF”, “img02.pnsg”, “img2.JPG”, “img10.png”, “img12.png”]

	입력: [“F-5 Freedom Fighter”, “B-50 Superfortress”, “A-10 Thunderbolt II”, “F-14 Tomcat”]
	출력: [“A-10 Thunderbolt II”, “B-50 Superfortress”, “F-5 Freedom Fighter”, “F-14 Tomcat”]
	*/
	public static void main(String[] args) {
		
		ArrayList<FileList> input = new ArrayList<FileList>();
		
		input.add(new FileList("img12.png"));
		input.add(new FileList("img10.png"));
		input.add(new FileList("img02.png"));
		input.add(new FileList("img1.png"));
		input.add(new FileList("IMG01.GIF"));
		input.add(new FileList("img2.JPG"));
		
		for(int inx = 0; inx < input.size();inx++) {
			if(inx != input.size() -1) {
				System.out.print(input.get(inx).getFileName() + ",");
			} else {
				System.out.println(input.get(inx).getFileName());
			}
		}

		Collections.sort(input);
		
		for(int inx = 0; inx < input.size();inx++) {
			if(inx != input.size() -1) {
				System.out.print(input.get(inx).getFileName() + ",");
			} else {
				System.out.println(input.get(inx).getFileName());
			}
		}
		
		ArrayList<FileList> input2 = new ArrayList<FileList>();
		
		input2.add(new FileList("F-5 Freedom Fighter"));
		input2.add(new FileList("B-50 Superfortress"));
		input2.add(new FileList("A-10 Thunderbolt II"));
		input2.add(new FileList("F-14 Tomcat"));
		
		System.out.println();
		for(int inx = 0; inx < input2.size();inx++) {
			if(inx != input2.size() -1) {
				System.out.print(input2.get(inx).getFileName() + ",");
			} else {
				System.out.println(input2.get(inx).getFileName());
			}
		}

		Collections.sort(input2);
		for(int inx = 0; inx < input2.size();inx++) {
			if(inx != input2.size() -1) {
				System.out.print(input2.get(inx).getFileName() + ",");
			} else {
				System.out.println(input2.get(inx).getFileName());
			}
		}
	}
}

class FileList implements Comparable<FileList> {

	private String header;
	private String number;
	private String tail;
	private String fileName;

	public FileList(String fileName){
		this.fileName = fileName;
		setValues(this.fileName);
	}

	public void setValues(String fileName) {
		String lowerCase = fileName.toLowerCase();
		
		boolean checkType = true;
		
		this.header = "";
		this.number = "";
		this.tail = "";
		
		for(int inx = 0; inx < fileName.length();inx++) {
			if( ('a' <= lowerCase.charAt(inx) && lowerCase.charAt(inx) <= 'z') 
					|| ' ' == lowerCase.charAt(inx)
					|| '.' == lowerCase.charAt(inx)
					|| '-' == lowerCase.charAt(inx) ) {
				if(checkType) {
					this.header = this.header + lowerCase.charAt(inx);
				} else {
					this.tail = lowerCase.substring(inx, fileName.length());
					break;
				}
			} else if( '0' <= lowerCase.charAt(inx) &&  lowerCase.charAt(inx) <= '9') {
				if(checkType) {
					checkType = false;
				}
				this.number = this.number + lowerCase.charAt(inx);
			}
		}
	}
	
	public String getHeader() {
		return header;
	}



	public void setHeader(String header) {
		this.header = header;
	}



	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}



	public String getTail() {
		return tail;
	}



	public void setTail(String tail) {
		this.tail = tail;
	}



	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void print() {
		System.out.println("===========================");
		System.out.println(this.fileName);
		System.out.println(this.header);
		System.out.println(this.number);
		System.out.println(this.tail);
	}
	
	@Override
	public int compareTo(FileList arg0) {

		int result = this.header.compareTo(arg0.header);
		if(result == 0 && Integer.parseInt(this.number) > Integer.parseInt(arg0.number)) {
			result = 1;
		} else if(result == 0 && Integer.parseInt(this.number) < Integer.parseInt(arg0.number)){
		    result = -1;
		} else if(result == 0){
			result = 0;
		}

		return result;
	}
	
}

