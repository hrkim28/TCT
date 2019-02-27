import java.util.Arrays;

public class TCT_20190227_KimSeongMo {
    public static void main(String[] args){
        TCT_20190227_KimSeongMo obj = new TCT_20190227_KimSeongMo();
        int n1 = 2;
        int s1 = 9;
        int n2 = 2;
        int s2 = 1;
        int n3 = 3;
        int s3= 13;
        int n4 = 3;
        int s4= 30;
        
        System.out.println(Arrays.toString(obj.getMaxProduct(n1,s1)));
        System.out.println(Arrays.toString(obj.getMaxProduct(n2,s2)));
        System.out.println(Arrays.toString(obj.getMaxProduct(n3,s3)));
        System.out.println(Arrays.toString(obj.getMaxProduct(n4,s4)));
    }
    
    private int[] getMaxProduct(int size, int sum){
        int[] result;
        if( size > sum ){
            result = new int[1];
            result[0] = -1;
            return result;
        }
        
        result = new int[size];
        int remain = sum%size;
        int base = (sum-remain)/size;
        for( int inx = 0; inx < size; inx++ ){
            if( size-inx <= remain ) result[inx] = base+1 ;
            else result[inx] = base;
        }
        return result;
    }
}
