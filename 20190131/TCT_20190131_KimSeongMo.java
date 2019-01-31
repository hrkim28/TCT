import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TCT_20190131_KimSeongMo {
    public static void main(String[] args){
        TCT_20190131_KimSeongMo obj = new TCT_20190131_KimSeongMo();
        String [] input = {"but","i","wont","hesitate","no","more","no","more","it","cannot","wait","im","yours"};
        System.out.println(obj.getSortedList(input).toString());
    }

    private ArrayList<Object> getSortedList( String [] input ){
        int tempLength = 0;
        int minLength = 50;
        int maxLength = 0;
        HashSet<String> distinctSet = new HashSet<String>(Arrays.asList(input));
        HashMap<Integer, ArrayList<String>> strLengthMap = new HashMap<Integer, ArrayList<String>>();
        
        for( String str : distinctSet ){
            tempLength = str.length();
            if( tempLength < minLength ) minLength = tempLength;
            if( tempLength >  maxLength ) maxLength = tempLength;
            if( strLengthMap.containsKey(tempLength) ) {
                strLengthMap.get(tempLength).add(str);
            } else {
                strLengthMap.put(tempLength, new ArrayList<String>());
                strLengthMap.get(tempLength).add(str);
            }
        }
        
        Object[] tempArr = null;
        ArrayList<Object> resultList = new ArrayList<Object>();
        
        for( int inx = minLength; inx <= maxLength; inx++ ){
            if(strLengthMap.get(inx) == null) continue;
            tempArr = strLengthMap.get(inx).toArray();
            Arrays.sort(tempArr);
            resultList.addAll(Arrays.asList(tempArr));
        }
        
        return  resultList;
    }
}
