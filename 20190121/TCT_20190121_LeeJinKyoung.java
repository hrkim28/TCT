

/**
 * <pre>
 * Class : TCT_20190116_LeeJinKyoung
 * Description : TODO
 * </pre>
 * 
 * @author jinklee
 */
public class TCT_20190121_LeeJinKyoung {
    /**
    *
    * @param args
    */
   public static void main(String[] args){
       TCT_20190121_LeeJinKyoung test = new TCT_20190121_LeeJinKyoung();
       
//       int n1 = 4;
//       int[] r1 = {4,6,2,4};
//       int[] p1 = {6,4,2,4};
//
//       test.calculator(n1,r1,p1);
//       
//       int n2 = 4;
//       int[] r2 = {4,6,2,4};
//       int[] p2 = {7,4,2,4};
//       
//       test.calculator(n2,r2,p2);
//
//       int n3 = 3;
//       int[] r3 = {4,5,6};
//       int[] p3 = {1,2,3};
//       
//       test.calculator(n3,r3,p3);

   
       int n4 = 3;
       int[] r4 = {3,6,9};
       int[] p4 = {7,17,37};
       
       test.calculator(n4,r4,p4);
   }
   
   public void calculator( int n, int [] r, int[] p){       
       //최대공약수를 구한다.
       long m = ngcd(r);

       //System.out.println(m);
       
       int[] result = new int[n];

       int windex = 0;

       for(int inx = 0 ; inx < r.length-1; inx++){ 
           if( (float)p[inx+1]/r[inx+1] > (float)p[windex]/r[windex] ){
              windex = inx+1;
           }           
       }

      // System.out.println(windex);
       
       int l = 1;
       for(int inx = 1; inx <= m; inx++){
           if((float)inx/m >= (float)(p[windex]%r[windex])/r[windex]){
               l = inx;
               break;
           }
       }
       
       //System.out.println(l);
       
       for(int inx = 0 ; inx < r.length; inx++){ 
           result[inx] = ( r[inx] * ( (int)p[windex]/r[windex] ) + r[inx] * l/ (int)m ) - p[inx];
       }
       
       print(r);
       print(p);
       print(result);       
   }

   /* n개의 최소공배수*/
   public long nlcm(int[] num) {
       long answer = 0;
       long temp=num[0];
   
       for(int i=0; i<num.length-1; i++) {
           temp = lcm(temp, num[i+1]);
       }
       answer = temp;
   

       return answer;    
    }
    
   /* n개의 최대공약수*/
   public long ngcd(int[] num) {
       long answer = 0;
       long temp=num[0];
   
       for(int i=0; i<num.length-1; i++) {
           temp = gcd(temp, num[i+1]);
       }
       answer = temp;
   
       return answer;    
   }

   /* 최대공약수 */
   public static long gcd(long a, long b) {
       long tmp;
       while (b != 0) {
           tmp = b;
           b = a % b;
           a = tmp;
       }
    
       return a;
   }

   /* 최소공배수 */
   public static long lcm(long a, long b) {
       if (a <= 0 || b <= 0) { return -1; }
       return a * b / gcd(a, b);
   }

   public void print(int [] r){
       for(int inx = 0 ; inx < r.length; inx++){
           System.out.print(r[inx]+" ");
       }
       
       System.out.println("");
   }
}


