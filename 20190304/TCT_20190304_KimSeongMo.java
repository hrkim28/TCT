import java.util.HashSet;

public class TCT_20190304_KimSeongMo {
        public static void main(String[] args){
            TCT_20190304_KimSeongMo obj = new TCT_20190304_KimSeongMo();
            String[] inputStr = {"madam", "abab", "abmadam", "kdccabbac", "lalavla"};
            for( int inx = 0; inx < inputStr.length; inx++ ){
                HashSet<Character> result = obj.getWordsForPalindrome(inputStr[inx]);
                System.out.println( result.size() + " = " + result.toString() );
            }
        }
        
        private HashSet<Character> getWordsForPalindrome(String input){
            String tempString = input;
            int count = 0;
            while(true){
                if( this.isPalindrome(tempString) ) break;
                tempString = tempString.substring(1, tempString.length());
                count++;
            }
            
            String addStr = input.substring(0,count);
            HashSet<Character> charSet = new HashSet<Character>();
            for( int inx = 0; inx < addStr.length(); inx++ ){
                charSet.add(addStr.charAt(inx));
            }
            
            return charSet;
        }

        private boolean isPalindrome(String tempString){
            String reversString = ( new StringBuffer(tempString) ).reverse().toString();
            if( tempString.equals(reversString) ) return true;
            return false;
        }
}
