import java.util.HashMap;
import java.util.Map;

public class TCT_20190214_HyeryoungKim {

	public static void main(String[] args) {
		TCT_20190214_HyeryoungKim tct = new TCT_20190214_HyeryoungKim();
		
		int n = 4;
		int[][] case1 = {{1,0,1,0}, {0,0,0,0}, {1,1,1,1}, {0,1,0,1}};
		int[][] case2 = {{1,0,1,0}, {0,0,1,0}, {1,1,1,1}, {0,1,0,1}};
		int[][] case3 = {{1,0,1,0}, {0,1,1,0}, {1,1,1,1}, {0,1,0,1}};
		
		tct.printParityResult(n, case1);
		tct.printParityResult(n, case2);
		tct.printParityResult(n, case3);
	}
	
	private void printParityResult(int n, int[][] input) {
		int[] rowSums = getRowSum(input);
		int[][] newArr = transposeArray(input);
		int[] colSums = getColSum(newArr);
		
		Map<String, Integer> rowMap = getOddRowSumCount(rowSums);
		Map<String, Integer> colMap = getOddColSumCount(colSums);
		int oddRowCount = rowMap.get("count");
		int oddColCount = colMap.get("count");
		int oddRowIndex = rowMap.get("index");
		int oddColIndex = colMap.get("index");
		if ( oddRowCount == 0 && oddColCount == 0 ) {
			System.out.println("OK");
		} else if ( oddRowCount == 1 && oddColCount == 1 ) {
			System.out.println("Change bit (" + (oddRowIndex+1) + "," + (oddColIndex+1) + ")");
		} else {
			System.out.println("Corrupt");
		}
	}
	
	private int[] getRowSum(int[][] input) {
		int[] rowSums = new int[4];
		int sum = 0;
		
		for ( int x = 0 ; x < input.length ; x++ ) {
			sum = 0;
			for ( int y = 0 ; y < input.length ; y++ ) {
				sum += input[x][y];
			}
			
			rowSums[x] = sum;
		}
		
		return rowSums;
	}
	
	private int[] getColSum(int[][] input) {
		int[] colSums = new int[4];
		int sum = 0;
		
		for ( int x = 0 ; x < input.length ; x++ ) {
			sum = 0;
			for ( int y = 0 ; y < input.length ; y++ ) {
				sum += input[x][y];
			}
			
			colSums[x] = sum;
		}
		
		return colSums;
	}
	
	private int[][] transposeArray(int[][] input) {
		int x = input.length;
		int y = input[0].length;
		
		int[][] newArr = new int[y][x];
		for ( int a = 0 ; a < input.length ; a++ ) {
			for ( int b = 0 ; b < input[a].length ; b++ ) {
				newArr[b][a] = input[a][b]; 
			}
		}
		return newArr;
	}
	
	private Map<String, Integer> getOddRowSumCount(int[] rowSums) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		int oddRowCount = 0;
		int oddRowIndex = 0;
		for ( int idx = 0 ; idx < rowSums.length ; idx++ ) {
			if ( rowSums[idx]%2 == 1 ) {
				oddRowCount++;
				oddRowIndex = idx;
			}
		}
		
		map.put("count", oddRowCount);
		map.put("index", oddRowIndex);
		return map;
	}
	
	private Map<String, Integer> getOddColSumCount(int[] colSums) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		int oddColCount = 0;
		int oddColIndex = 0;
		for ( int idx = 0 ; idx < colSums.length ; idx++ ) {
			if ( colSums[idx]%2 == 1 ) {
				oddColCount++;
				oddColIndex = idx;
			}
		}
		
		map.put("count", oddColCount);
		map.put("index", oddColIndex);
		return map;
	}
}
