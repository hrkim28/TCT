import java.util.HashSet;
import java.util.Set;

public class TCT_20190305_LeeJinKyoung {
	public static void main(String[] args) {

		int input = 17;
		int result = input -1;

		Set<Integer> resultSet = new HashSet<Integer>();
		
		resultSet.add(result);
		
		while(isPerfectSquare(result)) {
			result = (int) Math.sqrt(result);

			resultSet.add(result);
		}
		
		System.out.println(resultSet);
	}

	public final static boolean isPerfectSquare(long n)
	{
	  if (n < 0)
	    return false;

	  long tst = (long)(Math.sqrt(n) + 0.5);
	  return tst*tst == n;
	}
}