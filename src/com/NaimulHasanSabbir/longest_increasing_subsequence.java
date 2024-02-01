package com.NaimulHasanSabbir;

public class longest_increasing_subsequence {
    public int lengthOfLIS(int[] nums){
        int[] tail = new int[nums.length];

        int maxSize = 0;
        for(int num : nums){
            int start = 0, end = maxSize;

            while (start != end){
                int mid = (start + end) / 2;
                if(tail[mid] < num){
                    start = mid + 1;
                }else{
                    end = mid;
                }
            }
            tail[start] = num;
            maxSize = (start == maxSize) ? maxSize + 1 : maxSize;
        }
        return maxSize;
    }
}
