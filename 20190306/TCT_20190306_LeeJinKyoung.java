public class TCT_20190306_LeeJinKyoung {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        //String input = "long_and_mnemonic_identifier";
        String input = "jobLog";
        String result = "";
        
        if(!input.equals(input.toLowerCase()) && input.indexOf('_') > 0 ){
            result = "Error!!!";
        } else if(input.indexOf('_') > 0) {
            for(int inx = 0; inx < input.length(); inx++){
                if(input.charAt(inx) != '_'){
                    result += input.charAt(inx);
                } else {
                    if(inx != input.length() -1){
                        inx++;
                        result += String.valueOf(input.charAt(inx)).toUpperCase();
                    }
                }
            }
        } else {
            for(int inx = 0; inx < input.length(); inx++){
                if((int)input.charAt(inx) < (int)'a'){
                    result += '_';
                    result += String.valueOf(input.charAt(inx)).toLowerCase();
                } else {
                    result += input.charAt(inx); 
                }
            }
        }
        
        System.out.println(result);
    }

}
