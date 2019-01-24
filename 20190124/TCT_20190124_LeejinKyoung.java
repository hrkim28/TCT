

public class TCT_20190124_LeejinKyoung {

    /**
    *
    * @param args
    */
   public static void main(String[] args){
       int n=8;
       
       int result = 0;
       for(int inx = n/2 ; inx > 0;inx--){
           if((n/2)%2 == 1){
               if(getPrime(n/2-inx+1) && getPrime(n/2+inx-1)) {
                   System.out.println("1 : " + (n/2-inx+1) + "," + (n/2+inx-1) + " : " + result);
                   break;
               }
           } else {
               if(getPrime(n/2-inx) && getPrime(n/2+inx)) {
                   System.out.println("0 : " + (n/2-inx) + "," + (n/2+inx) + " : " + result);
                   break;
               }
           }
       }
       
   }
    /* 소수구하기 */
    public static boolean getPrime(int i) {
        boolean isPrime = true;
        for (int n = 2; n < i; n++) {
            if (i % n == 0) {
                 isPrime = false;
                 break;

            }
        }
        return isPrime;
    }
}
