import java.util.Arrays;
import java.util.Scanner;

public class TCT_20190116_HyeryoungKim {

    /*
       금수저 만수르 형님도 회사를 다니고 야근을 합니다. 야근을 하면 야근 피로도가 쌓입니다. 
       야근 피로도는 야근을 시작한 시점에서 남은 일의 작업량을 제곱하여 더한 값입니다. 
       만수르는 N시간 동안 야근 피로도를 최소화하도록 일할 겁니다. 
       만수르가 1시간 동안 작업량 1만큼을 처리할 수 있다고 할 때, 퇴근까지 남은 N 시간과 각 일에 대한 작업량 works에 대해 야근 피로도를 최소화한 값을 리턴하는 Code를 완성해주세요.
     
     [제한 사항]
     works는 길이 1 이상, 10 미만인 자연수로 구성된 배열입니다.
     N은 12 이하인 자연수입니다.
     
     [입출력 예제]
     works       N   result
     [4, 3, 3]   4   12
     [2, 1, 2]   1   6
     [1,1]       3   0
     */
    public static void main(String[] args){
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("퇴근까지 남은 시간 N을 입력하시오.");
        int n = sc.nextInt();
        if ( n > 12 ) {
            System.err.println("퇴근까지 남은 시간 N은 12이하인 자연수이어야 합니다.");
        } else {
            //int[] works = {4,3,3};
            int[] works = {2,1,2};
            int result = minimize(works, n);
            System.out.println("야근지수는 " + result + "입니다.");
        }
        
    }
    
    public static int minimize(int[] works, int n) {
        int sum = 0;

        while ( n > 0 ) {
            Arrays.sort(works);
            works[works.length-1] = works[works.length-1] - 1;
            
            n--;
        }
        
        for ( int idx = 0 ; idx < works.length ; idx++ ) {
            sum += Math.pow(works[idx], 2);
        }
        
        return sum;
    }
}
