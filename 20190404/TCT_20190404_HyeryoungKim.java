import java.util.Scanner;

public class TCT_20190404_HyeryoungKim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for ( int n = 0 ; n < t ; n++ ) {
            int r = sc.nextInt();
            String s = sc.next();
            StringBuffer result = new StringBuffer();
            for ( int idx = 0 ; idx < s.length() ; idx++ ) {
                for ( int jdx = 0 ; jdx < r ; jdx++ ) {
                    result.append(s.substring(idx, idx+1));
                }
            }
            System.out.println(result.toString());
        }
        
        sc.close();
    }
}