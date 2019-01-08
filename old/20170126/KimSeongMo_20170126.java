package lge.gpdm.prototype.service;


public class aaaaa {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        // TODO Auto-generated method stub
        String[] arr = {"a1","a2","a3","a4","a5","a6","a7","a8","a9","a10","b1","b2","b3","b4","b5","b6","b7","b8","b9","b10"};

        String temp = "";
        for(int inx = 1; inx < arr.length/2; inx++){
            if(inx!=1){
                arr[inx] = temp;
            }
            arr[inx] = arr[arr.length/2+inx-1];
            temp = arr[inx];
//            temp = arr[inx+1];
        }

        for(int jnx=0; jnx<arr.length; jnx++){
            System.out.println(arr[jnx]);
        }
        //Fail...TT
    }

}
