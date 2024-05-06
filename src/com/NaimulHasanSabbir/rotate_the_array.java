package com.NaimulHasanSabbir;

public class rotate_the_array {
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,4,5};
        int len = arr.length;
        int k = 3;

        k = k % len;

        int i , j;

        for(int i = len - k, j = len - 1; i < j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(i = 0, j = len - k; i < j; i++, j--){
            int temp  = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for(i = 0, j = len - 1; i < j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
