import java.util.Arrays;
import java.util.Comparator;

class FileName {
	int idx;
	String fullName;
	String head;
	int number;
	String tail;

	public FileName(){
		this.fullName=this.head = this.tail ="";
		this.idx = this.number = 0;
	}
	
	public  FileName(String FileName, int idx) {
		this();
		this.fullName = FileName;
		FileName = FileName.toUpperCase();
		String numArea ="";
		boolean headFlag =true;
		
		for(int i=0; i<FileName.length();i++){
			char str = FileName.charAt(i);
			if(str >= 48 && str <= 57){
				numArea +=str;
				headFlag = false;
			} 
			else if(headFlag)	this.head += str;
			else 	this.tail += str;
		}
		this.number = Integer.parseInt(numArea);
	}
	
	public static void sortFileNames(FileName[] fileNames){
		Arrays.sort(fileNames, new Comparator<FileName>(){
			@Override
			public int compare(FileName a, FileName b) {
				
				if(a.head.compareTo(b.head) !=0) return a.head.compareTo(b.head);
				else if(a.number > b.number) return 1;
				else if(a.number <b.number) return -1;
				else if(a.idx > b.idx) return 1;
				else if(a.idx < b.idx) return -1;
				else return 0;
			}
		});
	}
	public static void printFileNames(FileName[] fileNames){
		for(FileName fn : fileNames) System.out.print(fn.fullName + " | " );
		System.out.println();
	}
}
public class   TCT_20190219_LeeKangKil{
	
	public static void main(String args[])  {
		TCT_20190219_LeeKangKil kk = new TCT_20190219_LeeKangKil();
		String[] inputStr1 = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
		String[] inputStr2 = {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
		
		kk.excuteSort(inputStr1);
		kk.excuteSort(inputStr2);
	}
	
	public void excuteSort(String[] inputStr){
		FileName[] fileNames = new FileName[inputStr.length];
		for(int i=0; i<inputStr.length;i++) fileNames[i] = new FileName(inputStr[i],i);
		FileName.sortFileNames(fileNames);
		FileName.printFileNames(fileNames);
	}
	
}
