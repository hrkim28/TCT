import org.apache.commons.lang.StringUtils;

public class TCT_20190211_KimSeongMo {
    public static void main(String[] args){
        TCT_20190211_KimSeongMo obj = new TCT_20190211_KimSeongMo();
        String case1 = "BAPC";
        String case2 = "AABA";
        String case3 = "ABCABCBBAAACC";
        System.out.println( (obj.isValidEncryption(case1))?"OK":"FAKE");
        System.out.println( (obj.isValidEncryption(case2))?"OK":"FAKE");
        System.out.println( (obj.isValidEncryption(case3))?"OK":"FAKE");
    }
    
    private boolean isValidEncryption( String input ){
        for( char idx = 'A'; idx <= 'Z'; idx++ ){
            int charaterCount = StringUtils.countMatches(input, idx+"");
            if(  charaterCount > 0 && charaterCount%3 == 0 ) return false;
        }
        return true;
    }
    
}
