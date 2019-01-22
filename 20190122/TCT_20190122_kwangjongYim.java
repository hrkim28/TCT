  public static void main(String[] args) {
		
		try {
			printResult(getResult(6, new int[] {10,20,15,25,10,20}));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int getResult(int cnt, int stairsScoreList[]) throws Exception {
		
		int result[] = new int[cnt];
		result[0] = stairsScoreList[0];
		result[1] = stairsScoreList[0] + stairsScoreList[1];
		result[2] = max(stairsScoreList[0],stairsScoreList[1]) + stairsScoreList[2];

		for(int i=3; i < cnt; i++) {
			result[i] = max(result[i-3] + stairsScoreList[i-1], result[i-2]) + stairsScoreList[i];
		}

		return result[cnt - 1];
	}
	
	public static int max(int a, int b)
	{
	    return a > b ? a : b;
	}
	 
	
	public static void printResult(int result) {
		System.out.println("total: " + result);
	}
	
