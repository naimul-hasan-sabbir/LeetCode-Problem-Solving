package com.NaimulHasanSabbir;

public class minimum_swaps_required_to_bring_all_elements_less_than_or_equal_to_k_together {
    static int minimumSwaps(int[] arr, int k) {
        int snowBallSize = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] <= k) {
                snowBallSize++;
            }
        }
        int swap = 0, ans_swapped = Integer.MAX_VALUE;
        for(int i = 0; i < snowBallSize; i++){
            if(arr[i] > k) {
                swap++;
            }
        }
        ans_swapped = Math.min(ans_swapped, swap);
        for(int i = snowBallSize; i < arr.length; i++) {
            if(arr[i - snowBallSize] <= k && arr[i] > k){
                swap++;
            }else if(arr[i - snowBallSize] > k && arr[i] <= k){
                swap--;
            }
            ans_swapped = Math.min(ans_swapped, swap);
        }
        return ans_swapped;
    }
    public static void main(String[] args)
    {
        int arr[] = { 2, 7, 9, 5, 8, 7, 4 };
        int k = 5;

        System.out.println(minimumSwaps(arr, k));
    }
}
