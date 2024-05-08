package com.NaimulHasanSabbir;

public class sum_of_every_subArray_size_k {
    static void calcSum(int[] arr, int k){
        int sum = 0;

        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        System.out.println(sum);
        for(int j=k; j<arr.length; j++){
            sum += arr[j];
            sum -= arr[j - k];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        calcSum(arr,3);
    }
}
