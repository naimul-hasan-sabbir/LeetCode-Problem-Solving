package com.NaimulHasanSabbir;

public class find_the_sum_of_all_subarrays {
    static long subArraySum(int[] arr, int n){
        long result = 0;

        for(int i = 0; i < n; i++){
            result += (arr[i] * (i + 1) * (n - i));
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = new int[]{1, 2, 3};

        int n = arr.length;

        System.out.println(subArraySum(arr, n));

    }
}
