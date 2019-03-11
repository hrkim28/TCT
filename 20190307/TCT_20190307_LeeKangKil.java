import java.util.Arrays;
public class   TCT_20190307_LeeKangKil{

	public static void main(String args[])  {
		int M = 7;
		int tree[] ={20,15,10,17};
		Arrays.sort(tree);
	
		int start = 0,  end =tree.length-1, binary_pos=0;
		while(start <= end){
			binary_pos = (start+end)/2;
			
			if(getMyTree(tree[binary_pos],tree)>=M) start=binary_pos+1;
			else end=binary_pos-1;
		}
				
		for(int H = tree[binary_pos];H>0; H--){
			if(getMyTree(H,tree) == M ) { 
				System.out.println(H);
				return;
			}
		}
	}
    public static int getMyTree(int H, int[] tree){
    	int result=0;
    	for(int i=0; i<tree.length;i++){ 
    		if(tree[i]-H >0)	result = result +  tree[i]-H;    	
    	}
    	return result;
    }
}