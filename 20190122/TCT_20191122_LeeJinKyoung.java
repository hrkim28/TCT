
public class TCT_20191122_LeeJinKyoung {
    public static void main(String[] args){
        
        TCT_20191122_LeeJinKyoung test = new TCT_20191122_LeeJinKyoung();
        int[] steps = {6,10,20,15,25,10,20};
        test.print(steps);
        System.out.println("Result : " + test.maxScore(steps));
    
    }
    
   private int maxScore = 0;
    
   public int maxScore(int[] steps){
        getCase(1,steps.length-1,new int[steps.length],steps);
        
        return maxScore;
    }

    public void  getCase(int n, int index, int[] result, int[] steps) {
        result[index] = n;
        
        if(index == 1){
            //print(result);
            int score = caculatorScore(result, steps);

            if(maxScore < score){
                maxScore = score;
            }            
            //System.out.println(score);
        } else {
            if(n == 1){
                //위 계단을 밝은 경우 아래 계단을 밝지 않을 수 있다.
                getCase(0,index-1,result,steps);
    
                //위 계단을 밝은 경우 아래 계단을 밝을 수 있지만 3계단을 연속해서 밝을 수 없다.
                if( result.length -1 == index || result[index + 1] != 1){
                    getCase(1,index-1,result,steps);
                }
            } else if(n == 0) { //위 계단을 밝지 않은 경우 아래 계단은 밝는다.
                getCase(1,index-1,result,steps);
            }
        }
    }

    /**
     *
     * @param result
     * @param steps
     * @return
     */
    private int caculatorScore(int[] result, int[] steps){
        int score = 0;
        
        /*Score 계산 하기*/
        for(int jnx = 0 ; jnx < result.length; jnx++){
            if(result[jnx] == 1){ //result가 1인 Score를 더한다.
                score += steps[jnx];
            }
        }
        return score;
    }
    
    public void print(int [] r){
        for(int inx = 0 ; inx < r.length; inx++){
            System.out.print(r[inx]+" ");
        }
        
        System.out.println("");
    }


}
