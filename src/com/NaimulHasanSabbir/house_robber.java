package com.NaimulHasanSabbir;

import java.util.Arrays;

public class house_robber {
    /*
    Recursive top-down approach
     */
    public int rob(int[] nums){
        return rob(nums, nums.length - 1);
    }
    private int rob(int[] nums, int i){
        if(i < 0){
            return 0;
        }
        return Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
    }
    /*
    Recursive + memo (top-down) approach
    Time Complexity: O(n)
    Space Complexity: O(n)
     */
    int[] memo;
    public int rob2(int[] nums){
        memo = new int[nums.length + 1];
        Arrays.fill(memo, -1);
        return rob(nums, nums.length - 1);
    }
    private int rob2(int[] nums, int i){
        if(i < 0){
            return 0;
        }
        if(memo[i] >= 0){
            return memo[i];
        }
        int result = Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
        memo[i] = result;
        return result;
    }
}
