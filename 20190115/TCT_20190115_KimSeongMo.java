public class Fibonacci {
    public static void main(String[] args){
        printFibonacci(1);
        printFibonacci(100);
        printFibonacci(500000);
    }
    
    private static void printFibonacci( int maxNum ){
        String result = "";
        int[] arr = new int[2];
        int idx = 0;
        int tempNum;
        while(true){
            if(idx < 2){
                arr[idx] = idx;
            }else{
                tempNum = arr[1];
                arr[1] = arr[0] + arr[1];
                arr[0] = tempNum;
            }
            
            if( arr[1] > maxNum ){
                result = result.substring(0, result.length()-1);
                break;
            }
            result += arr[1] + ",";
            idx++;
        }
        System.out.println(result);
    }
}
