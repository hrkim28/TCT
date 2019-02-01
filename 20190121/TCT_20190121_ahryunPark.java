package com.lgcns.exercise.plmtct;


/**
 * ����
 * ������ �� ���� �ð��� �������� ������ �� ��� ���� �츮�� �Ǽ��� ���� �� ���� ����� ���� �߸� �ְ� ���ҽ��ϴ�. 
 * ���� ������ �ɻ�ġ �ʰ� ���ϴ� ���� ��ġæ �ظ��̿´��� �绡�� �������� ��Ȯ�� ���� �˷��־ ���� ���� ��ġ�� ���� ���߽��ϴ�. 
 * ���� �� ��Ḧ �� �־ ���� �ϼ��ؾ� �մϴ�.

	�̹� �ð��� ����� ������ ���� n ������ ��Ḧ �� r �������� �־ ������ �մϴ�. 
	��� ��Ḧ ��Ȯ�� �־��� ��� ������� ������ ���� ��Ȯ�� �� �� �з��� �˴ϴ�. 
	�츮�� �̹� ���� ���� �� ������ ���� p �� �־����ϴ�. 
	�츮�� ������ ���� ��Ḧ �ּ������� �� �־� �� ����� ������ ��Ȯ�� ���߰� �ͽ��ϴ�. 
	�̸� ���� �� ������ ���� ���� ���� ��� ������, �ּ��� �� ���� ������ �մϴ�. 
	�츮�� �׻� ������ �����θ� ��Ḧ ���� �� �ֱ� ������, �� �������� ��Ḧ �� �ִ´ٰų� �ϴ� ���� �Ұ����մϴ�.
	
	�־�� �� �� ����� �ּҷ��� ����ϴ� ���α׷��� �ۼ��ϼ���.
	
	[�Է�]
	�� �׽�Ʈ ���̽��� �� �ٷ� �����˴ϴ�. ù �ٿ��� ����� �� n (1 <= n <= 200) �� �־�����, 
	���� �ٿ��� n ���� ������ �࿡ ���� �ϴ� �� ����� �� r (1 <= r <= 1000), 
	�� ���� �ٿ��� n ���� ������ �̹� ���� ���� ����� �� p (0 <= p <= 1000) �� �־����ϴ�.
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
	
	[���]
	�� �׽�Ʈ ���̽����� �� �ٿ� n ���� ������ �� ��Ḷ�� �� �־�� �ϴ� ���� ����մϴ�.
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
		
		//�ִ����� ���ϱ�
		int gcdNum = gcd(inputR[0], inputR[1]);
		if(inputR.length>2) {
			for(int inx = 2; inx< inputR.length; inx++) {
				gcdNum = gcd(gcdNum, inputR[inx]);
			}
		}
		
		//���� ���ϱ�
		int[] rate = new int[inputR.length];
		double max = 0.0;
		for(int inx = 0 ; inx < inputR.length; inx++) {
			
			rate[inx] = inputR[inx]/gcdNum;
			
			if(max <  (double)inputP[inx]/rate[inx]) {
				max = (double)inputP[inx]/rate[inx];
			}
		}
		
		//�߰� �� ���ϱ� 
		for(int inx = 0; inx<rate.length; inx++) {
			inputP[inx] = (rate[inx]*(int)Math.ceil(max))-inputP[inx];
			System.out.print(inputP[inx] + " ");
		}
		
		
	}
	
	
    //�ִ� �����
    public static int gcd(int a, int b) { 
        
        while(a != b){
            //System.out.println("a:"+a+"/b:"+b);
            if (a > b) a = a - b;
            else if (b > a) b = b - a;            
            
        }        
        
        return a;        
    }


}
