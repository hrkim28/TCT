public class TCT_20190128_LeeJinKyoung {

    public static void main(String[] args){
        countAphabet( "I think I'm lost." );
        countAphabet( "I think I'm lost.I can't tell." );
        countAphabet( "I think I'm lost. I can't tell what's where.");
    }

    /**
     *
     * @param str
     */
    private static void countAphabet(String str){
        //알파벳 아스키 코드
        int upperA = 65; //"A"
        int lowerA = 97; //"a"
        
        int aphabet = 24; //알파벳 갯수
        
        int [] strAscii = new int[aphabet];
        
        int maxCount = 0;        
        for(int inx = 0; inx < str.length(); inx++){
            int charAscii = (int)str.charAt(inx);
            
            if(charAscii < 97){
                charAscii += (lowerA - upperA);
            }
            
            if( lowerA <= charAscii &&  charAscii <= lowerA + aphabet){
                strAscii[charAscii-lowerA]++;
                
                if(maxCount < strAscii[charAscii-lowerA]){
                    maxCount = strAscii[charAscii-lowerA];
                }
            }
        }
        System.out.println(str);
        System.out.print("가장많이 쓰인 알파벳 : " );
        for(int inx = 0; inx < aphabet; inx++){
            if(strAscii[inx] == maxCount) {
                System.out.print((char)(lowerA + inx) + " ");
            }
        }
        System.out.println(maxCount+ "회");
    }
}
