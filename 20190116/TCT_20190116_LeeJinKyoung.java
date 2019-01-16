import java.util.Arrays;

/**
 * <pre>
 * Class : TCT_20190116_LeeJinKyoung
 * Description : TODO
 * </pre>
 * 
 * @author jinklee
 */
public class TCT_20190116_LeeJinKyoung {

    /**
    *
    * @param args
    */
   public static void main(String[] args){
/*
works    N   result
[4, 3, 3]   4   12
[2, 1, 2]   1   6
[1,1]   3   0
*/
       TCT_20190116_LeeJinKyoung test = new TCT_20190116_LeeJinKyoung();
       
       
       int[] works1 = {4,3,3};
       System.out.println(test.workloadCalculator(works1,4));       
       
       int[] works2 = {2,1,2};
       System.out.println(test.workloadCalculator(works2,1));
       
       int[] works3 = {1,1};
       System.out.println(test.workloadCalculator(works3,3));
   }
   
   
   public int workloadCalculator( int[] works, int workingtime){
       int workload = 0;
       
       for(int inx = 0; inx < works.length; inx++){
           workload = works[inx] + workload;
       }
       
       if( workload <= workingtime){
           workload = 0;
       } else {  
           workload = 0;
           Arrays.sort(works);
           
           while(workingtime > 0) {
               workingtime--;
               works[works.length-1] = works[works.length-1] - 1;
               Arrays.sort(works);
           }
           
           
           for(int inx = 0; inx < works.length; inx++){
               workload = workload + (works[inx] * works[inx]);
           }
       }

       return workload;
       
   }
}
