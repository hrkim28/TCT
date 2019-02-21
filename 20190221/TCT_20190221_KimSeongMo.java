public class TCT_20190221_KimSeongMo {
    int shortPathCost = 1000;
    int transferCost = 200;
    
    public static void main(String[] args){
        TCT_20190221_KimSeongMo obj = new TCT_20190221_KimSeongMo();
        int[][] input = {{0,32,0,3},{3,13,1,0},{28,25,1,5},{39,0,6,0}};
        System.out.println(obj.getMaxCost( input ));
    }

    private int getMaxCost(int[][] input){
        int maxCost = Integer.MIN_VALUE;
        int shortPathCount = 0;
        int transCount = 0;
        int tempCost;
        for( int inx = 0; inx < input.length-1; inx++ ){
            if( inx == 0 ){
                shortPathCount = input[inx][1];
                transCount = input[inx][3];
            }else{
                shortPathCount = shortPathCount - input[inx][0] + input[inx][1];
                transCount = transCount - input[inx][2] + input[inx][3];
            }
            tempCost = shortPathCount * shortPathCost + transCount * transferCost;
            if( tempCost > maxCost ) maxCost = tempCost;
        }
        return maxCost;
    }
}
