import java.util.ArrayList;
import java.util.List;

public class TCT_20190425_HyeryoungKim {

    public static void main(String[] args) {
        TCT_20190425_HyeryoungKim tct = new TCT_20190425_HyeryoungKim();

        int n = 4;
        String[][] strArr = {
        		{"The morse Code", "Here come dots"}
            ,{"TOM MARVOLO RIDDLE", "I AM LORD VOLDEMORT"}
            ,{"Why do you care?", "Hey, you cowards!"}
            ,{"Done!","O, end!"}
            };

        for ( int idx = 0 ; idx < n ; idx++ ) {
            System.out.println(tct.isAnagram(strArr[idx][0], strArr[idx][1]));
        }
    }

    private boolean isAnagram(String originalStr, String transferredStr) {
        boolean isAnagram = true;
        
        originalStr = originalStr.replaceAll("\\p{Z}", "").toLowerCase();
        transferredStr = transferredStr.replaceAll("\\p{Z}", "").toLowerCase();
        
        List<String> originStringList = new ArrayList<String>();
        for ( int idx = 0 ; idx < originalStr.length() ; idx++ ) {
        	char c = originalStr.charAt(idx);
        	if ( c >= 'a' && c <= 'z' ) {
        		originStringList.add(String.valueOf(c));
        	}
        }

        for ( int jdx = 0 ; jdx < transferredStr.length() ; jdx++ ) {
            //String alpha = transferredStr.substring(jdx, jdx+1);
            char alpha = transferredStr.charAt(jdx);
            if ( alpha >= 'a' && alpha <= 'z' ) {
            	if ( originStringList.contains(String.valueOf(alpha)) ) {
                    originStringList.remove(String.valueOf(alpha));
                } else {
                	isAnagram = false;
                	break;
                }
            }
        }

        if ( originStringList.size() > 0 ) {
            isAnagram = false;
        }
        return isAnagram;
    }
}