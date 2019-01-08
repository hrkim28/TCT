
package lge.prm.common.code.controller;

public class arrRevers {

    public static void main(String[] args){
        // TODO Auto-generated method stub
        int[] init = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        reverse(3,7,init);
        reverse(4,6,init);
        reverse(5,5,init);
        for(int inx = 0; inx < init.length; inx++){
            System.out.print(init[inx]+" ");
        }
    }

    public static void reverse(int start, int end, int[]arr){
        int length = end - start + 1;
        int temp = 0;
        for(int inx = 0; inx < length/2; inx++){
            temp = arr[start+inx-1];
            arr[start+inx-1] = arr[end-inx-1];
            arr[end-inx-1] = temp;
        }
    }
}

