public static void main(String[] args) {
		
		try {
			printResult(getResult(4, new int[] {2,5,3,3}));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int getResult(int cnt, int[] binary) throws Exception {
		
		String sBinary = "";
		String sTemp = "";
		int result = 0;
		
		List<Integer> odds = new ArrayList<Integer>();
		/*
	       잘못만들었네요. 추후에 수정하겠습니다.
	       전제: 1-9 사이 숫자만 아래와 같이 처리 가능...
		*/
		for(int i : binary) { // 하나의 문자열로 만듬 
			sBinary += i;	
		}
		for(int i : binary) {
			sTemp = sBinary.replaceAll(Integer.toString(i), "");
			if((sBinary.length() - sTemp.length()) % 2 == 1) { // 홀수라면..
				odds.add(i);
			}
		}
		for(int i = 0; i < odds.size(); i++) {
			result ^= odds.get(i);	
		}
				
		return result;
	}

	
	public static void printResult(int result) {
		System.out.println(result);
	}
