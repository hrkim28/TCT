import org.apache.commons.lang.StringUtils;

public class TCT_20190212_KimSeongMo {
    public static void main(String[] args){
        TCT_20190212_KimSeongMo obj = new TCT_20190212_KimSeongMo();
        System.out.println(obj.getUniqueAdjNum(1));
        System.out.println(obj.getUniqueAdjNum(222));
        System.out.println(obj.getUniqueAdjNum(5000));
        System.out.println(obj.getUniqueAdjNum(1000000));
    }
    
    private String getUniqueAdjNum( long input ){
        long interval = 1;
        long underNum;
        long upperNum;
        while( true ){
            underNum = input - interval;
            upperNum = input + interval;
            if(this.isUniqueCombination(underNum+"") && underNum >= 1 ) return underNum+"";
            if(this.isUniqueCombination(upperNum+"") && upperNum <= 10000000000L ) return upperNum+"";
            interval++;
        }
    }

    private boolean isUniqueCombination(String underNum){
        for( int idx = 0; idx < 10; idx++ ){
            if( StringUtils.countMatches(underNum, idx+"") > 1 ) return false;
        }
        return true;
    }
    
}
