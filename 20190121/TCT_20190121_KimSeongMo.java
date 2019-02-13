import java.util.Arrays;

public class TCT_20190121_KimSeongMo {
    int minimumCalcuation;
    
    public static void main(String[] args){
        TCT_20190121_KimSeongMo obj = new TCT_20190121_KimSeongMo();
        int[] ratio1 = {4,6,2,4};
        int[] remain1 = {6,4,2,4};
        int[] ratio2 = {4,6,2,4};
        int[] remain2 = {7,4,2,4};
        int[] ratio3 = {4,5,6};
        int[] remain3 = {1,2,3};
        
        System.out.println( Arrays.toString( obj.getMinimumSupply(ratio1, remain1) ) );
        System.out.println( Arrays.toString( obj.getMinimumSupply(ratio2, remain2) ) );
        System.out.println( Arrays.toString( obj.getMinimumSupply(ratio3, remain3) ) );
    }
    
    private int[] getMinimumSupply(int[] ratio, int[] remain ){
        int[] commonRatio = this.getMinCommonRatio(ratio);
        int maxScale = 1;
        int tempScale;
        for( int inx = 0; inx < ratio.length; inx++ ){
            tempScale = ( remain[inx] % commonRatio[inx] == 0)? remain[inx]/commonRatio[inx] : remain[inx]/commonRatio[inx]+1;
            if(maxScale < tempScale) maxScale = tempScale;
        }
        
        for( int inx = 0; inx < ratio.length; inx++ ){
            remain[inx] = ratio[inx]*maxScale - remain[inx];
        }
        
        return remain;
    }

    private int[] getMinCommonRatio(int[] ratio){
        int gratedCommonDivisor = this.getGCD(ratio);
        if( gratedCommonDivisor != 1 ){
            for( int inx = 0; inx < ratio.length; inx++ ){
                ratio[inx] = ratio[inx] / gratedCommonDivisor;
            }
        }
        return ratio;
    }

    private int getGCD(int[] ratio){
        int min = ratio[0];
        for( int inx = 0; inx < ratio.length; inx++ ){
            if( min > ratio[inx] ) min = ratio[inx];
        }
        for( int inx = min; inx > 0; inx-- ){
            boolean isCommonDivisor = true;
            for( int jnx = 0; jnx < ratio.length; jnx++ ){
                if( ratio[jnx] % inx != 0 ){
                    isCommonDivisor = false; break;
                }
            }
            if(isCommonDivisor) return inx;
        }
        return 1;
    }
}
