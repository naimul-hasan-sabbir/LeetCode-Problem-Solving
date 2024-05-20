package com.NaimulHasanSabbir;

import java.util.Arrays;

public class max_gap {
    public int maximumGap(int[] nums) {
        if(nums.length < 2) return 0;

        int maxVal = Arrays.stream(nums).max().getAsInt();
        int minVal = Arrays.stream(nums).min().getAsInt();

        int[] maxBucket = new int[nums.length - 1];
        int[] minBucket = new int[nums.length - 1];

        Arrays.fill(maxBucket, Integer.MIN_VALUE);
        Arrays.fill(minBucket, Integer.MAX_VALUE);

        double delta = (double) (maxVal - minVal) / (nums.length - 1);

        for(int num : nums){
            if(num == maxVal || num == minVal) continue;

            int index = (int) ((num - minVal) / delta);
            maxBucket[index] = Math.max(maxBucket[index], num);
            minBucket[index] = Math.min(minBucket[index], num);
        }
        int preVal = minVal;
        int maxGap = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(minBucket[i] == Integer.MAX_VALUE) continue;

            maxGap = Math.max(maxGap, minBucket[i] - preVal);
            preVal = maxBucket[i];
        }
        maxGap = Math.max(maxGap, maxVal - preVal);

        return maxGap;
    }
}
