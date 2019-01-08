package helper;
import java.util.Random;


/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : DomHelper.java
 * ===========================================
 * Modify Date    Modifier    Description
 * -------------------------------------------
 * 2015. 1. 17.  yongsik1.kim   Initial
 * ===========================================
 */

/**
 * <pre>
 * Class : DomHelper
 * Description : TODO
 * </pre>
 *
 * @author yongsik1.kim
 */
public class LeeJinKyoung20170208 {

    /*
    *
정렬된 정수를 가지고 있는 K 개의 List가 있습니다.
각 List에서 1개씩의 숫자를 추출하여 가장 작은 범위를 출력하세요.
예를 들면
List 1: [4, 10, 15, 24, 26]
List 2: [0, 9, 12, 20]
List 3: [5, 18, 22, 30]
위의 예에서 출력값은 [20,24] 입니다.
List 1에서 24, List 2에서 20, List 3에서 22를 가져오는 경우입니다
    */
   public static int path[];

   public static void main(String[] args) throws Exception{

       int list1[] = new int[]{4, 10, 15, 24, 26};
       int list2[] = new int[]{0, 9, 12, 20};
       int list3[] = new int[]{5, 18, 22, 30};

       int pos1 = random(0,list1.length-1);
       int pos2 = random(0,list2.length-1);
       int pos3 = random(0,list3.length-1);

       int list[] = new int[3];
       list[0] = list1[pos1];
       list[1] = list2[pos2];
       list[2] = list3[pos3];

       //경로 구하기
       path = new int[3];
       genPath(list.length, 0, getRemainNode(list, -1));
   }

   private static void genPath(int n, int depth, int[] remainNodes){
       for(int i = 0; i < n; i++){
            path[depth] = remainNodes[i];
            if(remainNodes.length == 1){
                int pathValue = 0;
                for(int j = 0; j < 3; j++){
                    if(j != 2){
                        System.out.print(path[j] + ",");
                        pathValue = pathValue+  Math.abs(path[j] - path[j+1]);
                    } else {
                        System.out.print(path[j]);
                    }
                }
                System.out.println("==>" + pathValue);
            }
            genPath(n - 1, depth + 1, getRemainNode(remainNodes, i));
       }
}

    private static int[] getRemainNode(int[] source, int removeIdx){
           if(removeIdx == -1){
                return source;
           }

           int[] result = new int[source.length - 1];
           int index = 0;
           for(int i = 0; i < source.length; i++){
                    if(i != removeIdx){
                            result[index] = source[i];
                    index++;
                }
           }
           return result;
    }

    public static int random(int min, int max) throws Exception{
        Random random = new Random();
        return random.nextInt(max)+min;
    }
}
