
public class TCT_20191123_KimBoMi {
    public static void main(String[] args){       
        int[] inputValue = new int[]{4,2,5,3,3}; 
        
        int result = 0;
        TreeSet<Integer> hol = new TreeSet<Integer>();
        TreeSet<Integer> isCheck = new TreeSet<Integer>();        
        
        for(int i=1 ; i< inputValue.length ; i++){
            int temp = inputValue[i];
            int count = 0;
            if(!isCheck.contains(temp)){
                isCheck.add(temp);
                for(int k=1 ; k< inputValue.length ; k++){
                    if(temp==inputValue[k]){
                        count++;
                    }
                }
                if(count%2==1){
                    hol.add(temp);  
                }
            }
        }
        
        for(int n : hol){
            result = result ^ n;
        }
        
        System.out.println(result);    
    }
    
}
