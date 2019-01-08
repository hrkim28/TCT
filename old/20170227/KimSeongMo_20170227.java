package lge.prm.rest.spec.controller;

public class repeat {

    public static void main(String[] args){
        findRepeat("uhmhellouhmmynameislibe ",2);
        findRepeat("banana",3);
        findRepeat("thatsagoodquestion ",1);
        findRepeat("hello",3);
    }

    public static void findRepeat(String input, int min){
        int resultCnt = 0;
        String result = "";

        for(int inx = 0; inx < input.length(); inx++){
            for(int jnx = 0; jnx < input.length()-inx; jnx++){
                String findStr = "";
                findStr = input.substring(jnx, jnx+inx+1);
                if(count(findStr,input) >= min && findStr.length() > result.length()){
                    resultCnt = count(findStr,input);
                    result = findStr;
                }
            }
        }
        System.out.println(result);
        System.out.println(resultCnt);
        System.out.println();
    }

    public static int count(String findStr, String origin){
        int cnt = 0;
        for(int inx=0; inx < origin.length()-findStr.length()+1; inx++){
            int strLeng = inx+findStr.length();
            String tempStr = origin.substring(inx, strLeng);
            if(tempStr.equals(findStr)){
                cnt++;
            }
        }
        return cnt;
    }

}
