import java.util.HashSet;
import java.util.Set;

public class TCT_20190124_KimSeongMo {
    public static void main(String[] args){
        TCT_20190124_KimSeongMo obj = new TCT_20190124_KimSeongMo();
        int inputNum = 6;
        int result = obj.getCombination(inputNum);
        
        if( result == inputNum ){
            System.out.println("Invalid");
        }else{
            System.out.println( result + ", " + (inputNum - result)  );
        }
    }
    
    private int getCombination( int input ){
        Set<Integer> primeNumSet = this.getPrimeNumSet(input);
        int minInterval = input;
        int result = input;
        for( Integer num : primeNumSet ){
            if( primeNumSet.contains(input - num) && Math.abs(input - num) < minInterval ){
                result = num;
            }
        }
        return result;
    }
    
    private Set<Integer> getPrimeNumSet(int input){
        Set<Integer> result = new HashSet<Integer>();
        for( int inx = 2; inx < input; inx++ ){
            boolean isPrime = true;
            for( int jnx = 2; jnx < inx; jnx++ ){
                if( inx % jnx == 0 ) isPrime = false;
            }
            if( isPrime ) result.add(inx);
        }
        return result;
    }
    
}
