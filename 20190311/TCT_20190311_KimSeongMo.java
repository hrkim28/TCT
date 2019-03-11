import java.util.HashMap;

public class TCT_20190311_KimSeongMo {
        public static void main(String[] args){
            TCT_20190311_KimSeongMo obj = new TCT_20190311_KimSeongMo();
            String input1 = "{[()]}[{}]";
            String input2 = "{[()]}[{}[";
            String input3 = "{[()]}[{)]";
            String input4 = "{[(]}[{}]";
            String input5 = "}])]";
            System.out.println( obj.isVaild( input1 ) );
            System.out.println( obj.isVaild( input2 ) );
            System.out.println( obj.isVaild( input3 ) );
            System.out.println( obj.isVaild( input4 ) );
            System.out.println( obj.isVaild( input5 ) );
        }

        private boolean isVaild(String input){
            HashMap<String, Integer> blockCntMap = new HashMap<String, Integer>();
            
            blockCntMap.put("small", 0);
            blockCntMap.put("middle", 0);
            blockCntMap.put("large", 0);
            
            String tempChar = "";
            for( int inx = 0; inx < input.length(); inx++ ){
                tempChar = input.charAt(inx)+"";
                if( "(".equals( tempChar ) ){
                    blockCntMap.put("small", blockCntMap.get("small")+1);
                }else if( ")".equals( tempChar ) ){
                    if( blockCntMap.get("small") == 0 ) return false;
                    blockCntMap.put("small", blockCntMap.get("small")-1);
                }else if( "{".equals( tempChar ) ){
                    blockCntMap.put("middle", blockCntMap.get("middle")+1);
                }else if( "}".equals( tempChar ) ){
                    if( blockCntMap.get("middle") == 0 ) return false;
                    blockCntMap.put("middle", blockCntMap.get("middle")-1);
                }else if( "[".equals( tempChar ) ){
                    blockCntMap.put("large", blockCntMap.get("large")+1);
                }else if( "]".equals( tempChar ) ){
                    if( blockCntMap.get("large") == 0 ) return false;
                    blockCntMap.put("large", blockCntMap.get("large")-1);
                }else{
                    return false;
                }
            }
            if( blockCntMap.get("small") !=0 || blockCntMap.get("middle") !=0 || blockCntMap.get("large") !=0 ) return false;
            return true;
        }
}
