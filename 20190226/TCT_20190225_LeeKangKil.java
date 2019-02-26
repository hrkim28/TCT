import java.util.ArrayList;

public class   TCT_20190225_LeeKangKil{
	final static char[][] padList =  {{'\n'}, {'a','b','c'}, {'d','e','f',}, {'g','h','i'}, {'j','k','l'},{'m','n','o'},{'p','q','r','s'}, {'t','u','v'},{'w','x','y','z'}};
	
	public static void main(String args[])  {
		TCT_20190225_LeeKangKil lkk = new TCT_20190225_LeeKangKil();
		lkk.excuteTCT(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 1}, "klor");
		lkk.excuteTCT(new int[]{7, 8, 9, 1, 2, 3, 6, 5, 4}, "djevojka");
		lkk.excuteTCT(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}, "skakavac");
	}
	
	void excuteTCT(int[] input, String inputStr){
		ArrayList<Integer> inputList = new ArrayList<Integer>();
		for(int i=0; i<input.length;i++) inputList.add(i,input[i]);

		int prevNum= -1 ;
		for(int idx=0; idx<inputStr.length(); idx++){
			char chr = inputStr.charAt(idx);

			for(int i=0; i<padList.length;i++){
				for(int j=0; j<padList[i].length;j++){
					if(chr == padList[i][j]) {
						int padNum = inputList.indexOf( i+1 ) +1;
						
						if(prevNum == padNum ) System.out.print("#");
						for (int k=0; k<j+1; k++) System.out.print(padNum);
						
						prevNum = padNum ;
						break;
					}
				}
			}
		}
		System.out.println();
	}
}
	


