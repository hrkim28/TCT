package tct;

import java.util.Scanner;
public class TCT_20190121_LeeJoonWoo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("재료의 갯수를 입력하세요");
		System.out.println("예시:4");
		
		String input = sc.next();
	    int materialCount = Integer.parseInt(input);
	    
	    System.out.println("들어갈 재료의 양(숟가락수)를 입력하세요. 콤마로 구분하세요.");
		System.out.println("예시:4,6,2,4");
	    
	    input = sc.next();
	    String fomulaCount[] = input.split(",");
	    
	    System.out.println("이미 들어간 재료의 양(숟가락수)를 입력하세요. 콤마로 구분하세요.");
		System.out.println("예시:6,4,2,4");
	    
	    input = sc.next();
	    String inputCount[] = input.split(",");
	    
	    //입력된 레서피 중에서 가장 큰수를 찾기
	    int fomulaMax = 0;
	    int maxIndex = 0;
	    
	    for (int i =0; i<materialCount; i++) { 
			if (Integer.parseInt(fomulaCount[i]) > fomulaMax) { 
				fomulaMax = Integer.parseInt(fomulaCount[i]);  
			    maxIndex = i;
			}
		}
	    //레서피의 최대 공약수를 찾기
	    int successCount = 0;
	    int maxCommonIndex = 0;
	    //입력된 레서피의 최대값만큼   증가시키면서 최대공약수를 찾음
	    for (int i =1; i<fomulaMax; i++) {
	    	for (int j=0; j<materialCount; j++){
	    		if(Integer.parseInt(fomulaCount[j])%i==0 ){
	    			successCount = successCount+1;
	    		}
	    		
	    		//재료수로 나뉘면 공약수 이며 맨 마지막 For 문에서 남긴것이 최대 공약수
	    		if(successCount/materialCount == 1){
	    			maxCommonIndex = i;
	    		}
	    		
	    	}
	    	successCount = 0;
		}
	    
	    
	    //가장 작은 비율을 찾기
	    int minFomulaCount[] = new int[fomulaCount.length];
	    for(int i=0; i<minFomulaCount.length; i++){
	    	minFomulaCount[i] = Integer.parseInt(fomulaCount[i])/maxCommonIndex;
	    }
	    		
	    //가장 작은 비율부터 올리면서 이미 입력된  P 의 모든 값이 투입할 비율보다 모두 작아지는 첫번째 비율을 찾는다
	    int successIndex =0;
	    int allSuccessIndex =0;
	    for(int i=1; i<1000; i++){
	    	
	    	for (int j=0; j<materialCount; j++){
	    		if(minFomulaCount[j]*i >= Integer.parseInt(inputCount[j]) ){
	    			successIndex = successIndex+1;
	    		}
	    		
	    		//처음으로 모두 작아지는 것이 성공한  Index
	    		if(successIndex/materialCount == 1){
	    			allSuccessIndex = i;
	    			break;
	    		}
	    	} 
	    	successIndex = 0;
	    	if(allSuccessIndex > 0){
    			break;
    		}
	    }
	    
	    
        //찾아낸 최적의 비율에서 이미 투입한 P 값을 빼도록 함
	    String result = "";
	    for (int i =0; i<minFomulaCount.length; i++) { 
	    	minFomulaCount[i] = minFomulaCount[i]*allSuccessIndex - Integer.parseInt(inputCount[i]);
	    	result = result+" "+minFomulaCount[i];
		}
	
 		System.out.println("====================================");
	    System.out.println("result:"+result);
	    System.out.println("====================================");

	}

}
