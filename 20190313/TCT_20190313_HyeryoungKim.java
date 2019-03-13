import java.util.Scanner;

public class TCT_20190313_HyeryoungKim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 주전자 개수를 입력하세요");
        int ju = sc.nextInt();
        System.out.println("2. 나눠마실 친구 수를 입력하세요");
        int friend = sc.nextInt();
        
        System.out.println("3. 각 주전자에 담길 막걸리의 양을 입력하세요");
        int[] makgeolli = new int[ju];
        for ( int idx = 0 ; idx < ju ; idx++ ) {
            makgeolli[idx] = sc.nextInt();
        }
        
        System.out.println(getMaxMakgeolli(ju, friend, makgeolli));
        sc.close();
    }
    
    private static int getMaxMakgeolli(int ju, int friend, int[] arr) {
        int totalMak = 0;
        int min = 0;
        for ( int idx = 0 ; idx < arr.length ; idx++ ) {
            totalMak += arr[idx];
            if ( idx == 0 ) min = arr[0];
            if ( min > arr[idx] ) {
                min = arr[idx];
            }
        }
        
        // 개개인의 막걸리 최대값 시작점 구하기 
        int maxMakgeolli = (int)totalMak/friend;
        if ( maxMakgeolli > min ) {
            maxMakgeolli = min;
        }
        if ( ju >= 2 && friend >= 2 && maxMakgeolli > (int)friend/ju ) {
            maxMakgeolli = (int)min/((int)friend/ju);
        }
        
        while ( true ) {
            int sum = 0;
            for ( int idx = 0 ; idx < arr.length ; idx++ ) {
                sum += (int)arr[idx]/maxMakgeolli;
            }
            if ( sum == friend ) {
                break;
            }
            maxMakgeolli--;
        }
        
        return maxMakgeolli;
    }
}