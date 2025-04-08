package com.NaimulHasanSabbir.TwoPointers;

import java.util.Arrays;

public class KDiffPairsInAnArray {
    public static int findPairs(int[] nums, int k){
        Arrays.sort(nums);

        int start = 0, end = 1, count = 0;

        while (end < nums.length){
            if(nums[end] - nums[start] < k){
                end++;
            }else if(nums[end] - nums[start] > k){
                start++;
                if(start == end){
                    end++;
                }
            }else{
                int p = nums[start];
                int q = nums[end];

                if(k == 0){
                    while(start < nums.length && nums[start] == p){
                        start++;
                        end++;
                    }
                    count++;
                }else {
                    count++;
                    while (start < nums.length && nums[start] == p) {
                        start++;
                    }
                    while (end < nums.length && nums[end] == q) {
                        end++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr ={1,3,1,5,4};
        int k = 0;
        System.out.println(findPairs(arr, k));
    }
}
