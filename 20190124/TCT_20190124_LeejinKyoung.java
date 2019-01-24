

public class TCT_20190124_LeejinKyoung {

    /**
    *
    * @param args
    */
   public static void main(String[] args){
       TCT_20190124_LeejinKyoung test = new TCT_20190124_LeejinKyoung();
       
       int n=8;
       
       int result = 0;
       for(int inx = (n/2-1) ; inx > 0;inx--){
           result = gcd(n/2-inx,n/2+inx);
           
           if(result == 1) {
               System.out.println((n/2-inx) + "," + (n/2+inx) + " : " + result);
               break;
           }
       }
   }
    /* 공약수 */
    public static int gcd(int a, int b) {
        int tmp;
        while (b != 0) {
            tmp = b;
            b = a % b;
            a = tmp;
        }
     
        return a;
    }
    
}
