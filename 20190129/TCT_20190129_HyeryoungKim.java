import java.util.ArrayList;
import java.util.List;

public class TCT_20190129_HyeryoungKim {

	public static void main(String[] args) {
		String case1 = "5+6*3-6/2+5";
		getExpression(case1);
		
		String case2 = "9+5-4+8";
		getExpression(case2);
		
		String case3 = "128- 34/17 + 2 * 19 ";
		getExpression(case3);
	}
	
	private static void getExpression(String expression) {
		System.out.println("[입력] " + expression);
		
		List<String> list = new ArrayList<String>();
		
		int kihoCnt = 0;
		String number = "";
		for ( int idx = 0 ; idx < expression.length() ; idx++ ) {
			char ch = expression.charAt(idx);
			if ( ch == '+' || ch == '-' || ch == '*' || ch == '/' ) {
				list.add(number.trim());
				list.add(String.valueOf(ch).trim());
				kihoCnt++;
				number = "";
				continue;
			}
			number += ch;
		}
		list.add(number.trim());
		
		System.out.println("[출력]");
		getExpressionSub(expression, list, kihoCnt+1);
	}
	
	/**
	 * @param expression
	 * @param list
	 * @param numCnt
	 */
	private static void getExpressionSub(String expression, List<String> list, int numCnt) {
		String result = "";
		List<String> newList = null;
		if ( numCnt == 1 ) {
			System.out.println(expression);
		} else {
			String prevNum = "";
			String nextNum = "";
			int sum = 0;
			if ( list.contains("*") || list.contains("/") ) {
				newList = new ArrayList<String>();
				int newIdx = 0;
				for ( int idx = 0 ; idx < list.size() ; idx++ ) {
					if ( newIdx == 0 && ("*".equals(list.get(idx)) || "/".equals(list.get(idx))) ) {
						prevNum = list.get(idx-1);
						nextNum = list.get(idx+1);
						sum = calculator(Integer.valueOf(prevNum), Integer.valueOf(nextNum), list.get(idx));
						
						newList.remove(idx-1);
						newList.add(String.valueOf(sum));
						newIdx = idx;
						idx++;
					} else if ( newIdx + 1 != idx ) {
						newList.add(list.get(idx));
					} else if ( newIdx == 0 ) {
						newList.add(list.get(idx));
					}
				}
			} else {
				newList = new ArrayList<String>();
				for ( int idx = 1 ; idx < list.size() ; idx++ ) {
					if ( idx == 1 ) {
						prevNum = list.get(idx-1);
						nextNum = list.get(idx+1);
						sum = calculator(Integer.valueOf(prevNum), Integer.valueOf(nextNum), list.get(idx));
						
						newList.add(String.valueOf(sum));
						idx++;
					} else {
						newList.add(list.get(idx));
					}
				}
			}
			
			for ( String ch : newList ) {
				result += ch;
			}
			
			if ( numCnt > 2 ) System.out.println(result);
			getExpressionSub(result, newList, numCnt-1);
		}
		
	}
	
	private static int calculator(int preNum, int nextNum, String operator) {
		if ( "-".equals(operator) ) {
			return preNum-nextNum;
		} else if ( "+".equals(operator) ) {
			return preNum+nextNum;
		} else if ( "*".equals(operator) ) {
			return preNum*nextNum;
		} else if ( "/".equals(operator) ) {
			return preNum/nextNum;
		} else {
			return 0;
		}
	}
}
