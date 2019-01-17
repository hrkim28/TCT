
/**
 * <pre>
 * Class : TCT_20190116_LeeJinKyoung
 * Description : TODO
 * </pre>
 * 
 * @author jinklee
 */
public class TCT_20190117_LeeJinKyoung {
    /**
    *
    * @param args
    */
   public static void main(String[] args){
       TCT_20190117_LeeJinKyoung test = new TCT_20190117_LeeJinKyoung();
       
       System.out.println(test.calculator(9));
       System.out.println(test.calculator(15));
       System.out.println(test.calculator(21));
   }
   
   public int calculator( int n){
       
       int result = 0;
       if( n / 3 >= 3 && n % 3 == 0 ){
           //3개의 숫자의 합이 sum 값이 되는 숫자 조합을 찾자 
           int sum = n/3;

           //(sum - 2) + ... + 1까지 더하자
           for(int inx = sum - 2 ; inx > 0 ; inx--){
               result = inx + result;
           }
       }

       return result;
       
   }
   
   
}


