/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : LimYoungwon_20170209.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 2017. 2. 9.  youngwon.lim   Initial
 * ===========================================
 */
package daily;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * <pre>
 * Class : LimYoungwon_20170209
 * Description : TODO
 * </pre>
오름차순으로 1~20 까지 배치된 카드가 존재함
제시된 특정 구간의 위치를 역순으로 변경함

 예를 들어, 구간이 [5,10]으로 주어진다면, 위치 5부터 위치 10까지의 카드 5,6,7,8,9,10을 역순으 로 하여 10,9,8,7,6,5로 놓는다. 
--> 그림순서 : 1,2,3,4,10,9,8,7,6,5,11,12,13,14,15,16,17,18,19,20.
  이 상태에서 구간 [9,13]이 다시 주어진다면, 위치 9부터 위치 13까지의 카드 6,5,11,12,13 을 역순으로 하여 13,12,11,5,6으로 놓는다. 
    --> 그림순서.: 1,2,3,4,10,9,8,7,13,12,11,5,6,14,15,16,17,18,19,20
 [출력 예시(3개 구간일 경우)]
 입력구간 :        
[3,7]
[4,6]
[5,5]      
 결과 : 최종 카드배치는 [1,2,7,4,5,6,3,8,9,10,11,12,13,14,15,16,17,18,19,20] 입니다.


 * @author youngwon.lim
 */
public class LimYoungwon_20170209 {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        // TODO Auto-generated method stub
       int[] aryCard = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
       int cntInputNum =0;
       int[] intMax;
       int[] intMin;
       
       InputStreamReader isr = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(isr);
       
       try{
          //입력
           System.out.println("변경된 구간의 횟수를 입력하세요");
           cntInputNum = Integer.parseInt(br.readLine());
           intMin = new int[cntInputNum];
           intMax = new int[cntInputNum];
           for(int i=0 ; i < cntInputNum; ++i)
           {
               System.out.println("구간의 최소값을 입력하세요");
               intMin[i] = Integer.parseInt(br.readLine());
               System.out.println("구간의 최대값을 입력하세요");
               intMax[i] = Integer.parseInt(br.readLine());
               
               if(intMin[i]> 19)
               {
                   System.out.println("구간의 최소값이 19보다 크다, 재입력");
                   intMin[i] = Integer.parseInt(br.readLine());
               }else if(intMax[i]<2)
               {
                   System.out.println("구간의 최대값이 2보다 작다, 재입력");
                   intMax[i] = Integer.parseInt(br.readLine());
               }else if(intMin[i]>intMax[i])
               {
                   System.out.println("구간의 최소값이 최대값보다 크다 ");
                   System.out.println("구간의 최소값을 입력하세요");
                   intMin[i] = Integer.parseInt(br.readLine());
                   System.out.println("구간의 최대값을 입력하세요");
                   intMax[i] = Integer.parseInt(br.readLine());
               }
           }
           
           
           
           // 처리
           for(int i =0; i< cntInputNum ; ++i)
           {
               reverseArray(aryCard,intMin[i],intMax[i]);
               System.out.println("["+intMin[i]+"," +intMax[i]+"]");
               printArray(aryCard);
           }
       }catch(Exception e){
           System.out.println("Error");
       }
       

       
       
       
       
    }
    
    public static void reverseArray(int[] aryInput,int min, int max)
    {
        int[] aryInputNum = aryInput;
        int cnt = max-min+1;
        int[] aryTemp = new int[cnt];
        
        for(int i= 0 ; i< cnt ; ++i)
        {
            aryTemp[i] = aryInputNum[min-1+i];
        }
        
        for(int i=0; i< cnt ; ++i)
        {
            aryInputNum[min-1+i] = aryTemp[cnt-1-i];
        }
    }
    
    public static void printArray(int[] aryPrint)
    {
        for( int i=0; i< aryPrint.length; ++i)
        {
            System.out.print(aryPrint[i]);
            if( i!= aryPrint.length -1 )
            {
                System.out.print(","); 
            }else
            {
                System.out.println(""); 
            }
            
            
        }
    }
    

}
