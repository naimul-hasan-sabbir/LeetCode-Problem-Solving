package com.NaimulHasanSabbir.Array;

import java.util.Arrays;

public class DivideArrayIntoArrayMaxDifference {
    public static int[][] divideArray(int[] nums, int k){
        Arrays.sort(nums);
        int[][] result = new int[nums.length/3][3];
        for(int i = 2; i < nums.length; i+=3){
            if((nums[i] - nums[i-2]) > k){
                return new int[0][];
            }
            result[i/3] = new int[]{nums[i-2], nums[i-1], nums[i]};
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,4,8,7,9,3,5,1};
        System.out.println(Arrays.deepToString(divideArray(nums, 2)));
    }
}
