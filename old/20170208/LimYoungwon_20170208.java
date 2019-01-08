/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : LimYoungwon_20170208.java
 * ===========================================
 * Modify Date    Modifier    Description 
 * -------------------------------------------
 * 2017. 2. 8.  youngwon.lim   Initial
 * ===========================================
 */
package daily;

import java.util.ArrayList;
import java.util.Random;

/**
 * <pre>
정렬된 정수를 가진 K개의 리스트가 존재함
각 리스트에서 한가지 수를 추출하여 가장작은 범위 추출

예시 
List 1 [4,10,15,24,26]
List 2 [0,9,12,20]
List 3 [5,18,22,30]
결과
24,20,22
[20,24]

 */
public class LimYoungwon_20170208 {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        // TODO Auto-generated method stub
        
        int intMaxArrayCnt =10;
        int intMaxArrayAttributeCnt = 100;
        int intMaxArrayNum = 100;
        
        
        Random rnd = new Random();
        int intTempCnt =0;
        int intTemp =0;
        int cntArry = rnd.nextInt(intMaxArrayCnt)+1;
        int cntArrysNum = 0;
        int[] arygetNum = new int[cntArry];
        
        //생성
        ArrayList<int[]> listNumberArray = new ArrayList<int[]>();
        
        for(int i=0; i<cntArry; ++i)
        {
            listNumberArray.add(createRandomList(rnd,intMaxArrayAttributeCnt, intMaxArrayNum));
            cntArrysNum = rnd.nextInt(listNumberArray.get(i).length);
            arygetNum[i] = listNumberArray.get(i)[cntArrysNum];
        }
        
        //추출 MIN MAX
        bubbleRange(arygetNum);
                
        //출력  
        System.out.println("number list");
        for(int i=0; i<cntArry; ++i)
        {
            intTempCnt = listNumberArray.get(i).length;
            System.out.print(i);
            System.out.print(" [");
            
            for(int j=0; j< intTempCnt ; ++j)
            {
                System.out.print(listNumberArray.get(i)[j]);
                if(j != intTempCnt-1){
                    System.out.print(" ,");
                }
            }
            System.out.println("]");
         }
        
        System.out.println("");
        System.out.println("get number from list");
        for(int k=0; k< arygetNum.length; ++k)
        {
            System.out.print(" List ");
            System.out.print(k);
            System.out.print(": ");
            System.out.print(arygetNum[k]);
        }
        
        System.out.println("");
        System.out.println("Min, Max Range");
        System.out.print("[");
        System.out.print(arygetNum[0]);
        System.out.print(",");
        System.out.print(arygetNum[arygetNum.length-1]);
        System.out.println("]");
        

    }
    
    public static int[] createRandomList(Random rnd, int intMaxArrayAttributeCnt, int intMaxArrayNum){
        
        int intRnd = rnd.nextInt(intMaxArrayAttributeCnt)+1;
    
        int[] intResult = new int[intRnd];   
        
        for(int i =0; i< intResult.length; ++i)
        {
            intResult[i] = rnd.nextInt(intMaxArrayNum);
        }
        bubbleRange(intResult);
        return intResult;
    }
    
    public static void bubbleRange(int[] inputArray)
    {
        int intTemp =0;
        
        for(int m=0; m<inputArray.length -1; ++m)
        {
            for(int n=m; n< inputArray.length ; ++n)
            {
                if(inputArray[m] > inputArray[n])
                {
                    intTemp = inputArray[n];
                    inputArray[n] = inputArray[m];
                    inputArray[m] = intTemp;
                }
            }
        }
    }
 }
