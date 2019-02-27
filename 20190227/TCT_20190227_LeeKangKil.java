import java.util.ArrayList;

public class   TCT_20190227_LeeKangKil{

	public static void main(String args[])  {
		System.out.println(getResultList(2,9));
		System.out.println(getResultList(2,1));
		System.out.println(getResultList(3,13));
	}
	
	public static ArrayList<Integer> getResultList(int N, int S){
		ArrayList<Integer> result = new ArrayList<Integer>();
		if ( N > S ) { result.add(-1); return result; }
		
		int num = S/N;
		int lastNum = num + S%N;
		
		for (int i=0; i<N-1;i++) result.add(num);
		
		result.add(lastNum);
		return result;
	}
}