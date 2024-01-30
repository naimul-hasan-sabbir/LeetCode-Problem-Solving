package com.NaimulHasanSabbir;

import java.util.HashMap;

public class subarray_sum_equals_k {
    /*
    This solution is brute force approach
    Time Complexity: O(n^2)
     */
    public int subarraySum(int[] nums, int k){
        int count = 0;
        int[] sum = new int[nums.length + 1];

        sum[0] = 0;

        for(int i = 1; i<= nums.length; i++){
            sum[i] = sum[i - 1] + nums[i];
        }
        for(int start = 0; start < sum.length; start++){
            for(int end = start + 1; end < sum.length; end++){
                if(sum[end] - sum[start] == k){
                    count++;
                }
            }
        }
        return count;
    }
    /*
    Optimized solution will be using HashMap
    Time Complexity: O(n)
    Space Complexity: O(n)
     */
    public int subarraySum2(int[] nums, int k){
        int sum = 0;
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int j = 0; j < nums.length; j++){
            sum += nums[j];
            if(map.containsKey(sum - k)){
                res += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return res;
    }
}
