import java.util.Scanner;

public class   TCT_20190130_LEEKANGKIL{
	public static void main(String args[])  {

		int [][]table_A ={{500,1},{300,2},{200,3},{50,4},{30,5},{10,6}};
		int [][]table_B ={{512,1},{256,2},{128,4},{64,8},{32,16}};
		
		TCT_20190130_LEEKANGKIL lkk = new TCT_20190130_LEEKANGKIL();
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		int num = sc.nextInt();
		String[] inputStr = new String[num];
		
		for(int i=0; i<num;i++){
			inputStr[i] = sc2.nextLine();
		}
		
		for(int i=0; i<num;i++){
			String []rank = inputStr[i].split(" ");
			System.out.println( (lkk.getReward(table_A,Integer.valueOf(rank[0])) + lkk.getReward(table_B,Integer.valueOf(rank[1])))*10000 );
		}
		
	}
	
	public int getReward(int[][] array, int rank){

		if (rank ==0) return 0;
		int rankPos=0;
		
		for(int i=0; i<array.length;i++){
			rankPos = rankPos + array[i][1];
			if(rank <= rankPos) return array[i][0]; 
		}
		return 0;
	}

}