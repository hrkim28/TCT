package com.lgcns.exercise.plmtct;


/**
 * 문제
 * 마법의 약 수업 시간에 교수님의 설명을 안 듣고 졸던 헤리는 실수로 냄비에 몇 가지 재료의 양을 잘못 넣고 말았습니다. 
 * 약의 색깔이 심상치 않게 변하는 것을 눈치챈 해르미온느가 재빨리 레시피의 정확한 양을 알려주어서 약을 전부 망치는 것은 면했습니다. 
 * 지금 얼른 재료를 더 넣어서 약을 완성해야 합니다.

	이번 시간에 만드는 마법의 약은 n 종류의 재료를 각 r 숟가락씩 넣어서 만들어야 합니다. 
	모든 재료를 정확히 넣었을 경우 만들어진 마법의 약은 정확히 한 병 분량이 됩니다. 
	헤리가 이미 냄비에 넣은 각 재료들의 양은 p 로 주어집니다. 
	헤리는 적절히 냄비에 재료를 최소한으로 더 넣어 각 재료의 비율을 정확히 맞추고 싶습니다. 
	이를 위해 한 병보다 많은 약을 만들어도 상관 없지만, 최소한 한 병은 만들어야 합니다. 
	헤리는 항상 숟가락 단위로만 재료를 넣을 수 있기 때문에, 반 숟가락의 재료를 더 넣는다거나 하는 일은 불가능합니다.
	
	넣어야 할 각 재료의 최소량을 계산하는 프로그램을 작성하세요.
	
	[입력]
	각 테스트 케이스는 세 줄로 구성됩니다. 첫 줄에는 재료의 수 n (1 <= n <= 200) 이 주어지고, 
	다음 줄에는 n 개의 정수로 약에 들어가야 하는 각 재료의 양 r (1 <= r <= 1000), 
	그 다음 줄에는 n 개의 정수로 이미 냄비에 넣은 재료의 양 p (0 <= p <= 1000) 가 주어집니다.
	case 1)
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
 *
 */
public class TCT_20190121_ahryunPark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCT_20190121_ahryunPark tct = new TCT_20190121_ahryunPark();
		
		int n1 = 4;
		int[] inputR1 = {4,6,2,4};
		int[] inputP1 = {6,4,2,4};
		System.out.println("case 1");
		tct.getReuslt(n1,inputR1, inputP1);
		System.out.println("");
		
		int n2 = 4;
		int[] inputR2 = {4,6,2,4};
		int[] inputP2 = {7,4,2,4};
		System.out.println("case 2");
		tct.getReuslt(n2,inputR2, inputP2);
		System.out.println("");
		
		int n3 = 3;
		int[] inputR3 = {4,5,6};
		int[] inputP3 = {1,2,3};
		System.out.println("case 3");
		tct.getReuslt(n3, inputR3, inputP3);
		

	}
	
	
	public void getReuslt(int N, int[] inputR, int[] inputP){
		
		//최대공약수 구하기
		int gcdNum = gcd(inputR[0], inputR[1]);
		if(inputR.length>2) {
			for(int inx = 2; inx< inputR.length; inx++) {
				gcdNum = gcd(gcdNum, inputR[inx]);
			}
		}
		
		//비율 구하기
		int[] rate = new int[inputR.length];
		double max = 0.0;
		for(int inx = 0 ; inx < inputR.length; inx++) {
			
			rate[inx] = inputR[inx]/gcdNum;
			
			if(max <  (double)inputP[inx]/rate[inx]) {
				max = (double)inputP[inx]/rate[inx];
			}
		}
		
		//추가 양 구하기 
		for(int inx = 0; inx<rate.length; inx++) {
			inputP[inx] = (rate[inx]*(int)Math.ceil(max))-inputP[inx];
			System.out.print(inputP[inx] + " ");
		}
		
		
	}
	
	
    //최대 공약수
    public static int gcd(int a, int b) { 
        
        while(a != b){
            //System.out.println("a:"+a+"/b:"+b);
            if (a > b) a = a - b;
            else if (b > a) b = b - a;            
            
        }        
        
        return a;        
    }


}
