package build.classes;


/**
 * <pre>
 * Class : test111111
 * Description : TODO
 * </pre>
 * 
 * @author seongmo1.kim
 */
public class test111111 {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        // TODO Auto-generated method stub
        String insert1 = "aaabbcccccca";
        String insert2 = "abbcccccca";
        String insert3 = "apple";
        System.out.print("Original : "+insert1+"  ->  ");cal(insert1);System.out.println();
        System.out.print("Original : "+insert2+"  ->  ");cal(insert2);System.out.println();
        System.out.print("Original : "+insert3+"  ->  ");cal(insert3);System.out.println();
    }
    
    public static void cal(String insert){
        int cnt = 1;
        boolean flag = false;
        for(int i=0; i<insert.length();i++){
            char temp;
            temp = insert.charAt(i);
            if(flag){
                cnt = 1; //바뀌면 cnt 초기화 
            }
            if(i == insert.length()-1){
                if(flag){
                    System.out.print(temp);
                }else{
                    cnt++;
                    System.out.print(cnt);
                }
            }else if(i == 0){
                if(insert.charAt(i)==insert.charAt(i+1)){
                    flag = false;
                }else if(insert.charAt(i)!=insert.charAt(i+1) ){
                    System.out.print(temp);
                    flag = true;
                }
            }
            else{
                if(temp==insert.charAt(i-1) && temp==insert.charAt(i+1)){
                    cnt++;
                    flag = false;
                }else if(temp==insert.charAt(i-1) && temp!=insert.charAt(i+1) ){
                    cnt++;
                    System.out.print(temp);
                    System.out.print(cnt);
                    flag = true;
                }else if(temp !=insert.charAt(i-1) && temp!=insert.charAt(i+1)){
                    System.out.print(temp);
                    flag = true;
                } 
            }
        }
    }

}
