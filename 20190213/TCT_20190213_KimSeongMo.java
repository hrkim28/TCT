public class TCT_20190213_KimSeongMo {
    int minimumCalcuation;
    
    public static void main(String[] args){
        TCT_20190213_KimSeongMo obj = new TCT_20190213_KimSeongMo();
        System.out.println( obj.getMinimumCaculation(1) );
        System.out.println( obj.getMinimumCaculation(2) );
        System.out.println( obj.getMinimumCaculation(3) );
        System.out.println( obj.getMinimumCaculation(4) );
        System.out.println( obj.getMinimumCaculation(10) );
        System.out.println( obj.getMinimumCaculation(30) );
        System.out.println( obj.getMinimumCaculation(100) );
        System.out.println( obj.getMinimumCaculation(243) );
        System.out.println( obj.getMinimumCaculation(729) );
        System.out.println( obj.getMinimumCaculation(1000) );
        System.out.println( obj.getMinimumCaculation(1000000) );
    }
    
    private int getMinimumCaculation(int input){
        this.minimumCalcuation = Integer.MAX_VALUE;
        this.findCalcCombination(input, 0);
        return minimumCalcuation;
    }
    
    private void findCalcCombination( int input, int caculationCount ){
        if( input > 1 ){
            caculationCount++;
            if(input%3 == 0){
                findCalcCombination(input/3, caculationCount);
            }else if( input%3 == 2  ){
                findCalcCombination(input-1, caculationCount);
            }else{
                findCalcCombination(input/2, caculationCount);
                findCalcCombination(input-1, caculationCount);
            }
        }else{
            if(this.minimumCalcuation > caculationCount){
                this.minimumCalcuation = caculationCount;
            }
        }
    }
}
