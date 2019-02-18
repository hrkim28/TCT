public class TCT_20190218_KimSeongMo {
    int count0;
    int count1;
    
    public static void main(String[] args){
        TCT_20190218_KimSeongMo obj = new TCT_20190218_KimSeongMo();
        obj.printFibonacciResult(0);
        obj.printFibonacciResult(1);
        obj.printFibonacciResult(3);
        obj.printFibonacciResult(8);
    }
    
    private void printFibonacciResult(int input){
        this.count0 = 0;  this.count1 = 0;
        this.findFibonacci(input);
        System.out.println( this.count0 + ", " + this.count1 );
    }
    
    private int findFibonacci(int input){
        if (input == 0) {
            this.count0++;
            return 0;
        } else if (input == 1) {
            this.count1++;
            return 1;
        } else {
            return this.findFibonacci(input-1) + this.findFibonacci(input-2);
        }
    }
}
