public class TCT_20190225_KimSeongMo {
    int max;
    
    public static void main(String[] args){
        TCT_20190225_KimSeongMo obj = new TCT_20190225_KimSeongMo();
        int[] input = {1000,2000,3000,4000};
        System.out.println( obj.getMinimumCaculation(input) );
    }
    
    private int getMinimumCaculation(int[] input){
        this.max = Integer.MIN_VALUE;
        this.findCombination(input, 0, 0, false);
        return this.max;
    }
    
    private void findCombination( int[] input, int sum, int currIdx, boolean isFirstSelected ){
        if( currIdx == input.length ){
            if( !isFirstSelected ){
                sum = sum + input[currIdx];
            }
            if( sum > this.max ) this.max = sum;
        }
        else if( currIdx == input.length-1 ){
            // ???
        }else if( currIdx == input.length-2 ){
            // ???
        }else{
            if( currIdx != 0 ){
                findCombination(input, sum + input[currIdx], currIdx + 2, isFirstSelected);
                findCombination(input, sum, currIdx + 1, isFirstSelected);
            }else{
                findCombination(input, sum + input[currIdx], currIdx + 2, true);
                findCombination(input, sum, currIdx + 1, false);
            }
        }
    }
}
