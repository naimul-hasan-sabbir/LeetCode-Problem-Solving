package com.NaimulHasanSabbir;

public class Maximum_chunks {
    static int maxChunks(int[] arr) {
        int len = arr.length;
        int res = 0, max_so_far = 0;
        for(int i = 0; i < len; i++){
            max_so_far = Math.max(max_so_far, arr[i]);

            if(max_so_far == i){
                res += 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(maxChunks(arr));
    }
}
