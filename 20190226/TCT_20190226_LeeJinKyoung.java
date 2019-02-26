
public class TCT_20190226_LeeJinKyoung {
	public static void main(String[] args) {
		//a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,s,y,z
		//2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9
		//1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,4,1,2,3,1,2,3,4
		
		int[] key = new int[] {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
		int[] keyCount = new int[] {1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,4,1,2,3,1,2,3,4};
		//int[] keyOld = {1,2,3,4,5,6,7,8,9};
		//int[] keyNew = {2,3,4,5,6,7,8,9,1};
		//String str = "klor";
		
		//int[] keyNew = {7,8,9,1,2,3,6,5,4};
		//String str = "djevojka";

		int[] keyNew = {9,8,7,6,5,4,3,2,1};
		String str = "skakavac";		
		
		for(int inx = 0; inx < str.length(); inx++) {
			int pos = (int)str.charAt(inx) - (int)'a';
			
			if( inx > 0 ) {
				int prePos = str.charAt(inx-1) - (int)'a';
				if(key[prePos] == key[pos]) {
					print(shiftkey(keyNew,key[pos]),keyCount[pos],true);
				} else {
					print(shiftkey(keyNew,key[pos]),keyCount[pos],false);
				}
				
			} else {
				print(shiftkey(keyNew,key[pos]),keyCount[pos],false);
			}
		}
	}
	
	public static void print(int key, int keyCount, boolean sharp) {
		if(sharp) {
			System.out.print("#");
		}
		
		for(int inx = 0; inx < keyCount; inx++) {
			System.out.print(key);
		}
	}
	
	public static int shiftkey(int[] keyNew, int number) {
		
		int oldKey = 0;
		for(int inx = 0; inx < keyNew.length; inx++) {
			if(keyNew[inx] == number) {
				if(inx + 1 !=  keyNew.length) {
					oldKey = inx + 1;
				} else {
					oldKey = 1;
				}
				break;
			}
		}
		return oldKey;
	}
}