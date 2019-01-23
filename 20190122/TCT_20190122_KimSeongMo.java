public class TCT_20190122_KimSeongMo {
    private int maxScore = 0;
    public static void main(String[] args){
        
        // Local Optimal != Global Optimal
        
        TCT_20190122_KimSeongMo obj = new TCT_20190122_KimSeongMo();
        int[] testCase1 = {6,10,20,15,25,10,20};
        int[] testCase2 = {10,30,10,2,15,75,10,26,100,32,4};
        System.out.println(obj.getMaxScore(testCase1));
        System.out.println(obj.getMaxScore(testCase2));
    }

    private int getMaxScore( int[] steps ){
        this.maxScore = 0;
        int[] newSteps = new int[steps.length-1];
        for( int inx = 1; inx < steps.length; inx++ ){
            newSteps[inx-1] = steps[inx];
        }
        int stepNum = newSteps.length;
        int minCase = (stepNum%2 == 0)?stepNum/2:stepNum/2+1;
        int maxCase = (stepNum%3 == 0)?2*stepNum/3: 2*stepNum/3+1;
        for( int inx = minCase; inx <= maxCase; inx++  ){
            int[] combArr = new int[inx];
            this.combination(combArr, newSteps.length,inx, 0, 0, newSteps);
        }
        return this.maxScore;
    }
    
    public void combination(int[] combArr, int n, int r, int index, int target, int[] arr){
        if(r == 0){
            int total = 0;
            if( ( combArr[0] == 0 || combArr[0] == 1 ) && combArr[index-1] == n-1){
                for( int inx=0; inx<index; inx++ ){
                    if( (inx > 0 && combArr[inx] - combArr[inx-1] > 2) 
                            || ( inx > 1 && combArr[inx] - combArr[inx-1] == 1 && combArr[inx-1] - combArr[inx-2] == 1 ) ){
                        total = 0; 
                        break;
                    }else{
                        total += arr[combArr[inx]];
                    }
                }
                if( this.maxScore <= total ){
                    this.maxScore = total;
                }
            }
        }else if(target == n){ 
            return;
        }else{
            combArr[index] = target;
            combination(combArr, n, r-1, index+1, target+1, arr);
            combination(combArr, n, r, index, target+1, arr); 
        }
    }
}
