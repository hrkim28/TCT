/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : LimYoungwon_20170131.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 2017. 1. 31.  youngwon.lim   Initial
 * ===========================================
 * 

마지막에 남은 1명의 소개팅녀 출력
101명의 소개팅녀가 있음 
Yes/No를 선택할 수 있으며 No선택시 목록에서 제외됨
첫번째 소개팅녀부터 홀수는 Yes 짝수는 No

 */
package daily;


/**
 * <pre>
 * Class : LimYoungwon_20170131
 * Description : TODO
 * </pre>
 * 
 * @author youngwon.lim
 */
public class LimYoungwon_20170131 {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        // TODO Auto-generated method stub
        
        // initialize
        int girlCnt = 101;
        
        int cnt = 0;
        int lastCnt = 1;
        int lastGirl =0;
        
        int temp = 0;
        int girls[] = new int[girlCnt+1];
        for(int i=1; i < girls.length ; ++i)
        {
            girls[i]= i;
        }
        
        
        while (lastCnt !=cnt){
            lastCnt = cnt;
            
            for(int j= 1 ; j < girls.length ; ++j)
            {
                if( girls[j] == 0)
                {
                    continue;
                }else
                {
                    cnt = cnt + 1;
                }
                            
                if( cnt%2 == 0)
                {
                    girls[j] = 0;
                }else{
                    //girls[j] = cnt;
                    lastGirl = j;
                }
            }
        }
        System.out.println(lastGirl);
            
    }

}
