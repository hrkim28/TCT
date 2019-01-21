package test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class CaseInfo {
	int n;
	int[] r;
	int[] p;
	
	CaseInfo(int n, int[] r, int[] p){
		this.n = n;
		this.r = r;
		this.p = p;
	}

}

public class TCT_NaTaeUng {

	
	
    public static void main(String args[]) throws IOException {
        run();
    }
    /*
     * case 1)
	 n : 4
	 r : 4 6 2 4
	 p : 6 4 2 4
	 case 2)
	 n : 4
	 r : 4 6 2 4
	 p : 7 4 2 4
	 case 3)
	 n : 3
	 r : 4 5 6
	 p : 1 2 3
	
	[출력]
	각 테스트 케이스마다 한 줄에 n 개의 정수로 각 재료마다 더 넣어야 하는 양을 출력합니다.
	case 1)
	 0 5 1 2
	 case 2)
	 1 8 2 4
	 case 3)
	 3 3 3
     */

    
    public static void run() throws IOException {
    	List<CaseInfo> list = new ArrayList<CaseInfo>();
    	
    	CaseInfo testCase1 = new CaseInfo(4,new int[]{4, 6, 2, 4}, new int[]{6, 4, 2, 4});
    	CaseInfo testCase2 = new CaseInfo(4,new int[]{4, 6, 2, 4}, new int[]{7, 4, 2, 4});
    	CaseInfo testCase3 = new CaseInfo(3,new int[]{4, 5, 6}, new int[]{1, 2, 3});
    	list.add(testCase1);
    	list.add(testCase2);
    	list.add(testCase3);
    
    	
    	for(int i=0; i<3 ; i++) {
    		
        	int max = 0;
        	int cnt = 1;
        	boolean chkFlag;
        	
    		CaseInfo temp = list.get(i);
    		
    		//배열 최대값
        	for(int j =0; j<temp.n; j++) {
        	  if(max < temp.r[j]) {
        		  max = temp.r[j];
        	  }
        	}
        	
        	
        	
    		//레시피 배열 최소 비율로 분해하기
    		for(int k = max; k > 0; k--) {
    			chkFlag = true;
    			for(int p =0; p<temp.n; p++) {
    				if((temp.r[p] % k) != 0){
    					chkFlag = false;
    					break;
    				}
    				
    			}
    			if(chkFlag) {
    				for(int p =0; p<temp.n; p++) {
    					int a = temp.r[p]/k;
    					temp.r[p] = a;
    				}
    				break;
    			}
    		}
    		
    		// 주어진 레시피에 맞는 최소 재료 정보 찾기
    		chkFlag = true;
    		while(true) {
    			
    			for(int j =0; j<temp.n; j++) {
    				if(temp.r[j]*cnt < temp.p[j]) {
    					chkFlag = false; 
    					break;
    				}
    			}
    			
    			if(chkFlag) {
    				System.out.println("case " + (i+1) + ") ");
    				for(int j =0; j<temp.n; j++) {
    					System.out.print(temp.r[j]*cnt - temp.p[j] + " ");
    				}
    				System.out.println("");
    				break;
    			}
    			chkFlag = true;
    		  cnt++;
    		}
 
    	}
       
  
      }

}
