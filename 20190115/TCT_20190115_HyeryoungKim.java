public class TCT_20190115_HyeryoungKim {

    /**
     * 피보나치 수열이란, 첫 번째 항의 값이 0이고 두 번째 항의 값이 1일 때, 이후의 항들은 이전의 두 항을 더한 값으로 이루어지는 수열을 말한다.
       예) 0, 1, 1, 2, 3, 5, 8, 13
       인풋을 정수 n으로 받았을때, n 이하까지의 피보나치 수열을 출력하는 프로그램을 작성하세요
     */
    public static void main(String[] args) {
        int num = 100;
        System.out.println(fibonacci(num));
    }

    // F(n) = F(n-1) + F(n-2)
    public static String fibonacci(int n) {
        StringBuffer answer = new StringBuffer();
        int a = 0;
        int b = 1;
        int next = 0;
        int tmp = 0;
        
        if ( n == 0 ) {
            answer.append(String.valueOf(a));
        }
        else {
            answer.append(String.valueOf(a));
            answer.append(", " + String.valueOf(b));
            
            while ( tmp < n ) {
                next = a + b;
                a = b;
                b = next;
                tmp = a + b;
                answer.append(", " + String.valueOf(b));
            }
        }
        
        return answer.toString();
    }
}