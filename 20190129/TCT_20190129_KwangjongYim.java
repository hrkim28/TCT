/*
	 * 시간 관계상 다 풀지 못했습니다. 빠른 시일안에 다 작성하도록 하겠습니다.
	 */
public static void main(String[] args) {
		
		try {
			getResult("5+6*3-6/2+5");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String getResult(String inputTxt) throws Exception {
		String[] textSplit = inputTxt.split("\\+|\\*|-|\\/"); // 연산 기호를 제거한 숫자 배열
		String[] calSymbols = inputTxt.replaceAll("[0-9]", "").split(""); // 숫자를 제외한 연산자 배열
		
		int fNum = 0;
		int sNum = 0;

		
		for(int i = 0; i < calSymbols.length; i++) {
			fNum = Integer.parseInt(textSplit[i+1]);
			sNum = Integer.parseInt(textSplit[i+2]);
			
			if(calSymbols[i].equals("+") || calSymbols[i].equals("-")) {
				
				
				
				
				if(calSymbols[i + 1].equals("*")) {
					
					inputTxt = inputTxt.replace(fNum + calSymbols[i + 1] + sNum, Integer.toString(fNum * sNum));
					System.out.println(inputTxt);

				} else if(calSymbols[i + 1].equals("/")) {
					inputTxt = inputTxt.replace(fNum + calSymbols[i + 1] + sNum, Integer.toString(fNum / sNum));
					System.out.println(inputTxt);
					
				} else {
					fNum = Integer.parseInt(textSplit[i]);
					sNum = Integer.parseInt(textSplit[i+1]);
					
					if(calSymbols[i].equals("+")) {
						inputTxt = inputTxt.replace(fNum + calSymbols[i] + sNum, Integer.toString(fNum + sNum));
						System.out.println(inputTxt);
					} else { // 빼기
						inputTxt = inputTxt.replace(fNum + calSymbols[i] + sNum, Integer.toString(fNum - sNum));
						System.out.println(inputTxt);
					}
				}
			} else {
				fNum = Integer.parseInt(textSplit[i]);
				sNum = Integer.parseInt(textSplit[i+1]);
				
				if(calSymbols[i].equals("*")) {
					inputTxt = inputTxt.replace(fNum + calSymbols[i] + sNum, Integer.toString(fNum * sNum));
					System.out.println(inputTxt);
											
				} else if(calSymbols[i].equals("/")) {
					inputTxt = inputTxt.replace(fNum + calSymbols[i] + sNum, Integer.toString(fNum / sNum));
					System.out.println(inputTxt);
											
				}
			}
				
		
		}
		return getResult(inputTxt); 
		
	}
