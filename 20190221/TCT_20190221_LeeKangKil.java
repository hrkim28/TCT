public class   TCT_20190221_LeeKangKil{
	final static int nomalFee = 1000, transferFee = 200;

	public static void main(String args[])  {
		int nomalCnt =0 ,transferCnt =0, maxFee=0, fee=0;
		int[][] subwayArray = {{0, 32, 0, 3},{3, 13, 1, 0},{28, 25, 1, 5},{39, 0, 6, 0}};
		
		for (int[] station :  subwayArray){
				nomalCnt = nomalCnt - station[0] + station[1];
				transferCnt = transferCnt - station[2] +station[3];

				fee  = nomalCnt * nomalFee + transferCnt * transferFee;  
				if( fee > maxFee) maxFee = fee;
		}
		System.out.println(maxFee);
	}
}
	