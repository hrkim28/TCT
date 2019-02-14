import java.util.Scanner;
public class   TCT_20190214_LeeKangKil{
	public static void main(String args[])  {
		TCT_20190214_LeeKangKil hell = new TCT_20190214_LeeKangKil();
		
		Scanner sc = new  Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		String [][]array = new String[n][n];
		for(int i=0; i<n;i++) {
			array[i] = sc.nextLine().split(" ");
		}
		
		hell.checkParityBit(array);
	}
	
	public void checkParityBit(String array[][]){
		int wrongX = -1, wrongY = -1;
		int wrongXCnt = 0, wrongYCnt = 0;
		int n = array[0].length;
		
		for(int y=0; y<n; y++){
			int xSum = 0, ySum =0;
			for(int x=0; x<n;x++){
				if( array[y][x].equals("1") ) ySum++;
				if( array[x][y].equals("1") ) xSum++;
			}
			
			if(xSum%2!=0){
				wrongXCnt++;
				wrongX = y;
			}
			
			if(ySum%2!=0){
				wrongYCnt++;
				wrongY = y;
			}
		}
		
		if(wrongXCnt == 0 &&  wrongYCnt == 0)  System.out.println("OK");
		else if(wrongXCnt == 1 && wrongYCnt ==1 )  System.out.println("Change bit (" + (wrongY+1) + ","+(wrongX+1)+")");
		else System.out.println("Corrupt");
	}
}
