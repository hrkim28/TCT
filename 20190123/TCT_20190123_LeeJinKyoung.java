import java.util.TreeSet;



public class TCT_20190123_LeeJinKyoung {

    public static void main(String[] args){
        TCT_20190123_LeeJinKyoung test = new TCT_20190123_LeeJinKyoung();
        int[] list = new int[]{4,2,5,3,3};
        TreeSet<Integer> odds = test.oddList(list);

        if(odds.size() > 0) {
            int result = odds.first();
            
            odds.remove(result);        
            for(int n : odds){
                result = result ^ n;
            }
    
            test.print(list);
            System.out.println(result);
        } else {
            System.out.println("홀수번 나타나는 숫자가 없음");
        }
        
    }

    public TreeSet<Integer> oddList(int[] list){

        TreeSet<Integer> st = new TreeSet<Integer>();
        for(int n : list){
            if(st.contains(n)){
                st.remove(n);
            } else {
                st.add(n);
            }
        }
        
        return st;
    }
    
    public void print(int [] r){
        for(int inx = 0 ; inx < r.length; inx++){
            System.out.print(r[inx]+" ");
        }
        
        System.out.println("");
    }

}
