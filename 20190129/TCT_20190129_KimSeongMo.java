public class TCT_20190129_KimSeongMo {
    public static void main(String[] args){
        TCT_20190129_KimSeongMo obj = new TCT_20190129_KimSeongMo();
        String input1 = "9+5-4+8";
        String input2 = "5+6*3-6/2+5";
        obj.getResult(input1);
        obj.getResult(input2);
    }
    
    private  void getResult( String input ){
        int plusIdx = input.indexOf("+");
        int minusIdx = input.indexOf("-");
        int multipleIdx = input.indexOf("*");
        int devideIdx = input.indexOf("/");
        
        if( plusIdx != -1 || minusIdx != -1 || multipleIdx != -1 || devideIdx != -1 ){
            if( multipleIdx > 0 || devideIdx > 0  ){
                input = this.getMulDivResult(multipleIdx, devideIdx, input);
            }else{
                input = this.getPlusMinusResult(plusIdx, minusIdx, input);
            }
            System.out.println(input);
            this.getResult(input);
        }
    }

    private String getMulDivResult(int multipleIdx, int devideIdx, String input){
        int result = 0;
        int mulPreNum = this.getPreNum( multipleIdx, input );
        int mulPostNum = this.getPostNum( multipleIdx, input );
        int devidePreNum = this.getPreNum( devideIdx, input );
        int devidePostNum = this.getPostNum( devideIdx, input );
        if( this.isPriorityOperator(multipleIdx,devideIdx) ){
            result = mulPreNum * mulPostNum;
            input = input.replaceFirst(mulPreNum + "\\*" + mulPostNum, result + "");
        }else{
            result = devidePreNum / devidePostNum;
            input = input.replaceFirst(devidePreNum + "\\/" + devidePostNum, result + "");
        }
        return input;
    }
    
    private String getPlusMinusResult(int plusIdx, int minusIdx, String input){
        int result = 0;
        int plusPreNum = this.getPreNum( plusIdx, input );
        int plusPostNum = this.getPostNum( plusIdx, input );
        int minusPreNum = this.getPreNum( minusIdx, input );
        int minusPostNum = this.getPostNum( minusIdx, input );
        if( this.isPriorityOperator(plusIdx, minusIdx) ){
            result = plusPreNum + plusPostNum;
            input = input.replaceFirst(plusPreNum + "\\+" + plusPostNum, result + "");
        }else{
            result = minusPreNum - minusPostNum;
            input = input.replaceFirst(minusPreNum + "\\-" + minusPostNum, result + "");
        }
        return input;
    }
    
    private boolean isPriorityOperator(int firstOperatorIdx, int secondOperatorIdx){
        if( firstOperatorIdx == -1 ){
            return false;
        }else if( secondOperatorIdx == -1 ){
            return true;
        }else if( firstOperatorIdx < secondOperatorIdx ){
            return true;
        }else{
            return false;
        }
    }
    
    private int getPreNum(int index, String input){
        if(index == -1) return 1;
        String result = "";
        for( int inx = index-1; inx >= 0; inx-- ){
            if( input.charAt(inx) == '+' || input.charAt(inx) == '-' || input.charAt(inx) == '*' || input.charAt(inx) == '/'  ) break;
            result += input.charAt(inx);
        }
        return Integer.parseInt(( new StringBuffer(result) ).reverse().toString());
    }
    
    private int getPostNum(int index, String input){
        if(index == -1) return 1;
        String result = "";
        for( int inx = index+1; inx < input.length(); inx++ ){
            if( input.charAt(inx) == '+' || input.charAt(inx) == '-' || input.charAt(inx) == '*' || input.charAt(inx) == '/'  ) break;
            result += input.charAt(inx);
        }
        return Integer.parseInt(result);
    }
}
