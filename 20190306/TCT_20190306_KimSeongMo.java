public class TCT_20190306_KimSeongMo {
        public static void main(String[] args){
            TCT_20190306_KimSeongMo obj = new TCT_20190306_KimSeongMo();
            String input = "long_and_mnemonic_identifier";
            String inpu2 = "longAndMnemonicIdentifier";
            try {
                System.out.println( obj.getTransVarName(input) );
                System.out.println( obj.getTransVarName(inpu2) );
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        private String getTransVarName(String input) throws Exception{
            String result = "";
            String[] strArr = input.split("_");
            if( strArr.length > 1 ) result =  getVarCppToJava(input, strArr);
            else result =   getVarJavaToCpp(input);
            return result;
        }

        private String getVarCppToJava(String cpp, String[] strArr) throws Exception{
            String result = "";
            result += strArr[0];
            String ubRemoveStr = cpp.replaceAll("_", "");
            for( int inx = 0; inx < ubRemoveStr.length(); inx++ ){
                if( Character.isUpperCase(ubRemoveStr.charAt(inx)) ) throw new Exception("error");
            }
            for( int inx = 1; inx < strArr.length; inx++ ){
                result += Character.toUpperCase( strArr[inx].charAt(0) ) + strArr[inx].substring(1, strArr[inx].length());
            }
            return result;
        }
        
        private String getVarJavaToCpp(String java){
            String result = "";
            Character teamChar;
            for( int inx = 0; inx < java.length(); inx++ ){
                teamChar = java.charAt(inx);
                if(  Character.isUpperCase(teamChar) ){
                    result = result + "_" + Character.toLowerCase(teamChar);
                }else{
                    result = result + teamChar;
                }
            }
            return result;
        }
}
