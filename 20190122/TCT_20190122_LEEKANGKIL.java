
import java.util.Scanner;

public class   TCT_20190122_LEEKANGKIL{

	public static void main(String args[])  {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int []score = new int[n];
		boolean []visit = new boolean[n];
		int scoreSum = 0;
		int curPos = 0;
		
		for(int i=0;i<n;i++){
			score[i] = sc.nextInt();
			visit[i]=false;
		}

		scoreSum =score[n-1];
		curPos = n-1;
		visit[curPos]=true;

		while(curPos>1){
			int max =0;
			
			if(curPos<n-1 && visit[curPos] &&visit[curPos+1]) {
				scoreSum +=score[curPos-2];
				curPos = curPos -2;
				visit[curPos]=true;
			} else {
				max = Math.max(score[curPos-2], score[curPos-1]);
				scoreSum +=max;
				
			    if(max == score[curPos-1])  curPos--; 
			    else curPos = curPos - 2;
			    
			    visit[curPos] = true;
			}
		}
		
		if(curPos == 1  && !visit[curPos+1]) scoreSum += score[0];
		
		System.out.println(scoreSum);
	}

}